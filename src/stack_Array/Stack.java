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
public class Stack<AnyType> {

    private AnyType[] dataArray;
    private int top;

    public Stack(int maxSize) {
        dataArray = (AnyType[]) new Object[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(AnyType data) {
       
        if (top == dataArray.length - 1) {
            System.out.println("stack is full");

        } else {
            dataArray[++top] = data;
        }

    }
 public  AnyType pop(){
     
     if(!isEmpty()){
       
        return dataArray[top--];
     }
     return null;
 }
    public void print() {
        if (top != -1) {
            for (int i = 0; i <= top; i++) {
                System.out.print(dataArray[i]+"->>");
            }
        }
        System.out.println("null");
    }
}
