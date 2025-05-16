package br.com.screenmatch.service;

import br.com.screenmatch.dto.CitacaoDTO;
import br.com.screenmatch.model.Citacao;
import br.com.screenmatch.repository.CitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitacaoService {

    @Autowired
    private CitacaoRepository citacaoRepository;

    public CitacaoDTO obterCitacao() {
        Citacao citacao = citacaoRepository.buscaFrase();
        return new CitacaoDTO(citacao.getTitulo(), citacao.getFrase(), citacao.getPersonagem(), citacao.getPoster());
    }
}
