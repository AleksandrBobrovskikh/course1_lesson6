package com.geekbrains;

class Cat extends Animal {

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int meters) {
        if (meters > catMaxRunValue)
            System.out.println("Кот по имени " + getName() + " не смог пробежать " + meters + "м, и умер. " + '\u2639');
        else
            System.out.println("Кот по имени " + getName() + " пробежал " + meters + "м.");
    }

    @Override
    public void swim(int meters) {
        System.out.println(getName() + " не умеет плавать и " + meters + "м ему не под силу.");
    }
}
