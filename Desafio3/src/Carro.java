public class Carro {
    private final String marca;
    private final String modelo;
    private final int ano;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int valor) {
        if (valor > 0) {
            velocidadeAtual += valor;
            System.out.println("O carro acelerou +" + valor+ "km/h");
        } else {
            System.out.println("Valor de aceleração inválida!");
        }
    }

    public void frear(int valor) {

        if (valor >= velocidadeAtual) {
            System.out.println("O carrou parou!");
            velocidadeAtual = 0;
        }
        else if (valor > 0) {
            velocidadeAtual -= valor;
            System.out.println("O carro reduziu -" + valor + "km/h");
        } else {
            System.out.println("Valor de frenagem inválido!");
        }
    }

    public void exibirStatus() {
        System.out.println("\n=== STATUS DO CARRO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade atual: " + velocidadeAtual + "km/h");
    }
}
