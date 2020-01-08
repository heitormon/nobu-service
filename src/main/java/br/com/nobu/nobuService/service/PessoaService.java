package br.com.nobu.nobuService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nobu.nobuService.model.Pessoa;
import br.com.nobu.nobuService.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	PessoaRepository pessoaRepository;
	
	public List<Pessoa> findAllPessoa() {
		// TODO Auto-generated method stub
		return pessoaRepository.findAll();
	}

	public Pessoa create(Pessoa pessoa) {
		// TODO Auto-generated method stub
		return pessoaRepository.save(pessoa);
	}

	
}
