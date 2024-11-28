package generics;

import java.util.List;

public class ListaUtil {

    //Sem usar o Generics depois do static, vai precisar se preocupar com o Cast
    // (especificar o tipo de valor que recebe)
    public static Object getUltimo1(List<?> lista) {
        return lista.get(lista.size() - 1);
    }

    //Aqui ele já faz o Cast a partir do Generics, identificando o tipo que o metodo retorna
    public static <T> T getUltimo2(List<T> lista) {
        return lista.get(lista.size() - 1);
    }

}
