package trabalho;

import java.util.Arrays;

public class MiniGame extends Eletronico {

    public MiniGame(int codigo, int peso) {
        super(codigo, 10, peso, 25, Arrays.asList(
                new Estoque("Madeira", 20),
                new Estoque("Aco", 20),
                new Estoque("Ferro", 5),
                new Estoque("Aluminio", 5),
                new Estoque("Chumbo", 5)));
    }

}
