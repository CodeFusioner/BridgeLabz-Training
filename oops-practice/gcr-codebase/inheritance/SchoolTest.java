package inheritance;

class Person {
    String personNameVar;
    int personAgeVar;

    Person(String givenName, int givenAge) {
        personNameVar = givenName;
        personAgeVar = givenAge;
    }

    void displayBasicInfo() {
        System.out.println("Name: " + personNameVar);
        System.out.println("Age: " + personAgeVar);
    }
}

class Teacher extends Person {
    String teacherSubjectVar;

    Teacher(String name, int age, String subject) {
        super(name, age);
        teacherSubjectVar = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + teacherSubjectVar);
    }
}

class Student extends Person {
    String studentGradeVar;

    Student(String name, int age, String grade) {
        super(name, age);
        studentGradeVar = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + studentGradeVar);
    }
}

class Staff extends Person {
    String staffDepartmentVar;

    Staff(String name, int age, String department) {
        super(name, age);
        staffDepartmentVar = department;
    }

    void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + staffDepartmentVar);
    }
}

public class SchoolTest {
    public static void main(String[] args) {

        Teacher objTeacher = new Teacher("Radhika", 35, "Mathematics");
        Student objStudent = new Student("Kapil", 20, "12th Grade");
        Staff objStaff = new Staff("Mahesh", 40, "Administration");

        objTeacher.displayBasicInfo();
        objTeacher.displayRole();

        System.out.println();

        objStudent.displayBasicInfo();
        objStudent.displayRole();

        System.out.println();

        objStaff.displayBasicInfo();
        objStaff.displayRole();
    }
}
