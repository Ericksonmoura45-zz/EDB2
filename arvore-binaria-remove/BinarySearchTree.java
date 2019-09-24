public class BinarySearchTree {
   private Node root = null;
   
   public boolean isEmpty() {
      return root == null;
   }

   void insert(Node node) {
      if (root == null){
           root = node;
           return;
      }
   }
    
   void insert(int value) {
      Node n = new Node(value);
      insert(n);
   }
   
   Node search (int key) {
      if (root == null){
          return null;
      }
   return root.search(key);
   } 

   void remove(int key) {
        root.remove(root, key);
   }
} 
