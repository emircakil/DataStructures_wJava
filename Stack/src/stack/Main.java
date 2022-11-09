/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

/**
 *
 * @author emir7
 */
public class Main {

    public static void main(String[] args) {

        Stackk stack = new Stackk();
        stack.push('2');
        stack.push('3');
        stack.push('4');
        
        

        stack.printStack();

        stack.pop();
        stack.printStack();
        
        System.out.println("Top node of the stack: " + stack.peek().value);
    }
}
