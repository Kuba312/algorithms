package repetition;

import com.sun.source.tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class BinaryTreeLevelOrderLearn {


    public static class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public static void levelOrderTraversal(TreeNode startNode) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(startNode);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.printf("%d", node.data);
            if (node.right != null) {
                queue.add(node.right);
            }
            if (node.left != null) {
                queue.add(node.left);
            }
        }
    }

    public static void main(String[] args) {
        // Creating a binary tree
        TreeNode rootNode = createTreeNode();
        System.out.println("Level Order traversal of binary tree will be:");
        levelOrderTraversal(rootNode);

    }

    public static TreeNode createTreeNode() {
        TreeNode rootNode = new TreeNode(40);
        TreeNode node20 = new TreeNode(20);
        TreeNode node10 = new TreeNode(10);
        TreeNode node30 = new TreeNode(30);
        TreeNode node60 = new TreeNode(60);
        TreeNode node50 = new TreeNode(50);
        TreeNode node70 = new TreeNode(70);


        rootNode.left = node20;
        rootNode.right = node60;

        node20.left = node10;
        node20.right = node30;

        node60.left = node50;
        node60.right = node70;

        return rootNode;
    }
}
