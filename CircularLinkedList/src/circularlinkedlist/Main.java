/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circularlinkedlist;

/**
 *
 * @author emir7
 */
public class Main {

    public static void main(String[] args) {

        CircularLinkedList circularList = new CircularLinkedList();
        
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        
        circularList.addNodeLast(node1);
        circularList.addNodeLast(node2);
        circularList.addNodeLast(node3);

        circularList.printList(circularList);
    }
}
