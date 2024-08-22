package classe;

public class Usuario {

	String nome;
	String email;
	
	@Override
	public boolean equals(Object objeto) { //usuario sendo generico agora
		
		if(objeto instanceof Usuario) {
			
		
		Usuario outro = (Usuario) objeto; //converte-se o objeto para Usuario.
		
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email);
		
		return nomeIgual && emailIgual;
		} else {
			return false;
		  }
		}
	}

//O hashcode será abordado em outra aula.
