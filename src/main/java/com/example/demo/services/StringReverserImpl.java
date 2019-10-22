package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class StringReverserImpl implements StringReverser {

    @Override
    public String reverseString(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            stringBuilder.append(word.charAt(i));
        }
        return stringBuilder.toString();
    }
}
