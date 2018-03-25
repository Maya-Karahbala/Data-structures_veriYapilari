/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoublyLinkedList;

/**
 *
 * @author maya
 */
public class test {
    public static void main(String[] args) {
         dList<Integer> myList=new dList<>();
         myList.print();
         myList.addFirst(4);
         myList.addFirst(42);
         myList.addFirst(41);
         myList.addLast(1);
            myList.print();
           
         myList.insertAfter(42, 11);
         myList.print();
          System.out.println("");
         myList.remove(1);
        System.out.println(myList.size());
      
       
    }
  
}
