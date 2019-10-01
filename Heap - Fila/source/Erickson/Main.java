

public class Main {

    public static void main(String[] args) {


        FilaBanco fila = new FilaBanco();
        Pessoa m = new Pessoa("Hector", 33);
        fila.addPessoa("Gaffgarion", 45);
        fila.addPessoa("Ramza", 26);
        fila.addPessoa("Orlandu", 60);
        fila.addPessoa("Vormav", 50);
        fila.addPessoa(m);
        fila.addPessoa(new Pessoa("Tampinha", 5));


        m.setIdade(1);

        while (fila.getSize() > 0) {
            Pessoa p = fila.peek();
            System.out.println(p.getNome() + " está no atendimento.");
            fila.remove();
        }
    }
}
