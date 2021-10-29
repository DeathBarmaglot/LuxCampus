package com.shpp.p2p.cs.ppolyak.LuxCampus.src;
import static com.shpp.p2p.cs.ppolyak.LuxCampus.src.Employee.print;

public class Test {

    public static void main(String[] args) {

        Employee[] employees = EmployeeFactory.generateEmployees(10);
        EmployeeService workers = new EmployeeService(employees);
        workers.printEmployees();

        double salaries = workers.calculateSalaryAndBonus();
        System.out.println("Total money this month for employees: "+ salaries+"\n");

        Employee middle = workers.getById(5);
        print("Employee #5: ", middle);

        Employee[] worker = workers.getByName("John");
        print("Employee John: ", worker);

        Employee[] sortedName = workers.sortByName();
        print("Sorted Employees By Name: ", sortedName);

        Employee[] sortedSalary = workers.sortByNameAndSalary();
        print("Sorted Employees By Name And By Salary: ", sortedSalary);

        Employee change = workers.edit(new Employee(4, "Jeremy", 25, 29159.0, "man"));
        print("Employee #4 edit: ", change);

        Employee remove = workers.remove(7);
        print("Employee #7 removes: ", remove);

    }
}