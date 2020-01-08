package br.com.nobu.nobuService.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
	private Long id;
	
	private String nome;
	
	private String email;
}
