/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatepostfix_wstack;

class Node {

    Node link;
    int data;

    public Node(int data) {

        link = null;
        this.data = data;

    }
}

public class CalculatePostfix_wStack {

    static CalculatePostfix_wStack stack = new CalculatePostfix_wStack();
    Node top;

    public CalculatePostfix_wStack() {

        top = null;
    }

    public void push(int data) {

        Node node = new Node(data);

        if (isEmpty()) {

            top = node;
        } else {

            node.link = top;
            top = node;
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

    public Node peek() {

        return top;
    }

    public boolean isEmpty() {

        return top == null;
    }

    public void printStack() {

        Node temporary = top;

        while (temporary != null) {

            System.out.println(top.data);
            top = top.link;
        }
        System.out.println(" ");
    }

    public static int calculatePostfix(String expression) {

        for (int i = 0; i < expression.length(); i++) {
            
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {

                stack.push( c -  '0');

            } else {

                int val1 = stack.pop().data;
                int val2 = stack.pop().data;

                 switch(c)
                {
                    case '+':
                    stack.push(val2 + val1);
                    break;
                     
                    case '-':
                    stack.push(val2 - val1);
                    break;
                     
                    case '/':
                    stack.push(val2 / val1);
                    break;
                     
                    case '*':
                    stack.push(val2 * val1);
                    break;
              }

            }
        }
        return stack.pop().data;
    }

    public static void main(String[] args) {

        // Infix expression (20*(4 + -(3+2))) =  its an integer so result is 1...
        String expression = "632+-9*3/";
        System.out.println("Postfix = " + calculatePostfix(expression));
    }

}
