package com.example.task1.JavaConfiguration;

import com.example.task1.XMLConfiguration.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Peta extends Person {

    private int age;

    public Peta(@Value("${peta.name}") String name, @Value("${peta.age}")int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printAge(){
        System.out.println(getName() + " age is " + age);
    }
}
