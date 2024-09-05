package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Silvio","Samy" ,50); //Aqui define o valor inicial.
        p1.setIdade(27); //Aqui altera o valor inicial, na construção foi setado um if que não há valor negativo

        System.out.println(p1.getNomeCompleto());
        System.out.println(p1);
    }
}
