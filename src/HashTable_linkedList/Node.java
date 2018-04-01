/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable_linkedList;

/**
 *
 * @author maya
 */
public class Node<T,G> {
    T key;
    G value;
    Node<T,G> nextNode;

    public Node(T key, G value) {
        this.key = key;
        this.value = value;
        // next node will be null by default
        
    }
    
}
