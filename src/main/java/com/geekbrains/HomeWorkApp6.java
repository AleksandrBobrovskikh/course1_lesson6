package com.geekbrains;

class Animal {
    protected String name;
    protected static int animalCount = 0;
    protected static int catCount = 0;
    protected static int dogCount = 0;
    protected int catMaxRunValue = 200;
    protected int dogMaxRunValue = 500;
    protected int dogMaxSwimValue = 10;


    public Animal(String name) {
        this.name = name;
        animalCount++;
    }


    protected String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int meters) {
        System.out.println(name + " пробежал " + meters + " m.");
    }

    public void swim(int meters) {
        System.out.println(name + " проплыл " + meters + " m.");
    }

    public static void animalInfo() {
        System.out.println();
        System.out.println("Всего создано животных: " + animalCount);
        System.out.println("Из них котов: " + catCount);
        System.out.println("Из них собак: " + dogCount);
    }

}





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
