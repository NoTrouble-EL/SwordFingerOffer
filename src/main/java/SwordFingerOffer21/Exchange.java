package SwordFingerOffer21;

import java.util.Arrays;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/20 22:07
 */
public class Exchange {

    public static int[] exchange(int[] nums){
        int i = 0, j = nums.length-1;
        while (i < j){
            while (i < j && (nums[i] % 2 != 0)){
                i++;
            }
            while (i < j && (nums[j] % 2 == 0)){
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(exchange(nums)));
    }
}
