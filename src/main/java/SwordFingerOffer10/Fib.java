package SwordFingerOffer10;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/27 11:55
 */
public class Fib {

    public static int fib(int n){
        int p = 0, q = 1, r = 0;
        for (int i = 0; i < n; i++){
            r = p + q;
            p = q;
            q = r;
        }

        return p;
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
