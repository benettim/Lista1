package br.piu.entregaveis.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.piu.entregaveis.Models.CidadeModel;

@Repository
public interface CidadeRepository extends JpaRepository<CidadeModel, Long>{
	
}
