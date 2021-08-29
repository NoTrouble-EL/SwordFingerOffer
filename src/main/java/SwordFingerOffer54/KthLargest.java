package SwordFingerOffer54;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/29 11:09
 */
public class KthLargest {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    private static int k;
    private static int res;

    public static int kthLargest(TreeNode root, int k){
        KthLargest.k = k;
        dfs(root);

        return res;
    }

    private static void dfs(TreeNode root){
        //corner case
        if (root == null){
            return;
        }
        //右
        dfs(root.right);
        if (k == 0){
            return;
        }
        //中
        if (--k == 0){
            res = root.val;
        }
        //左
        dfs(root.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(1);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node3.left = node5;

        System.out.println(kthLargest(root, 3));
    }
}
