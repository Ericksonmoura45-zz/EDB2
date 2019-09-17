package br.com.waldson.aula11
import java.util.Arrays;

public class Banco { //
    public static void main(String [] args){
        //Help / Priority QUEUE
        FilaBanco fila = new FilaBanco();
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
