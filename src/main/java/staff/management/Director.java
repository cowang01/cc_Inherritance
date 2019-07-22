package staff.management;

import staff.Employee;

public class Director extends Employee {

    private double budget;

    public Director(String name, String NINumber, double salery, double budget) {
        super(name, NINumber, salery);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double bonus(){
        double employeeBonus = this.getSalery() / 50;
        return employeeBonus;
    }
}
