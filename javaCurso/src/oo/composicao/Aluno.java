package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	String nome;
	final List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome) {
		this.nome = nome;
	}
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}

//	puxar na classe CursoTeste o código : 
//	System.out.println(aluno1.cursos.get(0).alunos); Do contrário não funciona
	public String toString() { 
		return nome; //Sempre que precisar transformar um objeto e em string, ele irá usar a função to String
	}
}
