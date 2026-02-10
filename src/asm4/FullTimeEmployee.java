package asm4;

public class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(String name, String id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }
}
