package Employee;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private String IDNP;
    private String department;
    private String function;
    private double salary;

    public Employee(int id, String name, String surname, String IDNP, String department, String function, double salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.IDNP = IDNP;
        this.department = department;
        this.function = function;
        this.salary = salary;
    }

    //SET Employee
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setIDNP(String IDNP) {
        this.IDNP = IDNP;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    //GET Employee
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getIDNP() {
        return this.IDNP;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getFunction() {
        return this.function;
    }

    public double getSalary() {
        return this.salary;
    }
}
