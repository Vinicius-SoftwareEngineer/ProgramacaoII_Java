import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do livro: ");
        livro1.titulo = sc.nextLine();

        System.out.println("Digite o autor do livro: ");
        livro1.autor = sc.nextLine();

        System.out.println("Digite a quantidade de páginas do livro: ");
        livro1.qtpag = sc.nextInt();
        sc.nextLine(); // limpa o buffer

        System.out.println("Quer pegar o livro emprestado? Sim/Não");
        String devolve = sc.nextLine();

        if (devolve.equalsIgnoreCase("sim")) {
            livro1.emprestar();
        } else {
            livro1.devolver();
        }

        livro1.exibirInformacoes();
        sc.close();
    }
}