package SwordFingerOffer61;

import java.util.Arrays;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/27 11:19
 */
public class IsStraight {

    public static boolean isStraight(int[] nums){
        // corner case
        if (nums.length != 5){
            return false;
        }

        Arrays.sort(nums);
        int king = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                king++;
                continue;
            }
            if (i != nums.length-1){
                if (nums[i] == nums[i+1]){
                    return false;
                }
            }
        }

        return nums[nums.length-1] - nums[king] < 5;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,2,5};
        System.out.println(isStraight(nums));
    }
}
