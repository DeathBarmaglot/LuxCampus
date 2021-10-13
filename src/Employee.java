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
    this.id = (new Date().getTime() / 1000L) % Integer.MAX_VALUE;
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
        return salary + fixedBugs * defaultBugRate/100;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
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

    public String toSting() {
        return "Employee ( " +
                "Name: " + getName() +
                ", age: " + getAge() +
                ", gender: " + getGender() +
                "\n Salary: " + getSalary() +
                ", fixed bugs: " + getFixedBugs() +
                ", default bug rate: " + getDefaultBugRate() + ")\n";
    }

}
