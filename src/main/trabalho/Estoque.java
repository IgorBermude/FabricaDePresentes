package trabalho;

import java.util.List;

public class Estoque {

    private String material;
    private int quantidade;

    public Estoque(String material, int quantidade) {
        this.material = material;
        this.quantidade = quantidade;
    }

    protected void decrementarMaterial(String material, int quantidade) {
        if(material.equals(this.material)){
            this.quantidade =- quantidade;
        }
    }

    String getMaterial() {
        return material;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return material + "\t" + quantidade;
    }
    
    
}
