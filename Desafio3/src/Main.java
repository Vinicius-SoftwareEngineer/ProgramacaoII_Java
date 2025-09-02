import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a marca do carro: ");
        String marca = sc.nextLine();

        System.out.println("Digite o modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.println("Digite o ano do carro: ");
        int ano = sc.nextInt();

        Carro carro = new Carro (marca, modelo, ano);

        int opcao;
        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Exibir status do carro");
            System.out.println("2 - Acelerar");
            System.out.println("3 - Frear");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    carro.exibirStatus();
                    break;

                case 2:
                    System.out.println("Digite quanto deseja acelerar (km/h): ");
                    int acelerar = sc.nextInt();
                    carro.acelerar(acelerar);
                    carro.exibirStatus();
                    break;

                case 3:
                    System.out.println("Digite quanto deseja frear (km/h): ");
                    int frear = sc.nextInt();
                    carro.frear(frear);
                    carro.exibirStatus();
                    break;

                case 0:
                    System.out.println("Saindo do simulador de carro...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}