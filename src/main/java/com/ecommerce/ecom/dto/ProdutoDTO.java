package com.ecommerce.ecom.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data // Gera getters, setters, toString, equals e hashCode
@NoArgsConstructor // Gera um construtor vazio
@AllArgsConstructor // Gera um construtor com todos os campos
public class ProdutoDTO {
    private Long id;

    @NotBlank(message = "O nome do produto é obrigatório")
    private String nome;

    @Size(max = 255, message = "A descrição não pode ultrapassar 255 caracteres")
    private String descricao;

    private BigDecimal preco;

    @Min(value = 0, message = "O estoque não pode ser negativo")
    private int estoque;
}