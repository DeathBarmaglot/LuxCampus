package com.shpp.p2p.cs.ppolyak.LuxCampus.src;

import java.util.Arrays;

public class Employee {
    protected long id;
    private String name;
    private int age;
    private String gender;
    protected double salary;
    private int fixedBugs;
    private double defaultBugRate;

    public Employee(long id, String name, int age, double salary, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public Employee(long id, String name, int age, double salary, String gender, double defaultBugRate,int fixedBugs ) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.fixedBugs = fixedBugs;
        this.defaultBugRate = defaultBugRate;
    }

    public double getDefaultBugRate() {
        return defaultBugRate;
    }

    private void setDefaultBugRate(double defaultBugRate) {
        this.defaultBugRate = defaultBugRate;
    }

    public int getFixedBugs() {
        return fixedBugs;
    }

    private void setFixedBugs(int fixedBugs) {
        this.fixedBugs = fixedBugs;
    }

    public double getSalary() {
        return salary + fixedBugs * defaultBugRate;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "{ \"id\": " + getId() +
                ", \"name\": " + getName() +
                ", \"age\": " + getAge() +
                ", \"gender\": " + getGender() +
                ", \"salary\": " + getSalary() +
//                ", \"fixedBugs\": " + getFixedBugs() +
//                ", \"bugsRate\": " + getDefaultBugRate() +
                " }\n";
    }
    public static void print(String string, Employee[] worker){
        System.out.println(string + Arrays.toString(worker));
    }
    public static void print(String string, Employee employee){
        System.out.println(string + employee);
    }
}
