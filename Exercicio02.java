import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para ler a tabuada: ");
        int num = input.nextInt();

        String nomeArquivo = "tabuada_" + num + ".txt";
        File arquivo = new File(nomeArquivo);

        if (!arquivo.exists()) {
            System.out.println("O arquivo '" + nomeArquivo + "' não existe.");
            input.close();
            return;
        }

        System.out.println("\nConteúdo do arquivo:");
        System.out.println("--------------------------");

        try {
            Scanner reader = new Scanner(arquivo);

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao ler o arquivo.");
        }

        input.close();
    }
}