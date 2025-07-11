package com.emkay;


import com.emkay.caculate.bmi.core.BmiCalculator;
import com.emkay.print.test.HelloWord;

public class Main {
    public static void main(String[] args) {
        double bmiValue = BmiCalculator.calculate(65, 1.77);
        System.out.println("BMI: " + bmiValue);

        String helloKha = HelloWord.printHello("Kha");
        System.out.println(helloKha);
    }
}