import java.util.*;

public class FirstAndLastPositionProblem {

    public static int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums, target), last(nums, target)};
    }

    private static int first(int[] nums, int target){
        int l = 0, r = nums.length - 1, ans = -1;

        while(l <= r){
            int mid = l + (r - l) / 2;

            if(nums[mid] == target){
                ans = mid;
                r = mid - 1;
            } else if(nums[mid] < target){
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    private static int last(int[] nums, int target){
        int l = 0, r = nums.length - 1, ans = -1;

        while(l <= r){
            int mid = l + (r - l) / 2;

            if(nums[mid] == target){
                ans = mid;
                l = mid + 1;
            } else if(nums[mid] < target){
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        System.out.println("Range: " + Arrays.toString(searchRange(nums, target)));
    }
}
