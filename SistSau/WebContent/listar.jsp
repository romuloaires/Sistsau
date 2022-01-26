<%@ page language="java"  import="java.io.*,java.sql.*,javax.sql.*,javax.naming.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="br.com.rest.dao.*"%>
<%@page import="br.com.rest.model.*"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.rest.connexao.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-BR">

<head lang="pt-br">
  <meta name="viewport" content="width=device-width, initial-scale=1" charset="utf-8">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
   <link rel="stylesheet" href="css/menu.css"> 
   <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"> 
   <link rel="stylesheet" href="https://cdn.datatables.net/1.10.11/css/dataTables.bootstrap.min.css"> 


  <title>AppSaude</title>
  <link rel="stylesheet" href="css/bootstrap.css">
  <link rel="stylesheet" href="css/bootstrap-theme.css">
</head>
<body>

<br/>
<br/>
<div id="main" class="container-fluid">
 <div id="main" class="container-fluid">
     <div id="top" class="row">
 <div class="col-md-3" >
        <h2>Buscar</h2>
    </div>

<div class="col-md-6">
        <div class="input-group h2">
            <input name="data[search]" class="form-control"  id="search" type="text" placeholder="Buscar Paciente">
            <span class="input-group-btn">
                <button class="btn btn-primary"  type="submit">
                    <span class="glyphicon glyphicon-search" ></span>
                </button>
            </span>
        </div>
    </div>

    <div class="col-md-3">
        <a href="view.jsp" class="btn btn-primary pull-right h2">Meus Dados</a>
    </div>


     </div> <!-- /#top -->
 
     <hr />
     <div id="list" class="row">

  <div class="table-responsive col-md-12">
        <table id="example" class="table table-striped" cellspacing="0" cellpadding="0">
            <thead>
                <tr>
                    <th>CPF</th>
                    <th>Nome</th>

                    <th class="actions">Ações</th>
                 </tr>
                 <%ClienteDao dao = new ClienteDao(); 
                   ArrayList<Cliente> lista = dao.listarTodos();
                   for(Cliente cliente: lista){
                   %>
                 
            </thead>
            <tbody>
 
                <tr>
                    <td><%=cliente.getClCpf() %></td>
                    <td><%=cliente.getClienteNome() %></td>
                   
                    <td class="actions">
                        <a class="btn btn-success btn-xs" href="view.jsp">Visualizar</a>
                        <a class="btn btn-warning btn-xs" href="editar.html">Editar</a>
                        
                    </td>
                </tr>
                <%
                   }
                %>
                
            </tbody>
         </table>
 
     </div>

     
     </div> <!-- /#list -->
 
     <div id="bottom" class="row">
      <div class="col-md-12">
         
        <ul class="pagination">
            <li class="disabled"><a>&lt; Anterior</a></li>
            <li class="disabled"><a>1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li class="next"><a href="#" rel="next">Próximo &gt;</a></li>
        </ul><!-- /.pagination -->
 
    </div>
     
     </div> <!-- /#bottom -->
 </div>  <!-- /#main -->

<script src="//code.jquery.com/jquery-1.12.0.min.js"></script>

<script src="https://cdn.datatables.net/1.10.11/js/jquery.dataTables.min.js"></script>

<script src="https://cdn.datatables.net/1.10.11/js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
    $('#example').DataTable();
} );

</script>

</body>
</html>