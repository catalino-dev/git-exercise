package com.synacy.training.gitexercise.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping(value = { "/", "/index" })
    public String index(@RequestParam(value="value1", required=false) String value1,
                        @RequestParam(value = "value2", required = false) String value2,
                        @RequestParam(value = "operator", required = false) String operator,
                        Model model) {

        if (value1 != null && value2 != null && operator != null) {
            double a = Double.valueOf(value1);
            double b = Double.valueOf(value2);

            if (operator.equalsIgnoreCase("ADD")) {
                String result = String.valueOf(a + b);
                model.addAttribute("result", result);
            }
        }

        return "index";
    }
}
