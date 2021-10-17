package com.shpp.p2p.cs.ppolyak.LuxCampus.src;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Employee[] employees = EmployeeFactory.generateEmployees(50);
        EmployeeService workers = new EmployeeService(employees);

        double salaries = workers.calculateSalaryAndBonus();
        System.out.println(salaries);
        Employee[] worker = workers.getByName("Jimmy");
        System.out.println(Arrays.toString(worker));
       workers.sortByName();


    }
}