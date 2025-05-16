package br.com.screenmatch.model;

import jakarta.persistence.*;

@Entity
@Table(name = "citacoes")
public class Citacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String frase;
    private String personagem;
    private String poster;

    public Citacao() {
    }

    public Citacao(Long id, String titulo, String frase, String personagem, String poster) {
        this.id = id;
        this.titulo = titulo;
        this.frase = frase;
        this.personagem = personagem;
        this.poster = poster;
    }

    public Long getId() {
        return id;
    }

    public Citacao setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public Citacao setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getFrase() {
        return frase;
    }

    public Citacao setFrase(String frase) {
        this.frase = frase;
        return this;
    }

    public String getPersonagem() {
        return personagem;
    }

    public Citacao setPersonagem(String personagem) {
        this.personagem = personagem;
        return this;
    }

    public String getPoster() {
        return poster;
    }

    public Citacao setPoster(String poster) {
        this.poster = poster;
        return this;
    }
}
