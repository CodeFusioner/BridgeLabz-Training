package review;
import java.util.*;
public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) set.add(x);

        int start = arr[0];
        int end = arr[n - 1];

        System.out.print("Missing numbers = {");
        boolean first = true;

        for (int i = start; i <= end; i++) {
            if (!set.contains(i)) {
                if (!first) System.out.print(", ");
                System.out.print(i);
                first = false;
            }
        }

        System.out.print("}");
    }
}
