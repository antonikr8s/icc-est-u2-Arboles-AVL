public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("NOMBRES: CARLOS ANTONIO GORDILLO TENEMAZA");
        System.out.println("CORREO: cgordillot@est.ups.edu.ec\n");

        AVLTree tree = new AVLTree();
        /*
         * tree.insert(10);
         * tree.insert(20);
         * tree.insert(15);
         */

        int[] valores = { 10, 20, 15 };

        // Insertar todos los valores
        for (int v : valores) {
            tree.insert(v);
        }

        // Imprimir arboles
        System.out.print("\nArbol original: ");
        for (int v : valores) {
            System.out.print(v + " ");
        }

        System.out.print("\nArbol balanceado (in-order): ");
        tree.printInOrder();
    }
}
