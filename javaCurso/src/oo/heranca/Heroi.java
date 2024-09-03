package oo.heranca;

public class Heroi extends Jogador {
//    Heroi agora também é um Jogador, conforme a outra class no mesmo package.

    boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        boolean ataque3 = super.atacar(oponente);
        return ataque1 || ataque2 || ataque3;
    }
}
