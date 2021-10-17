package com.shpp.p2p.cs.ppolyak.LuxCampus.src;

import java.util.Date;

public class Employee {

    private long id;
    private String name;
    private int age;
    private String gender;
    private double salary;
    private int fixedBugs;
    private double defaultBugRate = 100 ;
    private static int count = 0;

    public Employee (String name, int age, String gender, double salary, int fixedBugs, double defaultBugRate, long id){
    this.id = id;
    this.name = name;
    this.age = age;
    this.gender =gender;
    this.salary = salary;
    this.fixedBugs = fixedBugs;
    this.defaultBugRate = defaultBugRate;
    count++;
    }

    public double getDefaultBugRate() {
        return defaultBugRate;
    }

    public void setDefaultBugRate(double defaultBugRate) {
        this.defaultBugRate = defaultBugRate;
    }

    public int getFixedBugs() {
        return fixedBugs;
    }

    public void setFixedBugs(int fixedBugs) {
        this.fixedBugs = fixedBugs;
    }

    public double getSalary() {
        return salary + fixedBugs * defaultBugRate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public long getId() {
        return id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Employee = {"  +
                " name: " + getName(name) +
                ", age: " + getAge() +
                ", gender: " + getGender() +
                ", salary: " + getSalary() +
                ", fixed bugs: " + getFixedBugs() +
                ", bug rate: " + getDefaultBugRate() +
                ", ID: " + getId() + " }\n";
    }

    public String getNames() {
        return this.name;
    }
}
