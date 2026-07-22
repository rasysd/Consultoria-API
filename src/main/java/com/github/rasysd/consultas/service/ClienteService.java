package com.github.rasysd.consultas.service;

import com.github.rasysd.consultas.model.Cliente;
import com.github.rasysd.consultas.repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente cadastrarCliente(Cliente cliente){
        return this.clienteRepository.save(cliente);
    }

}