package com.emkay.sb.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public void save() {
        System.out.println("Spring Data/Spring JPA has been call to generate JPQL");
    }
}
