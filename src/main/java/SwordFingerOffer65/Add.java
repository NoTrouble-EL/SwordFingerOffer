package SwordFingerOffer65;

/**
 * @Author: Wukun
 * @Date: 2021/8/19上午11:08
 */
public class Add {

    public static int add(int a, int b){
        while (a != 0){
            // Non-carry addition, which is equivalent to the exclusive OR of two numbers
            int temp = a ^ b;
            // The carry part can be regarded as the phase and shifted by 1 bit to the left
            a = (a & b) << 1;
            b = temp;
        }

        return b;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
    }
}
