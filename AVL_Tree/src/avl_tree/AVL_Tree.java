package avl_tree;

class Node {

    int key, height;
    Node left, right;

    Node(int key) {
        this.key = key;
        height = 1;
       
    }
}

public class AVL_Tree {

    Node root;

    

    int height(Node node) {

        if (node == null) {

            return 0;
        }

        return node.height;
    }

    int max(int key1, int key2) {

        return (key1 > key2) ? key1 : key2;
    }

    Node rightRotate(Node node) {

        Node tmp1 = node.left;
        Node tmp2 = tmp1.right;
        
        tmp1.right = node;
        node.left = tmp2;

        node.height = max(height(node.left), height(node.right)) + 1;
        tmp1.height = max(height(tmp1.left), height(tmp1.right)) + 1;

        return tmp1;
    }

    Node leftRotate(Node node) {

        Node tmp1 = node.right;
        Node tmp2 = tmp1.left;

        tmp1.left = node;
        node.right = tmp2;

        node.height = max(height(node.left), height(node.right)) + 1;
        tmp1.height = max(height(tmp1.left), height(tmp1.right)) + 1;

        return tmp1;
    }
    
    

    int getBalance(Node node) {

        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    Node insert(Node node, int key) {

        if (node == null) {
            return (new Node(key));
        }

        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        } else {
            return node;
        }

        node.height = 1 + max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }

        if (balance < -1 && key > node.right.key) {
            return leftRotate(node);
        }

        if (balance > 1 && key > node.left.key) {

            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && key < node.right.key) {

            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;

    }

    void preOrder(Node node) {

        if (node != null) {

            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);

        }
  
    }

    public static void main(String[] args) {

        AVL_Tree tree = new AVL_Tree();

        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 70);

        tree.preOrder(tree.root);
    }

}
