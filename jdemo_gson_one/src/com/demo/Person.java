package com.demo;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getAge() {
        return this.age;
    }

    public String desc() {
        return "My name is " + this.name + " now i am " + age + "years old";
    }

}
