package asm5;

public class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void guitien(double amount) {
        if (amount >0) {
            balance += amount;
            System.out.println("Da gui: " + amount);
        }
    }

    public void ruttien(double amount) {
        if (amount >0 && amount <= balance) {
            balance -= amount;
            System.out.println("Da rut: " + amount);
        } else {
            System.out.println("Khong du tien de rut");
        }
    }

    public void inSodu() {
        System.out.println("So du: " + balance);
    }
}
