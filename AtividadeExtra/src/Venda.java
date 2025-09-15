import java.util.ArrayList;
import java.util.List;

public class Venda {
    public static final int INTEIRA = 1;
    public static final int MEIA = 2;
    public static final int PROMOCIONAL = 3;
    public static final int GRATUITO = 0;

    public class Ingresso { // agora pública
        private int idade;
        private int tipoEscolhido;
        private int tipoAplicado;
        private double preco;

        Ingresso(int idade, int tipoEscolhido, double basePrice) {
            this.idade = idade;
            this.tipoEscolhido = tipoEscolhido;
            calcularPreco(basePrice);
        }

        void calcularPreco(double basePrice) {
            if (idade < 5) {
                tipoAplicado = GRATUITO;
                preco = 0.0;
                return;
            }
            switch (tipoEscolhido) {
                case INTEIRA:
                    tipoAplicado = INTEIRA;
                    preco = basePrice;
                    break;
                case MEIA:
                    tipoAplicado = MEIA;
                    preco = basePrice * 0.5;
                    break;
                case PROMOCIONAL:
                    tipoAplicado = PROMOCIONAL;
                    preco = basePrice * 0.7;
                    break;
                default:
                    tipoAplicado = INTEIRA;
                    preco = basePrice;
            }
        }

        public String getTipoAsString() {
            switch (tipoAplicado) {
                case GRATUITO: return "Gratuito";
                case INTEIRA: return "Inteira";
                case MEIA: return "Meia";
                case PROMOCIONAL: return "Promocional";
                default: return "Desconhecido";
            }
        }

        public int getTipoAplicado() {
            return tipoAplicado;
        }

        public double getPreco() {
            return preco;
        }
    }

    private List<Ingresso> ingressos = new ArrayList<>();

    public void adicionarIngresso(int idade, int tipoEscolhido, double basePrice) {
        ingressos.add(new Ingresso(idade, tipoEscolhido, basePrice));
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public double getValorTotal() {
        double total = 0;
        for (Ingresso i : ingressos) {
            total += i.getPreco();
        }
        return total;
    }

    public int getQuantidade() {
        return ingressos.size();
    }

    public String getTipoAplicadoAsString() {
        StringBuilder sb = new StringBuilder();
        for (Ingresso i : ingressos) {
            sb.append(i.getTipoAsString()).append(" ");
        }
        return sb.toString().trim();
    }
}
