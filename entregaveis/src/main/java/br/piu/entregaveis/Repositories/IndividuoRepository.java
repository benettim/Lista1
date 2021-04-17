package br.piu.entregaveis.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.piu.entregaveis.Models.IndividuoModel;

public interface IndividuoRepository extends JpaRepository<IndividuoModel, Long>{
	public List<IndividuoModel> findByTipo(String tipo);
}
