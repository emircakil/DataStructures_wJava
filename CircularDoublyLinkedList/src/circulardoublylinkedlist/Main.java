package circulardoublylinkedlist;

public class Main {

    public static void main(String[] args) {

        CircularDoublyLinkedList circularList = new CircularDoublyLinkedList();

        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        
        circularList.addNodeLast(node1);
        circularList.addNodeLast(node2);
        circularList.addNodeLast(node3);
        circularList.addNodeLast(node4);

        circularList.printList(circularList);
        
        circularList.popLastNode();
        circularList.printList(circularList);
    }
}
