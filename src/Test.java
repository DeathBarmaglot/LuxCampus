package com.shpp.p2p.cs.ppolyak.LuxCampus.src;

public class Test {

    public static void main(String[] args) {

        Employee[] employees = EmployeeFactory.generateEmployees(50);
        EmployeeService workers = new EmployeeService(employees);

        double salaries = workers.calculateSalaryAndBonus();
        System.out.println(salaries);

        Employee[] worker = workers.getByName("John");
//        System.out.println(Arrays.toString(worker));
        Employee[] sortedName = workers.sortByName();
//        System.out.println(Arrays.toString(sortedName));
        Employee[] sortedSalary = workers.sortByNameAndSalary();
//        System.out.println(Arrays.toString(sortedSalary));


    }
}