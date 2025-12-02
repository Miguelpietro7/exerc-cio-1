public class Exercicio04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Agenda agenda = new Agenda();

        System.out.print("Digite o nome do contatinho que deseja buscar: ");
        String nome = input.nextLine();

        Contatinho resultado = agenda.buscarContatinho(nome);

        if (resultado != null) {
            System.out.println("\nContatinho encontrado:");
            System.out.println(resultado.toString());
        } else {
            System.out.println("Contatinho não encontrado.");
        }

        input.close();
    }
}
