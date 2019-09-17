package src;
public class Pessoa {

    public Pessoa(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;


        public String getNome () {
            return nome;
        }

        public void setNome (String nome){
            this.nome = nome;
        }

        public int getIdade () {
            return idade;
        }

        public void setIdade ( int idade){
            this.idade = idade;
        }

    }
}
