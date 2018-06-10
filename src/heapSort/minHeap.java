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
public class minHeap {
     void heapSort(int[] array) {
          int n= array.length-1;
        heapify(array);

        for (int i = n; i > 0; i--) {
            swap(array, 0, i);
            n--;
            maxHeap(array, 0);
        }
    }
public void heapify(int[] array){
   int  n=(array.length-2)/2;
    for (int i =n; i > 0; i--) {
        maxHeap(array, i);
        
    }
}
  void maxHeap(int[] array, int k) {
      int n= array.length-1;
        int left = 2 * k + 1;
        int right = 2 * k + 2;

        int max = k;

        if (left <= n && array[max] < array[left]) {
            max = left;
        }
        if (right <= n && array[max] < array[right]) {
            max = right;
        }

        if (max != k) {
            swap(array, k, max);
            maxHeap(array, max);
        }
    }
    public void minHeapFun(int[] array, int k) {
        int left = k * 2 + 1;
        int right = k * 2 + 2;
        int min = k;
        int minLeftAndRight = right;
        if (left < array.length && right < array.length) {
            if (array[left] < array[right]) {
                minLeftAndRight = left;
            }
            if (array[minLeftAndRight] < array[k]) {

                min = minLeftAndRight;
            }
        }
        if (min != k) {
            swap(array, k, min);
            minHeapFun(array, min);
        }

    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
