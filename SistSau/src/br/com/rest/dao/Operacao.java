package br.com.rest.dao;


import java.sql.SQLException;

import br.com.rest.model.Alergia;
import br.com.rest.model.Cliente;
import br.com.rest.model.Medicacao;
import br.com.rest.model.Medicamento;


public class Operacao {

    public static void main(String[] args) throws SQLException {
        // TODO code application logic her
    	
                  
             Cliente cliente1 = new Cliente();
               ClienteDao client = new ClienteDao();
            
            
            // cliente1.setClienteEmail("pan@gmai.com");
               cliente1.setClienteNome("henrique");
             //  cliente1.setClCpf("12387364");
             
               
               
               client.inserir(cliente1);
           cliente1  = client.findByName("henrique");
              System.out.println(cliente1); 
              // Cliente pessoa2 = (Cliente) client.pesquisarPorNome("henrique");
              // System.out.println("Consultando: " + pessoa2.getClienteNome());
               //cliente1.altera(cliente1);
            // cliente1.remove(cliente1);
               
    }
    
}