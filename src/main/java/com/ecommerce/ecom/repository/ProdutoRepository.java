package com.ecommerce.ecom.repository;

import com.ecommerce.ecom.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}