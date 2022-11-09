package stack;

class Node {

    Node link;
    char value;

    Node(char value) {

        link = null;
        this.value = value;
    }

}

public class Stackk {
 
    Node top;

    Stackk() {
      
        top = null;
    }

    public boolean isEmpty() {

        return top == null;
    }

    /*
    public int push(char data) {

        Node new_node = new Node(data);

        if (isEmpty()) {

            top = new_node;
            return -1;
        } else {

            }
        }

    }
     */
    public void push(char data) {

        Node new_node = new Node(data);

        if (isEmpty()) {

                top = new_node;
        } else {
         
                new_node.link = top;
                top = new_node;
         

        }
    }

    public Node pop() {

        Node node = top;

        if (isEmpty()) {

            System.out.println("Stack is empty!");
            return null;
        } else {

            top = top.link;
        }
        return node;
    }

    public Node peek() {

        if (isEmpty()) {

            System.out.println("Stack is empty!");
            return null;
        } else {

            return top;
        }

    }

    public void dischargeStack() {

        if (isEmpty()) {

            System.out.println("Stack is empty!");
        } else {

            while (!isEmpty()) {

                System.out.println(pop().value);

            }
        }
    }

    public void printStack() {

        Node temp = top;

        if (isEmpty()) {

            System.out.println("Stack is empty!");
        } else {

            while (temp != null) {

                System.out.println(temp.value);
                temp = temp.link;
            }
            System.out.println("");

        }
    }
}
