package br.piu.entregaveis.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.piu.entregaveis.Models.CandidatoModel;

@Repository
public interface CandidatoRespository extends JpaRepository<CandidatoModel, Long>{
	
}
