public class Main {
    private static final int NODE_TO_REMOVE = 8;

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(new Node(10));
        tree.insert(11);
        tree.insert(9);
        tree.insert(8);
        tree.insert(16);

        tree.remove(NODE_TO_REMOVE);

        Node node = tree.search(NODE_TO_REMOVE);
        if (node != null) {
            System.out.printf("Element %d found!%n", NODE_TO_REMOVE);
        } else {
            System.out.printf("Element %d not found!%n", NODE_TO_REMOVE);
        }
    }
}
