/**
 * Classe responsável por conter os metodos de criar e fechar o banco de dados.
 */
/**
 * @author Romulo Aires
 *
 */
package br.com.rest.connexao;



import java.sql.*;

public class Conexao {
    static String status="";
    static String url = "jdbc:mysql://localhost/appsaude";
    static String user = "root";
    static String senha = "";
    protected Statement stmt = null;
    protected ResultSet rs = null;
  private static Connection connection = null; 
 
  public static  Connection getConnection()  {
       
    	 
    	try {
    		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        	
    		 
            return DriverManager.getConnection(url, user, senha);
         }
    	catch (SQLException e) {
		   status = e.getMessage();
        	throw new RuntimeException(e);
		}
   
    }
    
    
    public static PreparedStatement getPreparedStatement(String sql){
        // testo se a conexão já foi criada
        if (connection == null){
            // cria a conexão
            connection = getConnection();
        }
        try {
            // retorna um objeto java.sql.PreparedStatement
            return connection.prepareStatement(sql);
        } catch (SQLException e){
            System.out.println("Erro de sql: "+
                    e.getMessage());
        }
        return null;
    }
    
    
    public void closeConection() {
    	 try{
    	 if( this.rs != null ){
    	 this.rs.close();
    	 }
    	 if( this.stmt != null ){
    	 this.stmt.close();
    	 }
    	 if( this.connection != null ){
    	 this.closeConection();
    	 }
    	 }catch (SQLException sEx) {
    	 sEx.printStackTrace();
    	 } 

}
    
}