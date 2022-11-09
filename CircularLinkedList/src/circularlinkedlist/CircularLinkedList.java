package circularlinkedlist;

class Node {

    int value;
    Node next;

    public Node(int value) {

        this.value = value;
        next = null;

    }
}

public class CircularLinkedList {

    Node head;
    Node tail;

    CircularLinkedList() {

        head = null;
        tail = null;

    }

    void printList(CircularLinkedList list) {

        Node temporary = list.head;

        System.out.print(temporary.value + " ");
        temporary = temporary.next;

        while (temporary != list.head) {

            System.out.print(temporary.value + " ");

            temporary = temporary.next;
        }
        System.out.println("");
    }

    void addNodeLast(Node new_node) {

        if (head == null) {

            head = new_node;
            tail = new_node;
        } else {

            tail.next = new_node;
            tail = new_node;
            tail.next = head;
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
}
