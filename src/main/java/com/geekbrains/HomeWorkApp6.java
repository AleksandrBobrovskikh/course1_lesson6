package com.geekbrains;

public class HomeWorkApp6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Котяха");
        Cat cat2 = new Cat("Котиха");
        Dog dog = new Dog("Пёсель");

        cat.run(200);
        cat.run(201);
        cat.swim(100);

        dog.run(500);
        dog.run(501);
        dog.swim(10);
        dog.swim(11);

        Animal.animalInfo();

    }
}
