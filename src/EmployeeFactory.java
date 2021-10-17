package com.shpp.p2p.cs.ppolyak.LuxCampus.src;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class EmployeeFactory {

    public static Employee generateEmployees() {

        Random random = new Random();
        long id =  Math.abs(random.nextLong() * 1000);
        int age = random.nextInt(70  - 15) + 15;
        String gender = random.nextBoolean() ? "man" : "woman";
        double salary = BigDecimal.valueOf(random.nextDouble() * 10000 + 5000).setScale(2, RoundingMode.HALF_UP).doubleValue();
        int bugs = random.nextInt(100  - 15) + 15;
        int percent = random.nextInt(100  - 15) + 15;
        String[] nameMan = {"Roy", "John", "Jimmy", "Thomas", "Albert", "Charlie", "Michael", "Howard", "James", "Marvin", "Jordan", "William", "Wayne", "Jeremy", "Robert", "Edwards", "Chester", "Daniel"};
        String[] nameWomen = {"Mary", "Patricia", "Karen", "Rita", "Dolores", "Pauline", "Agnes", "Kristin", "Dawn", "Lisa", "Carolyn", "Ashley", "Maria", "Lillian", "Frances", "Marian", "Alice", "Helen", "Linda"};

        String name;
        if (gender.equals("man")){
             name = nameMan[random.nextInt(nameMan.length - 1)];
        } else {
            name = nameWomen[random.nextInt(nameWomen.length - 1)];
        }


        return new Employee(name, age, gender, salary, bugs, percent, id);
    }

    public static Employee[] generateEmployees(int size) {
        Employee[] employees = new Employee[size];
        int i = 0;
        while (i < size) {
            employees[i] = generateEmployees();
            i++;
        }
        return employees;
    }
}