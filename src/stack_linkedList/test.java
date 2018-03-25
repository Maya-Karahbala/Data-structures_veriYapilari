/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_linkedList;

/**
 *
 * @author maya
 */
public class test {
    public static void main(String[] args) {
        Stack<Integer> myStack=new Stack<>();
        myStack.print();
        myStack.push(66);
        myStack.push(66);
        myStack.push(33);
        myStack.push(1);
        myStack.print();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
         myStack.print();
    }
}
