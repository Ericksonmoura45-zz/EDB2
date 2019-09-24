class Node {
    private Node left;
    private Node right;
    private int value;

    Node(int value) {
        this.value = value;
    }

    void insert(Node node) {
        if (node.value < this.value) {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.insert(node);
            }
        } else if (node.value > this.value) {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.insert(node);
            }
        }
    }

    Node search(int key) {
        if (key == this.value) {
            return this;
        }

        if (key < this.value) {
            if (this.left != null) {
                return this.left.search(key);
            }
        }

        if (key > this.value) {
            if (this.right != null) {
                return this.right.search(key);
            }
        }

        return null;
    }

    Node remove(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.value) {
            root.left = remove(root.left, key);
        } else if (key > root.value) {
            root.right = remove(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.value = lowerValue(root.right);
            root.right = remove(root.right, root.value);
        }

        return root;
    }

    private int lowerValue(Node node) {
        int value = node.value;

        while (node.left != null) {
            value = node.left.value;
            node = node.left;
        }

        return value;
    }
}

