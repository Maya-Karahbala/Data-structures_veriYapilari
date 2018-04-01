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
public class test {

    public static void main(String[] args) {
        HashTable<String, String> myTable = new HashTable<>(27);// characters number with one more for every thing
        myTable.put("ahmet", "42546");
        myTable.put("ali", "426");
        myTable.put("ayse", "16");
        myTable.put("selim", "4746");
        myTable.put("maya", "9946");
        myTable.print();

    }
}
