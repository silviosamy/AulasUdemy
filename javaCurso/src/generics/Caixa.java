package generics;

public class Caixa<T> {

    private T coisa;

    public T abrir() {
        return coisa;
    }

    public void guardar(T coisa) {
        this.coisa = coisa;
    }
}
