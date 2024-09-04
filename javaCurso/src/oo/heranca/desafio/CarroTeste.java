package oo.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {

        Carro c1 = new Civic();

        c1.acelerar();
        System.out.println(c1);
        c1.acelerar();
        System.out.println(c1);
        c1.acelerar();
        System.out.println(c1);

        Carro c2 = new Ferrari(400); //Mesma coisa que Ferrari c2, Carro c2. Ele tem a herança dos valores.
//        Criada a instância FERRARI, chamando o valor definido lá. Não na class.Carro

        c2.acelerar();
        c2.frear();
        System.out.println(c2);
        c2.acelerar();
        c2.frear();
        System.out.println(c2);
        c2.acelerar();
        System.out.println(c2);
    }
}
