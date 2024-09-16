package lambdas;

public class CalculoTeste {

    public static void main(String[] args) {
//forma padrão de implementar metódos.
        Calculo somar = new Somar();
        System.out.println(somar.executar(2,3));
        Calculo multiplicar = new Multiplicar();
        System.out.println(multiplicar.executar(2,3));

    }
}
