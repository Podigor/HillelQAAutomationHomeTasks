package com.hometasks.lesson7;

public class AngularDeveloper extends Employee {

    public AngularDeveloper(String name) {
        super(name);
    }

    @Override
    String getPosition() {
        return "Angular Developer";
    }

    @Override
    String getSeniority() {
        return "Middle";
    }
}
