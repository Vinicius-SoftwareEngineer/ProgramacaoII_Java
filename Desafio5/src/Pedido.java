public class Pedido {
    private int idPedido;
    private String cliente;
    private String dataPedido;
    private double valorTotal;
    private String status;

    public Pedido(int idPedido, String cliente, String dataPedido, double valorTotal) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.dataPedido = dataPedido;
        this.valorTotal = valorTotal;
        this.status = "Pendente";
    }

    public int getIdPedido() {
        return idPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equalsIgnoreCase("Pendente") ||
            status.equalsIgnoreCase("Processando") ||
            status.equalsIgnoreCase("Enviado") ||
            status.equalsIgnoreCase("Entregue") ||
            status.equalsIgnoreCase("Cancelado")) {

            this.status = status;
            System.out.println("Status atualizado para: " + status);
        } else {
            System.out.println("Status inválido! Use um dos valores permitidos: Pendente, Processando, Enviado, Entregue, Cancelado.");
        }
    }

    public void exibirDetalhes() {
        System.out.println("\n=== Detalhes do Pedido ===");
        System.out.println("ID: " +idPedido);
        System.out.println("Cliente: " + cliente);
        System.out.println("Data: " + dataPedido);
        System.out.println("Valor Total: R$" + valorTotal);
        System.out.println("Status: " + status);
    }
}
