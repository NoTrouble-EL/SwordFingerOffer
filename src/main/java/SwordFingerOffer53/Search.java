package SwordFingerOffer53;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/21 22:16
 */
public class Search {

    public static int search(int[] nums,int target){
        return getRight(nums, target) - getRight(nums, target-1);
    }

    private static int getRight(int[] nums, int target){
        int lo = 0, hi = nums.length-1;
        while (lo <= hi){
            int mid = ((hi - lo) >> 1) + lo;
            if (nums[mid] > target){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }

        return hi;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(search(nums, 8));
    }
}
