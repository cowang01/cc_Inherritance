package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String NINumber, double salery, String deptName) {
        super(name, NINumber, salery);
        this.deptName = deptName;
    }


    public String getDeptName() {
        return deptName;
    }
}
