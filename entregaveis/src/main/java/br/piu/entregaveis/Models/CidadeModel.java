package br.piu.entregaveis.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CidadeModel {
	
	@Id
	private Long idpop;
	@Column(nullable=false)
	private int populacao;
	@Column(nullable=false)
	private int ano;
	
	public Long getIdpop() {
		return idpop;
	}
	public void setIdpop(Long idpop) {
		this.idpop = idpop;
	}
	public int getPopulacao() {
		return populacao;
	}
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
}
