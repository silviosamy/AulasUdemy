package oo.abstrato;

public class TesteAbstrato {
    public static void main(String[] args) {

        Animal a = new Cachorro();

        System.out.println(a.mover());
        System.out.println(((Cachorro) a).mamar());
    }
}
