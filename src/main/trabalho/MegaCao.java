package trabalho;

import java.util.Arrays;

public class MegaCao extends Manufaturado {

    public MegaCao(int codigo, int peso, String produtor) {
        super(codigo, 8, peso, produtor, Arrays.asList(
                new Estoque("Aco", 50),
                new Estoque("Aluminio", 50),
                new Estoque("Chumbo", 50),
                new Estoque("Cobre", 50),
                new Estoque("Ouro", 10),
                new Estoque("Prata", 10),
                new Estoque("Couro", 10),
                new Estoque("Pedra", 10)));
    }


}
