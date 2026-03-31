package collectors;

import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    String getName() { return name; }
    String getGrade() { return grade; }
}

public class StudentResultGrouping {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Kapil", "A"),
                new Student("Aman", "B"),
                new Student("Riya", "A"),
                new Student("Neha", "C")
        );

        Map<String, List<String>> result = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.mapping(Student::getName, Collectors.toList())
                ));

        System.out.println(result);
    }
}

