package SwordFingerOffer55;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/29 15:11
 */
public class MaxDepth {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    public static int maxDepth(TreeNode root){
        //递归出口 And corner case
        if (root == null){
            return 0;
        }

        //递归左子树和右子树，取最大+1
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        System.out.println(maxDepth(root));
    }
}
