package asm4;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Ming", "M01", 10.000);
        Employee e2 = new PartTimeEmployee("Trang", "T02", 66, 20.000);

        System.out.println("Lương Ming: "+ e1.getSalary());
        System.out.println("Lương Trang: "+ e2.getSalary());

        Vehicle[] list = {
                new Car("BMW", 540),
                new Bike("Ducati", 400),
                new Train("Vinfast", 678),
                new Plane("VietNamAirline", 2345)
        };

        for (Vehicle v: list) {
            v.move();
        }

        Animal[] animals = {
                new Lion("Trang"),
                new Elephant("Trangg"),
                new Monkey("Ming")
        };

        for (Animal a: animals) {
            a.eat();
        }
    }
}
