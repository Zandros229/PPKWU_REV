package com.example.demo.controllers;

import com.example.demo.services.StringReverser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StringReverserController {

    @Autowired
    StringReverser stringReverser;

    @GetMapping("string/{word}")
    public String reversWord(@PathVariable String word) {
        return stringReverser.reverseString(word);
    }
}
