package com.example.test;

public class BMICalculator {
    public static double calculateBMI(double weight, double height) {
        height = height / 100; // konwersja z cm na metry
        return weight / (height * height);
    }
}
