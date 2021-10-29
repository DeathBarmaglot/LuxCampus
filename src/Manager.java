package com.shpp.p2p.cs.ppolyak.LuxCampus.src;
public class Manager extends Employee{

    public Manager(long id, String name, int age, double salary, String gender) {
        super(id, name, age, salary, gender);
    }

    @Override
    public String toString() {
        return "Manager: "+ super.toString();
    }


}
