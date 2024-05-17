<h1 align="center">
Avaliação Prática de Java 
</h1>

<p align="center">
  Desenvolver tanto a API quanto o front-end (Spring boot e VueJs no front, caso não tenha 
conhecimentos de VueJs, pode ser feito o front com angular). Utilizar a versão 11 do java. 
</p>

## Requisitos
### Backend
- Git instalado - [**Download**](https://git-scm.com/downloads).
- JDK 17 instalado - [**Download**](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html).

### Frontend
- Node.js v18.14.1 instalado - [**Download**](https://nodejs.org/en/download/prebuilt-installer)

## Baixando o Projeto
``` bash
  # Clonar o projeto:
  $ git clone https://github.com/diasRibeirao/avaliacao-globalti.git
```


## Iniciando Backend
``` bash
  # Entrar no diretório do projeto:
  $ cd avaliacao-globalti
  $ cd avaliacao-globalti-back
```

## Executando o Projeto
```bash
  # Instalar as dependências:
  $ mvn clean install 

  # Rodar a aplicação:
  $ mvn spring-boot:run

  # Rodar a aplicação com o CMD:
  $ Executar o seguinte comando: java -jar target/avaliacao-globalti-back-0.0.1-SNAPSHOT.jar

```

## Banco de Dados

#### [**http://localhost:8081/api/h2-console/login.jsp**](http://localhost:8081/api/h2-console/login.jsp)
```bash
 spring.datasource.driverClassName=org.h2.Driver
 spring.datasource.url=jdbc:h2:mem:globaltidb
 spring.datasource.username=sa
 spring.datasource.password=
```

## Documentação Online

#### [**http://localhost:8081/api/swagger-ui/index.html**](http://localhost:8081/api/swagger-ui/index.html)

![image](https://github.com/diasRibeirao/avaliacao-globalti/assets/29930488/945c9386-0372-4a4c-b14b-be67637a6e38)

<br /><br />

## Iniciando Frontend
``` bash
  # Ir ao diretório onde baixou/clonou o projeto principal
  # Abrir outro prompt
  # Entrar no diretório do projeto:
  $ cd avaliacao-globalti
  $ cd avaliacao-globalti-back
```

## Executando o Projeto
```bash
  # Instalar as dependências:
  $ npm install 

  # Rodar a aplicação:
  $ npm run serve
  
  #Acessar o sistema
  $ http://localhost:8080/

```
![image](https://github.com/diasRibeirao/avaliacao-globalti/assets/29930488/759c833d-7287-4184-8f7a-ede137c18fd5)


<br /><br />
Emerson Dias de Oliveira<br />
https://github.com/diasRibeirao
