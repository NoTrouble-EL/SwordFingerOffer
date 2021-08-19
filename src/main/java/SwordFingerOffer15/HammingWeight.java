package SwordFingerOffer15;

/**
 * @Author: Wukun
 * @Date: 2021/8/19上午9:25
 */
public class HammingWeight {

    /**
     *
     * @param n
     * @return
     */
    public static int hammingWeight(int n){
        // Create a variable to save the result
        int res = 0;

        // When all 1s become 0, the result is 0, and the loop is exited at the same time
        while(n != 0){
            // Change the rightmost 1 in binary to 0
            n &= (n-1);
            res++;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }
}
