package com.hometasks.lesson8;

public class BigDog extends Dog {

    public BigDog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Woow");
    }

    @Override
    void greets(Dog dog) {
        System.out.println("Woooow");
    }

    void greets(BigDog bigDog) {
        System.out.println("Woooooooow");
    }
}
