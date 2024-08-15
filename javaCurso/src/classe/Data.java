package classe;

public class Data {

	int dia; //Dentro da instância é inicializado com 0 ,se não for definido valor.
	int mes;
	int ano;
	
//	static int x; //estático, iniciando em 0.
//	int x; //Iniciará com o valor 0. Pois é o valor padrão do inteiro.
			//Porém, quando é definido constante, deve ser definido o valor. Ou, deve ser definido 
			//dentro do construtor.
	Data() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this (1, 1, 1970 ); // Usar um construtor para chamar outro usando o This.
	}
	
	Data(int dia, int mes, int ano) {
//		this(); << Não pode usar aqui
		this.dia = dia;
		this.mes = mes; 
		this.ano = ano;
	}
	
	String obterDataFormatada(){
		return String.format("%d/%d/%d.", this.dia, mes, ano);
	}
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}
//	static void teste() { Não funciona em método static.
//		this.dia = 3;
	}
// Para acessar alguma variável que pertence a instância ,é o usado o THIS . nome da instância.

// É possível chamar um construtor dentro de outro, usando o this.

