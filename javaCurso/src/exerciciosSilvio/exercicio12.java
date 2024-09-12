package exerciciosSilvio;

public class exercicio12 {
    public static void main(String[] args) {
// Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago,
// conforme a escolha da forma de pagamento
// pelo comprador e imprima na tela o valor final do produto a ser pago.
// Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
// Tabela de Código de Condições de Pagamento
// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
        String produto = "Prato";
        double valor = 20.10;
        double dinheiro = valor -((valor/100) * 15);
        double pix = valor -((valor/100) * 15);
        double credito = valor - ((valor/100) * 10);
        double cartao2x = valor;
        double cartao3xMais = valor + ((valor/100) * 10);
        System.out.printf("R$%.2f",dinheiro);;




    }
}
