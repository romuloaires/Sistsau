package br.com.rest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.rest.connexao.Conexao;
import br.com.rest.model.Medicacao;

public class MedicacaoDao  extends Conexao{
	
	public  void inserir(Medicacao medicacao)
    {
		
		Connection con = getConnection();
    	//semanatrans2016.vai.la
        
        String sql = "insert into sa03medicacao(md03tipo, md03datahora, md03numero)" + "values(?,?,?)";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
             
            String a = medicacao.getMedicacaoDataHora();
            String b = medicacao.getMedicacaoNumero();
            String c = medicacao.getMedicacaoTipo();
       
            stmt.setString(1,a);
            stmt.setString(2,b);
            stmt.setString(3,c);
           
            
               // pst.setString(2, usuario.getClienteEmail());
               // pst.setString(3, usuario.getClienteSenha());
            stmt.executeUpdate();
            stmt.close();
                
                
             
            
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
           }
    
    }
}
