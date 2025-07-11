package com.emkay;

import com.emkay.entity.Employee;
import com.emkay.entity.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Student s1 = new Student("101", "Kay", 1999, 3.8);
        System.out.println(s1);
        Employee e1 = new Employee("102", "Emkay", 1998, 10000);
        System.out.println(e1);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String jsonString = objectMapper.writeValueAsString(e1);
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jon = """
                {"id":"102","name":"Emkay","yob":1998,"salary":10000.0}
                """;
        Employee e2 = objectMapper.readValue(jon, Employee.class);
        System.out.println(e2);
    }
}