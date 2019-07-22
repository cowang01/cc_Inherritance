package staff;

public class Employee {

    private String name;
    private String NINumber;
    private double salery;

    public Employee(String name, String NINumber, double salery) {
        this.name = name;
        this.NINumber = NINumber;
        this.salery = salery;
    }




    public String getName() {
        return name;
    }

    public String getNINumber() {
        return NINumber;
    }

    public double getSalery() {
        return salery;
    }

    public void increaseSalery(double increase){
        this.salery += increase;
    }

    public double bonus(){
        double employeeBonus = this.salery / 100;
        return employeeBonus;
    }
}//
