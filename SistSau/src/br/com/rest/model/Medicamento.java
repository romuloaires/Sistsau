package br.com.rest.model;



/**
 * Classe responsavel por conter os atributos do medicamento
 */
/**
 * @author Romulo Aires
 *
 */

public class Medicamento {

	private String medicamentoId;
	private String medicamentoDescricao;
	private String medicamentoTarja;
	
	
	public String getMedicamentoId() {
		return medicamentoId;
	}
	public void setMedicamentoId(String medicamentoId) {
		this.medicamentoId = medicamentoId;
	}
	public String getMedicamentoDescricao() {
		return medicamentoDescricao;
	}
	public void setMedicamentoDescricao(String medicamentoDescricao) {
		this.medicamentoDescricao = medicamentoDescricao;
	}
	public String getMedicamentoTarja() {
		return medicamentoTarja;
	}
	public void setMedicamentoTarja(String medicamentoTarja) {
		this.medicamentoTarja = medicamentoTarja;
	}
		
	
}
