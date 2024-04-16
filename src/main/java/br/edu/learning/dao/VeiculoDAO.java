package br.edu.learning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.edu.learning.dao.DAO;
import br.edu.learning.model.Veiculo;

public class VeiculoDAO {
	
	
	private final String SQLINSERT = 
			"insert into VEICULO (MARCA, MODELO, COR, ANO) values(?, ?, ?, ?)";
	
	private final String SQLSELECT = 
			"select ID, MARCA, MODELO, COR, ANO from VEICULOS";
	
	private final String SQLSELECT_ID = 
			"select ID, MARCA, MODELO, COR, ANO from VEICULOS where id = ?";
	
	private final String SQLUPDATE = 
			"update VEICULO set MARCA = ?, MODELO = ?, COR = ?, ANO = ? where ID = ?";
	
	private final String SQLDELETE = 
			"delete from VEICULO where ID = ?";
	
	
	
	
	
	public void novoVeiculo(Veiculo vec) {
		System.out.println(vec.getMarca());
		try {
			Connection con = DAO.conexao();
			
            if (!con.isClosed()) {
            	PreparedStatement ps = 
            			con.prepareStatement(SQLINSERT);
            	ps.setString(1, vec.getMarca());
            	ps.setString(2, vec.getModelo());
            	ps.setString(3, vec.getCor());
            	ps.setString(4, vec.getAno());
            	
            	ps.execute();
            }
            	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}
