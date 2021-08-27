package SwordFingerOffer66;

import java.util.Arrays;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/27 11:28
 */
public class ConstructArr {

    public static int[] constructArr(int[] a){
        int[] res = new int[a.length];

        int left = 1;
        for (int i = 0; i < a.length; i++){
            res[i] = left;
            left *= a[i];
        }

        int right = 1;
        for (int i = a.length-1; i >= 0; i--){
            res[i] *= right;
            right *= a[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(constructArr(nums)));
    }
}
