package classe;

public class PrimeiroTrauma {
	
	int a = 3; //Somente Atributo de instância, precisando ser criado novo construtor repassando este valor.
	static int b = 4; //Variável de Instância, estático.
	
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma(); //Criar Instância com o nome 
												 //da classe, com novo construtor.
		// Só é possível acessar o membro da Instância (int a = 3); a partir do 
		//método estático, se for criado uma instância.
		System.out.println(p.a);
		System.out.println(b);
		// é possível criar algo estático (static) sem necessariamente criar uma nova instância.
		// Ex: static int b = 4;
	}
}
