package SwordFingerOffer32;

import java.util.*;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/29 12:27
 */
public class LevelOrder {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    public static int[] levelOrder(TreeNode root){
        //创建一个List用于保存结果
        List<Integer> res = new ArrayList<>();

        //corner case
        if (root == null){
            return new int[0];
        }

        //创建一个队列用于层序遍历
        Deque<TreeNode> queue = new ArrayDeque<>();
        //塞入头节点
        queue.offer(root);

        //层序遍历
        while (!queue.isEmpty()){
            //取出队列中的元素
            TreeNode node = queue.poll();
            //加入到list中
            res.add(node.val);
            //将当前结点的左右子结点入队
            if (node.left != null){
                queue.offer(node.left);
            }
            if (node.right != null){
                queue.offer(node.right);
            }
        }

        //创建一个数组接受结果
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++){
            ans[i] = res.get(i);
        }

        return ans;
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

        System.out.println(Arrays.toString(levelOrder(root)));
    }
}
