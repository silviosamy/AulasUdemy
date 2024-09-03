package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	final String nome;
	final List<Aluno> alunos = new ArrayList<>();
//	Método para adicionar alunos
	
	Curso(String nome) { //curso.nome = Curso nome na class CursoTeste(método main)
		this.nome = nome;
		
	}
	
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
		
	}
}
