package SwordFingerOffer17;

import java.util.Arrays;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/20 21:58
 */
public class PrintNumbers {

    public static int[] printNumbers(int n){
        //
        int cornerCase = (int) Math.pow(10, n);

        int[] res = new int[cornerCase-1];
        for (int i = 1; i < cornerCase; i++){
            res[i-1] = i;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNumbers(1)));
    }
}
