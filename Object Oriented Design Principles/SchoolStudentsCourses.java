import java.util.*;

class Course {
    String name;
    List<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void enroll(Student s) {
        students.add(s);
        s.courses.add(this);
    }

    void showStudents() {
        System.out.println("Students in " + name + ":");
        for (Student s : students)
            System.out.println(" - " + s.name);
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void viewCourses() {
        System.out.println(name + "'s Courses:");
        for (Course c : courses)
            System.out.println(" - " + c.name);
    }
}

class School {
    String name;
    List<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }
}

public class SchoolStudentsCourses {
    public static void main(String[] args) {
        School school = new School("High School");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        c1.enroll(s1);
        c2.enroll(s1);
        c2.enroll(s2);

        school.addStudent(s1);
        school.addStudent(s2);

        s1.viewCourses();
        c2.showStudents();
    }
}