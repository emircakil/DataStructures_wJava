/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue_warray;

public class Queue_wArray {

    int size;
    int front;
    int rear;
    int capacity;
    int[] queueArray;

    public Queue_wArray(int capacity) {

        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        queueArray = new int[this.capacity];
    }

    boolean isFull(Queue_wArray queue) {

        return (queue.size == queue.capacity);
    }

    boolean isEmpty(Queue_wArray queue) {

        return (queue.size == 0);
    }

    void enqueue(int item) {

        if (isFull(this)) {
            System.out.println("Queue is full!");
            return;
        } else {

            this.rear = (this.rear + 1) % this.capacity;
            this.queueArray[this.rear] = item;
            this.size += 1;
        }
    }

    int dequeue() {

        if (isEmpty(this)) {
            System.out.println("Queue is empty!");
            return Integer.MIN_VALUE;
        }

        int item = this.queueArray[this.front];
        this.front = (this.front + 1) % capacity;
        this.size -= 1;
        return item;
    }

    int front() {

        if (isEmpty(this)) {
            System.out.println("Queue is empty!");
            return Integer.MIN_VALUE;
        }

        return this.queueArray[this.front];
    }

    int rear() {

        if (isEmpty(this)) {
            System.out.println("Queue is empty!");
            return Integer.MIN_VALUE;
        }

        return this.queueArray[this.rear];
    }

    void printQueue() {

        for (int i = front; i <= rear; i++) {

            System.out.print(queueArray[i] + " <= ");

        }
        System.out.println("");
    }

    public static void main(String[] args) {

        Queue_wArray queue = new Queue_wArray(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Front item is " + queue.front());
        System.out.println("Rear item is " + queue.rear());
        queue.printQueue();

        System.out.println(queue.dequeue() + " dequeued from queue\n");
        System.out.println("Front item is " + queue.front());
        System.out.println("Rear item is " + queue.rear());
        queue.printQueue();
    }

}
