import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precoBase = 30.0;
        Bilheteria bilheteria = new Bilheteria(precoBase);

        System.out.println("=== Sistema de Bilheteria ===");
        boolean atender = true;

        while (atender) {
            int quantidade = lerIntComRange(sc, "Quantidade de ingressos: ", 1, Integer.MAX_VALUE);
            Venda venda = new Venda();

            for (int i = 1; i <= quantidade; i++) {
                System.out.println("\nIngresso " + i + ":");
                int idade = lerIntComRange(sc, "Idade do cliente: ", 0, 120);
                int tipo = lerIntComRange(sc, "Tipo desejado: " +
                        "1- Inteira  " +
                        "2- Meia  " +
                        "3- Promocional" +
                        "\nEscolha: ", 1, 3);
                venda.adicionarIngresso(idade, tipo, precoBase);
            }

            bilheteria.processarVenda(venda, sc);

            char resposta = lerSimNao(sc, "Atender próximo cliente? (S/N): ");
            if (resposta == 'N') {
                atender = false;
                bilheteria.gerarRelatorioFinal();
            }
        }
        sc.close();
    }

    public static int lerIntComRange(Scanner sc, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                int val = Integer.parseInt(line);
                if (val < min || val > max) {
                    System.out.println("Entrada inválida. Informe um valor entre " + min + " e " + max + ".");
                } else return val;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
    }

    public static char lerSimNao(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim().toUpperCase();
            if (line.equals("S") || line.equals("N")) return line.charAt(0);
            System.out.println("Entrada inválida. Digite 'S' para sim ou 'N' para não.");
        }
    }
}
