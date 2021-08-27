package SwordFingerOffer49;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/27 13:57
 */
public class NthUglyNumber {

    public static int nthUglyNumber(int n){
        int[] dp = new int[n];
        dp[0] = 1;
        int i = 0, j = 0, k = 0;

        for (int index = 1; index < n; index++){
            int n2 = dp[i] * 2;
            int n3 = dp[j] * 3;
            int n5 = dp[k] * 5;
            dp[index] = Math.min(n2, Math.min(n3, n5));
            if (dp[index] == n2){
                i++;
            }
            if (dp[index] == n3){
                j++;
            }
            if (dp[index] == n5){
                k++;
            }
        }

        return dp[n-1];
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }
}
