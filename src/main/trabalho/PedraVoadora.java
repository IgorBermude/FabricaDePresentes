package trabalho;

import java.util.Arrays;

public class PedraVoadora extends Eletronico {

    public PedraVoadora(int codigo, int peso) {
        super(codigo, 15, peso, 40, Arrays.asList(
                new Estoque("Aco", 100),
                new Estoque("Ferro", 100),
                new Estoque("Aluminio", 100),
                new Estoque("Chumbo", 70),
                new Estoque("Cobre", 10),
                new Estoque("Ouro", 8),
                new Estoque("Prata", 12),
                new Estoque("Couro", 50),
                new Estoque("Pedra", 50)));
    }

  

    
}
