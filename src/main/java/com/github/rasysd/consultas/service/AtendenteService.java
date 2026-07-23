package com.github.rasysd.consultas.service;

import com.github.rasysd.consultas.model.Atendente;
import com.github.rasysd.consultas.repository.AtendenteRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AtendenteService {
    private final AtendenteRepository atendenteRepository;
    private final PasswordEncoder passwordEncoder;

    public AtendenteService(AtendenteRepository atendenteRepository, PasswordEncoder passwordEncoder) {
        this.atendenteRepository = atendenteRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Atendente cadastrarAtendente(Atendente atendente) {
        String senhaSegura = this.passwordEncoder.encode(atendente.getSenha());
        atendente.setSenha(senhaSegura);
        return this.atendenteRepository.save(atendente);
    }
}
