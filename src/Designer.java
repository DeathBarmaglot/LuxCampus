package com.shpp.p2p.cs.ppolyak.LuxCampus.src;

public class Designer extends Employee{

    int workedDays;
    double rate;

    public Designer(int id, String name, int age, double salary, String gender, double rate, int workedDays) {
        super(id, name, age, salary, gender);
        this.rate = rate;
        this.workedDays = workedDays;

}

    public double getSalary() {
        double salary = this.salary + this.rate * this.workedDays;
        setSalary(salary);
        return salary;
    }


    @Override
    public String toString() {
        return "Designer: "+ super.toString()+"{ rate: " + this.rate + ", workedDays: "+ this.workedDays+" }\n";
    }

}
