package SwordFingerOffer68;

/**
 * @Author: Wukun
 * @Date: 2021/8/25上午11:01
 */
public class LowestCommonAncestor {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        while (true){
            if (p.val > root.val && q.val > root.val){
                root = root.right;
            }else if(p.val < root.val && q.val < root.val){
                root = root.left;
            }else{
                return root;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(0);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(8);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(9);

        root.left = node1;
        root.right = node6;
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        node6.left = node7;
        node6.right = node8;

        TreeNode res = lowestCommonAncestor(root, node1, node6);
        System.out.println(res);
    }
}
