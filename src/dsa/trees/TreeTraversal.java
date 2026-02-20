package dsa.trees;
import java.util.*;
public class TreeTraversal {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Inorder:");
        inorder(root);

        System.out.println("\nPreorder:");
        preorder(root);

        System.out.println("\nPostorder:");
        postorder(root);

        System.out.println("Level Order:");
        levelOrder(root);
    }

    private static void levelOrder(Node root) {
        if(root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            Node current = q.poll();
            System.out.print(current.data + " ");

            if(current.left != null) {
                q.add(current.left);
            }
            if(current.right != null) {
                q.add(current.right);
            }
        }
    }

    private static void postorder(Node root) {
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    private static void preorder(Node root) {
        if(root == null) {
            return; 
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    private static void inorder(Node root) {
        if(root == null) {
            return; 
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}
