public class DividePens {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;
        int pensPerStudent = dividePens(totalPens - (totalPens % students), students);
        System.out.println("Each student gets " + pensPerStudent + " pens.");
        System.out.println("Remaining pens after distribution: " + (totalPens % students));
    }
    public static int dividePens(int totalPens, int students) {
        return totalPens / students;
    }
}
