package com.listmaster.listMaster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.listmaster.listMaster.model.ListaDeCompras;
import com.listmaster.listMaster.repository.ListaDeComprasRepository;
import com.listmaster.listMaster.repository.ProdutoRepository;

@RestController
@RequestMapping("/listaDeCompras")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ListaDeComprasController {
	
	@Autowired
	private ListaDeComprasRepository listaDeComprasRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public ResponseEntity<List<ListaDeCompras>> getAll(){
		return ResponseEntity.ok(listaDeComprasRepository.findAll());
	}

}
