package com.ecommerce.ecom.controller;

import com.ecommerce.ecom.dto.ProdutoDTO;
import com.ecommerce.ecom.service.ProdutoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
@RequiredArgsConstructor // Gera um construtor com todos os campos final/NonNull
public class ProdutoController {

    private final ProdutoService produtoService; // Remova o @Autowired

    @GetMapping
    public List<ProdutoDTO> getAllProdutos() {
        return produtoService.getAllProdutos();
    }

    @GetMapping("/{id}")
    public ProdutoDTO getProdutoById(@PathVariable Long id) {
        return produtoService.getProdutoById(id);
    }

    @PostMapping
    public ProdutoDTO createProduto(@Valid @RequestBody ProdutoDTO produtoDTO) {
        return produtoService.createProduto(produtoDTO);
    }

    @PutMapping("/{id}")
    public ProdutoDTO updateProduto(@PathVariable Long id, @Valid @RequestBody ProdutoDTO produtoDTO) {
        return produtoService.updateProduto(id, produtoDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable Long id) {
        produtoService.deleteProduto(id);
    }
}