import java.util.*;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }
}

class University {
    String name;
    List<Department> departments = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }
}

public class UniversityFacultiesDepartments {
    public static void main(String[] args) {
        University u = new University("Tech University");
        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Physics");

        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Johnson");

        u.addDepartment(d1);
        u.addDepartment(d2);
    }
}