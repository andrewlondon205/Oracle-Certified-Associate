import java.util.ArrayList;

public final class Department {// cannot subclass this class and all methods are final

    //private final instance variables
    private final String name, address;
    private final int numEmployees;
    private final ArrayList<String> employees;

    //private constructor - cannot change this class because this constructor
    // cannot be invoked from a subclass (hidden)

    private Department(String name, String address, int numEmployees, ArrayList<String> employees) {
        this.name = name;
        this.address = address;
        this.numEmployees = numEmployees;
        this.employees = new ArrayList<String>(employees);
    }

    //factory method to create a Department
    public static Department createNewInstance (String name, String address, int numEmployees, ArrayList<String> employees) {
        return new Department(name,address,numEmployees,employees);
    }

    //not set methods, only get methods


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public ArrayList<String> getEmployees() {
        return new ArrayList<String>(employees);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", numEmployees=" + numEmployees +
                ", employees=" + employees +
                '}';
    }
}

/**
 * The next line generates the error:
 * - compiler error: cannot inherit from department as department is final
 * class SportsDepartment extends Department {
 *     SportsDepartment() {
 *         super(" ", "", 2, new ArrayList<String>());
 *     }
 * }
 */

 class TestImmutable {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Ann");
        employees.add("Liam");

        Department dept = Department.createNewInstance("Argos","Athlone",2,employees);
        System.out.println("created: " + dept);

        String name = dept.getName();
        String address = dept.getAddress();
        int numEmployees = dept.getNumEmployees();
        employees = dept.getEmployees();

        //Retrieved: Argos Athlone 2 [Ann,Liam]
        System.out.println("Retrieved: " +name+ " " + address + " " +numEmployees + " " + employees);

        //change what i got back - any effect on the "dept" immutable object
        name = "Boots"; //Strings are immutable so new objects are created in the background =>
        address = "Galway";
        numEmployees = 3; // simple primitive i.e. value is just copied back
        employees.add("Tom"); // as we only got a copy of the AL back, we are changing that copy

        //any change? Department {name=Argos,address=Athlone, num
        System.out.println("Any change? " + dept);

    }
}