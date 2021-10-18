package com.shpp.p2p.cs.ppolyak.LuxCampus.src;
import java.util.Random;


public class Developer extends Employee{
    public Developer(long id, String name, int age, double salary, String gender, int fixedBugs) {
        super(id, name, age, salary, gender, fixedBugs);

    }

//    double getDevSalary() {
//        return salary + this.getFixedBugs() * this.getDefaultBugRate() * (new Random().nextBoolean() ? 2 : 0);
//    }


    @Override
    public String toString() {
        return "Developer: "+  super.toString();
    }

}
