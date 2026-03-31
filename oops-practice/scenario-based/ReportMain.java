import java.util.*;

class InvalidMarkException extends Exception {
    public InvalidMarkException(String msg) { super(msg); }
}

class Students {
    String name;
    String[] subjects;
    int[] marks;

    public Students(String name, String[] subjects, int[] marks) {
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
    }

    double average() throws InvalidMarkException {
        int sum = 0;
        for (int m : marks) {
            if (m < 0 || m > 100)
                throw new InvalidMarkException("Marks must be between 0 and 100");
            sum += m;
        }
        return sum / (double) marks.length;
    }

    String grade(double avg) {
        if (avg >= 90) return "A+";
        if (avg >= 75) return "A";
        if (avg >= 60) return "B";
        if (avg >= 40) return "C";
        return "Fail";
    }

    void display() throws InvalidMarkException {
        double avg = average();
        System.out.println("\nReport Card");
        System.out.println("Student: " + name);
        for (int i = 0; i < subjects.length; i++)
            System.out.println(subjects[i] + ": " + marks[i]);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade(avg));
    }
}

public class ReportMain {
    public static void main(String[] args) throws Exception {
        List<Students> list = new ArrayList<>();

        list.add(new Students(
                "Kapil",
                new String[]{"Math","Science","English"},
                new int[]{90, 85, 80}
        ));

        for (Students s : list) s.display();
    }
}
