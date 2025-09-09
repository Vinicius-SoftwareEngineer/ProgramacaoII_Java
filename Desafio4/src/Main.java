import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== Sistema de Gestão de Loja ===");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Atualizar quantidade de um produto");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite o preço: ");
                    double preco = sc.nextDouble();
                    System.out.println("Digite a quantidade em estoque: ");
                    int quantidade = sc.nextInt();
                    Produto novoProduto = new Produto(nome, preco, quantidade);
                    produtos.add(novoProduto);
                    break;

                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado. ");
                    } else {
                        System.out.println("\nLista de Produtos: ");
                        for (Produto p : produtos) {
                            p.exibirDetalhes();
                        }
                    }
                    break;

                case 3:
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado para atualizar.");
                    } else {
                        System.out.println("Digite o nome do produto que deseja atualizar: ");
                        String nomeBusca = sc.nextLine();
                        boolean encontrado = false;

                        for (Produto p : produtos) {
                            if (p.getNome().equalsIgnoreCase(nomeBusca)) {
                                System.out.println("Digite a nova quantidade: ");
                                int novaQtd = sc.nextInt();
                                p.setQtdEmEstoque(novaQtd);
                                System.out.println("Quantidade atualizado com sucesso!");
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Produto não encontrado.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);
        sc.close();
    }
}