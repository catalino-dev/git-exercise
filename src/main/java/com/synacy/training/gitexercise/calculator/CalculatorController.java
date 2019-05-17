package com.synacy.training.gitexercise.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping(value = { "/", "/index" })
    public String index(@RequestParam(value="value1", required=false, defaultValue = "0")  String value1,
                        @RequestParam(value = "value2", required = false, defaultValue = "0") String value2,
                        @RequestParam(value = "operator", required = false) String operator,
                        Model model) {

        if (value1 != null && value2 != null && operator != null) {
            CalculateMethod method = CalculateMethod.of(operator);
            String[] parameters = new String[] { value1, value2 };

            calculate (model, parameters, method);
        }

        return "index";
    }

    private void calculate (Model model, String[] parameters, CalculateMethod method) {

        if (method != null) {
            String result = method.calculate(parameters);
            model.addAttribute("result", result);
        }
    }
}
