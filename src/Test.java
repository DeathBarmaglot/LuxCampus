package com.shpp.p2p.cs.ppolyak.LuxCampus;

public class Test {

    public static void main(String[] args) {
        EmployeeFactory employee = new EmployeeFactory();
        Employee[] employees = employee.createEmployees(20);
        EmployeeService coworkers = new EmployeeService(employees);
        coworkers.print();

    }
}