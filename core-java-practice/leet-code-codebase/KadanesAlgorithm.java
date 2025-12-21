
public class KadanesAlgorithm {
	public static void main(String[] args) {
		int [] arr = {2, 3, -8, 7, -1, 2, 3};
		int res = maxSubarraySum(arr);
		System.out.println(res);
	}
	public static int maxSubarraySum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : arr){
            sum += num;
            max = Math.max(max,sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
