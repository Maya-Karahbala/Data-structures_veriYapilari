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
public class Stack<AnyType> {
    private Node<AnyType>head;
    public boolean isEmpty(){
      return head==null;
    }
    public void push(AnyType data){
        Node<AnyType> newNode=new Node<>(data);
        if(isEmpty()){
            head=newNode;
        }
        else{
            newNode.nextNode=head;
            head=newNode;
        }
    }
    public AnyType pop(){
        if(!isEmpty()){
             Node<AnyType> temp=head;
             
           
            AnyType removed=head.data;
            head=head.nextNode;
            return removed;
        }
        return  null;
    }
    public void print(){
        if(!isEmpty()){
             Node<AnyType> temp=head;
             
            while (temp!=null) {                
                System.out.print(temp+"-->");
                temp=temp.nextNode;
            }
            System.out.println("null");
         
        }
    }
}
