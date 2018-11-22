
package BinarySearchTree;


public class test {
    public static void main(String[] args) {
      BSTree<Integer> tree = new BSTree<>();

        /*
                 20
                /  \
               6    28
              / \    \
             3   7    35
            / \   \  
           2   4   18
         */
 /*  tree.insert(20);
   tree.insert(6);
    tree.insert(28);
    tree.insert(3);bst.test.main()
    tree.insert(7);
    tree.insert(35);
    tree.insert(2);bst.test.main()
    tree.insert(4);
    tree.insert(18);*/
 
        tree.insertRecursive(20);
        tree.insertRecursive(6);
        tree.insertRecursive(28);
        tree.insertRecursive(28);
        tree.insertRecursive(3);
        tree.insertRecursive(7);
        tree.insertRecursive(35);
        tree.insertRecursive(2);
        tree.insertRecursive(4);
        tree.insertRecursive(18);
        System.out.println("");
        tree.preorder();
        System.out.println(tree.searchRecursive(28));
         System.out.println(tree.search(20));
         System.out.println(tree.min());
         System.out.println(tree.max());
         System.out.println(tree.nodeCount());
         System.out.println(tree.sum());

}
}
