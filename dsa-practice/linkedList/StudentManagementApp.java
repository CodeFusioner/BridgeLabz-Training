package linkedList;

class StudentNode {
    int roll;
    String name;
    int age;
    String grade;
    StudentNode next;

    StudentNode(int roll, String name, int age, String grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    private StudentNode head;

    public void addAtBeginning(int roll, String name, int age, String grade) {
        StudentNode node = new StudentNode(roll, name, age, grade);
        node.next = head;
        head = node;
    }

    public void addAtEnd(int roll, String name, int age, String grade) {
        StudentNode node = new StudentNode(roll, name, age, grade);
        if (head == null) {
            head = node;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = node;
    }

    public void addAtPosition(int pos, int roll, String name, int age, String grade) {
        if (pos == 1) {
            addAtBeginning(roll, name, age, grade);
            return;
        }
        StudentNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) temp = temp.next;
        if (temp == null) return;

        StudentNode node = new StudentNode(roll, name, age, grade);
        node.next = temp.next;
        temp.next = node;
    }

    public void deleteByRoll(int roll) {
        if (head == null) return;

        if (head.roll == roll) {
            head = head.next;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.roll != roll)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public StudentNode searchByRoll(int roll) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.roll == roll) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void updateGrade(int roll, String newGrade) {
        StudentNode student = searchByRoll(roll);
        if (student != null)
            student.grade = newGrade;
    }

    public void display() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println(temp.roll + " | " + temp.name + " | " + temp.age + " | " + temp.grade);
            temp = temp.next;
        }
    }
}

public class StudentManagementApp {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(1, "Kapil", 21, "A");
        list.addAtEnd(2, "Rahul", 22, "B");
        list.addAtPosition(2, 3, "Aman", 20, "A+");

        list.display();

        list.updateGrade(2, "A");
        list.deleteByRoll(1);

        System.out.println("\nAfter Updates:");
        list.display();
    }
}
