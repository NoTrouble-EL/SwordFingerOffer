package SwordFingerOffer57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/23 22:10
 */
public class FindContinuousSequence {

    public static int[][] findContinuousSequence(int target){
        int left = 1, right = 2;
        List<int[]> res = new ArrayList<>();
        while (left < right){
            int sum = (left + right) * (right - left + 1) / 2;
            if (sum == target){
                int[] arr = new int[right - left + 1];
                for (int i = left; i <= right; i++){
                    arr[i - left] = i;
                }
                res.add(arr);
                left++;
            }else if(sum > target){
                left++;
            }else{
                right++;
            }
        }

        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][] res = findContinuousSequence(15);
        for (int i = 0; i < res.length; i++){
            System.out.print("[");
            for (int j = 0; j < res[i].length; j++){
                System.out.print(res[i][j]);
            }
            System.out.println("]");
        }
    }
}
