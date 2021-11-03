package com.example.api.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.models.Produto;
import com.example.api.models.Usuario;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
