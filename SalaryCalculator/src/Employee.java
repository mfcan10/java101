public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double calculateTax() {
        if (salary > 1000) {
            return salary * 0.03;
        } else {
            return 0;
        }
    }

    public int calculateBonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double calculateRaise() {
        final int currentYear = 2021;
        double raise = 0;
        int yearsWorked = currentYear - hireYear;
        if ((yearsWorked) < 10) {
            raise = salary * 0.05;
        } else if (9 < (yearsWorked) && (yearsWorked) < 20) {
            raise = salary * 0.10;
        } else if (19 < (yearsWorked)) {
            raise = salary * 0.15;
        }
        return raise;
    }

    public String toString() {
        double tax = calculateTax();
        int bonus = calculateBonus();
        double raiseAmount = calculateRaise();

        return "Name: " + this.name + "\n" +
                "Salary: " + this.salary + " ₺\n" +
                "Hire Year: " + this.hireYear + "\n" +
                "Tax: " + tax + " ₺\n" +
                "Bonus: " + bonus + " ₺\n" +
                "Salary Raise: " + raiseAmount + " ₺\n" +
                "Salary (after tax and bonus): " + (this.salary - tax + bonus) + " ₺\n"+
                "Total Salary: "+((this.salary - tax + bonus)+raiseAmount)+" ₺";
    }
}
