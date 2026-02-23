package asm5;

public class CheckingAccount extends BankAccount {

    private final double LIMIT = -5_000_000;

    public CheckingAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    public void ruttien(double amount) {
        if (balance - amount >= LIMIT) {
            balance -= amount;
            System.out.println("Da rut: " + amount);
        } else {
            System.out.println("Khong the rut vuot qua 5tr");
        }
    }
}
