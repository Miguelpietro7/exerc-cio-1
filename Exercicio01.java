import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para gerar a tabuada: ");
        int num = input.nextInt();

        String nomeArquivo = "tabuada_" + num + ".txt";

        try {
            FileWriter writer = new FileWriter(nomeArquivo);

            for (int i = 1; i <= 10; i++) {
                writer.write(num + " x " + i + " = " + (num * i) + "\n");
            }

            writer.close();
            System.out.println("Arquivo '" + nomeArquivo + "' criado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo.");
        }

        input.close();
    }
}