package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.imprimirDataFormatada();
//		d1.dia = 15;
//		d1.mes = 9;
		d1.ano = 2021;
		
		var d2 = new Data(31, 12, 2020);
		
//		d2.dia = 10;
//		d2.mes = 6;
//		d2.ano = 1999;
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
				
	}
}
