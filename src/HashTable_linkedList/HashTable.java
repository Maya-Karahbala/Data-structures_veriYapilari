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
public class HashTable<T, G> {

    linkedList<T, G>[] table;

    public HashTable(int size) {
        table = new linkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new linkedList<>();
        }
    }

    // example
    public int hashFunction(T key) {
        // return a suitable index to store given node who has that key
        int first = String.valueOf(key).charAt(0);
        int hashValue = table.length - 1;//store all first outside the alphape in the last index in table
        if (Character.isAlphabetic(first)) {
            hashValue = Character.toUpperCase(first) % 'A';
        }
        return hashValue;
    }

    public void put(T key, G value) {
        int index = hashFunction(key);
        Node<T, G> temp = table[index].head;
        while (temp != null && !temp.key.equals(key)) {
            temp = temp.nextNode;
        }
        if (temp == null) {
            table[index].addFirst(key, value);
        } else {
            //key is same update the value
            temp.value = value;
        }
    }

    public G get(T key) {
        int index = hashFunction(key);
        Node<T, G> temp = table[index].head;
        while (temp != null && !temp.key.equals(key)) {
            temp = temp.nextNode;
        }
        if (temp != null) {// 
            return temp.value;
        }
        System.out.println("key \"" + key + "\" not found !");
        return null;//not found
    }
    public void print(){
        for (int i = 0; i < table.length; i++) {
           System.out.print("[" + i + "] ");
           table[i].print();
        }
    }

}
