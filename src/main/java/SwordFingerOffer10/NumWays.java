package SwordFingerOffer10;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/27 11:57
 */
public class NumWays {

    public static int numWays(int n){
        int p = 1, q = 1, r = 0;
        for (int i = 0; i < n; i++){
            r = q + p;
            p = q;
            q = r;
        }

        return p;
    }

    public static void main(String[] args) {
        System.out.println(numWays(7));
    }
}
