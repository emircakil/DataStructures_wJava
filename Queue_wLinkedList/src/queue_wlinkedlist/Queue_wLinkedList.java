package queue_wlinkedlist;

class Node {

    int value;
    Node next;

    Node(int value) {
        this.value = value;
        next = null;
    }
}

public class Queue_wLinkedList {

    Node front;
    Node rear;

    Queue_wLinkedList() {

        front = null;
        rear = null;
    }

    void enqueue(int value) {

        Node new_node = new Node(value);

        if (rear == null) {

            this.front = this.rear = new_node;
        } else {

            this.rear.next = new_node;
            rear = new_node;
        }
    }

    int dequeue() {

        Node temporary = front;

        if (front == null) {

            System.out.println("Queue is empty!");
            return Integer.MIN_VALUE;
        } else {

            front = front.next;
        }
        return temporary.value;
    }

    void printQueue() {

        Node temporary = front;

        while (temporary != null) {

            System.out.print(temporary.value + " <= ");
            temporary = temporary.next;
        }
        System.out.println("");
    }

    int getFront() {

        return this.front.value;
    }

    int getRear() {

        return this.rear.value;
    }

    int getSize() {

        Node temporary = front;
        int counter = 0;

        while (temporary != null) {

            temporary = temporary.next;
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {

        Queue_wLinkedList queue = new Queue_wLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.printQueue();
        System.out.println("Front element on the queue is: " + queue.getFront());
        System.out.println("Rear element on the queue is: " + queue.getRear());
        System.out.println("Queue size: " + queue.getSize());
        
        System.out.println("");
        System.out.println(queue.dequeue() + "has been dequeued");
        System.out.println(queue.dequeue() + "has been dequeued");
        System.out.println("");
        
        queue.printQueue();
        System.out.println("Front element on the queue is: " + queue.getFront());
        System.out.println("Rear element on the queue is: " + queue.getRear());
        System.out.println("Queue size: " + queue.getSize());
        
        

    }

}
