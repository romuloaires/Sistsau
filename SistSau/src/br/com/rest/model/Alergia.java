package br.com.rest.model;


/**
 * Classe responsavel por conter os atributos da Alergia
 */
/**
 * @author Romulo Aires
 *
 */

public class Alergia {

	private String alergiaId;
	private String alergiaDescricao;
	
	
	public void setAlergiaId(String alergiaId) {
		this.alergiaId = alergiaId;
	}
	public String getAlergiaId(){
		return alergiaId;
	}
	public String getAlergiaDescricao() {
		return alergiaDescricao;
	}
	public void setAlergiaDescricao(String alergiaDescricao) {
		this.alergiaDescricao = alergiaDescricao;
	}
		
	
}
