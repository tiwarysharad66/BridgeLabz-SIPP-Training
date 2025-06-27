import java.util.*;

class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    List<Employee> employees;

    Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }
}

class Company {
    String name;
    List<Department> departments;

    Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }
}

public class CompanyAndDepartments {
    public static void main(String[] args) {
        Company c = new Company("TechCorp");
        Department d1 = new Department("HR");
        d1.addEmployee(new Employee("Alice"));
        d1.addEmployee(new Employee("Bob"));

        Department d2 = new Department("IT");
        d2.addEmployee(new Employee("Charlie"));

        c.addDepartment(d1);
        c.addDepartment(d2);
    }
}