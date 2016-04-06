package br.com.brunoonuki.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import br.com.brunoonuki.models.*;

import br.com.brunoonuki.models.ProdutoService;

@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping("/produtos")
	public String todos(Model model) {
		model.addAttribute ("produtos", produtoService.obterTodos());
		return "produtos";
	}
}
