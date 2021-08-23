package SwordFingerOffer57;

import java.util.Arrays;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/23 22:05
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target){
        int lo = 0, hi = nums.length-1;
        int[] res = new int[2];
        while (lo < hi){
            int sum = nums[lo] + nums[hi];
            if (sum == target){
                res[0] = nums[lo];
                res[1] = nums[hi];
                return res;
            }else if (sum > target){
                hi--;
            }else{
                lo++;
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {10,26,30,31,47,60};
        System.out.println(Arrays.toString(twoSum(nums, 40)));
    }
}
