package trabalho;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorArquivo {

    protected List<Presente> lerArquivoPresente(String nomeArquivo) {
        List<Presente> presentes = new ArrayList<Presente>();
        try {
            FileInputStream file = new FileInputStream(nomeArquivo);
            Scanner scan = new Scanner(file);

            int qtdPresentes = scan.nextInt(); // Lê a quantidade de presentes
            scan.nextLine(); // Consome a linha restante

            for (int i = 0; i < qtdPresentes; i++) {
                String linha = scan.nextLine();
                String[] dados = linha.split(" ");
                int codigo = Integer.parseInt(dados[0]);
                int peso = Integer.parseInt(dados[1]);

                if (codigo <= 5) {
                    // Criar um objeto Eletronico
                    //codigo, idadeMinima, peso, consumoEnergia, materiais
                    presentes.add(new Eletronico(codigo, 0, peso, 0, null));
                } else {
                    // Criar um objeto Manufaturado
                    //codigo, idadeMinima, peso, produtor, materiais
                    String produtor = dados[2];
                    presentes.add(new Manufaturado(codigo, 0, peso, produtor, null));
                }
            }

            scan.close();

        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo não encontrado.");
        }
        return presentes;
    }

    protected List<Estoque> lerArquivoEstoque(String nomeArquivo) {
        List<Estoque> materiais = new ArrayList<Estoque>();
        try {
            FileInputStream file = new FileInputStream(nomeArquivo);
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String linha = scan.nextLine();
                String[] dados = linha.split(" ");//String[] é um vetor de String, onde cada posição é um elemento da linha.

                String material = dados[0];
                int quantidade = Integer.parseInt(dados[1]);//Le e tranforma o dado em inteiro

                //Adiciona na lista.
                Estoque estoque = new Estoque(material, quantidade);
                materiais.add(estoque);
            }
            scan.close();

        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo não encontrado.");
        }
        return materiais;
    }
}
