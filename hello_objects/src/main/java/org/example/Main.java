package org.example;

public class Main {
    public static void main(String[] args) {
        // Creat person objects
        Person joe = new Person("Joe");
        Person ada = new Person("Ada");
        Person kim = new Person("Kim");

        // use the print method
        joe.printPerson();
        ada.printPerson();
        kim.printPerson();

        // use a setter method
        joe.growOlder();
        joe.printPerson();

        for (int i = 0; i < 18; i++) {
            joe.growOlder();
        }
        System.out.println(joe);
        System.out.println(joe.isLegal());

        joe.setHeight(180);
        joe.setWeight(80);
        System.out.println(joe);
    }
}