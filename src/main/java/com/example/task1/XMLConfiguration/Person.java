package com.example.task1.XMLConfiguration;

public abstract class Person implements Agable, Jobable {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public void printAge(){
        System.out.println("default age");
    }

    public void printJob(){
        System.out.println("default job");
    }
}
