package com.hometasks.lesson7;

import java.util.Arrays;

public class Manager extends Employee {
    final String lastName;
    Employee[] team;

    public Manager(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }
    void setTeamMembers(Employee... members) {
        this.team = members;
    }
    @Override
    String getPosition() {
        return "Manager";
    }

    @Override
    String getSeniority() {
        return "Senior";
    }

    @Override
    String getLastName() {
        return lastName;
    }


// This method accepts array of Employee instances and returns String array with employee names to use it in getInfo()
    String[] getStringArrayOfTeamMembersNames(Employee[] team) {
        String[] stringArray = new String[team.length];
        for(int i = 0; i < team.length; i++) {
            stringArray[i] = team[i].getName();
        }
         return stringArray;
    }

    @Override
    String getInfo() {
        return super.getInfo() + " and has a team of " + team.length + " members: "
                + Arrays.toString(getStringArrayOfTeamMembersNames(team));
    }
}
