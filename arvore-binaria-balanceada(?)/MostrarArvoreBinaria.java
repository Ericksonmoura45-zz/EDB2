import javax.swing.*; // importei todas caso precisasse
import java.awt.*;

public class MostrarArvoreBinaria extends JComponent {
    private ArvoreBinariaBusca arvore = null;
    private int nodeSize = 25;
    private int offset   = 55;

    public MostrarArvoreBinaria(ArvoreBinariaBusca arvore) {
        this.arvore = arvore;
    }

    //Sobrecarga
    protected void paintComponent(Graphics grafico) {
        if (this.arvore == null) {
            return;
        }
        drawNode(grafico, this.arvore.getRoot(), getWidth() / 2, 0, 0 ); // LVL
    }

    /*private void drawNode(Graphics graphics, Node node, int x, int y, int level) {        // Provavelmente Errado!
        graphics.drawOval(x, y, nodeSize, nodeSize);
        graphics.drawString(
            String.valueOf(node.getValue()),
            x + 9,
            y + 21
        ); */

        if (node.getLeft() != null) {
            int CriancaX = x - offset;
            int CriancaY = y + offset;

            graphics.drawLine(x + nodeSize / 2, y + nodeSize, CriancaX + nodeSize / 2, CriancaY);
            drawNode(graphics, node.getLeft(), CriancaX, CriancaY, level + 1);
        }

        if (node.getRight() != null) {
            int Criancax = x + offset;
            int CriancaY = y + offset;

            graphics.drawLine(
                x + nodeSize / 2,
                y + nodeSize,
                Criancax + nodeSize / 2,
                CriancaY
            );

            drawNode(graphics, node.getRight(), Criancax, CriancaY, level + 1);
        }
    }
}
