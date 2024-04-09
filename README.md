# Sistema de ingressos de um cinema

## Requisitos funcionais

### Administrativo

- [] Usuário com perfil ADMINISTRADOR poderá listar, criar, editar e inativar todas as demais entidades do sistema;
- [] Usuário com perfil OPERADOR poderá listar, criar, editar e inativar filmes, sessões;
- [] Ao incluir uma sessões para um filme, o sistema deverá gerar a os ingressos para a sessão;
- [] O sistema possui a gestão de filmes, sessões, salas, poltronas e ingressos;
- [] O ingresso deverá conter a modalidade de venda (meia, inteira, cortesia, etc);
- [] Os filmes devem conter nome, sinopse, imagem, descrição, duração, classificação indicativa, gênero e diretor;
- [] As sessões devem conter data, horário, filme, sala e poltronas;

### Vendas
- [] O sistema deverá permitir a venda de ingressos para uma sessão;
- [] O sistema deverá cadastrar um cliente no ato da venda do ingresso. Deverá salvar o nome, cpf, telefone e email do cliente;
- [] O sistema deverá permitir a venda de mais de um ingresso por cliente;
- [] Ao final da venda, o sistema deve notificar o usuário com um email com as informações necessárias.
- [] O cliente não possui acesso ao sistema, apenas o operador e administrador.
