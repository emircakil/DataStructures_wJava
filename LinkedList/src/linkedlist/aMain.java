/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author emir7
 */
public class aMain {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();

        Node node1 = new Node(10);
        list.addNodeLast(node1);

        Node node2 = new Node(2);
        list.addNodeLast(node2);

        Node node3 = new Node(15);
        list.addNodeLast(node3);

        Node startTest = new Node(21);
        list.addNodeFirst(startTest);

        Node middleNodeTest = new Node(100);
        list.addNodeMiddle(middleNodeTest, node1);

        Node firstNodePopTest = new Node(1);
        list.addNodeFirst(firstNodePopTest);

        list.popFirstNode();

        list.popLastNode();

        list.popMiddleNode(middleNodeTest);

        // concatenateTwoList
        Node l2node1 = new Node(10);
        Node l2node2 = new Node(20);
        Node l2node3 = new Node(30);

        list2.addNodeLast(l2node1);
        list2.addNodeLast(l2node2);
        list2.addNodeLast(l2node3);

        list = list.concatenateTwoList(list, list2);
        
        list.printList(list);
        
        
        list = list.reverseList(list);
        
        System.out.println("");
        list.printList(list);
        System.out.println("Reversing list");
        
        list.lastNodeMoveFirst();
        
        list.printList(list);
        
        
        System.out.println("");
        System.out.println("Node counter: " + list.nodeCounter());
    }
}
