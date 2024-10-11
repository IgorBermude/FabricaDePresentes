package trabalho;

import java.util.Arrays;

public class EspadaPau extends Manufaturado {

    public EspadaPau(int codigo, int peso, String produtor) {
        super(codigo, 12, peso, produtor, Arrays.asList(
                new Estoque("Madeira", 200),
                new Estoque("Couro", 20),
                new Estoque("Pedra", 20)));
    }
   

}
