package asm5;

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new SavingAccount(10_000_000, "SA01");
        BankAccount b2 = new CheckingAccount(6_000_000, "CA02");
        BankAccount b3 = new VipAccount(80_000_000, "VA03");

        System.out.println("$===SavingAccount===$");
        b1.ruttien(1_000_000);
        b1.inSodu();

        System.out.println("$===CheckingAccount===$");
        b2.ruttien(6_000_000);
        b2.inSodu();

        System.out.println("$===VipAccount===$");
        b3.guitien(9_000_000);
        b3.ruttien(2_000_000);
        b3.inSodu();
    }
}
