package com.flatironschool.codedemosqlite.Models;

/**
 * Created by altyus on 11/17/14.
 */
public class Dog {

    private String mName;
    private int mAge;
    private String mBreed;

    public Dog(String name, int age, String breed) {
        mName = name;
        mAge = age;
        mBreed = breed;
    }

    public String getName() {
        return mName;
    }

    public int getAge() {
        return mAge;
    }

    public String getBreed() {
        return mBreed;
    }
}
