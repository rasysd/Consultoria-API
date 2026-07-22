package com.github.rasysd.consultas.controller;

import com.github.rasysd.consultas.model.Cliente;
import com.github.rasysd.consultas.service.ClienteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    @PostMapping
    public Cliente cadastrarCliente (@RequestBody Cliente cliente) {
        return this.clienteService.cadastrarCliente(cliente);
    }
}
