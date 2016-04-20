package br.com.brunoonuki.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.brunoonuki.ModelsViews.LancamentoModelView;
import br.com.brunoonuki.models.LancamentoService;

@Controller
public class LancamentoController {
	
	@Autowired
	private LancamentoService lancamentoService;	
	
	@RequestMapping ("/lancamentos")
	public String lancamentos(Model model) {
		model.addAttribute("lancamentos", lancamentoService.obterTodos());
		return "lancamentos";
	}
	
	@RequestMapping (value="/lancamentos/novo", method=RequestMethod.POST)
	public String cadastrar (LancamentoModelView lancamentomv, BindingResult bindingResult) {
		lancamentoService.cadastrar(lancamentomv.getLancamento());
		return "redirect:/lancamentos/novo-sucesso";
	}
	
	@RequestMapping ("/lancamentos/novo-sucesso") 
	public String novoSucesso() {
		return "lancamento-novo-sucesso";
	}
	
	
	
	
}
