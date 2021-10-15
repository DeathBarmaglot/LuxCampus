package com.shpp.p2p.cs.ppolyak.LuxCampus;
import java.util.Arrays;

public class EmployeeService {

    public Employee[] employees;

    public EmployeeService(Employee[] employees) {
        this.employees = employees;
    }

    public void print() {
        Arrays.stream(employees).forEach(System.out::println);
    }

}