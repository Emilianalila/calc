package com.example.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    @GetMapping("/add/{x}/{y}")
    public int add(@PathVariable int x, @PathVariable int y) {
        return x + y;
    }

    @GetMapping("/calc/{x}/{operator}/{y}")
    public int calc(@PathVariable int x, @PathVariable String operator, @PathVariable int y) {
        return switch (operator) {
            case "+" -> x + y;
            case "*" -> x * y;
            case "-" -> x - y;
            case "divide" -> x / y;
            default -> 0;
        };
    }
}
