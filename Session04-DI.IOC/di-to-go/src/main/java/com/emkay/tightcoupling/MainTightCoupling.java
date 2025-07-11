package com.emkay.tightcoupling;

public class MainTightCoupling {

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.registerUser(new Account());
    }
}
