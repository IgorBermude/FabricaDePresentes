package trabalho;

import java.util.List;

public class Eletronico extends Presente {

    private int consumoEnergia;

    public Eletronico(int codigo, int idadeMinima, int peso, int consumoEnergia, List<Estoque> materiais) {
        super(codigo, idadeMinima, peso, materiais);
        this.consumoEnergia = consumoEnergia;
    }
    
}
