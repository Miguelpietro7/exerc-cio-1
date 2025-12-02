import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Agenda agenda = new Agenda();

        System.out.println("Quantos contatinhos deseja adicionar?");
        int qtd = input.nextInt();
        input.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.println("\n--- Novo Contatinho ---");
            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Email: ");
            String email = input.nextLine();

            System.out.print("Telefone: ");
            String telefone = input.nextLine();

            System.out.print("Categoria: ");
            String categoria = input.nextLine();

            Contatinho c = new Contatinho(nome, email, telefone, categoria);
            agenda.addContatinho(c);
        }

        agenda.salvarLista();
        input.close();
    }
}