package OOP;

public class Employee {

    String name;
    String surname;
    double salary = 2500;
    String position;
    int experience = 4;
    int new_experience = experience + 1;

    public Employee(String name, String surname, double salary, String position, int experience, int new_experience) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.position = position;
        this.experience = experience;
        this.new_experience = new_experience;
    }

    public void employeeRecord() {
        System.out.println("Name " + this.name);
        System.out.println(("Surname " + this.surname));
        System.out.println("Salary " + this.salary);
        System.out.println("Position " + this.position);
        System.out.println("Experience " + this.experience);
        System.out.println("New experience " + this.new_experience);
    }



}