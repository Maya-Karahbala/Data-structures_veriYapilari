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
public class Node<AnyType> {
    Node<AnyType> nextNode,prevNode;
    AnyType data;

    public Node( AnyType data) {
       
        this.data = data;
        
    }
    
}
