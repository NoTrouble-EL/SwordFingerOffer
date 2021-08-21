package SwordFingerOffer53;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/21 22:31
 */
public class MissingNumber {

    public static int missingNumber(int[] nums){
        int lo = 0, hi = nums.length-1;
        while (lo <= hi){
            int mid = ((hi - lo) >> 1) + lo;
            if (nums[mid] == mid){
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }

        return lo;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7,9};
        System.out.println(missingNumber(nums));
    }
}
