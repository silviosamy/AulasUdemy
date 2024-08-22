package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		HashSet<Comparable> conjunto = new HashSet<Comparable>();
		
		conjunto.add(1.2); //double -> Double - converte automaticamente
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // string já é objeto
		conjunto.add(1); // int -> Integer
		conjunto.add('x');
			
		System.out.println("Tamanho é " + conjunto.size()); //Verifica a quantidade de elementos dentro do conjunto. Neste caso, 5.
		
		System.out.println(conjunto.remove("teste")); // Nada acontece
		System.out.println(conjunto.remove("Teste")); // Retira a String "Teste"
		
		System.out.println("Tamanho é " + conjunto.size()); //Removeu antes o "Teste", agora temos 4 elementos no conjunto.
		
		System.out.println(conjunto.remove('x')); // Retira a String "Teste"
		System.out.println(conjunto.contains('x')); // "contém 'x'?" - (neste caso retorna true).
		System.out.println("Tamanho é " + conjunto.size()); //Removeu antes o "Teste", agora temos 4 elementos no conjunto.
		
		Set<Comparable> nums = new HashSet<Comparable>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
//		conjunto.addAll(nums); //União entre 2 conjuntos
		conjunto.retainAll(nums); //Vai comparar os 2 conjuntos e ver o que tem em comum.
		System.out.println(conjunto);
		conjunto.clear();
		System.out.println(conjunto);
		
	}
}
