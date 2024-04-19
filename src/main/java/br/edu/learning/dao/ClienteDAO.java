package br.edu.learning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.learning.model.Cliente;
import br.edu.learning.model.Veiculo;

public class ClienteDAO {
	
	private final String SQLINSERT = 
			"insert into CLIENTE (NOME, CONTATO, VEICULO_MARCA, VEICULO_MODELO) values(?, ?, ?, ?)";
	
	private final String SQLSELECT = 
			"select ID, NOME, CONTATO, VEICULO_MARCA, VEICULO_MODELO from CLIENTE";
	
	private final String SQLSELECT_ID = 
			"select ID, NOME, CONTATO, VEICULO_MARCA, VEICULO_MODELO from CLIENTE where id = ?";
	
	private final String SQLUPDATE = 
			"update CLIENTE set NOME = ?, CONTATO = ?, VEICULO_MARCA = ?, VEICULO_MODELO = ? where ID = ?";
	
	private final String SQLDELETE = 
			"delete from CLIENTE where ID = ?";
	
	
	
	
	public int novoCliente(Cliente cliente) {
		
		int ID = 0;
			
			try {
				Connection con = DAO.conexao();
				
	            if (!con.isClosed()) {
	            	PreparedStatement ps = 
	            			con.prepareStatement(SQLINSERT, Statement.RETURN_GENERATED_KEYS);
	            	
	            	ps.setString(1, cliente.getNome());
	            	ps.setString(2, cliente.getContato());
	            	ps.setString(3, ((Veiculo) cliente.getVeiculos()).getMarca());
	            	ps.setString(4, ((Veiculo) cliente.getVeiculos()).getModelo());
	  
	            	ps.execute();
	            	
	            	ResultSet rs = ps.getGeneratedKeys();
					rs.next();
					ID = rs.getInt(1);
	            }
	            	
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			return ID;
		}
	
	
	
	
	
	public List<Cliente> lista() {

		List<Cliente> clientes = new ArrayList<Cliente>();

		try {
			Connection con = DAO.conexao();

			if (!con.isClosed()) {
				PreparedStatement ps = con.prepareStatement(SQLSELECT);
				ResultSet rs = ps.executeQuery();

				Cliente clienteSQL = null;
				while (rs.next()) {

					clienteSQL = new Cliente();
					clienteSQL.setId(rs.getInt("id"));
					clienteSQL.setNome(rs.getString("nome"));
					clienteSQL.setContato(rs.getString("contato"));
					
					VeiculoDAO veiDAO = new VeiculoDAO();
					tmp.setVeiculo(veiDAO.buscarVeiculoPorCliente(rs.getInt("id")));
					vendedores.add(tmp);
				}

				con.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return vendedores;
	}

		
		
	

}
