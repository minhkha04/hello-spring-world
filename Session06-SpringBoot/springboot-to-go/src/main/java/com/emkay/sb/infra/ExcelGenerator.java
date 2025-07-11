package com.emkay.sb.infra;

import org.springframework.stereotype.Component;

@Component
public class ExcelGenerator {

    public void generateExcel(String fileName) {
        System.out.println("The " + fileName + " has been generated.");
    }
}
