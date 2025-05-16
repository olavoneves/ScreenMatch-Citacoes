package br.com.screenmatch.repository;

import br.com.screenmatch.model.Citacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CitacaoRepository extends JpaRepository<Citacao, Long> {

    @Query("SELECT c FROM Citacao c ORDER BY FUNCTION('RANDOM') LIMIT 1")
    Citacao buscaFrase();
}
