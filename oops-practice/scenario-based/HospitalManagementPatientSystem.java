import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


//Hospital Patient Management System (CRUD)
//Concepts: Patient, Doctor, Bill classes.
// OOP: Encapsulation (Properties), Abstraction (Interface IPayable), Inheritance
//(InPatient, OutPatient : Patient), Polymorphism (DisplayInfo).

interface IPayable {
    double calculateBill();
}

abstract class Patient implements IPayable{
    private int patientId;
    String name;
    int age;
    Doctor doctor;

    public Patient(int patientId, String name, int age, Doctor doctor){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.doctor = doctor;
    }
    public int getPatientId() {
        return patientId;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setDoctor(Doctor doctor){
        this.doctor = doctor;
    }
    public abstract void displayInfo();
}
class Doctor {

    private int doctorId;
    private String name;
    private String specialization;

    public Doctor(int id, String name, String specialization) {
        this.doctorId = id;
        this.name = name;
        this.specialization = specialization;
    }

    public int getDoctorId() { return doctorId; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }
}

class InPatient extends Patient{
    private int noOfDaysAdmitted;
    private double dailyCharge;
    public InPatient(int id, String name, int age, Doctor doctor, int noOfDaysAdmitted, double dailyCharge) {
        super(id, name, age, doctor);
        this.noOfDaysAdmitted = noOfDaysAdmitted;
        this.dailyCharge = dailyCharge;
    }
    @Override
    public double calculateBill() {
        return noOfDaysAdmitted * dailyCharge;
    }
    @Override
    public void displayInfo() {
        System.out.println("InPatient → " + getName() + " | Doctor: " + getDoctor().getName());
    }
}
class OutPatient extends Patient {
    private double fee;
    public OutPatient(int id, String name, int age, Doctor doctor, double fee) {
        super(id, name, age, doctor);
        this.fee = fee;
    }
    @Override
    public double calculateBill() {
        return fee;
    }
    @Override
    public void displayInfo() {
        System.out.println("OutPatient → " + getName() + " | Doctor: " + getDoctor().getName());
    }
}

class Bill {
    public static void generateBill(Patient patient) {
        System.out.println("Patient: " + patient.getName());
        System.out.println("Doctor: " + patient.getDoctor().getName());
        System.out.println("Total Bill: ₹" + patient.calculateBill());
    }
}

class HospitalService {
    // CRUD operations can be implemented here
    private List<Patient> patients = new ArrayList<>();
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
    public void viewAllPatients(){
        for(Patient p: patients){
            p.displayInfo();
        }
    }
    public void updatePatientDetails(int patientId, String name, int age, Doctor doctor){
        for(Patient p: patients){
            if(p.getPatientId() == patientId){
                p.setName(name);
                p.setAge(age);
                p.setDoctor(doctor);
            }
        }
    }
    public void deletePatient(int patientId){
        patients.removeIf(p -> p.getPatientId() == patientId);
    }
    public Patient getPatientById(int patientId) {
        for (Patient p : patients) {
            if (p.getPatientId() == patientId) {
                return p;
            }
        }
        return null;
    }
}

public class HospitalManagementPatientSystem {
    public static void main(String[] args) {
        Doctor doc1 = new Doctor(1, "Dr. Kapil", "Cardiology");

        Patient p1 = new OutPatient(102, "Manas", 30, doc1, 500);
        Patient p2 = new InPatient(103, "Anita", 25, doc1, 3, 1500);

        HospitalService service = new HospitalService();

        service.addPatient(p1);
        service.addPatient(p2);
        service.viewAllPatients();
        Bill.generateBill(p1);
        Bill.generateBill(p2);



    }
}
