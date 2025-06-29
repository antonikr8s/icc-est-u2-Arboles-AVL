public class AVLTree {
    // usa la complejidad O(1), sumamos la altura
    private Node root;

    public AVLTree() {
        this.root = null;
    }

    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.getHeight();
    }

    public int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return height(node.getLeft()) - height(node.getRight());// no recursivo con complejidad O(1)
    }

    public void insert(int value) {
        System.out.println("Nodo a insertar: " + value);
        root = insertRec(root, value);
    }

    private Node insertRec(Node node, int value) {
        if (node == null) {
            Node newNode = new Node(value);
            newNode.setHeight(1); // altura inicial

            System.out
                    .println("Nodo insertado: " + newNode.getValue() + " balance al insertar: " + getBalance(newNode));

            return newNode;
        }

        if (value < node.getValue()) {
            node.setLeft(insertRec(node.getLeft(), value));

        } else if (value > node.getValue()) {
            node.setRight(insertRec(node.getRight(), value));
        } else {
            return node;
        }

        System.out.println("Node actual: " + node.getValue());

        // actualizar la altura de este ancestro node

        int altura = 1 + Math.max(height(node.getLeft()), height(node.getRight()));
        node.setHeight(altura);

        System.out.println("\tAltura = " + node.getHeight());

        int balance = getBalance(node);
        System.out.println("\tBalance = " + balance);

        // Caso Izquierda-Izquierda
        if (balance > 1 && value < node.getLeft().getValue()) {
            System.out.println("Rotacion Derecha");
        }
        // Caso Derecha-Derecha
        if (balance < -1 && value > node.getRight().getValue()) {
            System.out.println("Rotacion Izquierda");
        }

        // Caso Izquierda-Derecha (mixto)

        if (balance > 1 && value > node.getLeft().getValue()) {
            System.out.println("-> Cambio ");
            System.out.println("Rotacion Izquierda-Derecha");
        }

        // Caso Derecha-Izquierda (mixto)
        if (balance < -1 && value < node.getRight().getValue()) {
            System.out.println("-> Cambio ");
            System.out.println("Rotacion Derecha-Izquierda");
        }

        return node;// falta calcular el factor de equilibrio

    }

    private Node rotateLeft(Node x) {
        Node y = x.getRight();
        Node T2 = y.getLeft();

        y.setLeft(x);
        x.setRight(T2);

        x.setHeight(1 + Math.max(height(x.getLeft()), height(x.getRight())));
        y.setHeight(1 + Math.max(height(y.getLeft()), height(y.getRight())));

        return y;
    }

    private Node rotateRight(Node y) {
        Node x = y.getLeft();
        Node T2 = x.getRight();

        x.setRight(y);
        y.setLeft(T2);

        y.setHeight(1 + Math.max(height(y.getLeft()), height(y.getRight())));
        x.setHeight(1 + Math.max(height(x.getLeft()), height(x.getRight())));

        return x;
    }

    // metodos para imprimir
    public void printInOrder() {
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.getLeft());
            System.out.print(node.getValue() + " ");
            printInOrder(node.getRight());
        }
    }

}

/*
 * Si el balance es >1 ¿que hijo tiene mayor altura?
 * el de la inquierda porque mi formula dice izquierda-derecha, por ende
 * el hijo de la izquierda debe ser mas alto
 */
