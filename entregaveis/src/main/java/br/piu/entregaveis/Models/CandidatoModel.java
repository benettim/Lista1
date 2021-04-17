package br.piu.entregaveis.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class CandidatoModel {
	
	@Id
	private Long idCandidato;
	@Column(nullable=false)
	private String nomeCandidato;
	@Column(nullable=false)
	private int votos = 0;
	
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos = votos;
	}
	public Long getIdCandidato() {
		return idCandidato;
	}
	public void setIdCandidato(Long idCandidato) {
		this.idCandidato = idCandidato;
	}
	public String getNomeCandidato() {
		return nomeCandidato;
	}
	
	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}
}
