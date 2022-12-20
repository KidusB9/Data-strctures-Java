public class BinarySearchTree {
    private Node root;

    // inner class to represent a node in the tree
    private class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
        }
    }

    // method to insert a new node into the tree
    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        } else {
            // value already exists in the tree, do nothing
        }
        return current;
    }

    // method to search for a specific element in the tree
    public boolean search(int data) {
        return searchRecursive(root, data);
    }

    private boolean searchRecursive(Node current, int data) {
        if (current == null) {
            return false;
        }
        if (data == current.data) {
            return true;
        }
        if (data < current.data) {
            return searchRecursive(current.left, data);
        } else {
            return searchRecursive(current.right, data);
        }
    }
}
