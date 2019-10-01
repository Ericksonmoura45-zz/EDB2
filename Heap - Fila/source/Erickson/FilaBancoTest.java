


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FilaBancoTest{


    FilaBanco fila = null;


    public void setUp() {
        fila = new FilaBanco();
    }

    public void mustBeOrdered(){  // vendo se dá certo

        Pessoa demon = new Pessoa("Silk", 12);
        Pessoa dragon = new Pessoa("Deathwing", 45);
        Pessoa knight = new Pessoa("Omega", 30);

        fila.addPessoa(demon);
        fila.addPessoa(dragon);
        fila.addPessoa(knight);

        assertSame(demon, fila.peek());
        fila.remove();
        assertSame(dragon, fila.peek());
        fila.remove();
        assertSame(knight, fila.peek());
        fila.remove();
        assertNull(fila.peek());

    }

    public void addPessoaByName() {

        fila.addPessoa("Saurfang", 55);
        assertEquals("Saurfang", fila.peek().getNome());
    }

    public void addPessoaByObject() {
        Pessoa orc = new Pessoa("Saurfang", 55);
        fila.addPessoa(orc);
        assertSame(p, fila.peek());
    }



    public void peekMustReturnElementHighestPriority() {

        Pessoa node = new Pessoa("Teka", 10);
        fila.addPessoa(node);
        assertSame(node, fila.peek());
    }

    @Test
    public void removeElementWithHighestPriority() {
        Pessoa h = new Pessoa("Helenoy", 30);
        Pessoa j = new Pessoa("Jupyter", 35);
        fila.addPessoa(h);
        fila.addPessoa(j);
        fila.remove();
        assertSame(h,fila.peek());
    }

    @Test
    public void mustReorderWhenPriorityChange(){
        //Arrange
        Pessoa demon = new Pessoa("Silk", 12);
        Pessoa dragon = new Pessoa("Deathwing", 45);
        Pessoa knight = new Pessoa("Omega", 30);

        fila.addPessoa(demon);
        fila.addPessoa(dragon);
        fila.addPessoa(knight);
       fulano.setIdade(50);
        assertSame(dragon, fila.peek());


    }
}