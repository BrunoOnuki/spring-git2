package br.com.brunoonuki.models;

import java.util.List;

public interface LancamentoRepository {
	List <Lancamento> obterTodos();

	void inserir (Lancamento lancamento);
}
