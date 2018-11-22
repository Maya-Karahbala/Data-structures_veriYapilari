
package BinarySearchTree;

/**
 *
 * @author maya
 */
public class BSTree <T extends Comparable<T>> {
  
      Node<T> root;

    public void insert(T newData) {
        Node newNode = new Node(newData);

        if (root == null) {
            root = newNode;
        } else {
            Node<T> temp = root;
            while (temp != null) {
                if (newData.compareTo(temp.data) > 0) {
                    //go to right
                    if (temp.right == null) {
                        temp.right = newNode;
                        return;
                    }
                    temp = temp.right;
                } else if (newData.compareTo(temp.data) < 0) {
                    //go to left
                    if (temp.left == null) {
                        temp.left = newNode;
                        return;
                    }
                    temp = temp.left;
                } else {
                    return;//if equal do nothing
                }
            }
        }
    }

    /*
                 20
                /  \
               6    28
              / \    \
             3   7    35
            / \   \  
           2   4   18
     */
    public void preorder() {
        preorder(root);
    }

    private void preorder(Node<T> n) {
        if (n != null) {
            System.out.print(n.data + " ");
            preorder(n.left);
            preorder(n.right);
        }
    }

    /*
      preorder(20)-> 20
                  preorder(6)->6
                             preorder(3)->3
                                        preorder(2)->2
                                                   preorder(null)
                                                   preorder(null)
                                        preorder(4)->4
                                                   preorder(null)
                                                   preorder(null)
                            
                           preorder(7)->7
                                    preorder(null)
                                    preorder(18)->18
                                                preorder(null)
                                                preorder(null)
                 preorder(28)->28
                              preorder(null)
                              preorder(25)->35
                                           preorder(null)
                                           preorder(null)
      result -> 20 6 3 2 4 7 18 28 35 
                 
     */
    public void insertRecursive(T newData) {
        root = insertRecursive(newData, root);
    }

    private Node<T> insertRecursive(T newData, Node<T> n) {
        if (n == null) {
            return new Node<T>(newData);
        } else if (newData.compareTo(n.data) > 0) { //go to right
            n.right = insertRecursive(newData, n.right);
        } else if (newData.compareTo(n.data) < 0) { //go to left
            n.left = insertRecursive(newData, n.left);
        }

        return n;
    }

    /*
  **insertRecursive(20)
   root=insertRecursive(20,root)
   root= return new Node<T>(20);
  ----------------------------------------
  **insertRecursive(6)->
    root=insertRecursive(6,root)
                          20.left=insertRecursive(6, root.left);
                                   new Node(6)
         return 20
  -------------------------------------------
    **insertRecursive(28)->
    root=insertRecursive(28,root)
                          20.right=insertRecursive(28, root.right);
                                   new Node(28)
         return 20
  ----------------------------------------------
  insertRecursive(3)->
    root=insertRecursive(3,root)
                  root.left =insertRecursive(3, root.left  =6 );
                                 6.left =insertRecursive(3, 6.left=null);
                                 6.left=new Node(3)
                             return 6
          return 20 -> root
  
     */
    public boolean searchRecursive(T key) {
        return searchRecursive(key, root);
    }

    private boolean searchRecursive(T key, Node<T> n) {
        if (n == null) {
            return false;
        } else if (key.compareTo(n.data) == 0) { // key has founded
            return true;
        } else if (key.compareTo(n.data) > 0) { //go to right
            return searchRecursive(key, n.right);
        } else if (key.compareTo(n.data) < 0) { //go to left
            return searchRecursive(key, n.left);
        }
        return false;
    }

    public boolean search(T key) {
        if (root == null) {
            return false;
        } else {
            Node<T> temp = root;
            while (temp != null) {
                if (key.compareTo(temp.data) == 0) { // key has founded
                    return true;
                } else if (key.compareTo(temp.data) > 0) { //go to right
                    temp = temp.right;
                } else if (key.compareTo(temp.data) < 0) { //go to left
                    temp = temp.left;
                }
            }

        }
        return false;
    }

    public T min() {
        if(root!=null){
        return min(root);}
        else return null ;
    }

    private T min(Node<T> n) {
        if (n.left == null) {
            return n.data;
        } else {
            return min(n.left);
        }
    }
    public T max() {
        if(root!=null){
        return max(root);}
        else return null ;
    }

    private T max(Node<T> n) {
        if (n.right == null) {
            return n.data;
        } else {
            return max(n.right);
        }
    }
     public int nodeCount(){
        return nodeCount(root);
    }
    private int nodeCount(Node<T> n){
        if(n==null)return 0;
        else return 1+nodeCount(n.left)+nodeCount(n.right);
    }
     public int sum(){
         if(root.data instanceof Integer) return sum(root);
         return 0;
        
    }
    private int sum(Node n){
        if(n==null)return 0;
        else return (Integer)n.data +sum(n.left)+sum(n.right);
    }    
}
