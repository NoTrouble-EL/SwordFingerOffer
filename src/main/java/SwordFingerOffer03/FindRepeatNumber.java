package SwordFingerOffer03;

import java.util.HashSet;

/**
 * @Author: Wukun
 * @Date: 2021/8/25上午10:44
 */
public class FindRepeatNumber {

    public static int findRepeatNumber(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums){
            if (!set.add(n)){
                return n;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,0,2,5,3};
        System.out.println(findRepeatNumber(nums));
    }
}
