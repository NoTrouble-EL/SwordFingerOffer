package SwordFingerOffer63;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/27 14:11
 */
public class MaxProfit {

    public static int maxProfit(int[] prices){
        int min = Integer.MAX_VALUE;
        int maxBinifit = 0;
        for (int n : prices){
            min = Math.min(min, n);
            maxBinifit = Math.max(maxBinifit, n - min);
        }

        return maxBinifit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
