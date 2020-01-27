package com.pedroCorp.alunos.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pedroCorp.alunos.dao.IAlunoBD;
import com.pedroCorp.alunos.model.Aluno;

@Component
public class ServicoAlunos implements IAlunoService {

	@Autowired
	IAlunoBD repo;

	public void gravarAlunoNoBanco(Aluno aluno) {
		try {
			repo.save(aluno);
		} catch (Exception ex) {
			throw new RuntimeException("Erro ao inserir");
		}
	}

	public void atualizarAlunoNoBanco(Aluno aluno) {
		try {
			repo.save(aluno);
		} catch (Exception ex) {
			throw new RuntimeException("Erro ao atualizar");
		}
	}

	public Aluno recuperarAlunoPorId(int id) {
		return repo.findById(id).get();
	}
}