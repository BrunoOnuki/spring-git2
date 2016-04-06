package br.com.brunoonuki.models;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository
public class NaMemoriaProdutoRepository implements ProdutoRepository {

private static List<Produto> produtos = new ArrayList<>();

	static {
		produtos.add(new Produto());
		produtos.get(0).setId(1L);
		produtos.get(0).setNome("Tablet Samsuung");
		produtos.get(0).setPreco(899.00);
		
		produtos.add(new Produto());
		produtos.get(1).setId(2L);
		produtos.get(1).setNome("Celular Iphone 5s");
		produtos.get(1).setPreco(4_500.00);
		
		produtos.add(new Produto());
		produtos.get(1).setId(3L);
		produtos.get(1).setNome("Livro Java Como Programar");
		produtos.get(1).setPreco(400.00);
	}

	@Override
	public java.util.List<Produto> obterTodos() {
		// TODO Auto-generated method stub
		return produtos;
	}
}
