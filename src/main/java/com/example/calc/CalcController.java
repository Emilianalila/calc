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

}
