/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapSort;

/**
 *
 * @author maya
 */
public class test {
    public static void main(String[] args) {
        int array[] = new int[12];

        // random int array with 10 elements
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        minHeap hSort = new minHeap();

        System.out.println("unsorted array");
        printArray(array);

        System.out.println("after heapify");
        hSort.heapify(array);
        printArray(array);
          System.out.println("after sorting");
        hSort.heapSort(array);
        printArray(array);

        
    }
    public  static void  printArray(int [] array){
          for (int i = 0; i < array.length; i++) {
            System.out.print(i+" ");
            
        }
          System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            
        }
        System.out.println("");
    }
}
