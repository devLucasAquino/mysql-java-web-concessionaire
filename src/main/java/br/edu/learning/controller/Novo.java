package br.edu.learning.controller;

import br.edu.learning.dao.VeiculoDAO;
import br.edu.learning.model.Veiculo;

public class Novo {

	public static void main(String[] args) {
		
		
		Veiculo vei = new Veiculo("Fiat", "Uno", "Vermelho", "1996");
		VeiculoDAO vDAO = new VeiculoDAO();
		
		vDAO.novoVeiculo(vei);

		
	}

}
