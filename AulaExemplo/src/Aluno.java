public class Aluno {
    String nome, curso;
    int matricula, idade;

    public float media(float nota1, float nota2){
        return (nota1 + nota2) / 2;
    }

    public String situacaoaluno (float media){
        if (media >=7){
            return "Aprovado";
        }
        else if(media <3){
            return "Reprovado";
        }
        else {
            return "Em recuperação";
        }
    }

    public void exibirdados(){
        System.out.println(("Nome do aluno: " + nome));
        System.out.println("Curso do aluno: " + curso);
        System.out.println("Matrícula: "+ matricula);
        System.out.println("Situação: ");
    }
}