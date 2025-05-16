# ScreenMatch - Citações 🎬✨

Um projeto full stack desenvolvido para exibir citações de filmes/séries, integrando uma API REST em Java (Spring Boot) com um front-end dinâmico.  

🔗 **Live Demo**: [Em breve...](#) *(Sujeito a deploy futuro)*  

## 🚀 Tecnologias  
### Back-end  
- **Java 17** + **Spring Boot 3**  
- **PostgreSQL** (Persistência de dados)  
- **Spring Data JPA** (Abstração de queries)  
- **DTOs** (Padrão Data Transfer Object)  
- **CORS** (Configuração para comunicação cross-origin)  
- **Tomcat** (Servidor embutido)  

### Front-end  
- **JavaScript** (Fetch API para consumo de dados)  
- **HTML/CSS** (Interface responsiva)  

## 🔍 Arquitetura do Projeto  
### Back-end (API RESTful)  
✔ **Controllers**: Endpoints mapeados com `@RestController` para operações CRUD.  
✔ **Services**: Lógica de negócio isolada em classes `@Service`.  
✔ **DTOs**: Proteção da camada de domínio e serialização customizada.  
✔ **Tratamento de Erros**: Exceções personalizadas para respostas claras.  
✔ **CORS**: Configurado para aceitar requisições do front-end.  

### Front-end  
✔ Consumo assíncrono da API via `fetch()`.  
✔ Renderização dinâmica dos dados recebidos.  

## 📌 Features Implementadas  
✅ Listagem de citações  
✅ Feedback visual para ações do usuário  

## 🛠 Desafios e Soluções  
- **CORS**: Ajuste manual para permitir comunicação entre ambientes distintos.  
- **DTOs**: Evitar exposição de IDs e campos sensíveis na API.  
- **Otimização de Queries**: Uso de `@Query` no JPA para consultas eficientes.  

## 🔜 Próximos Passos  
- [ ] Implementar autenticação via **JWT**  
- [ ] Deploy em cloud (**AWS/Heroku**)  
- [ ] Adicionar testes unitários (JUnit/Mockito)  

## 🙌 Agradecimentos  
Projeto desenvolvido como parte de um desafio proposto por **Jacqueline Oliveira** e **Iasmin Araújo** (Alura).  

---

