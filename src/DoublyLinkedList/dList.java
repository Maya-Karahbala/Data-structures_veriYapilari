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
public class dList<AnyType> {

    Node<AnyType> head;
    private  int size;

    public dList() {
        head = null;
        size = 0;
    }

    public void addLast(AnyType data) {
        Node<AnyType> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<AnyType> temp = head;
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = newNode;
            newNode.prevNode = temp;
        }
        size++;
    }

    public void addFirst(AnyType data) {
        Node<AnyType> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.nextNode = head;
            head.prevNode = newNode;
            head = newNode;
        }
        size++;
    }

    public boolean insertAfter(AnyType iData, AnyType newData) {
        Node<AnyType> newNode = new Node<>(newData);
        Node<AnyType> temp = head;
        while (!temp.data.equals(iData) && temp != null) {
            temp = temp.nextNode;
        }
        if (temp != null) {
            newNode.nextNode = temp.nextNode;
            temp.nextNode.prevNode = newNode;
            temp.nextNode = newNode;
            newNode.prevNode = temp;
            size++;
            return true;
        }
        return false;
    }

    public void remove(AnyType rData) {
        if (head == null) {
            System.out.println("empty list");
        } else {
            if (head.data.equals(rData)) {
                head=head.nextNode;
                head.prevNode=null;
                
            } else {
                Node<AnyType> temp = head;
                while (!temp.data.equals(rData) && temp != null) {
                    temp = temp.nextNode;
                }
                if(temp.nextNode==null){
                    temp.prevNode.nextNode=null;
                }
                else if (temp != null) {
                    temp.prevNode.nextNode = temp.nextNode;
                    temp.nextNode.prevNode = temp.prevNode;
                }
                else{
                    System.out.println("item not found");
                }
            }
        }
    }
       public int size() {
        return size;
    }

    public void print() {
        if (head != null) {
            Node<AnyType> temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.nextNode;

            }

        }
        System.out.println("null");
    }

}
