package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	final String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	Curso (String nome){
		this.nome = nome;
	}
	
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
	
	
	//Meu codigo, revisar depois
//	Aluno obterAlunoPorCurso (String nome) {
//			for(Curso curso: Curso.curso.nome     ) {
//				if(curso.nome.equalsIgnoreCase(nome));
//				return curso;
//			}
//			return null;
//		}
}
