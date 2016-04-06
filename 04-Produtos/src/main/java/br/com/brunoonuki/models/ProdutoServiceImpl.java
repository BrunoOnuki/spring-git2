package br.com.brunoonuki.models;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	
	@Autowired
	private ProdutoDAO produtoDAO;
	
	@Override
	public List<Produto> obterTodos() {
		// TODO Auto-generated method stub
		return produtoDAO.obterTodos();
	}

}
