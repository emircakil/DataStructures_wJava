package linkedlist;

class Node {

    int value;

    Node next;

    public Node(int value) {

        this.value = value;
        next = null;

    }
}

public class LinkedList {

    Node head;
    Node tail;

    public LinkedList() {

        head = null;
        tail = null;
    }

    void printList(LinkedList list) {

        Node temporary = list.head;

        while (temporary != null) {
            System.out.print(temporary.value + " ");
            temporary = temporary.next;
        }
    }

    void addNodeLast(Node newNode) {

        if (head == null) {

            head = newNode;
            tail = newNode;
        } else {

            tail.next = newNode;
            tail = newNode;
        }

    }

    void addNodeFirst(Node newNode) {

        if (head == null) {

            head = newNode;
            tail = newNode;
        } else {

            newNode.next = head;
            head = newNode;
        }

    }

    void addNodeMiddle(Node newNode, Node prevNode) {

        if (head == null) {

            head = newNode;
            tail = newNode;
        } else {

            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
    }

    void popFirstNode() {

        if (head == null) {

            System.out.println("Please add node before pop a node!");

        } else {

            head = head.next;
        }
    }

    void popLastNode() {

        Node temporary = head;
        Node prev = null;

        if (head == null) {

            System.out.println("Please add node before pop a node!");
        } else {

            while (temporary != tail) {

                prev = temporary;
                temporary = temporary.next;
            }
            prev.next = null;
            tail = prev;
        }
    }

    void popMiddleNode(Node popingNode) {

        Node temporary = head;
        Node prev = null;

        if (head == null) {

            System.out.println("Please add node before pop a node");
        } else {

            while (temporary != popingNode) {

                prev = temporary;
                temporary = temporary.next;
            }

            prev.next = temporary.next;

        }
    }

    int nodeCounter() {

        int counter = 0;
        Node temporary = head;

        while (temporary != null) {
            temporary = temporary.next;
            counter++;
        }
        return counter;
    }

    LinkedList concatenateTwoList(LinkedList list1, LinkedList list2) {

        LinkedList temporary;

        if (list1.head == null) {
            return list2;

        }
        if (list2.head == null) {
            return list1;

        }
        temporary = new LinkedList();
        temporary.head = list1.head;
        temporary.tail = list2.tail;
        list1.tail.next = list2.head;

        return temporary;

    }

    LinkedList reverseList(LinkedList list) {

        Node prev = null;
        Node current = head;
        Node next2 = null;
        Node tail2 = head;

        while (current != null) {

            next2 = current.next;
            current.next = prev;
            prev = current;
            current = next2;
        }
        head = tail;
        tail = tail2;
        return list;
    }
    
    void lastNodeMoveFirst (){
    
        Node temporary = head;
        
        Node prev = null;
        while(temporary !=tail){
            prev = temporary;
            temporary = temporary.next;
        
        }
        prev.next = null;
        tail.next = head;
        head = tail;
        
    }

}
