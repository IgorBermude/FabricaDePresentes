package trabalho;

import java.util.Arrays;

public class LiliAlegre extends Manufaturado {

    public LiliAlegre(int codigo, int peso, String produtor) {
        super(codigo, 7, peso, produtor, Arrays.asList(
                new Estoque("Ouro", 50),
                new Estoque("Prata", 50),
                new Estoque("Couro", 200)));
    }

}
