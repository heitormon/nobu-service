package br.com.nobu.nobuService.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="pessoa")
public class Pessoa implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome", nullable = false, length = 180)
	private String nome;
	@Column(name = "email", nullable = false, length = 180)
	private String email;
	@Column(name = "dataNascimento", nullable = false, length = 180)
	private Date dataNascimento;
	@Column(name = "cargo", nullable = false, length = 180)
	private String cargo;

}
