package circulardoublylinkedlist;

class Node {

    Node next;
    Node back;
    int value;

    public Node(int value) {

        next = null;
        back = null;
        this.value = value;

    }
}

public class CircularDoublyLinkedList {

    Node head;
    Node tail;

    CircularDoublyLinkedList() {

        head = null;
        tail = null;
    }

    void addNodeLast(Node new_node) {

        if (head == null) {

            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            new_node.back = tail;
            tail = new_node;
            tail.next = head;
            head.back = tail;
        }

    }
    
    void popLastNode(){
    
        if (head == null){
        
            System.out.println("Please add node before pop a node!");   
        }else {
        
            tail = tail.back;
            tail.next = head;
        }
    }
    
    void printList (CircularDoublyLinkedList list){
    
        Node temporary = head;
        System.out.print(temporary.value + " ");
        temporary = temporary.next;
        while (temporary != head){
        
            System.out.print(temporary.value + " ");
            temporary = temporary.next;
        }
        System.out.println("");
    }

}
