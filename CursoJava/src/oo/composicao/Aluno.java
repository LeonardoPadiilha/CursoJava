package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	
	Aluno (String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso obterCursoPorNome (String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	
	public String toString() {
		return nome;
	}
	
	
	//Meu codigo, revisar depois
//	Aluno obterAlunoPorCurso (String nome) {
//		for(Aluno aluno: this.alunos) {
//			if(aluno.nome.equalsIgnoreCase(nome));
//			return aluno;
//		}
//		return null;
//	}
}
