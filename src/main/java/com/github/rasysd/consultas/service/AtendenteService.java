package com.github.rasysd.consultas.service;

import com.github.rasysd.consultas.model.Atendente;
import com.github.rasysd.consultas.repository.AtendenteRepository;
import org.springframework.stereotype.Service;

@Service
public class AtendenteService {
    private final AtendenteRepository atendenteRepository;

    public AtendenteService(AtendenteRepository atendenteRepository) {
        this.atendenteRepository = atendenteRepository;
    }

    public Atendente cadastrarAtendente(Atendente atendente) {
        return this.atendenteRepository.save(atendente);
    }
}
