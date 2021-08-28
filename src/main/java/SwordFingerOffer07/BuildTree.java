package SwordFingerOffer07;

import java.util.Arrays;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/28 14:40
 */
public class BuildTree {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder){
        //递归出口和corner case
        if (preorder == null || preorder.length == 0){
            return null;
        }

        //构建root结点
        TreeNode root = new TreeNode(preorder[0]);
        //根据前序遍历找到根结点在中序遍历的索引
        int index = findIndex(preorder, inorder);
        //递归构建左子树
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, index+1),
                Arrays.copyOfRange(inorder, 0, index));
        //递归构建右子树
        root.right = buildTree(Arrays.copyOfRange(preorder, index+1, preorder.length),
                Arrays.copyOfRange(inorder, index+1,inorder.length));

        return root;
    }

    private static int findIndex(int[] preorder, int[] inorder){
        for (int i = 0; i < inorder.length; i++){
            if (preorder[0] == inorder[i]){
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9, 3, 15,20,7};
        TreeNode root = buildTree(preorder, inorder);
        System.out.println(root);
    }
}
