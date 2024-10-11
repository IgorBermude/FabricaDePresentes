package trabalho;

import java.util.Arrays;

public class RoboX extends Eletronico {

    public RoboX(int codigo, int peso) {
        super(codigo, 14, peso, 50, Arrays.asList(
                new Estoque("Madeira", 300),
                new Estoque("Ferro", 300),
                new Estoque("Aluminio", 50),
                new Estoque("Ouro", 5),
                new Estoque("Prata", 5),
                new Estoque("Couro", 50),
                new Estoque("Pedra", 5)));
    }

}
