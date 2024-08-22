package colecoes;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String > usuarios = new HashMap<Integer, String>(); //2 valores - Ex : CPF e usuario.
		usuarios.put(1, "Roberto"); //Adicionar na posição 1 , Roberto - Método put adiciona se não existir, e substitui caso já exista.
		usuarios.put(20, "Ricardo"); //Aqui ele Alterou o valor da chave.
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty()); //Vai dar False, pois não está vazio.
		
		System.out.println(usuarios.keySet()); //Coluna das chaves, sem ordem.
		System.out.println(usuarios.values()); //Vai passar os valores das chaves.
		System.out.println(usuarios.entrySet()); //Pega a chave e valor ao mesmo tempo.
		
		System.out.println(usuarios.containsKey(20)); // Vai dar true, pois 20 é a chave definida.
		System.out.println(usuarios.containsKey("Rebeca")); //Vai dar true , pois contém receba como valor.
		
		System.out.println(usuarios.get(4));
		
		for(int chave: usuarios.keySet()) { //Percorrer a quantidade de chaves (mesma coisa que keyset)
			System.out.println(chave);
		}
		for(String valor: usuarios.values()) { //Percorrer a quantidade de chaves (mesma coisa que keyset)
			System.out.println(valor);		
		}
		for(java.util.Map.Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue() + " ");
		} 
	}
}
