package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
//		int a = 3;
//		Scanner  entrada = new Scanner(System.in); 
		//new é uma palavra de Java, para chamar o Construtor.
		Produto p1 = new Produto("Notebook", 4356.89, 0);
				
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto(); //Com () é um método (linkado na outra class)
		double precoFinal2 = p2.precoComDesconto(); //Sem () é um atributo(linkado na outra class)
		double mediaCarrinho = ((precoFinal1 + precoFinal2) / 2);
		
		System.out.printf(("Média do carrinho = R$%.2f."), mediaCarrinho);
	}
}
