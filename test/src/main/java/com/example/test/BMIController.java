package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BMIController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/calculateBMI")
    public String calculateBMI(@RequestParam("weight") double weight,
                               @RequestParam("height") double height,
                               Model model) {
        double bmi = BMICalculator.calculateBMI(weight, height);
        model.addAttribute("bmi", bmi);
        return "index";
    }
}
