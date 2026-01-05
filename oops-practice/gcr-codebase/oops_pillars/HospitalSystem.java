package oops_pillars;
import java.util.ArrayList;
import java.util.List;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getPatientDetails() {
        return patientId + " - " + name + " (Age: " + age + ")";
    }

    protected void addToHistory(String record) {
        medicalHistory.add(record);
    }

    protected List<String> getHistory() {
        return medicalHistory;
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double roomChargePerDay;

    public InPatient(String id, String name, int age, String diagnosis, int days, double roomCharge) {
        super(id, name, age, diagnosis);
        this.daysAdmitted = days;
        this.roomChargePerDay = roomCharge;
    }

    public double calculateBill() {
        return daysAdmitted * roomChargePerDay + 2000;
    }

    public void addRecord(String record) {
        addToHistory(record);
    }

    public void viewRecords() {
        for (String r : getHistory()) System.out.println(r);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(String id, String name, int age, String diagnosis, double fee) {
        super(id, name, age, diagnosis);
        this.consultationFee = fee;
    }

    public double calculateBill() {
        return consultationFee + 300;
    }

    public void addRecord(String record) {
        addToHistory(record);
    }

    public void viewRecords() {
        for (String r : getHistory()) System.out.println(r);
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Patient p1 = new InPatient("P101", "Rahul", 30, "Fracture", 5, 1500);
        Patient p2 = new OutPatient("P102", "Neha", 24, "Cold", 500);

        System.out.println(p1.getPatientDetails() + " | Bill: " + p1.calculateBill());
        System.out.println(p2.getPatientDetails() + " | Bill: " + p2.calculateBill());
    }
}
