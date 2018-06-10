/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

//              50
//           25       70
//      20     28   60      77
//   8     21          62      80
public class test {
    public static void main(String[] args) {
        BSTree tree=new BSTree();
        tree.addNormal(50);
         tree.addNormal(70);
          tree.addNormal(60);
         tree.addNormal(77);
          tree.addNormal(62);
           tree.addNormal(80);
         ////////////
          tree.addNormal(25);
            tree.addNormal(20);
         tree.addNormal(28);
          tree.addNormal(8);
           tree.addNormal(21);
          tree.preOrder(tree.root);
        
    }
}
