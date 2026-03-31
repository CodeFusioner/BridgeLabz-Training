package sorting;
import java.util.Arrays;

class CountingSortStudentAges {
    static void countingSort(int[] arr) {
        int min = 10, max = 18;
        int[] count = new int[max - min + 1];

        for (int num : arr) count[num - min]++;

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                arr[index++] = i + min;
            }
        }
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 11, 18, 14, 10, 13};
        countingSort(ages);
        System.out.println(Arrays.toString(ages));
    }
}
