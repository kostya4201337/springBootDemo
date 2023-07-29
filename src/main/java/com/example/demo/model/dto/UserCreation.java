package com.example.demo.model.dto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserCreation {

    private static final String ageValidError = "age validation error";

    private String name;

    private int age;

    private String password;

    public UserCreation(final String name, final int age, final String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public boolean setAge(int age) {
        if (age < 0) {
            log.error(ageValidError);
            throw new RuntimeException(ageValidError);
        } else {
            this.age = age;
            return true;
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}
