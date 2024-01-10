package com.mymall.mymall.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "v1/")
public class Test {

    @GetMapping(path = "/test")
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

}