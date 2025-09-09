public class Produto {
    private String nome;
    private double preco;
    private int qtdEmEstoque;

    public Produto(String nome, double preco, int qtdEmEstoque) {
        this.nome = nome;
        setPreco(preco);
        setQtdEmEstoque(qtdEmEstoque);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço não pode ser negativo. Valor não alterado.");
        }
    }

    public int getQtdEmEstoque() {
        return qtdEmEstoque;
    }

    public void setQtdEmEstoque(int qtdEmEstoque) {
        if (qtdEmEstoque >= 0) {
            this.qtdEmEstoque = qtdEmEstoque;
        } else {
            System.out.println("reço não pode ser negativa. Valor não alterado.");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + qtdEmEstoque);
    }
}
