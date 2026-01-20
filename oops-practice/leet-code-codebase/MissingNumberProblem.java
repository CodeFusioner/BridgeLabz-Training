import java.util.*;

public class MissingNumberProblem {

    public static int missingNumber(int[] nums) {
        int xor = 0;

        for(int i = 0; i <= nums.length; i++){
            xor ^= i;
        }

        for(int num : nums){
            xor ^= num;
        }

        return xor;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Missing Number: " + missingNumber(nums));
    }
}
