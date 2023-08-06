package com.example.task1.Entities;

import org.springframework.beans.factory.annotation.Autowired;

public class Ason extends Person {

    private int age;

    public Ason(String name, int age) {
        super(name);
        this.age = age;
    }

    public Ason(){}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void printAge(){
        System.out.println(getName() + " age is " + age);
    }
}
