package org.example;

import java.util.Objects;

public class Person {
    private final String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name) {
        this(name, 0, 0, 0);
    }

    public Person(String name, int age, int weight, int height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void printPerson() {
        System.out.println(this.name + " is " + this.age + " years old");
    }

    public void growOlder() {
        this.age++;
    }

    public boolean isAdult() {
        return this.age >= 18;
    }

    public double bodyMassIndex() {
        double heightInMeters = this.height / 100.0;
        return this.weight / (heightInMeters * heightInMeters);
    }

    public String toString() {
        return this.name + " is " + this.age + " years old, their BMI is " + this.bodyMassIndex();
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean olderThan(Person compared) {
        return this.age > compared.age;
    }

    public boolean equals(Person compared) {
        return (
                Objects.equals(this.name, compared.getName())
                && this.getAge() == compared.getAge()
                && this.getWeight() == compared.getWeight()
                && this.getHeight() == compared.getHeight()
                );
    }
}
