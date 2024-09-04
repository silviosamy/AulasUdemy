package oo.heranca;

public class Jogo {
    public static void main(String[] args) {

        Heroi heroi = new Heroi(10,11);

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 11;


        System.out.println("Monstro tem -> " + monstro.vida);
        System.out.println("Heroi tem -> " + heroi.vida);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro tem -> " + monstro.vida);
        System.out.println("Heroi tem -> " + heroi.vida);
    }
}
