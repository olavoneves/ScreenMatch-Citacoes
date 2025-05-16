package br.com.screenmatch.controller;

import br.com.screenmatch.dto.CitacaoDTO;
import br.com.screenmatch.service.CitacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class CitacaoController {

    @Autowired
    private CitacaoService service;

    @GetMapping("/frases")
    public CitacaoDTO obterCitacao() {
        return service.obterCitacao();
    }
}
