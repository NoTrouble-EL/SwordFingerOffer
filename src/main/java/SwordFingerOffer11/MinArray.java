package SwordFingerOffer11;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/20 21:52
 */
public class MinArray {
    public static int minArray(int[] numbers){
        int lo = 0, hi = numbers.length-1;
        while (lo < hi){
            int mid = ((hi - lo) >> 1) + lo;
            if (numbers[mid] > numbers[hi]){
                lo = mid + 1;
            }else if(numbers[mid] < numbers[hi]){
                hi = mid;
            }else{
                hi--;
            }
        }

        return numbers[lo];
    }

    public static void main(String[] args) {
        int[] numbers = {3,4,5,1,2};
        System.out.println(minArray(numbers));
    }
}
