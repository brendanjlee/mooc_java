package org.example;

public class Main {
    public static void main(String[] args) {
        // Overloading
        Product tape = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        System.out.println(tape);
        System.out.println(plaster);
        System.out.println(tyre);
        newline();

        // Objects as parameters
        HealthStation childrensHospital = new HealthStation();
        Person ethan = new Person("Ethan", 1, 110, 7);

        System.out.println(ethan);
        childrensHospital.feed(ethan);
        System.out.println(ethan);

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        System.out.println("weighings performed: " + childrensHospital.weighings());
        newline();

        // Terminal with card
        PaymentTerminal unicafeExactum = new PaymentTerminal(1000);

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change: " + change);

        PaymentCard annesCard = new PaymentCard(7);

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = unicafeExactum.eatAffordably(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println(unicafeExactum);
        newline();

        // ahge
        Person p1 = new Person("john", 11, 11, 11);
        Person p2 = new Person("Joe", 123, 11, 11);
        System.out.println(p1.olderThan(p2));
        System.out.println(p1.equals(p1));
    }

    public static void newline() {
        System.out.println("------------");
    }
}