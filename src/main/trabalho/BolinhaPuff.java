package trabalho;

import java.util.Arrays;

public class BolinhaPuff extends Manufaturado {

    public BolinhaPuff(int codigo, int peso, String produtor) {
        super(codigo, 3, peso, produtor, Arrays.asList(
                new Estoque("Madeira", 10),
                new Estoque("Aluminio", 5),
                new Estoque("Couro", 200)));
    }

}
