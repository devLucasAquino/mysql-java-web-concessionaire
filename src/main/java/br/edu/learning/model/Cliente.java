package br.edu.learning.model;

import java.util.List;

public class Cliente {
	
	private Integer id;
	private String nome;
	private String contato;
	private List<Veiculo> veiculos;
	
	public Cliente() {}

	public Cliente(String nome, String contato, List<Veiculo> veiculos) {
		this.nome = nome;
		this.contato = contato;
		this.veiculos = veiculos;
	}

	public Cliente(Integer id, String nome, String contato, List<Veiculo> veiculos) {
		this.id = id;
		this.nome = nome;
		this.contato = contato;
		this.veiculos = veiculos;
	}
	
	

	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}
	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	
	
	
	
	
	
	
	
	
	
	

}
