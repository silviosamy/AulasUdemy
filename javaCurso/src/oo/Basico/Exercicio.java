package oo.Basico;

public class Exercicio {
    public static void main(String[] args) {

        float n1 = 6.1f;
        float n2 = 5.3f;
        float n3 = 7.8f;
        float n4 = 5.3f;
        float n5 = 7.4f;
        float n6 = 5.0f;

        float mediaAluno = CalculoMedia(n1, n2, n3);
        float mediaAluno2 = CalculoMedia(n4, n5, n6);

        System.out.println("A média do aluno é: " + mediaAluno);
        System.out.println("A média do aluno é: " + mediaAluno2);
    }

    public static float CalculoMedia(float nota1, float nota2, float nota3) {
        float media = (nota1 + nota2 + nota3) / 3;
        return media;
    }
}