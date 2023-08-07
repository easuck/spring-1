package com.example.task1.JavaConfiguration;

import com.example.task1.XMLConfiguration.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Max extends Person {

    private int age;
    private String job;

    public Max(@Value("${max.name}") String name, @Value("${max.age}")int age, @Value("${max.job}")String job) {
        super(name);
        this.age = age;
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void printAge(){
        System.out.println(getName() + " age is " + age);
    }

    @Override
    public void printJob(){
        System.out.println(getName() + " is also a " + job);
    }
}
