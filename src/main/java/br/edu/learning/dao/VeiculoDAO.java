package br.edu.learning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.edu.learning.dao.DAO;
import br.edu.learning.model.Veiculo;

public class VeiculoDAO {
	
	
	private final String SQLINSERT = 
			"insert into VEICULO (MARCA, MODELO, COR, ANO, ID_CLIENTE) values(?, ?, ?, ?, ?)";
	
	private final String SQLSELECT = 
			"select ID, MARCA, MODELO, COR, ANO, ID_CLIENTE from VEICULOS";
	
	private final String SQLSELECT_ID = 
			"select ID, MARCA, MODELO, COR, ANO, ID_CLIENTE from VEICULOS where id = ?";
	
	private final String SQLUPDATE = 
			"update VEICULO set MARCA = ?, MODELO = ?, COR = ?, ANO = ?, set ID_CLIENTE = ? where ID = ?";
	
	private final String SQLDELETE = 
			"delete from VEICULO where ID = ?";
	
	
	
	
	
	public void novoVeiculo(Veiculo vei) {
		
		try {
			Connection con = DAO.conexao();
			
            if (!con.isClosed()) {
            	PreparedStatement ps = 
            			con.prepareStatement(SQLINSERT);
            	
            	ps.setString(1, vei.getMarca());
            	ps.setString(2, vei.getModelo());
            	ps.setString(3, vei.getCor());
            	ps.setString(4, vei.getAno());
            	ps.setString(5, vei.getId_cliente());
            	
            	System.out.println(vei.getMarca());
            	ps.execute();
            }
            	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}
