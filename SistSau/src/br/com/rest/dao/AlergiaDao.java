package br.com.rest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.rest.connexao.Conexao;
import br.com.rest.model.Alergia;
import br.com.rest.model.Cliente;

public class AlergiaDao extends Conexao	{

	
	public  void inserir(Alergia descricao)
    {
		
		Connection con = getConnection();
    	
        
        String sql = "insert into sa04alergia(al04descricao)" + "values(?)";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
             
            String a = descricao.getAlergiaDescricao();
       
            stmt.setString(1,a);
           
            
               // pst.setString(2, usuario.getClienteEmail());
               // pst.setString(3, usuario.getClienteSenha());
            stmt.executeUpdate();
            stmt.close();
                
                
             
            
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
           }
    
    }
	
	
	
	
	

}
