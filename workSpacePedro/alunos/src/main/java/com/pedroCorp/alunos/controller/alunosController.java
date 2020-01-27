package com.pedroCorp.alunos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;//importação do comando que retorna status de erro
//ou ok(end-poins).
import org.springframework.web.bind.annotation.CrossOrigin;//importação .
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//ser usada dinamicamente(ou seja pode mudar dependendo do que vamos fazer) ex: no getPOstagem a 
//postagem que será buscada vai depender do id que escolhermos 
import org.springframework.web.bind.annotation.PostMapping;//importação .
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;//Essa notação serve para quando criamos
//uma variavel que vai receber um conteudo do usuario
import org.springframework.web.bind.annotation.RestController;//importação .

import com.pedroCorp.alunos.model.Aluno;
import com.pedroCorp.alunos.servicos.IAlunoService;

@RestController
@CrossOrigin("*")
public class alunosController {
	
	@Autowired
	private IAlunoService servico;

	@PostMapping("/aluno/novo")
	public ResponseEntity<Aluno> novoAluno(@RequestBody Aluno aluno) {
		try {
			servico.gravarAlunoNoBanco(aluno);
			return ResponseEntity.ok(aluno);
		}
		catch(Exception ex) {
			return ResponseEntity.badRequest().build();
		}
	}

	@GetMapping("/aluno/{id}")
	public ResponseEntity<Aluno> buscaAlunoId(@PathVariable int id) {
		return null;
	}

	@PutMapping("/aluno/alterar")
	public ResponseEntity<Aluno> ataulizarDados(@RequestBody Aluno aluno) {
		return null;
	}

}
