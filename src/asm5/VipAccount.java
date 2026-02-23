package asm5;

public class VipAccount extends BankAccount {
    public VipAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    public void guitien(double amount) {
        double bonus = amount * 0.1;
        balance = amount + bonus;
        System.out.println("Da gui: " + amount + ", Thuong: "+ bonus);
    }

    @Override
    public void ruttien(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Da rut: "+ amount);
        } else {
            System.out.println("Khong du tien de rut");
        }
    }
}
