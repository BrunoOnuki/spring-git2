package br.com.brunoonuki.models;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LancamentoServiceImpl implements LancamentoService{

	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@Override
	public List<Lancamento> obterTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cadastrar(Lancamento l) {
		// TODO Auto-generated method stub
		lancamentoRepository.inserir(l);
	}
	
	
	
}
