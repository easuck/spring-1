package com.example.task1.XMLConfiguration;

public class Vanya extends Person {

    private int age;
    private String job;

    public Vanya(String name, int age, String job) {
        super(name);
        this.age = age;
        this.job = job;
    }

    public Vanya(){}

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
