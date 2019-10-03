public class ArvoreBinariaBusca {
    private Node raiz = null;

    public boolean isEmpty() {
        return raiz == null;
    }

    public Node getRoot() {
        return raiz;
    }

    public void insert(Node node) {
        if (raiz == null) {
            raiz = node;
            return;
        }
        raiz.insert(node);
    }

    public void insert(int value) {
        Node n = new Node(value);
        insert(n);
    }

    public Node search(int key) {
        if (raiz == null) {
            return null;
        }
        return raiz.search(key);
    }
    
    public int height(Node node) {
        if (node == null) {
            return 0;
        }
  
        return 1 + Math.max(height(node.left), height(node.right)); 
    }
    
    public boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }
  
        int leftHeight = height(node.left); 
        int rightHeight = height(node.right); 
  
        if ((Math.abs(leftHeight - rightHeight) <= 1) && isBalanced(node.left) && isBalanced(node.right)) { 
            return true;
        }
  
        return false; 
    }
}
