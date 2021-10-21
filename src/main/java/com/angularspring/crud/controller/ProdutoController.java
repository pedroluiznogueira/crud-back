package com.angularspring.crud.controller;

import com.angularspring.crud.model.Produto;
import com.angularspring.crud.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoController {

    // injeção de dependência
    @Autowired
    private ProdutoService produtoService;

    // requisição Get
    @GetMapping
    public List<Produto> getAll() {
        return produtoService.listarProdutos();
    }
}
