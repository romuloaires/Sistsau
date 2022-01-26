package br.com.rest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.rest.connexao.Conexao;
import br.com.rest.model.Medicamento;

public class MedicamentoDao extends Conexao{
	
	
	public  void inserir(Medicamento medicamento)
    {
		
		Connection con = getConnection();
    	
        
        String sql = "insert into sa02medicamento(med02descricao, med02tarja)" + "values(?,?)";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
             
            String a = medicamento.getMedicamentoDescricao();
            String b = medicamento.getMedicamentoTarja();
       
            stmt.setString(1,a);
            stmt.setString(2,b);
           
            
               // pst.setString(2, usuario.getClienteEmail());
               // pst.setString(3, usuario.getClienteSenha());
            stmt.executeUpdate();
            stmt.close();
                
                
             
            
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
           }
    
    }
	
	
	
	
	
}
