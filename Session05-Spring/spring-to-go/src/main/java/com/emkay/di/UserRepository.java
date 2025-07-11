package com.emkay.di;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public void getAll() {
        System.out.println("Here is the list of user from table");
    }
}
