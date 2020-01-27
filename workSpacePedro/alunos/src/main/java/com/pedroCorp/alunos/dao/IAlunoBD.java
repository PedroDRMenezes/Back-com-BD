package com.pedroCorp.alunos.dao;

import org.springframework.data.repository.CrudRepository;

import com.pedroCorp.alunos.model.Aluno;

public interface IAlunoBD extends CrudRepository<Aluno, Integer>{

}
