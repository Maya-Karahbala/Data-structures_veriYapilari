/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_Array;

/**
 *
 * @author maya
 */
public class test {
    public static void main(String[] args) {
        Stack<Integer> myStack=new Stack<>(5);
        Stack<Integer> myStack2=new Stack<>(5);
        myStack.print();
        myStack.push(22);
         myStack.push(22);
          myStack.push(8);
           myStack.push(8);
            myStack.push(38);
            myStack.print();
           System.out.println( myStack2.pop());
          
            myStack.print();
    }
  
}
