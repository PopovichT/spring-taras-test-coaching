package com.example.springtestingtrainer.service;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int multiplicate(int a, int b) {
        return a * b;
    }

    public Integer divide(int a, int b) {
        if (b == 0) {
            return null;
        }
        return a / b;
    }

    public Integer countWords(String word) {
        return  word.length();
    }
}
