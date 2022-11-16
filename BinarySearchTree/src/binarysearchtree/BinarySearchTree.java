package binarysearchtree;

class Node {

    int key;
    Node left;
    Node right;

    Node(int key) {

        this.key = key;
        left = null;
        right = null;
    }
}

public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {

        root = null;
    }

    public BinarySearchTree(int value) {

        root = new Node(value);
    }

    void insert(int key) {

        root = insertRec(root, key);
    }

    // Recursive function to insert a new key.
    Node insertRec(Node root, int key) {

        if (root == null) {

            root = new Node(key);
            return root;

        } else if (key < root.key) {

            root.left = insertRec(root.left, key);
        } else if (key > root.key) {

            root.right = insertRec(root.right, key);
        }

        return root;

    }

    // tree treversals
    void inorder() {

        inorderRec(root);
    }

    void inorderRec(Node root) {

        if (root != null) {

            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);

        }
    }

    void preorder() {

        preorderRec(root);
    }

    void preorderRec(Node root) {

        if (root != null) {

            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    void postorder() {

        postorderRec(root);
    }

    void postorderRec(Node root) {

        if (root != null) {

            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }
    
    int height(Node root){
    
        if(root == null){
            return-1;
        }else {
        
            int leftDepth = height(root.left);
            int rightDepth = height(root.right);
            
            if(leftDepth > rightDepth){
            
                return (leftDepth + 1);
            }else {
            
                return (rightDepth + 1);
            }
        }
    }
    
    int size(Node root){
    
        if(root == null){
            return 0;
        }else {
        
            return (size(root.left) + 1 + size(root.right));
        }
        
    }
    
    Node delete(Node root, int x){
    
        Node temporary1, temporary2;
        
        if(root == null){
            
            return null;
        }
        
        if(root.key == x){
        
            if(root.left == root.right){
            
            
                root = null;
                return null;
            }
            else if(root.left == null){
            
                temporary1 = root.right;
                return temporary1;
            }
            else if (root.right == null){
            
                temporary1 = root.left;
                return temporary1;
            }else {
            
                temporary1 = temporary2 = root.right;
                
                while(temporary1.left != null){
                
                    temporary1 = temporary1.left;
                }
                temporary1.left = root.left;
                
                return temporary2;
            }
            
        }else {
        
            if(x < root.key){
            
                root.left = delete(root.left,x);
            }else {
            
                root.right = delete(root.right, x);
            }
        }
        return root;
    }

}
