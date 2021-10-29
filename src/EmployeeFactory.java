package com.shpp.p2p.cs.ppolyak.LuxCampus.src;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class EmployeeFactory {
    public static int count = 0;

    public static Employee generateEmployees() {

        Random random = new Random();

//        long id =  Math.abs(random.nextLong() * 1000);
        int age = random.nextInt(60 - 15) + 15;
        String gender = random.nextBoolean() ? "man" : "woman";
        double salary = (int) (random.nextDouble() * 10000 + 20000);
        int bugs = (int) (random.nextDouble() * 50 + 20);
        double percent = (int) (random.nextDouble() * 50 + 50);
        String[] mans = {"Roy", "John", "Jimmy", "Thomas", "Albert", "Charlie", "Michael", "Howard", "James", "Marvin", "Jordan", "William", "Wayne", "Jeremy", "Robert", "Edwards", "Chester", "Daniel"};
        String[] women = {"Mary", "Patricia", "Karen", "Rita", "Dolores", "Pauline", "Agnes", "Kristin", "Dawn", "Lisa", "Carolyn", "Ashley", "Maria", "Lillian", "Frances", "Marian", "Alice", "Helen", "Linda"};
//        String[] position = {"Manager", "Developer", "Designer"};
        int offer = random.nextInt(4);
        int days = random.nextInt(7) + 1;

        String name = gender.equals("man")
                ? mans[random.nextInt(mans.length - 1)]
                : women[random.nextInt(women.length - 1)];

        count += 1;

        switch (offer) {
            case 0:
                return new Manager(count, name, age, salary, gender);
            case 1:
                return new Developer(count, name, age, salary, gender, percent, bugs);
            case 2:
                return new Designer(count, name, age, salary, gender, percent, days);
            default:
                return new Employee(count, name, age, salary, gender, percent, bugs);
        }
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