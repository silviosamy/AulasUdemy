package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {

        Calculo somar = (x, y) -> {
            return x + y;
        };
        System.out.println(somar.executar(2, 3));
    }
}

//Syntaxe de lambda : (parametros) -> { corpo }
//Sem parametros : referencia<tipo> nome metodo = () -> {
//                 implementaçã do código
//                  };
