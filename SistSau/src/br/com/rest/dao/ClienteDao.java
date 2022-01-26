/**
 * Classe responsavel por conter os metodos do CRUD.
 */
/**
 * @author Romulo Aires
 *
 */
package br.com.rest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import br.com.rest.connexao.Conexao;
import br.com.rest.model.Alergia;
import br.com.rest.model.Cliente;
import br.com.rest.model.Medicacao;
import br.com.rest.model.Medicamento;



public class ClienteDao extends Conexao{
	
	
	private static ClienteDao instance;

	

	
	public  static ClienteDao getInstance(){
		if(instance == null)
			instance = new ClienteDao();
		return instance;
	}
	
	public ArrayList<Cliente> listarTodos(){
		Connection conexao = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Cliente> clientes = null;
		
		conexao = getConnection();
		clientes = new ArrayList<Cliente>();
		try {
			pstmt = conexao.prepareStatement("select * from sa01cliente ");
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				Cliente cliente = new Cliente();
				
				//cliente.setId(rs.getInt("id"));
				cliente.setClienteNome(rs.getString("cl01nome"));
				cliente.setClCpf(rs.getString("cl01cpf"));
				//cliente.setClienteCelular01(rs.getString("cl01celular1"));
				//cliente.setEndereco(rs.getString("endereco"));
				
				clientes.add(cliente);
			}
			
		} catch (Exception e) {
			System.out.println("Erro ao listar todos os clientes: " + e);
			e.printStackTrace();
		} finally {
			closeConection();
		}
		return clientes;
	}

	
	
	
	public  void inserir(Cliente usuario)
    {
		
		Connection con = getConnection();
    	
        
        String sql = "insert into sa01cliente(cl01nome,"
                + "cl01dtnascimento,"
                + "cl01email,"
                + "cl01login,"
                + "cl01senha,"
                + "cl01celular1,"
                + "cl01celular2,"
                + "cl01cpf,"
                + "cl01sus,"
                + "cl01sexo,"
                +"cl01tipo_sanguineo,"
                + "cl01fator_rh,"
//                + "cl01tipo_usuario,"
                + "cl01fumante,"
                + "cl01dependente_quimico,"
                + "cl01alcool,"
                + "cl01problema_cardiaco,"
                + "cl01diabete,"
                + "cl01hipertensao,"
                + "cl01aids,"
                + "cl01aviso_emergencia,"
                + "cl01hospital_emergencia)"
                + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
             
            String a = usuario.getClienteNome();
            String b = usuario.getClienteDtNascimento();
            String c = usuario.getClEmail();
            String d = usuario.getClienteLogin();
            String e = usuario.getClienteSenha();
            String f = usuario.getClienteCelular01();
            String g = usuario.getClienteCelular02();
            String    h = usuario.getClCpf();
            String    i = usuario.getClienteSus();
            String j = usuario.getClienteSexo();
            String k = usuario.getClienteTipoSanguineo();
            String l = usuario.getClienteFatorRh();
//            int i = usuario.getClienteTipoUsuario();
            String m = usuario.getClienteFumante();
            String n = usuario.getClienteDepQuimico();
            String o = usuario.getClienteAlcool();
            String p = usuario.getClienteProblemaCardiaco();
            String q = usuario.getClienteDiabete();
            String r = usuario.getClienteHipertensao();
            String s = usuario.getClienteAids();
            String t = usuario.getClienteAvisoEmergencia();
            String u = usuario.getClienteHospEmerg();
            
           
        
            
            
            
            
            
           
            stmt.setString(1,a);
            stmt.setString(2,b);
            stmt.setString(3,c);
            stmt.setString(4,d);
            stmt.setString(5,e);
            stmt.setString(6,f);
            stmt.setString(7,g);
            stmt.setString(8,h);
            stmt.setString(9,i);
            stmt.setString(10,j);  
            stmt.setString(11,k);
            stmt.setString(12,l);
            stmt.setString(13,m);
            stmt.setString(14,n);
            stmt.setString(15,o);
            stmt.setString(16,p);                    
            stmt.setString(17,q);
            stmt.setString(18,r);
            stmt.setString(19,s);
            stmt.setString(20,t);
            stmt.setString(21,u);
            
               // pst.setString(2, usuario.getClienteEmail());
               // pst.setString(3, usuario.getClienteSenha());
            stmt.executeUpdate();
            stmt.close();
                
                
             
            
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
           }
    
    }
	
	
//	public void adiciona(Cliente contato){
//		 Connection con = null;
//		
//			
//			
//	        try {
//	            
//				PreparedStatement sql = con.prepareStatement("INSERT INTO sa01cliente  (cl01nome,cl01email,cl01senha)"
//	                    + "VALUES (?,?,?)");
//	       
//	         
//	        sql.setString(1,contato.getClienteNome());
//	        sql.setString(2,contato.getClienteEmail());
//	        sql.setString(3,contato.getClienteSenha());
//	        
//	        sql.execute();
//	        sql.close();
//	        } catch (SQLException e) {
//	             throw new RuntimeException(e);
//	            }
//	        }
	
	
	
	//OK 
	 public Cliente findByName(String nome) throws SQLException {
	        String select = "SELECT * FROM sa01cliente WHERE cl01nome = ?";
	        Cliente contato = null;
	        PreparedStatement stmt = 
				getConnection().prepareStatement(select);
				
	        stmt.setString(1, nome);
	        ResultSet rs = stmt.executeQuery();

	        while (rs.next()) {
	            contato = new Cliente();
	            contato.setClienteNome(rs.getString("cl01nome"));	          
	            contato.setClienteDtNascimento(rs.getString("cl01dtnascimento"));
	            contato.setClEmail(rs.getString("cl01email"));
	            contato.setClienteLogin(rs.getString("cl01login"));
	            contato.setClienteSenha(rs.getString("cl01senha"));
	            contato.setClienteCelular01(rs.getString("cl01celular1"));
	            contato.setClienteCelular02(rs.getString("cl01celular2"));
	            contato.setClCpf(rs.getString("cl01cpf"));
	            contato.setClienteSus(rs.getString("cl01sus"));
	            contato.setClienteSexo(rs.getString("cl01sexo"));
	            contato.setClienteTipoSanguineo(rs.getString("cl01tipo_sanguineo"));
	            contato.setClienteFatorRh(rs.getString("cl01fator_rh"));
	            contato.setClienteFumante(rs.getString("cl01fumante"));
	            contato.setClienteDepQuimico(rs.getString("cl01dependente_quimico"));
	            contato.setClienteAlcool(rs.getString("cl01alcool"));
	            contato.setClienteProblemaCardiaco(rs.getString("cl01problema_cardiaco"));
	            contato.setClienteDiabete(rs.getString("cl01diabete"));
	            contato.setClienteHipertensao(rs.getString("cl01hipertensao"));
	            contato.setClienteAids(rs.getString("cl01aids"));
	          
	            //contato.setClienteDtNascimento(rs.getString("data_nascimento"));
	        }

	        rs.close();
	        stmt.close();
	        return contato;
	    }
	 public Cliente buscar (String cpf) throws SQLException {
	        String select = "SELECT * FROM sa01cliente WHERE cl01cpf = ?";
	        Cliente contato = null;
	        PreparedStatement stmt = 
				getConnection().prepareStatement(select);
				
	        stmt.setString(1, cpf);
	        ResultSet rs = stmt.executeQuery();

	        while (rs.next()) {
	            contato = new Cliente();
	            contato.setClienteNome(rs.getString("cl01nome"));	          
	            contato.setClienteDtNascimento(rs.getString("cl01dtnascimento"));
	            contato.setClEmail(rs.getString("cl01email"));
	            contato.setClienteLogin(rs.getString("cl01login"));
	            contato.setClienteSenha(rs.getString("cl01senha"));
	            contato.setClienteCelular01(rs.getString("cl01celular1"));
	            contato.setClienteCelular02(rs.getString("cl01celular2"));
	            contato.setClCpf(rs.getString("cl01cpf"));
	            contato.setClienteSus(rs.getString("cl01sus"));
	            contato.setClienteSexo(rs.getString("cl01sexo"));
	            contato.setClienteTipoSanguineo(rs.getString("cl01tipo_sanguineo"));
	            contato.setClienteFatorRh(rs.getString("cl01fator_rh"));
	            contato.setClienteFumante(rs.getString("cl01fumante"));
	            contato.setClienteDepQuimico(rs.getString("cl01dependente_quimico"));
	            contato.setClienteAlcool(rs.getString("cl01alcool"));
	            contato.setClienteProblemaCardiaco(rs.getString("cl01problema_cardiaco"));
	            contato.setClienteDiabete(rs.getString("cl01diabete"));
	            contato.setClienteHipertensao(rs.getString("cl01hipertensao"));
	            contato.setClienteAids(rs.getString("cl01aids"));
	          
	            //contato.setClienteDtNascimento(rs.getString("data_nascimento"));
	        }

	        rs.close();
	        stmt.close();
	        return contato;
	    }

//	public static Cliente buscar(String cpf) throws SQLException
//	    {
//		//CONSULTA POR CPF
//	         String select = "SELECT * FROM sa01cliente WHERE cl01cpf = ?";
//		        Cliente contato = null;
//		      //  Alergia alergia = null;
////		        Medicamento med = null;
////		        Medicacao medi = null;
//		        PreparedStatement stmt = 
//					getConnection().prepareStatement(select);
//					
//		        stmt.setString(1, cpf);
//		        ResultSet rs = stmt.executeQuery();
//
//		        while (rs.next()) {
//		            contato = new Cliente();
//		            contato.setClienteNome(rs.getString("cl01nome"));	          
//		            contato.setClienteDtNascimento(rs.getString("cl01dtnascimento"));
//		            contato.setClEmail(rs.getString("cl01email"));
//		            contato.setClienteLogin(rs.getString("cl01login"));
//		            contato.setClienteSenha(rs.getString("cl01senha"));
//		            contato.setClienteCelular01(rs.getString("cl01celular1"));
//		            contato.setClienteCelular02(rs.getString("cl01celular2"));
//		            contato.setClCpf(rs.getString("cl01cpf"));
//		            contato.setClienteSus(rs.getString("cl01sus"));
//		            contato.setClienteSexo(rs.getString("cl01sexo"));
//		            contato.setClienteTipoSanguineo(rs.getString("cl01tipo_sanguineo"));
//		            contato.setClienteFatorRh(rs.getString("cl01fator_rh"));
//		            contato.setClienteFumante(rs.getString("cl01fumante"));
//		            contato.setClienteDepQuimico(rs.getString("cl01dependente_quimico"));
//		            contato.setClienteAlcool(rs.getString("cl01alcool"));
//		            contato.setClienteProblemaCardiaco(rs.getString("cl01problema_cardiaco"));
//		            contato.setClienteDiabete(rs.getString("cl01diabete"));
//		            contato.setClienteHipertensao(rs.getString("cl01hipertensao"));
//		            contato.setClienteAids(rs.getString("cl01aids"));
//		    //        alergia.setAlergiaDescricao(rs.getString("al04descricao"));
////		            med.setMedicamentoDescricao(rs.getString("med02descricao"));
////		            med.setMedicamentoTarja(rs.getString("med02tarja"));
////		            medi.setMedicacaoTipo(rs.getString("md03tipo"));
////		            medi.setMedicacaoDataHora(rs.getString("md03datahora"));
////		            medi.setMedicacaoNumero(rs.getString("md03numero"));
//		            
//		           
////		            contato.setClienteAvisoEmergencia(rs.getString("cl01aviso_emergencia"));
////		            contato.setClienteHospEmerg(rs.getString("cl01hospital_emergencia"));
//		            
//		            //
//		        }
//	               
//		        rs.close();
//		        stmt.close();
//		        return contato;
//		        
//		    }
			
	  public void altera(Cliente contato) {
		  String select = "update sa01cliente set cl01nome=?, cl01email=?, cl01senha=?";
		  
		     try {
		    	 PreparedStatement con = 
							getConnection().prepareStatement(select);
		         con.setString(1, contato.getClienteNome());
		         con.setString(2, contato.getClEmail());
		         con.setString(3, contato.getClienteSenha());
		         //sql.setLong(4, contato.getId());
		         con.execute();
		         con.close();
		     } catch (SQLException e) {
		         throw new RuntimeException(e);
		     }
		 }
	
	
	
}