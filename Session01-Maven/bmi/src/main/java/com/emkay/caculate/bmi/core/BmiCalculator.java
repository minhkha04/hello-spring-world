package com.emkay.caculate.bmi.core;

public class BmiCalculator {

    public static double calculate(double weight, double height) {
        double result = weight / (height * height);
        return result;
    }
}
