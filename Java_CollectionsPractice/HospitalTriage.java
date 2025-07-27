import java.util.*;

class Patient implements Comparable<Patient> {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public int compareTo(Patient other) {
        return Integer.compare(other.severity, this.severity);
    }

    public String toString() {
        return name + " (" + severity + ")";
    }
}

public class HospitalTriage {
    public static List<String> getTreatmentOrder(List<Patient> patients) {
        PriorityQueue<Patient> queue = new PriorityQueue<>(patients);
        List<String> order = new ArrayList<>();
        while (!queue.isEmpty()) order.add(queue.poll().name);
        return order;
    }
}