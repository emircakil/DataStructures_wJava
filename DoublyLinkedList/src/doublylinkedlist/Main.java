/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublylinkedlist;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        // add node first
        
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        list.addNodeFirst(node1);
        list.addNodeFirst(node2);
        list.addNodeFirst(node3);

        list.printList(list);

        // add node last
        
        Node node4 = new Node(10);
        Node node5 = new Node(20);
        Node node6 = new Node(30);

        list.addNodeLast(node4);
        list.addNodeLast(node5);
        list.addNodeLast(node6);

        System.out.println("");
        list.printList(list);

        
        // add middle node
        
        Node addMiddleNode = new Node(100);
        list.addNodeMiddle(node5, addMiddleNode);

        System.out.println("");
        list.printList(list);

        Node addMiddleNode2 = new Node(200);
        list.addNodeMiddle(node2, addMiddleNode2);
        
        System.out.println("");
        list.printList(list);
        
        // delete first node
        
        list.popFirstNode();
        
        System.out.println("");
        list.printList(list);
        
        // delete last node
        
        list.popLastNode();
        
        System.out.println("");
        list.printList(list);
        
        // delete middle node
        
        Node middlePopTestNode = new Node(99);
        list.addNodeMiddle(node4, middlePopTestNode);
        
        System.out.println("");
        list.printList(list);
        
        list.popMiddleNode(middlePopTestNode);
        
        System.out.println("");
        list.printList(list);
        
        
        // reverse doubly linked list
        
        list.reverseList();
        
        System.out.println("");
        list.printList(list);
        
        // last node move to first
        
        list.lastNodeMoveFirst();
        
        System.out.println("");
        list.printList(list);
        
    }

}
