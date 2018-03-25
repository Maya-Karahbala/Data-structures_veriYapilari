/** veri yapılar 1 ödev
 *singly linked list veri yapısı kullanılarak, x’e bağlı değişen iki adet fonksiyon üzerinden
  aritmetik işlemler 
  * 10/3/2018.
 * @author maya karahBala
 */
package HW;

/**
 *
 * @author maya
 */
public class Node {
   String data;
   String dataPower;
   
    Node  nextNode;

    public Node(String data,String dataPower) {
        this.data = data;
         this.dataPower = dataPower;
    } 

    public Node() {
    }
    
}