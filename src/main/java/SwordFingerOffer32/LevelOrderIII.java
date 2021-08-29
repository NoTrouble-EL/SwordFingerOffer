package SwordFingerOffer32;

import java.util.*;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/29 14:52
 */
public class LevelOrderIII {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root){
        //创建一个list用于保存结果
        List<List<Integer>> res = new ArrayList<>();
        //corner case
        if (root == null){
            return res;
        }

        //创建一个队列用于层序遍历
        Deque<TreeNode> queue = new ArrayDeque<>();
        //将头节点入队
        queue.offer(root);

        //层序遍历
        while (!queue.isEmpty()){
            //创建一个List用于保存当前层的元素
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = queue.size(); i > 0; i--){
                //取出队列中的元素
                TreeNode node = queue.poll();
                //判断是奇数层还是偶数层，选择加入的顺序
                if (res.size() % 2 == 0){
                    list.add(node.val);
                }else{
                    list.addFirst(node.val);
                }
                //将当前节点的左右子树入队
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
            }

            res.add(list);
        }

        return res;
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

        System.out.println(levelOrder(root));
    }
}
