package com.github.rasysd.consultas.repository;

import com.github.rasysd.consultas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
