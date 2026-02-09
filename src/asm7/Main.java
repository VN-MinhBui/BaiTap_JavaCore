package asm7;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Developer("D01", "Dat", 20_000_000, 10);
        employees[1] = new Tester("T02", "Tai", 10_000_000, 8);
        employees[2] = new Manager("M03", "Ming", 50_000_000, 20);

        double totalSalary = 0;
        double totalBonus = 0;

        for (Employee e : employees){
            System.out.println("----------------");
            e.showInfo();

            totalSalary += e.calculateSalary();

            if (e instanceof BonusEligible){
                double bonus = ((BonusEligible) e).calculateBonus();
                System.out.println("Bonus: " + bonus);
                totalBonus += bonus;
            }
        }

        System.out.println("=================");
        System.out.println("Total Salary: "+ totalSalary);
        System.out.println("Total Bonus: "+ totalBonus);
    }
}
