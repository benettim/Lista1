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

import br.piu.entregaveis.Models.IndividuoModel;
import br.piu.entregaveis.Repositories.IndividuoRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/ex6")
public class Exercicio6Controller {
	
	@Autowired
	private IndividuoRepository individuorepository;
	
	@GetMapping("/listar6")
	public List<IndividuoModel> listar(){
		return individuorepository.findAll();
	}
	
	@GetMapping("/listar6/{tipo}")
	public List<IndividuoModel> listaTipo(@PathVariable String tipo){
		return individuorepository.findByTipo(tipo);
	}
	
	@PostMapping("/cadastrar6")
	public IndividuoModel cadastrar(@RequestBody IndividuoModel individuo) {
		return individuorepository.save(individuo);
	}
	
	@PutMapping("/alterar6/{id}")
	public IndividuoModel alterar(@PathVariable Long id, @RequestBody IndividuoModel individuo) {
		IndividuoModel individuomodel = individuorepository.getOne(id);
		if(individuomodel == null) return null;
		individuomodel.setNome(individuo.getNome());
		individuomodel.setTipo(individuo.getTipo());
		return individuorepository.save(individuomodel);
	}
	
	@DeleteMapping("/delete6/{id}")
	public void deletar(@PathVariable Long id) {
		individuorepository.deleteById(id);
	}
	
}
