package SwordFingerOffer55;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/29 15:15
 */
public class IsBalanced {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    public static boolean isBalanced(TreeNode root){
        // corner case
        if (root == null){
            return true;
        }

        //AVL的左右子树节点个数相差不超过1，且左右子树都为AVL
        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private static int maxDepth(TreeNode root){
        if (root == null){
            return  0;
        }

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

        System.out.println(isBalanced(root));
    }
}
