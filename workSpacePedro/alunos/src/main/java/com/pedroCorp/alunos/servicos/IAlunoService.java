package com.pedroCorp.alunos.servicos;

import com.pedroCorp.alunos.model.Aluno;

public interface IAlunoService {
	public void gravarAlunoNoBanco(Aluno aluno);
	public void atualizarAlunoNoBanco(Aluno aluno);
	public Aluno recuperarAlunoPorId(int id);
}
