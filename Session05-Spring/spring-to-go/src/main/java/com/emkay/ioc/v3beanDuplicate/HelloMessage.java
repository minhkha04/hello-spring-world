package com.emkay.ioc.v3beanDuplicate;

public class HelloMessage {

    private String mediumType;

    public HelloMessage(String mediumType) {
        this.mediumType = mediumType;
    }

    public void sayHello() {
        System.out.println("Type: " + mediumType);
        System.out.println("Ioc Container V3");
    }
}
