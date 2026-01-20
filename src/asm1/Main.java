package asm1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numerator 1: ");
        int n1 = sc.nextInt();
        System.out.println("Denominator 1: ");
        int d1 = sc.nextInt();
        Fraction a = new Fraction(n1, d1).simplified();
        System.out.print("Fraction 1 after simplified = ");
        a.print();

        System.out.println("Numerator 2: ");
        int n2 = sc.nextInt();
        System.out.println("Denominator 2: ");
        int d2 = sc.nextInt();
        Fraction b = new Fraction(n2, d2).simplified();
        System.out.print("Fraction 2 after simplified = ");
        b.print();

        Fraction tong = a.add(b);
        System.out.print("Tong = ");
        tong.print();

        Fraction hieu = a.sub(b);
        System.out.print("Hieu = ");
        hieu.print();

        Fraction tich = a.mul(b);
        System.out.print("Tich = ");
        tich.print();

        Fraction thuong = a.div(b);
        System.out.print("Thuong = ");
        thuong.print();
    }
}
