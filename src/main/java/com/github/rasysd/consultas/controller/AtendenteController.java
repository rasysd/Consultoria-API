package com.github.rasysd.consultas.controller;

import com.github.rasysd.consultas.model.Atendente;
import com.github.rasysd.consultas.service.AtendenteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atendentes")
public class AtendenteController {
    private final AtendenteService atendenteService;

    public AtendenteController(AtendenteService atendenteService) {
        this.atendenteService = atendenteService;
    }

    @PostMapping
    public Atendente cadastrarAtendente(@RequestBody Atendente atendente) {
        return this.atendenteService.cadastrarAtendente(atendente);
    }
}
