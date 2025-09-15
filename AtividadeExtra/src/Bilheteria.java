import java.util.Scanner;

public class Bilheteria {
    private int totalIngVdd = 0;
    private int qtdInteira = 0;
    private int qtdMeia = 0;
    private int qtdPromo = 0;
    private int qtdGratis = 0;
    private double totalBruto = 0.0;
    private double precoBase;

    public Bilheteria(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void processarVenda(Venda v, Scanner sc) {
        System.out.println("\n=== RESUMO DA VENDA ===");
        System.out.println("Quantidade: " + v.getQuantidade());
        System.out.println("Tipo aplicado: " + v.getTipoAplicadoAsString());
        System.out.printf("Valor total: R$ %.2f\n", v.getValorTotal());

        if (v.getValorTotal() == 0.0) {
            System.out.println("Ingresso(s) gratuito(s). Não é necessário pagamento.");
            qtdGratis += v.getQuantidade();
            totalIngVdd += v.getQuantidade();
            return;
        }

        int metodo = lerIntComRange(sc, "Método de pagamento: 1-Dinheiro  2-Cartão\nEscolha: ", 1, 2);
        if (metodo == 1) {
            double pago = 0.0;
            while (true) {
                pago = lerDouble(sc, "Valor pago em dinheiro (R$): ");
                if (pago + 1e-9 < v.getValorTotal()) {
                    System.out.println("Valor insuficiente. Digite um valor igual ou superior a R$ " + String.format("%.2f", v.getValorTotal()));
                } else {
                    double troco = pago - v.getValorTotal();
                    System.out.printf("Pagamento aceito. Troco: R$ %.2f\n", troco);
                    totalBruto += v.getValorTotal();
                    break;
                }
            }
        } else {
            System.out.println("Pagamento por cartão confirmado.");
            totalBruto += v.getValorTotal();
        }

        for (Venda.Ingresso i : v.getIngressos()) {
            switch (i.getTipoAplicado()) { // usar getter
                case Venda.INTEIRA: qtdInteira++; break;
                case Venda.MEIA: qtdMeia++; break;
                case Venda.PROMOCIONAL: qtdPromo++; break;
                case Venda.GRATUITO: qtdGratis++; break;
            }
            totalIngVdd++;
        }
    }

    private int lerIntComRange(Scanner sc, String prompt, int min, int max) {
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

    private double lerDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim().replace(',', '.');
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número (ex: 50.00).");
            }
        }
    }

    public void gerarRelatorioFinal() {
        System.out.println("\n===== RELATÓRIO FINAL =====");
        System.out.println("Total de ingressos vendidos: " + totalIngVdd);
        System.out.println(" - Inteiras: " + qtdInteira);
        System.out.println(" - Meias: " + qtdMeia);
        System.out.println(" - Promocionais: " + qtdPromo);
        System.out.println(" - Gratuitos: " + qtdGratis);
        System.out.printf("Valor total arrecadado (ingressos pagos): R$ %.2f\n", totalBruto);
    }
}
