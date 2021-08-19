package SwordFingerOffer56;

import java.util.Arrays;

/**
 * @Author: Wukun
 * @Date: 2021/8/19上午10:17
 */
public class SingleNumbers {

    public static int[] singleNumbers(int[] nums){
        // Create a variable to record the exclusive OR of two numbers that occur once
        int xor = 0;
        for (int n : nums){
            xor ^= n;
        }

        // Keep the rightmost 1 bit of the two XOR values
        xor &= (-xor);

        // Create an array to save the results
        int[] res = new int[2];

        // Traverse the array, separate the two numbers and XOR
        for (int n : nums){
            if ((xor & n) == 0){
                res[0] ^= n;
            }else{
                res[1] ^= n;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,4,6};
        System.out.println(Arrays.toString(singleNumbers(nums)));
    }
}
