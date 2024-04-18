package br.com.lista_atividades;

import java.io.*;

public class RemoveLinha {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("meuarquivo.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("meuarquivo_sem_excluir.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.contains("excluir")) {
                    writer.write(line);
                    writer.newLine();
                }
            }
            System.out.println("Criado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro oo ler ou escrever no arquivo: " + e.getMessage());
        }
    }
}
