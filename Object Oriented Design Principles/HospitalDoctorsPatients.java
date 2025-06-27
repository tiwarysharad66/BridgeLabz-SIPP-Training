import java.util.*;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        System.out.println("Dr. " + name + " is consulting " + p.name);
    }
}

class Hospital {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();
}

public class HospitalDoctorsPatients {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Adams");
        Doctor d2 = new Doctor("Baker");

        Patient p1 = new Patient("Charlie");
        Patient p2 = new Patient("Diana");

        d1.consult(p1);
        d2.consult(p2);
        d2.consult(p1);
    }
}