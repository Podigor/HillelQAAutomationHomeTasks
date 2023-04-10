package com.hometasks.lesson7;

public class ManualTestEngineer extends Employee {

    final String lastName;

    public ManualTestEngineer(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    @Override
    String getLastName() {
        return lastName;
    }

    @Override
    String getPosition() {
        return "Manual Test Engineer";
    }

    @Override
    String getSeniority() {
        return "Junior";
    }
}
