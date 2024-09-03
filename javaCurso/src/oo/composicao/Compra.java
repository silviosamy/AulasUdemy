package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	
	String Cliente;
	ArrayList<Item> itens = new ArrayList<Item>(); //Array criado que só aceita da public class Item
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco)); //bidirecional
	}
		
	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		
		return total;
	}	
}
