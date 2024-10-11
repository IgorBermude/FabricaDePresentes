package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Chamada da fução Leitor de arquivo
        LeitorArquivo leitor = new LeitorArquivo();

        //Criação de listas
        List<Presente> listaDePresentes = new ArrayList<Presente>();
        List<Estoque> listaDeMateriais = new ArrayList<Estoque>();

        listaDeMateriais = leitor.lerArquivoEstoque("estoque.txt");
        listaDePresentes = leitor.lerArquivoPresente("presentes.txt");

        produzirPresentes(listaDePresentes);


        // a) (4 pontos) Imprima o peso total de presentes em um dia de produção (some o
        // peso de todos os presentes).
        pesoPresentes(listaDePresentes);

        // b) (4 pontos) Determine o maior produtor de manufaturas. Se houver empate
        // devem ser impressos os nomes de todos os produtores empatados.
        // c) (2 pontos) Imprima a quantidade de presentes eletrônicos (1 ponto) e
        // manufaturas (1 ponto) produzidos em um dia.
        contarTiposPresentes(listaDePresentes, 1); // Passo o dia como parametro para realizar a divisão do total pelo numero de dias.

        // d) (2 pontos) Imprima as entradas de dados na tela (o estoque e os
        // presentes).
        imprimirPresentesMateriais(listaDePresentes, listaDeMateriais);

        // e) (10 pontos) Determine a quantidade de dias que o estoque de matérias
        // primas consegue produzir presentes (quando faltar uma matéria prima já não é
        // mais possível produzir um presente).
        // f) (5 pontos) Informe em que presente o estoque não conseguiu mais
        // produzi-lo(mostre todos os dados desse presente)
        // g) (5 pontos) Informe a matéria prima que faltou para produzir o presente do
        // item f).
    }
    
    public static Estoque verificarEstoque(List<Estoque> listaDeMateriais) {
        for (Estoque estoque : listaDeMateriais) {
            if (estoque.getQuantidade() < 0) {
                return estoque;
            }
        }
        return null;
    }

    public static void imprimirPresentesMateriais(List<Presente> listaDePresentes, List<Estoque> listaDeMateriais) {
        System.out.println("\nd) Segue os dados: ");

        System.out.println("Estoque: ");
        for (Estoque estoque : listaDeMateriais) {
            System.out.println(estoque);
        }

        System.out.println("\nPresentes a serem produzidos: ");
        for (Presente presente : listaDePresentes) {
            System.out.println(presente);
        }
    }

    public static void produzirPresentes(List<Presente> listaDePresentes) {
        for (Presente presente : listaDePresentes) {
            presente.criarPresente(presente.codigo, presente.peso, presente.getProdutor());
        }
    }

    public static void pesoPresentes(List<Presente> listaDePresentes) {
        double peso = 0;

        for (Presente p : listaDePresentes) { //Percorre a lista de presentes somando os pesos.
            peso = peso + p.getPeso();
        }

        System.out.println("\na) O peso total dos presentes: " + peso + " gramas");
    }

    public static void contarTiposPresentes(List<Presente> presentes, int dia) {
        double eletronicos = 0;
        double manofaturados = 0;

        for (Presente presente : presentes) { // Percorre a lista presentes.
            if (presente instanceof Eletronico) {// Verifica se o objeto é uma instacia de Eletronico
                eletronicos++;
            } else if (presente instanceof Manufaturado) {// Verifica se o objeto é uma instacia de Manufaturado
                manofaturados++;
            }
        }
        System.out.println("\nc) São/É produzido(s) " + eletronicos / dia + " presente(s) eletronico(s) e "
                + manofaturados / dia + " manofaturados por dia");
    }

}
