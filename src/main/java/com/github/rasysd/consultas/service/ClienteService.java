package com.github.rasysd.consultas.service;

import com.github.rasysd.consultas.model.Cliente;
import com.github.rasysd.consultas.repository.ClienteRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;
    private final PasswordEncoder passwordEncoder;

    public ClienteService(ClienteRepository clienteRepository, PasswordEncoder passwordEncoder) {
        this.clienteRepository = clienteRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Cliente cadastrarCliente(Cliente cliente){
        String senhaSegura = this.passwordEncoder.encode(cliente.getSenha());
        cliente.setSenha(senhaSegura);
        return this.clienteRepository.save(cliente);
    }

}