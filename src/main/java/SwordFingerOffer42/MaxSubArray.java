package SwordFingerOffer42;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/27 12:50
 */
public class MaxSubArray {

    public static int maxSubArray(int[] nums){
        int res = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i-1] > 0){
                nums[i] += nums[i-1];
            }
            res = Math.max(res, nums[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
