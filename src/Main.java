import java.util.Scanner;
import Classes.Bovino;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Criando um bovino
        Bovino bovino = new Bovino("001", "Nelore", 450.0);

        int opcao;

        do {

            System.out.println("\n==============================");
            System.out.println("     SISTEMA DA FAZENDA");
            System.out.println("==============================");
            System.out.println("1 - Alterar dados do bovino");
            System.out.println("2 - Retornar dados do bovino");
            System.out.println("3 - Encerrar");
            System.out.println("==============================");
            System.out.print("Escolha uma opção: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("\n--- ALTERAR DADOS ---");

                    System.out.print("Digite o novo número do brinco: ");
                    bovino.setBrinco(teclado.nextLine());

                    System.out.print("Digite a nova raça: ");
                    bovino.setRaca(teclado.nextLine());

                    System.out.print("Digite o novo peso: ");
                    bovino.setPeso(teclado.nextDouble());
                    teclado.nextLine();

                    System.out.println("\nDados alterados com sucesso!");

                    break;

                case 2:

                    bovino.exibirDados();

                    break;

                case 3:

                    System.out.println("\nSistema encerrado.");
                    System.out.println("Até logo!");

                    break;

                default:

                    System.out.println("\nOpção inválida!");

            }

        } while (opcao != 3);

        teclado.close();
    }
}