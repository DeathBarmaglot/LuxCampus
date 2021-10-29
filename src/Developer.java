package com.shpp.p2p.cs.ppolyak.LuxCampus.src;

import java.util.Random;

public class Developer extends Employee{
    int fixedBugs;
    double rate;

    public Developer(long id, String name, int age, double salary, String gender, double rate, int fixedBugs) {
        super(id, name, age, salary, gender);
        this.rate = rate;
        this.fixedBugs = fixedBugs;
    }

    public double getSalary() {
        double salary = this.salary + (this.rate * this.fixedBugs) * (new Random().nextBoolean() ? 2 : 0);
        setSalary(salary);
        return salary;
    }

    @Override
    public String toString() {
        return "Developer: "+  super.toString() +"{ rate: " + this.rate + ", fixedBugs: " + this.fixedBugs+" }\n";
    }

}
