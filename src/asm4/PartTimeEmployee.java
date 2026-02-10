package asm4;

public class PartTimeEmployee extends Employee{
    private int hours;
    private double rate;

    public PartTimeEmployee(String name, String id, int hours, double rate) {
        super(name, id);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double getSalary() {
        return hours * rate;
    }
}
