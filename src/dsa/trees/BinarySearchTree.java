package dsa.trees;

public class BinarySearchTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

        public static boolean search(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

        public static Node insert(Node root, int key) {
        if (root == null)
            return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);

        return root;
    }

        public static void main(String[] args) {

        Node root = null;

        root = insert(root, 5);
        root = insert(root, 3);
        root = insert(root, 8);
        root = insert(root, 2);
        root = insert(root, 4);
        root = insert(root, 9);

        System.out.println("Search 4: " + search(root, 4));
        System.out.println("Search 7: " + search(root, 7));
    }
}


