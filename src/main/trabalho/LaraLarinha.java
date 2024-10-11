package trabalho;

import java.util.Arrays;

public class LaraLarinha extends Manufaturado {

    public LaraLarinha(int codigo, int peso, String produtor) {
        super(codigo, 6, peso, produtor, Arrays.asList(
                new Estoque("Madeira", 10),
                new Estoque("Aco", 10),
                new Estoque("Aluminio", 20),
                new Estoque("Ouro", 5),
                new Estoque("Prata", 5),
                new Estoque("Couro", 30),
                new Estoque("Pedra", 30)));
    }
}
