package br.com.brunoonuki.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class NaMemoriaLancamentoRepository implements LancamentoRepository{

	private static List<Lancamento> lancamentos = new ArrayList<>();
	
	@Override
	public List<Lancamento> obterTodos() {
		// TODO Auto-generated method stub
		return lancamentos;
	}

	@Override
	public void inserir(Lancamento lancamento) {
		// TODO Auto-generated method stub
		long novoId;
		
		if (lancamentos.size() > 0) {
			Comparator <Lancamento> cmp;
			cmp = Comparator.comparing(Lancamento::getId);
			novoId = lancamentos.stream()
								.max(cmp)
								.get()
								.getId() + 1;
		}
		else {
			novoId = 1;
		}
		
		lancamento.setId(novoId);
		lancamentos.add(lancamento);
	}
	
}
