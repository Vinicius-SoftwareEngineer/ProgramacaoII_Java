import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(1, "Vinicius", "09/09/2025", 125.67));
        pedidos.add(new Pedido(2, "José", "10/09/2025", 59.89));
        pedidos.add(new Pedido(3, "João", "11/09/2025", 90.00));

        int opcao;
        do {
            System.out.println("\n=== Sistema de Pedidos Online ===");
            System.out.println("1 - Listar pedidos");
            System.out.println("2 - Atualizar status de um pedido");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n=== Lista de Pedidos === ");
                    for (Pedido p : pedidos) {
                        p.exibirDetalhes();
                    }
                    break;

                case 2:
                    System.out.println("Digite o ID do pedido: ");
                    int idBusca = sc.nextInt();
                    sc.nextLine();
                    boolean encontrado = false;

                    for (Pedido p : pedidos) {
                        if (p.getIdPedido() == idBusca) {
                            System.out.println("Status atual: " + p.getStatus());
                            System.out.println("Digite o novo status: ");
                            String novoStatus = sc.nextLine();
                            p.setStatus(novoStatus);
                            p.exibirDetalhes();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Pedido não encontrado");
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);

        sc.close();
    }
}