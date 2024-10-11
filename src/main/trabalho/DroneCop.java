package trabalho;

import java.util.Arrays;

public class DroneCop extends Eletronico {

    public DroneCop(int codigo, int peso) {
        super(codigo, 18, peso, 100, Arrays.asList(
                new Estoque("Madeira", 100),
                new Estoque("Aco", 20),
                new Estoque("Aluminio", 100),
                new Estoque("Chumbo", 5),
                new Estoque("Cobre", 20),
                new Estoque("Ouro", 1),
                new Estoque("Prata", 2),
                new Estoque("Couro", 5),
                new Estoque("Pedra", 5)));
    }
 
}
