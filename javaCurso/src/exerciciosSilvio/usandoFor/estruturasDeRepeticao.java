package exerciciosSilvio.usandoFor;

public class estruturasDeRepeticao {
    public static void main(String[] args) {
// Passos do For : Inicialização, Condição, Execução, Incremento(Depois volta
// para a condição até que retorne False, ai Finaliza.
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
//        While - Se a condição for True, ele executa.

        int j = 0;
        while (j < 3) { // Inicia no 0 < 3
            System.out.println("teste1");
            j++; // j + 1 (Até j < 3). Começa no 0(j = 0), e vai até 3.

        }
//      Do While - Executa uma vez, depois vê se a condição é True, e continua(para somente quando der false)
        do {
            System.out.println("teste"); //executa uma vez
        } while(false); //como deu false, ele para. Se for true, ele fica executando até X condição.
    }
}
