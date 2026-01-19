package review;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {5,6,1,2,9};
        int minIdx = 0;
        for(int i=0;i<arr.length;i++) {
            minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
