# nfe-upload-service - Aplicação responsável por receber o upload de arquivos xmls de notas fiscais.

### Pré-Requisitos *obrigatórios*:
 - Git
 - JDK 11+
 - Maven 3.8.1

## Rodar a aplicação em modo de desenvolvimento

## Maven

Use o seguinte comando para iniciar o servidor:<br/>
<small>Obs: Esse comando deve ser executado na _raiz_ do projeto!</small>
```shell script
./mvnw clean compile quarkus:dev
```
## Criar diretório input no caminho:

Ex: "/home/user/arquivos/input"

## Configurar no application.properties as variáveis abaixo e atribuir para uploads-directory o diretório de input criado acima que será utilizado 
## tanto para entrada dos arquivos de upload quanto para o processamento dos arquivos.

quarkus.http.body.uploads-directory=/home/user/arquivos/input

#### Alguns guias relacionados:
- Maven ([guia](https://maven.apache.org/what-is-maven.html))
- RESTEasy JAX-RS ([guia](https://docs.jboss.org/resteasy/docs/3.0.9.Final/userguide/html_single/index.html))
