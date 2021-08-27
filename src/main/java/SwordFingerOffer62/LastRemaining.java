package SwordFingerOffer62;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/27 14:04
 */
public class LastRemaining {

    public static int lastRemaining(int n, int m){
        int f = 0;
        for(int i = 2; i <= n; i++){
            //F(n) = (F(n-1) + m) %  n
            f = (f + m) % i;
        }

        return f;
    }

    public static void main(String[] args) {
        System.out.println(lastRemaining(10, 17));
    }
}
