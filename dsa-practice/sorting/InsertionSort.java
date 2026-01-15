package sorting;

import java.util.Arrays;

class InsertionSort {
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] ids = {104, 102, 109, 101, 106};
        insertionSort(ids);
        System.out.println(Arrays.toString(ids));
    }
}
