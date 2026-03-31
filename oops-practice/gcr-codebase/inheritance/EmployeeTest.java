package inheritance;

class Employee {
    String empNameVar;
    int empIdVal;
    double empSalaryVal;

    Employee(String givenEmpName, int givenEmpId, double givenSalary) {
        empNameVar = givenEmpName;
        empIdVal = givenEmpId;
        empSalaryVal = givenSalary;
    }

    void displayDetails() {
        System.out.println("Employee: " + empNameVar + ", ID: " + empIdVal + ", Salary: " + empSalaryVal);
    }
}

class Manager extends Employee {
    int managerTeamSizeVal;

    Manager(String mName, int mId, double mSalary, int teamSizeVal) {
        super(mName, mId, mSalary);
        managerTeamSizeVal = teamSizeVal;
    }

    @Override
    void displayDetails() {
        System.out.println("Manager: " + empNameVar + ", Team Size: " + managerTeamSizeVal);
    }
}

class Developer extends Employee {
    String devProgrammingLangVal;

    Developer(String dName, int dId, double dSalary, String progLang) {
        super(dName, dId, dSalary);
        devProgrammingLangVal = progLang;
    }

    @Override
    void displayDetails() {
        System.out.println("Developer: " + empNameVar + ", Language: " + devProgrammingLangVal);
    }
}

class Intern extends Employee {
    String internCollegeNameVal;

    Intern(String iName, int iId, double iSalary, String collegeName) {
        super(iName, iId, iSalary);
        internCollegeNameVal = collegeName;
    }

    @Override
    void displayDetails() {
        System.out.println("Intern: " + empNameVar + ", College: " + internCollegeNameVal);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee objManager = new Manager("Rohit", 101, 80000, 10);
        Employee objDeveloper = new Developer("Kapil", 102, 60000, "Java");
        Employee objIntern = new Intern("Ankit", 103, 15000, "GLA University");

        objManager.displayDetails();
        objDeveloper.displayDetails();
        objIntern.displayDetails();
    }
}
