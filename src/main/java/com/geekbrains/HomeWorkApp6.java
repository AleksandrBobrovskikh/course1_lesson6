package com.geekbrains;

class Animal {
    protected String name;
    protected static int animalCount = 0;
    protected static int catCount = 0;
    protected static int dogCount = 0;

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

    public void run (int meters){
        System.out.println(name + " пробежал " + meters + " m.");
    }

    public void swim (int meters){
        System.out.println(name + " проплыл " + meters + " m.");
    }

    public static void animalInfo(){
        System.out.println();
        System.out.println("Всего создано животных: " + animalCount);
        System.out.println("Из них котов: " + catCount);
        System.out.println("Из них собак: " + dogCount);
    }

}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int meters){
        if (meters > 200)
            System.out.println("Кот по имени " + name + " не смог пробежать " + meters + "м, и умер. " + '\u2639');
        else
            System.out.println("Кот по имени " + name + " пробежал " + meters + "м.");
    }

    @Override
    public void swim(int meters){
        System.out.println(name + " не умеет плавать и " + meters + "м ему не под силу.");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int meters) {
        if (meters > 500)
            System.out.println("Пёс по имени " + name + " не смог пробежать " + meters + "м, и умер. " + '\u2639');
        else
            System.out.println("Пёс по имени " + name + " пробежал " + meters + "м.");
    }

    @Override
    public void swim(int meters) {
        if (meters > 10)
            System.out.println("Пёс по имени " + name + " не смог проплыть " + meters + "м, и утонул. " + '\u2639');
        else
            System.out.println("Пёс по имени " + name + " проплыл " + meters + "м.");
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
