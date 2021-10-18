package com.shpp.p2p.cs.ppolyak.LuxCampus.src;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Employee[] employees = EmployeeFactory.generateEmployees(10);
        EmployeeService workers = new EmployeeService(employees);
        workers.printEmployees();

        double salaries = workers.calculateSalaryAndBonus();
        System.out.println(salaries);

        Employee[] worker = workers.getByName("John");

        System.out.println(Arrays.toString(worker));


        Employee middle = workers.getById(5);
        System.out.println(middle);


//        Employee[] dev = new Developer();

//        Employee[] sortedName = workers.sortByName();
//        System.out.println(Arrays.toString(sortedName));
//
//        Employee[] sortedSalary = workers.sortByNameAndSalary();
//        System.out.println(Arrays.toString(sortedSalary));


    }
}