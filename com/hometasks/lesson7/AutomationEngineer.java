package com.hometasks.lesson7;

public class AutomationEngineer extends Employee {
    final String lastName;

    public AutomationEngineer(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    @Override
    String getLastName() {
        return lastName;
    }

    @Override
    String getPosition() {
        return "Automation Engineer";
    }

    @Override
    String getSeniority() {
        return "Senior";
    }
}
