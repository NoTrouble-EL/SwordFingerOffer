package SwordFingerOffer16;

/**
 * @Author: Wukun
 * @Date: 2021/8/19上午10:02
 */
public class MyPow {

    /**
     *
     * @param x
     * @param n
     * @return
     */
    public static double myPow(double x, int n){
        //corner case
        if (n == 0){
            return 1.0;
        }

        long N = n;

        return n > 0 ? pow(x, N) : 1.0 / pow(x, -N);
    }

    private static double pow(double x, long n){
        // Recursive exit
        if (n == 0){
            return 1.0;
        }

        double y = pow(x, (n >> 1));

        return n % 2 == 0 ? y * y : y * y * x;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.0, 10));
    }
}
