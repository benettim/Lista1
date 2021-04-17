package br.piu.entregaveis.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.piu.entregaveis.Models.CandidatoModel;
import br.piu.entregaveis.Repositories.CandidatoRespository;

import java.util.List;
@RestController
@RequestMapping("/ex4")
public class Exercicio4Controller 
{
	@Autowired
	private CandidatoRespository candidatorespository;
	
	@GetMapping("/listar")
	public List<CandidatoModel> getTodos()
	{
		return candidatorespository.findAll();
	}
	
	@PostMapping("/cadastrar")
	public CandidatoModel cadastrar(@RequestBody CandidatoModel candidato)
	{
		return candidatorespository.save(candidato);
	}
	
	
}
