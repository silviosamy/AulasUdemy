package exerciciosSilvio;

public class exercicio16 {
    public static void main(String[] args) {
//16 - Faça um algoritmo que leia três valores que representam os três lados
// de um triângulo e verifique se são válidos, determine se o triângulo é
//equilátero, isósceles ou escaleno.

        double ladoA = 10;
        double ladoB = 11;
        double ladoC = 12;

        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Equilátero, os 3 lados são iguais.");
        } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
            System.out.println("Isósceles, tem 2 lados de comprimento iguais");
        } else
            System.out.println("Escaleno, lados diferentes");
    }
}
