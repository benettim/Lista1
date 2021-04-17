package br.piu.entregaveis.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex3")
public class Exercicio3Controller 
{
	@GetMapping
	public String num(float numero) 
	{
		if(numero%2==0) return "Par";
		else return "Impar";
	}
}
