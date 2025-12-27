import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> ll = new ArrayList<>();
        ll = threeSum(arr);
        System.out.println(ll);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int low = i+1, high = nums.length-1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    while(low < high && nums[low] == nums[low+1]) low++;
                    while(low < high && nums[high] == nums[high-1]) high--;
                    low++;
                    high--;
                }else if(sum < 0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return res;
    }
}
