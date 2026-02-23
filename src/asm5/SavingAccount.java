package asm5;

public class SavingAccount extends BankAccount {
    public SavingAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    public void ruttien(double amount) {
        double fee = amount * 0.2;
        double total = amount + fee;

        if (total <= balance) {
            balance -= total;
            System.out.println("Rut: " + amount + ", Phi: " + fee);
        } else {
            System.out.println("Khong du so du de rut");
        }
    }
}
