package com.geekbrains;

class Dog extends Animal {

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int meters) {
        if (meters > dogMaxRunValue)
            System.out.println("Пёс по имени " + name + " не смог пробежать " + meters + "м, и умер. " + '\u2639');
        else
            System.out.println("Пёс по имени " + name + " пробежал " + meters + "м.");
    }

    @Override
    public void swim(int meters) {
        if (meters > dogMaxSwimValue)
            System.out.println("Пёс по имени " + name + " не смог проплыть " + meters + "м, и утонул. " + '\u2639');
        else
            System.out.println("Пёс по имени " + name + " проплыл " + meters + "м.");
    }
}
