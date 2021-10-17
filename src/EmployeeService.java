package com.shpp.p2p.cs.ppolyak.LuxCampus.src;

import java.util.Arrays;

import static java.lang.Long.parseLong;

public class EmployeeService {

    public Employee[] employees;

    protected EmployeeService(Employee[] employees) {
        this.employees = employees;
    }

    protected void printEmployees() {
        Arrays.stream(employees).forEach(System.out::println);
    }

    protected double calculateSalaryAndBonus() {
        double salaries = 0;
        for (Employee employee : employees) {
            salaries += (employee.getSalary());
        }
        return salaries;
    }

    protected Employee getById(long id) {
        for (Employee employee : employees) {
            if (employee.getId() != id) {
                continue;
            }
            return employee;
        }
        return null;
    }

    protected Employee[] getByName(String name) {

        int c = 0;
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                c++;
            }
        }
        Employee[] array = new Employee[c];
        c = 0;
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                array[c] = employee;
                c++;
            }
        }
        return array;
    }

    protected Employee[] sortByName() {
        String[] names = new String[employees.length];
        Employee[] result = new Employee[employees.length];

        for (int i = 0; i < employees.length; i++) {
            names[i] = employees[i].getName() + "," + employees[i].getId();
        }
        Arrays.sort(names);
        for (int i = 0; i < employees.length; i++) {
            result[i] = (getById(parseLong(names[i].split(",")[1])));
        }

        return result;

    }

    protected Employee[] sortByNameAndSalary() {
        Employee[] names = sortByName();
        String[] salaries = new String[names.length];
        Employee[] result = new Employee[names.length];

        for (int i = 0; i < names.length; i++) {
            salaries[i] = names[i].getSalary() + "," + names[i].getId();
        }
        Arrays.sort(salaries);
        for (int i = 0; i < names.length; i++) {
            result[i] = (getById(parseLong(salaries[i].split(",")[1])));
        }

        return result;

    }

    protected Employee remove(long id) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                Employee delete = employees[i];
                employees[i] = null;
                return delete;
            }
        }
        return null;
    }

    protected Employee edit(Employee employee) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == employee.getId()) {
                employees[i] = employee;
            }
        }
        return null;
    }
}
