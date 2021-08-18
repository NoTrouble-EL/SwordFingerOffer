package SwordFingerOffer04;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/18 21:53
 */
public class FindNumberIn2DArray {
    /**
     *
     * @param matrix
     * @param target
     * @return
     *
     * time:O(m+n)
     * space:O(1)
     */
    public static boolean findNumberIn2DArray(int[][] matrix, int target){
        //corner case
        if (matrix == null || matrix.length == 0){
            return false;
        }

        // Search from the bottom left corner of the rectangle
        int i = matrix.length-1, j = 0;

        //
        while (i >= 0 && j < matrix[0].length){
            if (matrix[i][j] == target){
                return true;
            }else if (matrix[i][j] > target){
                i--;
            }else{
                j++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        System.out.println(findNumberIn2DArray(matrix, 5));
    }
}
