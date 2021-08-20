package SwordFingerOffer44;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/20 22:31
 */
public class FindNthDigit {
    public static int findNthDigit(int n){
        int digit = 1;
        long count = 9;
        long start = 1;
        while (n > count){
            n -= count;
            digit++;
            start *= 10;
            count = digit * start * 9;
        }

        long num = start + (n-1)/digit;

        return Long.toString(num).charAt((n-1)%digit) - '0';

    }

    public static void main(String[] args) {
        System.out.println(findNthDigit(11));
    }
}
