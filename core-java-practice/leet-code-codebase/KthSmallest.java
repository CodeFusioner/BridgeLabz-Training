import java.util.*;

public class KthSmallest {
	public static void main(String[] args) {
		int [] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
		int k = 4;
		int res = kthSmallest(arr, k);
		System.out.println(res);
	}
	public static int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : arr){
            pq.add(num);
        }
        
        while(k > 1){
            pq.poll();
            k--;
        }
        return pq.poll();
    }
}
