package binarysearchtree;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree bsc = new BinarySearchTree();

        bsc.insert(50);
        bsc.insert(30);
        bsc.insert(20);
        bsc.insert(40);
        bsc.insert(70);
        bsc.insert(60);
        bsc.insert(80);

        /*
        Binary Search Tree:
           50
       30       70
    20   40   60   80
    
         */
        System.out.println("InOrder:");
        bsc.inorder();
        System.out.println("\n");

        System.out.println("Preorder:");
        bsc.preorder();
        System.out.println("\n");

        System.out.println("Postorder:");
        bsc.postorder();
        System.out.println("\n");

        bsc.insert(100);
        bsc.insert(45);
        bsc.insert(110);

        /*
        Binary Search Tree:
           50
       30       70
    20   40   60   80
          45        100
                     110
         */
        
        System.out.println("InOrder:");
        bsc.inorder();
        System.out.println("\n");

        System.out.println("Preorder:");
        bsc.preorder();
        System.out.println("\n");

        System.out.println("Postorder:");
        bsc.postorder();
        System.out.println("\n");

        System.out.println("Height of the BSC: " + bsc.height(bsc.root));
        System.out.println("Size of the BSC: " + bsc.size(bsc.root));
        System.out.println("");

        bsc.root = bsc.delete(bsc.root, 110);
        bsc.inorder();
        System.out.println("");

        /*
        Binary Search Tree:
           50
       30       70
    20   40   60   80
          45        100
         */
        bsc.root = bsc.delete(bsc.root, 50);
        bsc.inorder();
        System.out.println("");

        /*
        Binary Search Tree:
           70
       30       80
    20   40   60   100
          45        
         */
    }

}
