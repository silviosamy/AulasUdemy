package oo.abstrato;

public class Cachorro extends Mamifero {
    //    como ela herda , é necessário utilizar o métodoo abstract.
    public String mover() {
        return "Usando as patas";
    }

    public String mamar() {
        return "Usando leite";
    }
}
