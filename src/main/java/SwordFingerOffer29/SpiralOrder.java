package SwordFingerOffer29;

import java.util.Arrays;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/20 22:13
 */
public class SpiralOrder {

    public static int[] spiralOrder(int[][] matrix){
        //corner case
        if (matrix == null || matrix.length == 0){
            return new int[0];
        }
        int left = 0, right = matrix[0].length-1, top = 0, bottom = matrix.length-1, index = 0;
        int[] res = new int[(right+1)*(bottom+1)];
        while (true){
            for (int i = left; i <= right; i++){
                res[index++] = matrix[top][i];
            }
            if (++top > bottom){
                break;
            }
            for (int i = top; i <= bottom; i++){
                res[index++] = matrix[i][right];
            }
            if (--right < left){
                break;
            }
            for (int i = right; i >= left; i--){
                res[index++] = matrix[bottom][i];
            }
            if (--bottom < top){
                break;
            }
            for (int i = bottom; i >= top; i--){
                res[index++] = matrix[i][left];
            }
            if (++left > right){
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(spiralOrder(matrix)));
    }
}
