/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

/**
 *
 * @author maya
 */
public class BSTree <T extends Comparable<T>> {
    Node<T>root;
    public void addNormal(T NewData){
        Node newNode=new Node(NewData);
        if(root==null){
            root=newNode;
        }
        else{
            Node temp=root;
            Node parent;
            while (true) {  
                parent=temp;
                if(NewData.hashCode()>temp.data.hashCode()){
                    temp=temp.rightChild;
                    if(temp==null){
                       parent.rightChild=newNode;
                       return;
                    }
                }
                else{
                    temp=temp.leftChild;
                     if(temp==null){
                       parent.leftChild=newNode;
                       return;
                    }
                }
            }
        }
    }
    public void preOrder(Node n){
        if(n==null){
            return;
        }
        System.out.print(n.data+" ");
        preOrder(n.leftChild);
        preOrder(n.rightChild);
    }
}
