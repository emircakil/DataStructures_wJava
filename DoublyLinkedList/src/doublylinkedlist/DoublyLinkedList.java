package doublylinkedlist;

class Node {

    int value;
    Node next;
    Node back;

    Node(int value) {

        this.value = value;
        next = null;
        back = null;
    }

}

public class DoublyLinkedList {

    Node head;
    Node tail;

    public DoublyLinkedList() {

        head = null;
        tail = null;
    }

    void printList(DoublyLinkedList list) {

        Node temporary = head;

        while (temporary != null) {

            System.out.print(temporary.value + " ");
            temporary = temporary.next;
        }
    }

    void addNodeFirst(Node newNode) {

        if (head == null) {

            head = newNode;
            tail = newNode;
        } else {

            newNode.next = head;
            head.back = newNode;
            head = newNode;
        }
    }

    void addNodeLast(Node newNode) {

        if (head == null) {

            head = newNode;
            tail = newNode;
        } else {

            tail.next = newNode;
            newNode.back = tail;
            tail = newNode;

        }
    }

    void addNodeMiddle(Node current, Node newNode) {

        if (head == null) {

            head = newNode;
            tail = newNode;
        } else {

            newNode.next = current.next;
            current.next = newNode;
            newNode.next.back = newNode;
            newNode.back = current;
        }
    }

    void popFirstNode() {

        if (head == null) {

            System.out.println("Please add node before pop a node!");
        } else {
            head = head.next;
            head.back = null;
        }
    }

    void popLastNode() {

        if (head == null) {

            System.out.println("Please add node before pop a node!");

        } else {

            tail = tail.back;
            tail.next = null;
        }
    }

    void popMiddleNode(Node node) {

        if (head == null) {

            System.out.println("Please add node before pop a node!");

        } else {

            node.back.next = node.next;
            node.next.back = node.back;

        }
    }

    void reverseList() {

        Node temporary = null;
        Node current = head;

        while (current != null) {

            temporary = current.back;
            current.back = current.next;
            current.next = temporary;
            current = current.back;

        }

        if (temporary != null) {
            head = temporary.back;

        }
        temporary = head;

        while (temporary != null) {

            current = temporary;
            temporary = temporary.next;

        }
        tail = current;
    }

    void lastNodeMoveFirst() {

        Node prev = tail.back;

        tail.next = head;
        head.back = tail;
        prev.next = null;
        tail.back = null;
        head = tail;
        tail = prev;
    }

}
