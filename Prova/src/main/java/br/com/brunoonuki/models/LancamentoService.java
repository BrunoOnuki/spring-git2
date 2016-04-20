package br.com.brunoonuki.models;

import java.util.List;

public interface LancamentoService {
	List <Lancamento> obterTodos();
	void cadastrar (Lancamento l);
}
