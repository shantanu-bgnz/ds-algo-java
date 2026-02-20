package dsa.trees;

public class HeightOfTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int heightNodeBased(Node root) {
        if (root == null)
            return 0;

        int leftHeight = heightNodeBased(root.left);
        int rightHeight = heightNodeBased(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int heightEdgeBased(Node root) {
        if (root == null)
            return -1;

        int leftHeight = heightEdgeBased(root.left);
        int rightHeight = heightEdgeBased(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Height of tree: " + heightNodeBased(root));
        System.out.println("Height of tree: " + heightEdgeBased(root));
    }
}