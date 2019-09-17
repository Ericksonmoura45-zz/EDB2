package src;
import java.util.Arrays;

public class Main { //
    public static void main(String [] args){
        //Heap / Priority QUEUE
        FilaBanco fila = new FilaBanco();
        fila = new FilaBanco();
        fila.addPessoa("Fulano", 20);
        fila.addPessoa("Sicrano", 10);
        fila.addPessoa("Vovó", 64);
        fila.addPessoa("Tio", 50);

        while (fila.getSize() > 0){
            Pessoa p = fila.peek();
            System.out.println(p.getNome() + "está sendo atendido.");
            fila.remove();
        }

    }
}
