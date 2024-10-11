package trabalho;

import java.util.List;


public class Manufaturado extends Presente{
    private String produtor;

    public Manufaturado(int codigo, int idadeMinima, int peso, String produtor, List<Estoque> materiais) {
        super(codigo, idadeMinima, peso, materiais);
        this.produtor = produtor;
    }

    @Override
    public String toString() {
        return super.toString() + produtor;
    }
    
    //Sobrescrevo o metodo getProdutor em Presete.
    @Override
    public String getProdutor() {
        return this.produtor;
    }
}
