package com.algaworks.algafood.di.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
	private String nome;
	private String email;
	private String telefone;
	private Boolean ativo = false;
	
	public Cliente(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public Boolean ativar() {
		return true;
	}
	
}
