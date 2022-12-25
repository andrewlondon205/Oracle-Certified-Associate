
class Employee {
    private int empId; // composition - HAS-A relationship
    private String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                '}';
    }
}

class Manager extends Employee {

    private String deptName;

     Manager(int empId, String name, String deptName) {
        super(empId, name);
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return super.toString() + "Manager{" +
                "deptName='" + deptName + '\'' +
                '}';
    }
}

class Director extends Manager {
    private double budget;

    Director(int empId, String name, String deptName, double budget) {
        super(empId, name, deptName);
        this.budget = budget;
    }

    @Override
    public String toString() {
        return super.toString() + "Director{" +
                "budget=" + budget +
                '}';
    }
}

public class EmployeeTest {

    public static void main(String[] args) {

        Director dir = new Director(754,"Joe Bloggs","Marketing",1000);
        System.out.println(dir);
    }

}
