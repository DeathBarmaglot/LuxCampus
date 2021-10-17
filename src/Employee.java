package com.shpp.p2p.cs.ppolyak.LuxCampus.src;
import java.util.Date;

public class Employee {

    private long id;
    private String name;
    private int age;
    private String gender;
    private double salary;
    private int fixedBugs;
    private double defaultBugRate = 100;

    public Employee(String name, int age, String gender, double salary, int fixedBugs, double defaultBugRate, long id) {
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

    private void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public long getId() {
        return id;
    }

    private void setGender(String gender) {
        this.gender = gender;
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
        return "{ \"name\": " + getName() +
                ", \"age\": " + getAge() +
                ", \"gender\": " + getGender() +
                ", \"salary\": " + getSalary() +
                ", \"fixedBugs\": " + getFixedBugs() +
                ", \"bugsRate\": " + getDefaultBugRate() +
                ", \"id\": " + getId() + " }\n";
    }
}

