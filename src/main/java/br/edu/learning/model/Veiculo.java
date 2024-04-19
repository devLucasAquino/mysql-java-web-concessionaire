package br.edu.learning.model;

public class Veiculo {
	
	private Integer id;
	private String marca;
	private String modelo;
	private String cor;
	private String ano;
	private String id_cliente;
	

	
	
	
	public Veiculo() {};
	
	public Veiculo(String marca, String modelo, String cor, String ano, String id_cliente) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.id_cliente = id_cliente;
	}
	
	public Veiculo(Integer id, String marca, String modelo, String cor, String ano, String id_cliente) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.id_cliente = id_cliente;
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

	public String getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	
	
	
	
	
	

	

}
