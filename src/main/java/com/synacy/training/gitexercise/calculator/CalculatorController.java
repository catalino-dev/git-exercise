package com.synacy.training.gitexercise.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping(value = { "/", "/index" })
    public String index(@RequestParam(value="value1", required=false)  String value1,
                        @RequestParam(value = "value2", required = false) String value2,
                        @RequestParam(value = "operator", required = false) String operator,
                        Model model) {

        if (value1 != null && value2 != null && operator != null) {
            if (operator.equals("SINE")) {
                if (value1 != null && value2 == null) {
                    CalculateMethod method = CalculateMethod.of(operator);
                    String[] parameters = new String[] {value1, "0"};

                    if (method != null) {
                        String result = method.calculate(parameters);
                        model.addAttribute("result", result);
                    }
                }
                else if (value1 == null && value2 != null) {
                    CalculateMethod method = CalculateMethod.of(operator);
                    String[] parameters = new String[] {"0", value2};

                    if (method != null) {
                        String result = method.calculate(parameters);
                        model.addAttribute("result", result);
                    }
                }
                else {
                    CalculateMethod method = CalculateMethod.of(operator);
                    String[] parameters = new String[] {value1, value2};

                    if (method != null) {
                        String result = method.calculate(parameters);
                        model.addAttribute("result", result);
                    }
                }
            }
            if (operator.equals("COSINE")) {
                if (value1 != null && value2 == null) {
                    CalculateMethod method = CalculateMethod.of(operator);
                    String[] parameters = new String[] {value1, "0"};

                    if (method != null) {
                        String result = method.calculate(parameters);
                        model.addAttribute("result", result);
                    }
                }
                else if (value1 == null && value2 != null) {
                    CalculateMethod method = CalculateMethod.of(operator);
                    String[] parameters = new String[] {"0", value2};

                    if (method != null) {
                        String result = method.calculate(parameters);
                        model.addAttribute("result", result);
                    }
                }
                else {
                    CalculateMethod method = CalculateMethod.of(operator);
                    String[] parameters = new String[] {value1, value2};

                    if (method != null) {
                        String result = method.calculate(parameters);
                        model.addAttribute("result", result);
                    }
                }
            }
            if (operator.equals("TAN")) {
                if (value1 != null && value2 == null) {
                    CalculateMethod method = CalculateMethod.of(operator);
                    String[] parameters = new String[] {value1, "0"};

                    if (method != null) {
                        String result = method.calculate(parameters);
                        model.addAttribute("result", result);
                    }
                }
                else if (value1 == null && value2 != null) {
                    CalculateMethod method = CalculateMethod.of(operator);
                    String[] parameters = new String[] {"0", value2};

                    if (method != null) {
                        String result = method.calculate(parameters);
                        model.addAttribute("result", result);
                    }
                }
                else {
                    CalculateMethod method = CalculateMethod.of(operator);
                    String[] parameters = new String[] {value1, value2};

                    if (method != null) {
                        String result = method.calculate(parameters);
                        model.addAttribute("result", result);
                    }
                }
            }

            CalculateMethod method = CalculateMethod.of(operator);
            String[] parameters = new String[] { value1, value2 };

            if (method != null) {
                String result = method.calculate(parameters);
                model.addAttribute("result", result);
            }
        }

        return "index";
    }
}
