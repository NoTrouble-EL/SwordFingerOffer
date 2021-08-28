package SwordFingerOffer33;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/28 15:39
 */
public class VerifyPostorder {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }

    public static boolean verifyPostorder(int[] postorder){
        //边界条件
        if (postorder == null || postorder.length == 0){
            return true;
        }

        return helper(postorder, 0, postorder.length-1);
    }

    private static boolean helper(int[] postorder, int start, int end){
        //递归出口和边界条件
        if (end - start <= 1){
            return true;
        }

        //记录当前头部指针
        int pre = start;
        //记录当前根节点的值
        int rootValue = postorder[end];
        //找到左右子树的分界点
        while (postorder[pre] < rootValue){
            pre++;
        }
        //记录分界点
        int m = pre;
        //验证右子树的完整性
        while (postorder[pre] > rootValue){
            pre++;
        }

        //验证左右子树的完整性，且后序遍历正确，且左右子树递归都正确
        return pre == end && helper(postorder, start, m-1) && helper(postorder, m, end-1);
    }

    public static void main(String[] args) {
        int[] postorder = {1,3,2,6,5};
        System.out.println(verifyPostorder(postorder));
    }
}
