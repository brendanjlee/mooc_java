package org.example;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
        this.weight = 0;
        this.height = 0;
    }

    // Setter: increment age
    public void growOlder() {
        this.age++;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    // Getter: get the age
    public int getAge() {
        return this.age;
    }

    // get name
    public String getName() {
        return this.name;
    }

    public boolean isLegal() {
        return (this.age > 18);
    }

    // tostring
    public String toString() {
        return (this.name + ", age " + this.age + " years. Height: " + this.height
                + " Weight: " + this.weight);
    }

    // print
    public void printPerson() {
        System.out.println(this.toString());
    }
}
