package com.lahey;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        System.out.println(dog.getAnimalName());
        System.out.println(dog.eats());
        System.out.println(dog.sleeps());
        System.out.println(dog.myThoughts());


        Animal a = new Animal();
        System.out.println(a.eats());
        System.out.println(a.sleeps());

        Cat c = new Cat();
        System.out.println(c.eats());
        System.out.println(c.sleeps());


        Bird b = new Bird();
        System.out.println(b.eats());
        System.out.println(b.sleeps());
        System.out.println(b.fly());



    }
}
