package br.piu.entregaveis.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex2")
public class Exercicio2Controller 
{
	@GetMapping("/{temperatura}")
	public float temp(@PathVariable float temperatura) 
	{
		
		return ((temperatura-32)*5)/8;
	}
}
