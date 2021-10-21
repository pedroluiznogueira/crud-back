package com.angularspring.crud.service;

import com.angularspring.crud.model.Produto;
import com.angularspring.crud.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    // injeção de dependência
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public void createProduto(Produto produto) {
        produtoRepository.save(produto);
    }
}
