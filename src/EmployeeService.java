package com.shpp.p2p.cs.ppolyak.LuxCampus.src;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.stream.Stream;

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
        return BigDecimal.valueOf(salaries).setScale(2, RoundingMode.HALF_UP).doubleValue();
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
            if (employee.getName(name).equals(name)) {
                c++;
            }
        }
        Employee[] array = new Employee[c];
        c = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName(name).equals(name)) {
                array[c] = employees[i];
                c++;
            }
        }
        return array;
    }

    protected void sortByName() {
        String[] names = new String[employees.length];

        for (int i = 0; i < employees.length; i++) {
            names[i] = employees[i].getNames()+","+employees[i].getSalary()+","+employees[i].getId();
        }
        Arrays.sort(names);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(Arrays.toString(names[i].split(",")));
        }
//            Arrays.toString(names));

//    return array;

    }
}
//    Employee edit(Employee) -> находит сотрудника по id, и подменяет информацию о нем на новую. Старую версию сотрудника метод возвращает.
//    Employee remove(long id) -> находит сотрудника по id, и удаляет его из массива. Возвращает ссылку на удаленного сотрудника.
