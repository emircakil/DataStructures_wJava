/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package infixtoprefix;

class Node {

    char data;
    Node link;

    Node(char data) {

        this.data = data;
        link = null;
    }
}

public class InfixToPrefixAndPostfix_Stack {

    static InfixToPrefixAndPostfix_Stack stack = new InfixToPrefixAndPostfix_Stack();
    static Node top;

    InfixToPrefixAndPostfix_Stack() {

        top = null;
    }

    public static boolean isEmpty() {

        return top == null;
    }

    public static void push(char data) {

        Node new_node = new Node(data);

        if (isEmpty()) {

            top = new_node;
        } else {

            new_node.link = top;
            top = new_node;
        }
    }

    public static Node pop() {

        Node temporary = top;

        if (isEmpty()) {

            System.out.println("Throw: Stack is empty!");
        } else {

            top = top.link;
        }
        return temporary;
    }

    public static Node peek() {

        return stack.top;
    }

    public void printStack() {

        Node temporary = top;

        if (isEmpty()) {

            System.out.println("Throw: Stack is empty!");
        } else {

            while (temporary != null) {

                System.out.println(top.data);
                top = top.link;
            }
            System.out.println("");
        }
    }

    public static boolean isOperator(char c) {

        return (!Character.isLetterOrDigit(c));
    }

    public static int getPriority(char c) {

        if (c == '-' || c == '+') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 2;
        } else if (c == '^') {
            return 3;
        }

        return 0;
    }

    static String reverse(char str[], int start, int end) {

        char temporary;

        while (start < end) {

            temporary = str[start];
            str[start] = str[end];
            str[end] = temporary;
            start++;
            end--;
        }
        return String.valueOf(str);
    }

    static String infixToPostfix(String expression) {

        String output = "";

        for (int i = 0; i < expression.length(); i++) {

            char c = expression.charAt(i);

            if (Character.isLetterOrDigit(c)) {

                output += c;
            } else if (c == '(') {

                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek().data != '(') {

                    output += stack.peek().data;
                    stack.pop();

                }
                stack.pop();
            } else {

                while (!stack.isEmpty() && stack.getPriority(c) <= stack.getPriority(stack.peek().data)) {

                    output += stack.peek().data;
                    stack.pop();
                }
                stack.push(c);
            }

        }
        while (!stack.isEmpty()) {
            if (stack.peek().data == '(') {

                return "Invalid Expression";
            }
            output += stack.peek().data;
            stack.pop();
        }
        return output;
    }

    static String infixToPrefix(char[] infix) {

        int Length = infix.length;
        String infixStr = reverse(infix, 0, Length - 1);
        infix = infixStr.toCharArray();

        for (int i = 0; i < Length; i++) {

            if (infix[i] == '(') {
                infix[i] = ')';
                i++;
            }else if (infix[i] == ')'){
            
                infix[i] = '(';
                i++;
            }
        }
        String prefix = infixToPostfix(String.valueOf(infix));
        prefix = reverse(prefix.toCharArray(), 0 , prefix.length()-1);
        
        return prefix;
    }

    public static void main(String[] args) {
        String expression = ("a+b*(c^d-e)^(f+g*h)-i");
        System.out.println(infixToPostfix(expression));
        System.out.println(infixToPrefix(expression.toCharArray()));
    }

}
