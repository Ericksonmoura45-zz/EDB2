

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private int idade;
    private final List<Carry> carries = new ArrayList<>();

    public void addCarry(FilaBanco fila){
        carries.add(fila);
    }

    public void removeCarry(FilaBanco fila){
        carries.remove(fila);
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        int oldAge = this.getIdade();
        this.idade = idade;
        for(Carry l : carries){
            l.notifyEvent(this, oldAge);
        }
    }


}
