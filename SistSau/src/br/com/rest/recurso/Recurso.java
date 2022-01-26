package br.com.rest.recurso;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.FormParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.rest.dao.AlergiaDao;
import br.com.rest.dao.ClienteDao;
import br.com.rest.dao.MedicacaoDao;
import br.com.rest.dao.MedicamentoDao;
import br.com.rest.model.Alergia;
import br.com.rest.model.Cliente;
import br.com.rest.model.Medicacao;
import br.com.rest.model.Medicamento;


@Path("/recurso")
public class Recurso {

	@GET
	@Path("/get")
	public String get(){
		return "as";
	}
	
	
	@GET //OK
	@Path("/cpf/{cpf}") //nao ta consultando numero pq o tipo ta string...tem que alterar o tipo
    @Produces(MediaType.APPLICATION_XML)
	public Cliente consultarCpf(@PathParam("cpf") String cpf){
	int exceptionNumber = 500;
	try{
		Cliente cliente = ClienteDao.getInstance().buscar(cpf);
			if(cliente == null){
			System.out.println("as");
			exceptionNumber = 404;
			throw new Exception ("nao encontrado");
		}
		return cliente;
		
	}catch(Exception e){
		throw new WebApplicationException(exceptionNumber);
		
	}
	
	}
	
	
	@GET
	@Path("/nome/{nome}") //OK
    @Produces(MediaType.APPLICATION_XML)
	public Cliente consultarNome(@PathParam("nome") String nome){
	int exceptionNumber = 500;
	try{
		//Cliente cliente = ClienteDao.buscar(cpf_cliente);
		Cliente cliente = ClienteDao.getInstance().findByName(nome);
		if(cliente == null){
			System.out.println("as");
			exceptionNumber = 404;
			throw new Exception ("nao encontrado");
		}
		return cliente;
		
	}catch(Exception e){
		throw new WebApplicationException(exceptionNumber);
		
	}
	
	}

	@POST
	@Path("/post")
	@Produces("text/plain")
//	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Response addCliente(
			 @FormParam("nome") String nome,
			 @FormParam("dtnascimento") String nasc,
			 @FormParam("email") String email,
			 @FormParam("login") String login,
			 @FormParam("senha") String senha,
			 @FormParam("celular01") String celular01,
			 @FormParam("celular02") String celular02,
			 @FormParam("cpf") String  cpf,
			 @FormParam("cartaosus") String cartaosus,
			 @FormParam("sexo") String sexo,
			 @FormParam("tiposang") String tiposang,
			 @FormParam("fatorrh") String fatorrh,
			 @FormParam("fumante") String fumante,
			 @FormParam("droga") String droga,
			 @FormParam("alcool") String alcool,
			 @FormParam("cardiaco") String cardiaco,
			 @FormParam("diabetico") String diabetico,
			 @FormParam("hipertenso") String hipertenso,
			 @FormParam("aids") String aids,
			 @FormParam("alergia") String alergia,
			 @FormParam("medicamento") String medicamento,
			 @FormParam("tarjamed") String tarjamed,
		//	 @FormParam("medicacao") String medicacao,
			 @FormParam("tipomed") String tipomed,
			 @FormParam("datmed") String datmed,
			 @FormParam("indnumerico") String indnumerico,
			 @FormParam("contatoeme") String contatoeme,
			 @FormParam("hospind") String hospind
			 
			 
			 ){
		 //o metodo addcliente constroi apartir da entrada XML recebido e persisti-lo
		 
		
	//	return "nome: " + nome + "email" + email+ "senha" + senha ;
   	 try{
   	 
   	    Cliente user = new Cliente();
   	    Alergia userla = new Alergia();
   	    Medicamento usermed = new Medicamento();
   	    Medicacao usermedicacao = new Medicacao();
   	    
        ClienteDao client = new ClienteDao();
        AlergiaDao alerg = new AlergiaDao();
        MedicamentoDao medic = new MedicamentoDao();
        MedicacaoDao medicacao = new MedicacaoDao();
        
        user.setClienteNome(nome);
        user.setClienteDtNascimento(nasc);
        user.setClEmail(email);
        user.setClienteLogin(login);
        user.setClienteSenha(senha);
        user.setClienteCelular01(celular01);
        user.setClienteCelular02(celular02);
        user.setClCpf(cpf);
        user.setClienteSus(cartaosus);
        user.setClienteSexo(sexo);
        user.setClienteTipoSanguineo(tiposang);
        user.setClienteFatorRh(fatorrh);
        user.setClienteFumante(fumante);
        user.setClienteDepQuimico(droga);
        user.setClienteAlcool(alcool);
        user.setClienteProblemaCardiaco(cardiaco);
        user.setClienteDiabete(diabetico);
        user.setClienteHipertensao(hipertenso);
        user.setClienteAids(aids);
        userla.setAlergiaDescricao(alergia);
        usermed.setMedicamentoDescricao(medicamento);
        usermed.setMedicamentoTarja(tarjamed);
        
        usermedicacao.setMedicacaoTipo(tipomed);
        usermedicacao.setMedicacaoDataHora(datmed);
        usermedicacao.setMedicacaoNumero(indnumerico);
       
        user.setClienteAvisoEmergencia(contatoeme);
        user.setClienteHospEmerg(hospind);
        
       
        client.inserir(user);
        alerg.inserir(userla);
        medic.inserir(usermed);
        medicacao.inserir(usermedicacao);
		
			return Response.status(200).entity("Cliente cadastradastrado").build();
		}catch(Exception e){
			throw new WebApplicationException(500);
		}
		
	}

	@PUT
	@Path("/atualiza")
    @Produces(MediaType.TEXT_PLAIN)
	public String putSomething(@FormParam("request") String request ,  @DefaultValue("1") @FormParam("version") int version) {
	        return null;	
	}

	@DELETE
	@Path("/<add method name here>")
	public void deleteSomething(@FormParam("request") String request ,  @DefaultValue("1") @FormParam("version") int version) {
		
		
	}
}
