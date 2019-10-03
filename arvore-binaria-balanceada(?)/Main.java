import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            arvore.insert(
                new Node(i)
            );
        }
        
        if (arvore.isBalanced(arvore.raiz)) {
            System.out.println("Árvore Balanceada!");
        } else {
            System.out.println("Árvore NÃO Balanceada!");
        }

        JFrame frame = new JFrame("Mostrar Arvore Binaria Balanceada");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(380, 280);

        MostrarArvoreBinaria mostrar = new MostrarArvoreBinaria(arvore);
        frame.add(mostrar);

        frame.setVisible(true);
    }
}
