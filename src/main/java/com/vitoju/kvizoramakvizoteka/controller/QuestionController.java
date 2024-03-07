package com.vitoju.kvizoramakvizoteka.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("questions")
public class QuestionController {

@GetMapping
    public ResponseEntity<String> svaPitanja() {
        return new ResponseEntity<>("Sva pitanja", HttpStatus.OK);
    }
}
