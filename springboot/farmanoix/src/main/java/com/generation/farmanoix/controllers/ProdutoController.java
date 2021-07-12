package com.generation.farmanoix.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.farmanoix.models.Produto;
import com.generation.farmanoixrepository.ProdutoRepository;


@RestController
@RequestMapping("/api/v1/produto")
@CrossOrigin("*")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repository;

	@GetMapping // buscar todos os itens
	public ResponseEntity<List<Produto>> findAllProduto() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}") // buscar item por ID
	public ResponseEntity<Produto> findByIdProduto(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/nome/{nome}") // buscar por nome
	public ResponseEntity<List<Produto>> findAllByNome(@PathVariable String nome) {
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}

	@PostMapping // postar produto
	public ResponseEntity<Produto> postProduto(@RequestBody Produto produto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}

	@PutMapping // alterar/atualizar produto
	public ResponseEntity<Produto> putProduto(@RequestBody Produto produto) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(produto));
	}

	@DeleteMapping("/{id}") // deletar por id
	public void deleteProduto(@PathVariable long id) {
		repository.deleteById(id);
	}

}
