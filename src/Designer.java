package com.shpp.p2p.cs.ppolyak.LuxCampus.src;
import java.util.Random;


public class Designer extends Employee{

    int workedDays;
    int rate;

    public Designer(int id, String name, int age, double salary, String gender, double rate, int workedDays) {
        super(id, name, age, salary, gender, rate, workedDays);



    }

    double getDevSalary() {
        return getSalary() + rate  * workedDays;
    }


    @Override
    public String toString() {
        return "Designer: "+ super.toString() ;
    }

}
