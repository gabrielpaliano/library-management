# Sistema de Gerenciamento de Biblioteca

![Java](https://img.shields.io/badge/Java-24-blue) ![Licença](https://img.shields.io/badge/Licença-MIT-green)

Uma aplicação simples baseada em Java para gerenciar uma biblioteca, permitindo cadastrar livros, gerenciar devoluções e consultar dados da biblioteca. Este projeto foi desenvolvido para praticar conceitos fundamentais de Java, como programação orientada a objetos, coleções e interação com o usuário via console.

## Sumário
- [Funcionalidades](#funcionalidades)
- [Pré-requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Uso](#uso)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Melhorias Futuras](#melhorias-futuras)
- [Contribuição](#contribuição)
- [Problemas e Sugestões](#problemas-e-sugestões)
- [Licença](#licença)
- [Autor](#autor)

## Funcionalidades
- **Gerenciamento de Livros**: Adicionar, remover e listar livros com detalhes como título, autor, ISBN e status de disponibilidade.

## Pré-requisitos
- Java Development Kit (JDK) 17 ou superior.
- Um editor de texto ou IDE (ex.: IntelliJ IDEA, Eclipse, VS Code).
- Conhecimento básico de Java e uso da linha de comando.
- Git (opcional, para clonar o repositório).

## Instalação
1. Clone o repositório para sua máquina local:
   ```bash
   git clone https://github.com/gabrielpaliano/library-management.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd library-management
   ```
3. Compile os arquivos Java:
   ```bash
   javac Main.java
   ```
4. Execute a aplicação:
   ```bash
   java Main
   ```

## Uso
1. Ao executar o programa, um menu interativo será exibido no console.
2. Selecione uma opção digitando o número correspondente:
   - `1`: Adicionar um novo livro (informe título, autor e ISBN).
   - `2`: Listar todos os livros cadastrados.
   - `3`: Sair do programa.
3. Siga as instruções exibidas no console para interagir com o sistema.

### Exemplo de Saída
Ao listar livros:
```
Título: Dom Casmurro, Autor: Machado de Assis, ISBN: 123456789, Disponível: true
Título: 1984, Autor: George Orwell, ISBN: 456789123, Disponível: false
```

## Estrutura do Projeto
```
library-management/
├── src/
│   ├── Main.java          # Classe principal com o menu interativo
│   ├── Livro.java         # Classe que representa um livro
│   ├── Biblioteca.java    # Classe que gerencia a coleção de livros
└── README.md              # Documentação do projeto
```

## Melhorias Futuras
- Adicionar persistência de dados usando arquivos (ex.: CSV, JSON ou serialização).
- Implementar uma interface gráfica com Swing ou JavaFX.
- Adicionar suporte para datas de empréstimo e multas por atraso.
- Gerar relatórios (ex.: livros mais emprestados).
- Introduzir categorias de livros ou papéis de usuário (ex.: estudante, bibliotecário).

## Contribuição
Contribuições são bem-vindas! Para contribuir:
1. Faça um fork do repositório.
2. Crie uma nova branch: `git checkout -b minha-funcionalidade`.
3. Faça commit das suas alterações: `git commit -m "Adiciona minha funcionalidade"`.
4. Envie para a branch remota: `git push origin minha-funcionalidade`.
5. Abra um Pull Request.

Certifique-se de que seu código segue o estilo do projeto e inclui comentários apropriados.

## Problemas e Sugestões
Encontrou um bug ou tem uma sugestão? Por favor, abra uma issue no [repositório do GitHub](https://github.com/gabrielpaliano/library-management/issues).

## Licença
Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Autor
- **Gabriel Paliano** - [Perfil no GitHub](https://github.com/gabrielpaliano)
