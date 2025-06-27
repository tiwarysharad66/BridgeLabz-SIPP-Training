import java.util.*;

class Course {
    String name;
    Professor professor;

    Course(String name) {
        this.name = name;
    }

    void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println(p.name + " assigned to " + name);
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        courses.add(c);
        System.out.println(name + " enrolled in " + c.name);
    }
}

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student s = new Student("Alice");
        Professor p = new Professor("Dr. Smith");

        Course c = new Course("Data Structures");
        c.assignProfessor(p);
        s.enrollCourse(c);
    }
}