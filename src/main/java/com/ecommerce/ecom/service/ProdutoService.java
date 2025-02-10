package com.ecommerce.ecom.service;

import com.ecommerce.ecom.dto.ProdutoDTO;
import com.ecommerce.ecom.model.Produto;
import com.ecommerce.ecom.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor // Gera um construtor com todos os campos final/NonNull
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public List<ProdutoDTO> getAllProdutos() {
        return produtoRepository.findAll().stream()
                .map(this::convertToDTO)
                .toList();
    }

    public ProdutoDTO getProdutoById(Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.map(this::convertToDTO).orElse(null);
    }

    public ProdutoDTO createProduto(ProdutoDTO produtoDTO) {
        Produto produto = convertToEntity(produtoDTO);
        produto = produtoRepository.save(produto);
        return convertToDTO(produto);
    }

    public ProdutoDTO updateProduto(Long id, ProdutoDTO produtoDTO) {
        Produto produto = produtoRepository.findById(id).orElseThrow();
        produto.setNome(produtoDTO.getNome());
        produto.setDescricao(produtoDTO.getDescricao());
        produto.setPreco(produtoDTO.getPreco());
        produto.setEstoque(produtoDTO.getEstoque());
        produto = produtoRepository.save(produto);
        return convertToDTO(produto);
    }

    public void deleteProduto(Long id) {
        produtoRepository.deleteById(id);
    }

    private ProdutoDTO convertToDTO(Produto produto) {
        ProdutoDTO dto = new ProdutoDTO();
        dto.setId(produto.getId());
        dto.setNome(produto.getNome());
        dto.setDescricao(produto.getDescricao());
        dto.setPreco(produto.getPreco());
        dto.setEstoque(produto.getEstoque());
        return dto;
    }

    private Produto convertToEntity(ProdutoDTO dto) {
        Produto produto = new Produto();
        produto.setNome(dto.getNome());
        produto.setDescricao(dto.getDescricao());
        produto.setPreco(dto.getPreco());
        produto.setEstoque(dto.getEstoque());
        return produto;
    }
}