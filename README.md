# cepJava


Java 11
JPA
Spring 2.7.2

Documentação para utilização da api

Authentication

No momento não é preciso autenticação para fazer requisições a esta API.

**INSTRUÇÕES PARA EXECUTAR A API.
**Crie uma imagem do banco POSTGRES, com os seguintes comandos:
Criar imagem do banco: docker pull postgres
Listar imagens: docker images
Criar o container e exportar a porta para ser usada:
docker run --name nome-do-banco -e POSTGRES_PASSWORD=suaSeha -d -p 5432:5432 postgres
Para saber o ID do container criado: docker ps -a
Depois entre no bash: docker exec -it ''id do container'' bash
Entrar no postgres: psql -U postgres
Criar base de dados: CREATE DATABASE nome-da-base;
Caso queira ajuda com a imagem: https://www.youtube.com/watch?v=ILF3gqXCtbE
Depois de criado, abra um terminal e coloque o container para rodar: docker start nome-do-banco
Estou usando o DBEAVER para acessar o banco, no vídeo acima tem explicando como configurar o banco para acessar a porta do container do postgres.
Estou usando o Intelijj para o back-end. Configure a porta e usuario do banco no seu properties.
Execute a API.
Estou usando o Postman para testes automatizados.
Error Codes
200 – OK

Requisição bem-sucedida. Irá retornar o resultado da função associada à requisição.

201– Created

Requisição de POST bem-sucedida. Irá retornar o item criado.

400 – Bad Request

Dados enviados de forma incorreta ou fora do padrão.

403 – Forbidden

Sem autorização suficiente para acessar o recurso desejado. Utilizado quando o usuário tenta alterar um item não permitido.

404 – Not Found

Requisição não encontrada.

405 – Method Not Allowed

Método não permitido.
