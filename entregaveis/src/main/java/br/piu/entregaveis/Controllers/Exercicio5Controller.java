package br.piu.entregaveis.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.piu.entregaveis.Models.CidadeModel;
import br.piu.entregaveis.Repositories.CidadeRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
@RestController
@RequestMapping("/ex5")
public class Exercicio5Controller {
	
	@Autowired
	private CidadeRepository cidaderepository;
	
	@GetMapping("/listar")
	public List<CidadeModel> getTodos()
	{
		return cidaderepository.findAll();
	}
	
	@PostMapping("/cadastrar")
	public CidadeModel cadastrar(@RequestBody CidadeModel cidade) {
		return cidaderepository.save(cidade);
	}
	
	@PutMapping("/alterar/{id}")
	public CidadeModel alterar(@PathVariable Long id, @RequestBody CidadeModel cidade){
		CidadeModel cidademodel = cidaderepository.getOne(id);
		if(cidademodel == null) return null;
		cidademodel.setPopulacao(cidade.getPopulacao());
		cidademodel.setAno(cidade.getAno());
		return cidaderepository.save(cidademodel);
	}
	
	@DeleteMapping("/delete/{id}")  
	public void excluir(@PathVariable Long id) {
		cidaderepository.deleteById(id);
	}
	
}
