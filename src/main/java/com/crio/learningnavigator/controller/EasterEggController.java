package com.crio.learningnavigator.controller;

import com.crio.learningnavigator.service.NumberFactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EasterEggController {

    private final NumberFactService numberFactService;

    @Autowired
    public EasterEggController(NumberFactService numberFactService) {
        this.numberFactService = numberFactService;
    }

    @GetMapping("/hidden-feature/{number}")
    public ResponseEntity<String> getNumberFact(@PathVariable int number) {
        return ResponseEntity.ok(numberFactService.getNumberFact(number));
    }
}
