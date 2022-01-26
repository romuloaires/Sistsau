package br.com.rest.model;

/**
 * Classe responsavel por conter os atributos da mediçao
 */
/**
 * @author Romulo Aires
 *
 */

public class Medicacao {
	
	private String medicacaoId;
	private String medicacaoTipo;
	private String medicacaoDataHora;
	private String medicacaoNumero;
	
	public void setMedicacaoId(String medicacaoId) {
		this.medicacaoId = medicacaoId;
	}
	public String getMedicacaoTipo() {
		return medicacaoTipo;
	}
	public void setMedicacaoTipo(String medicacaoTipo) {
		this.medicacaoTipo = medicacaoTipo;
	}
	public String getMedicacaoDataHora() {
		return medicacaoDataHora;
	}
	public void setMedicacaoDataHora(String medicacaoDataHora) {
		this.medicacaoDataHora = medicacaoDataHora;
	}
	public String getMedicacaoNumero() {
		return medicacaoNumero;
	}
	public void setMedicacaoNumero(String medicacaoNumero) {
		this.medicacaoNumero = medicacaoNumero;
	}
	
}
