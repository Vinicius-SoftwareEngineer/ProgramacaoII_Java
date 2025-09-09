import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Livro livro1 = new Livro();

        System.out.println("Digite o nome do livro: ");
       String titulo = sc.nextLine();

        System.out.println("Digite o autor do livro: ");
        String autor = sc.nextLine();

        System.out.println("Digite a quantidade de páginas do livro: ");
        int qtpag = sc.nextInt();
        sc.nextLine(); // limpa o buffer

        System.out.println("Quer pegar o livro emprestado? Sim/Não");
        String devolve = sc.nextLine();

        if (devolve.equalsIgnoreCase("sim")) {
            System.out.println("Emprestado");
        } else {
            System.out.println("Disponível");
        }


        sc.close();
    }
}