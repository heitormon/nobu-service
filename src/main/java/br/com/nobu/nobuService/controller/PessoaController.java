package br.com.nobu.nobuService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nobu.nobuService.model.Pessoa;
import br.com.nobu.nobuService.service.PessoaService;


@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	PessoaService pessoaService;
	
	@GetMapping("/{id}")
	public List<Pessoa> findAllFukyosho(){
		return pessoaService.findAllPessoa();
	}
}
