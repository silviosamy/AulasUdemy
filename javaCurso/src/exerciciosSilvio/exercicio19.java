package exerciciosSilvio;

public class exercicio19 {
    public static void main(String[] args) {
//Faça um algoritmo que imprima na tela a tabuada de 1 até 10.


        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");


            for (int j = 1; j <= 10; j++) {
                int multi = i * j;
                System.out.println(i + " x " + j + " = " + multi);
            }
            System.out.println();
        }
    }
}
