package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MayTinh {
    @RequestMapping("/maytinh")
    public String calculate(@RequestParam(value = "firstOperand", required = false, defaultValue = "0") double firstOperand,
                            @RequestParam(value = "secondOperand", required = false, defaultValue = "0") double secondOperand,
                            @RequestParam(value = "operator", required = false, defaultValue = "+") String operator,
                            ModelMap model) {
        double result = 0;
        switch (operator) {
            case "+": {
                result = firstOperand + secondOperand;
                operator = "Addition";
                break;
            }
            case "-": {
                result = firstOperand - secondOperand;
                operator = "Subtraction";
                break;
            }
            case "*": {
                result = firstOperand * secondOperand;
                operator = "Multiplication";
                break;
            }
            case "/": {
                result = firstOperand / secondOperand;
                operator = "Division";
                break;
            }
        }
        model.addAttribute("result", result);
        model.addAttribute("operator", operator);
        model.addAttribute("firstOperand", firstOperand);
        model.addAttribute("secondOperand", secondOperand);
        return "index";
    }
}

