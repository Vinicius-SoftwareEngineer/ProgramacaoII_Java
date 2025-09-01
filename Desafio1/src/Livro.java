public class Livro {
    String titulo, autor;
    int qtpag;
    boolean emprestado;

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

}