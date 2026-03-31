import java.util.*;

public class SubarraySumEqualsKProblem {

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0, count = 0;

        for(int num : nums){
            sum += num;

            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("K: " + k);
        System.out.println("Subarrays Count: " + subarraySum(nums, k));
    }
}
