package com.hometasks.lesson7;

public class JavaDeveloper extends Employee {

    public JavaDeveloper(String name) {
        super(name);
    }

    @Override
    String getPosition() {
        return "Java Developer";
    }

    @Override
    String getSeniority() {
        return "Senior";
    }
}
