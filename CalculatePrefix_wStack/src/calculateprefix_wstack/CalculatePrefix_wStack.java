/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculateprefix_wstack;

class Node {

    int data;
    Node link;

    Node(int data) {

        this.data = data;
        link = null;
    }

}

public class CalculatePrefix_wStack {

    static CalculatePrefix_wStack stack = new CalculatePrefix_wStack();
    Node top;

    CalculatePrefix_wStack() {

        top = null;
    }

    public void push(int data) {

        Node new_node = new Node(data);

        if (isEmpty()) {

            top = new_node;
        } else {

            new_node.link = top;
            top = new_node;
        }
    }

    public Node pop() {

        Node temporary = top;

        if (isEmpty()) {

            System.out.println("Throw: Stack is empty!");
        } else {

            top = top.link;
        }
        return temporary;
    }

    public void printStack() {

        Node temporary = top;

        while (temporary != null) {

            System.out.println(temporary.data);
            top = top.link;
        }
        System.out.println("");
    }

    public Node peek() {

        return top;
    }

    public boolean isEmpty() {

        return top == null;
    }

    public static int calculatePrefix(String expression) {

        for (int i = expression.length() - 1; i >= 0; i--) {

            char c = expression.charAt(i);

            if (Character.isDigit(c)) {

                stack.push(c - '0');
            } else {

                int val1 = stack.pop().data;
                int val2 = stack.pop().data;

                switch (c) {

                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                }

            }

        }
        return stack.pop().data;
    }

    public static void main(String[] args) {

        String expression = "*+235";
        System.out.println("Prefix = " + calculatePrefix(expression));
    }

}
