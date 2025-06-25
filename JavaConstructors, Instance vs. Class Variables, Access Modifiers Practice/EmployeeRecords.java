package constructors;
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int id, String dept, double salary) {
        this.employeeID = id;
        this.department = dept;
        this.salary = salary;
    }

    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public Manager(int id, String dept, double salary) {
        super(id, dept, salary);
    }

    void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID);   // public
        System.out.println("Department: " + department);   // protected
        // salary is private, cannot be accessed directly
    }
}
