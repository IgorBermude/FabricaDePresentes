package trabalho;

import java.util.Arrays;

public class LanitaControladora extends Eletronico {

    public LanitaControladora(int codigo, int peso) {
        super(codigo, 16, peso, 10, Arrays.asList(
                new Estoque("Madeira", 50),
                new Estoque("Aco", 50),
                new Estoque("Ferro", 50),
                new Estoque("Aluminio", 50),
                new Estoque("Chumbo", 50),
                new Estoque("Cobre", 50),
                new Estoque("Ouro", 5),
                new Estoque("Prata", 5),
                new Estoque("Couro", 5),
                new Estoque("Pedra", 5)));
    }

    

    
}
