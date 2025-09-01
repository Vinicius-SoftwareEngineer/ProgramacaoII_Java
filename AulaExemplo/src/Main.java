public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Vinicius";
        aluno1.idade = 18;
        aluno1.matricula = 123456;
        aluno1.curso = "Engenharia de Software";
        float media = aluno1.media (10, 9);



        System.out.println("O nome do aluno é: " + aluno1.nome);
        System.out.println("Sua idade é: " + aluno1.idade);
        System.out.println("Sua matrícula é: " + aluno1.matricula );
        System.out.println("Seu curso é: " + aluno1.curso);
        System.out.println("Sua média foi: " + media);
        System.out.println("Sua situação é: " + aluno1.situacaoaluno(media));

    }
}