package com.hometasks.lesson7;

public abstract class Employee {
    final String name;

    public Employee(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
    String getLastName() {
        return "";
    }
    abstract String getPosition();

    abstract String getSeniority();

    String getInfo() {
        return getName() + " " + getLastName() + " is a " + getSeniority() + " " + getPosition();
    }
}
