package oo.Básico;

public class Exercicio {
    public static void main(String[] args) {

        float n1 = 6.1f;
        float n2 = 5.3f;
        float n3 = 7.8f;

        float mediaAluno = CalculoMedia(n1, n2, n3);
        System.out.println("A média do aluno é: " + mediaAluno);
    }

    public static float CalculoMedia(float n1, float n2, float n3) {
        float media = (n1 + n2 + n3) / 3;
        return media;
    }
}