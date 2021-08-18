package SwordFingerOffer39;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/18 22:28
 */
public class MajorityElement {

    /**
     *
     * @param nums
     * @return
     *
     * time:O(n)
     * space:O(1)
     */
    public static int majorityElement(int[] nums){
        //corner case
        if (nums == null || nums.length == 0){
            return -1;
        }
        //Moore vote
        // Define two variables, one to record the current value,
        // and the other to record the number of times the current value can be offset
        int cur = 0, count = 0;
        // Iterate over the array
        for (int n : nums){
            // If the number of offsets is 0, the current value is taken as cur
            if (count == 0){
                cur = n;
            }
            // If the value obtained by traversal is equal to cur,
            // the number of offsets is +1, otherwise the number of offsets is -1
            if (cur == n){
                count++;
            }else{
                count--;
            }
        }

        return cur;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,2,2,2,5,4,2};
        System.out.println(majorityElement(nums));
    }
}
