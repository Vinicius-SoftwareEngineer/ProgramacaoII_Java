public class Livro {
    private String titulo, autor;
    private int qtpag;
    private boolean emprestado;

    public void emprestar(){
        emprestado = true;
    }
    public void devolver(){
        emprestado = false;
    }

    public void exibirInformacoes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Quantidade de páginas: " + qtpag);
        if (emprestado) {
            System.out.println("Emprestado");
        }
        else{
            System.out.println("Disponível");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}