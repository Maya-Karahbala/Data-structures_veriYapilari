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
public class linkedList<T, G> {

    Node<T, G> head;

    public void addFirst(T key, G value) {
        Node<T, G> newNode = new Node<>(key, value);
        // if list is empty head will be null and that does not effect
        newNode.nextNode = head;
        head = newNode;
    }

    public void print() {
        Node<T, G> temp = head;
        while (temp != null) {
            System.out.print(temp.key + " : " + temp.value + " ->");
            temp = temp.nextNode;
        }
        System.out.println("null");
    }
}
