package excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {

        geraErro1();

        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim!");
    }

    //Não checada ou não verificada
    static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro bem legal! #01");
    }

    //Checada ou verificada - É obrigado a colocar na assinatura do métodoo , que essa excessão é lançada.
    //
    static void geraErro2() throws Exception {
        try {
            throw new Exception("Ocorreu um erro bem legal! #02");
        } catch (Exception e) {
            System.out.println("Que legal!");
        }
    }
}
