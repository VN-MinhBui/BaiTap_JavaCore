package asm4;

public class Vehicle {
    protected String name;
    protected int maxSpeed;

    public Vehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void move() {
        System.out.println("Vehicle is moving");
    }
}
