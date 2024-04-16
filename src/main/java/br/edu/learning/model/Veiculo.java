package br.edu.learning.model;

public class Veiculo {
	
	private Integer id;
	private String marca;
	private String modelo;
	private String cor;
	private String ano;
	
	
	
	
	
	
	
	
	
	public Veiculo() {};
	
	public Veiculo(String marca, String modelo, String cor, String ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
	
	public Veiculo(Integer id, String marca, String modelo, String cor, String ano) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
	
	
	
	
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAno() {
		return ano;
	}

	public void setDate(String ano) {
		this.ano = ano;
	}

	

}
