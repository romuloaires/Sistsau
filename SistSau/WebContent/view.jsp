<%@ page language="java"  import="java.io.*,java.sql.*,javax.sql.*,javax.naming.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="br.com.rest.dao.*"%>
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


  <title>AppSaude</title>
  <link rel="stylesheet" href="css/bootstrap.css">
  <link rel="stylesheet" href="css/bootstrap-theme.css">
</head>
<body>

<center>
<div id="main"  class="container-fluid">
 <h3 class="page-header">Meus Dados </h3>
</div>
</center>

<legend>Dados Pessoais </legend>

<div class="row">
<div class="col-md-4">
 <p><strong>Nome</strong></p>
 <p> <input></input></p>
</div> 


<div class="col-md-4">
 <p><strong>Data de Nascimento</strong></p>
 <p>Trazer do banco</p>
</div> 


<div class="col-md-4">
 <p><strong>Email</strong></p>
 <p>Trazer do banco</p>
</div> 



<div class="col-md-4">
 <p><strong>Login</strong></p>
 <p> trazer do banco</p>
</div> 

</div>



<div class="row">
<div class="col-md-4">
 <p><strong>Celular 01</strong></p>
 <p> trazes do banco</p>
</div> 


<div class="col-md-4">
 <p><strong>Celular 02</strong></p>
 <p> trazes do banco</p>
</div> 


<div class="col-md-4">
 <p><strong>CPF</strong></p>
 <p> trazes do banco</p>
</div> 


<div class="col-md-4">
 <p><strong>Cartao SUS</strong></p>
 <p> trazes do banco</p>
</div> 

</div>


<legend> Perfil de Sa�de</legend>

<div class="row">
<div class="col-md-4">
 <p><strong>Sexo</strong></p>
 <p> trazes do banco</p>
</div> 



<div class="col-md-4">
 <p><strong>Tipo Sanguineo</strong></p>
 <p> trazes do banco</p>
</div> 


<div class="col-md-4">
 <p><strong>Fator RH</strong></p>
 <p> trazes do banco</p>
</div> 

<div class="col-md-4">
 <p><strong>Usa ou j� usou alguma droga il�cita?  </strong></p>
 <p> trazes do banco</p>
</div> 

</div>



<div class="row">
<div class="col-md-4">
 <p><strong>Consome Bebida Alc�olica?</strong></p>
 <p> trazes do banco</p>
</div> 

<div class="col-md-4">
 <p><strong>Possui Problemas Card�acos?</strong></p>
 <p> trazes do banco</p>
</div> 


<div class="col-md-4">
 <p><strong>Diab�tico</strong></p>
 <p> trazes do banco</p>
</div> 


</div>






<div class="row">
<div class="col-md-4">
 <p><strong>Hipertens�o</strong></p>
 <p> trazes do banco</p>
</div> 


<div class="col-md-4">
 <p><strong>Portador da AIDS?</strong></p>
 <p> trazes do banco</p>
</div> 




</div>

<legend>Alergia</legend>

<div class="row">
<div class="col-md-4">
 <p><strong>Alergia</strong></p>
 <p> trazes do banco</p>
</div> 
</div>

<legend>Medicamentos</legend>

<div class="row">
<div class="col-md-4">
 <p><strong>Descri��o</strong></p>
 <p> trazes do banco</p>
</div> 

<div class="col-md-4">
 <p><strong>Tarja de Medicamento</strong></p>
 <p> trazes do banco</p>
</div> 


</div>



<legend>Medica��o</legend>


<div class="row">
<div class="col-md-4">
 <p><strong>Tipo de Medica��o</strong></p>
 <p> trazes do banco</p>
</div> 



<div class="col-md-4">
 <p><strong>Data e Hora da Medica��o </strong></p>
 <p> trazes do banco</p>
</div> 


<div class="col-md-4">
 <p><strong>Indicativo Num�rico </strong></p>
 <p> trazes do banco</p>
</div> 


</div>


<legend>Contato - Emerg�ncia</legend>

<div class="row">
<div class="col-md-4">
 <p><strong>Avisar em caso de Emerg�ncia  </strong></p>
 <p> trazes do banco</p>
</div> 

<div class="col-md-4">
 <p><strong>Hospital Indicado </strong></p>
 <p> trazes do banco</p>
</div> 
</div>


<center>
<div id="actions" class="row">
 <div class="col-md-12">
  <a href="edit.html" class="btn btn-primary">Editar</a>
  <a href="index.html" class="btn btn-default">Fechar</a>
 </div>
</div>
</center>
</body>
</html>