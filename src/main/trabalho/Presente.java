package trabalho;

import java.util.List;

public abstract class Presente {
    //numserial definido como final para ser incremento sempre que criado um presente.
    protected final int numserial;
    protected int codigo;
    protected int idadeMinima;
    protected int peso;
    protected List<Estoque> materiais;

    public Presente(int codigo, int idadeMinima, int peso, List<Estoque> materiais) {
        this.numserial = Serial.getSerial();
        this.codigo = codigo;
        this.idadeMinima = idadeMinima;
        this.peso = peso;
        this.materiais = materiais;
    }

    @Override
    public String toString() {
        return this.codigo + "\t" + this.peso + "\t";
    }

    public double getPeso() {
        return peso;
    }

    public Presente criarPresente(int codigo, int peso, String produtor) {
        switch (codigo) {
            case 1:
                return new MiniGame(codigo, peso); // Cria Mini-game
            case 2:
                return new DroneCop(codigo, peso); // Cria DroneCop
            case 3:
                return new RoboX(codigo, peso); // Cria RoboX
            case 4:
                return new PedraVoadora(codigo, peso); // Cria PedraVoadora
            case 5:
                return new LanitaControladora(codigo, peso); // Cria LanitaControladora
            case 6:
                return new BolinhaPuff(codigo, peso, produtor); // Cria BolinhaPuff
            case 7:
                return new EspadaPau(codigo, peso, produtor); // Cria EspadaPau
            case 8:
                return new LaraLarinha(codigo, peso, produtor); // Cria LaraLarinha
            case 9:
                return new MegaCao(codigo, peso, produtor); // Cria MegaCao
            case 10:
                return new LiliAlegre(codigo, peso, produtor); // Cria LiliAlegre
            default:
                throw new IllegalArgumentException("Código de presente inválido.");
        }
    }

    public String getProdutor() {
        return ""; // Retorna uma string vazia por padrão
    }
}
