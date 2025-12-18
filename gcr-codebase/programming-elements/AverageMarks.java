public class AverageMarks {
    public static void main(String[] args) {
        int[] marks = {94, 95, 96};
        double average = calculateAverage(marks);
        System.out.println("The average marks are: " + average);
    }
    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
}
