 import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do titular: ");
        String nome = sc.nextLine();

        System.out.println("Digite o número da conta: ");
        String numeroConta = sc.nextLine();

        ContaBancaria conta = new ContaBancaria(nome, numeroConta);

        System.out.println("Bem vindo " + conta.getNome() + "!");
        conta.exibirSaldo();

        int opcao;
        do {
            System.out.println("\n=====MENU=====");
            System.out.println("1 - Exibir informações da conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n=== INFORMAÇÕES DA CONTA ===");
                    System.out.println("Titular: " + conta.getNome());
                    System.out.println("Número da conta: " + conta.getNumeroConta());
                    conta.exibirSaldo();
                    break;

                case 2:
                    System.out.println("Digite o valor do depósito: R$ ");
                    double valorDeposito = sc.nextDouble();
                    conta.Depositar(valorDeposito);
                    conta.exibirSaldo();
                    break;

                case 3:
                    System.out.println("Digite o valor do saque: R$ ");
                    double valorSaque = sc.nextDouble();
                    conta.Sacar(valorSaque);
                    conta.exibirSaldo();
                    break;

                case 0:
                    System.out.println("Saindo do sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente");

            }
        } while (opcao != 0);

        sc.close();

    }
}