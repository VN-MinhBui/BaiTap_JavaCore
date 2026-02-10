package asm4;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Ming", "M01", 10.000);
        Employee e2 = new PartTimeEmployee("Trang", "T02", 66, 20.000);

        System.out.println("Lương Ming: "+ e1.getSalary());
        System.out.println("Lương Trang: "+ e2.getSalary());
    }
}
