# Bootstrap Exercise - Spring Boot Application

## 📋 Descrição do Projeto

Este é um projeto demonstrativo de uma aplicação web Spring Boot que utiliza Bootstrap 5 para criar uma página responsiva com o tema "Wild & Wacky Vegetables" (Vegetais Selvagens e Malucos). O projeto foi desenvolvido como exercício educacional para demonstrar a integração entre Spring Boot, Thymeleaf e Bootstrap.

## 🛠️ Tecnologias Utilizadas

- **Java 18** - Linguagem de programação
- **Spring Boot 2.7.3** - Framework para aplicações Java
  - Spring Web - Para criação de endpoints web
  - Spring Boot Actuator - Para monitoramento da aplicação
  - Thymeleaf - Template engine para renderização de páginas HTML
  - Spring Boot DevTools - Para desenvolvimento com hot reload
- **Bootstrap 5.2.1** - Framework CSS para design responsivo
- **Maven** - Gerenciador de dependências e build
- **Lombok** - Para reduzir código boilerplate

## 📁 Estrutura do Projeto

```
bootstrapexercicio/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/professorangoti/bootstrap/
│   │   │       ├── BootstrapApplication.java      # Classe principal
│   │   │       └── HomeController.java            # Controller com endpoint
│   │   └── resources/
│   │       ├── templates/
│   │       │   └── home.html                      # Página principal com Bootstrap
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/professorangoti/bootstrap/
│               └── BootstrapApplicationTests.java
├── pom.xml                                         # Configurações Maven
└── README.md
```

## ✨ Funcionalidades

A aplicação demonstra diversos componentes do Bootstrap 5:

- **Layout Responsivo**: Uso do sistema de grid (container, row, col)
- **Navegação**: Lista de links de navegação estilizados
- **Formulários**: Campo de busca com input e botão
- **Tabelas**: Tabela estilizada com listras (table-striped)
- **Cards**: Cards com imagens e conteúdo
- **Tipografia**: Títulos e parágrafos estilizados

### Componentes Bootstrap Implementados:

1. **Grid System**: Layout com 3 colunas (sidebar) e 9 colunas (conteúdo principal)
2. **Navigation**: Links sem decoração usando classe `text-decoration-none`
3. **Forms**: Formulário com input de texto e botão primário
4. **Tables**: Tabela com cabeçalho e linhas alternadas
5. **Cards**: Cards com imagens, títulos e texto descritivo
6. **Utility Classes**: Margens (mt-1, mb-3) e outras classes utilitárias

## 🔧 Pré-requisitos

- Java JDK 18 ou superior
- Maven 3.6+ (ou usar o wrapper mvnw incluído)
- Navegador web moderno

## 🚀 Como Executar

### Usando Maven Wrapper (Recomendado)

```bash
# No Linux/Mac
./mvnw spring-boot:run

# No Windows
mvnw.cmd spring-boot:run
```

### Usando Maven Instalado

```bash
mvn spring-boot:run
```

### Executando os Testes

```bash
./mvnw test
```

### Build do Projeto

```bash
./mvnw clean package
```

O arquivo JAR será gerado em `target/bootstrap-0.0.1-SNAPSHOT.jar`

## 🌐 Acessando a Aplicação

Após iniciar a aplicação, acesse:

```
http://localhost:8080/exercicio-bootstrap
```

## 📡 Endpoints

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/exercicio-bootstrap` | Renderiza a página principal com exemplos Bootstrap |

## 🎨 Detalhes da Página

A página `home.html` apresenta:

- **Sidebar** (col-3): 
  - Lista de vegetais favoritos
  - Formulário de busca de receitas
  
- **Conteúdo Principal** (col-9):
  - Título principal
  - Tabela de vegetais e doenças
  - Parágrafos informativos sobre vegetais
  - Grid de 3 cards com imagens

## 👤 Autor

Professor Angoti (professorangoti)

## 📝 Observações

- Este é um projeto educacional demonstrativo
- A aplicação usa CDN para carregar o Bootstrap
- O formulário de busca é apenas ilustrativo (sem funcionalidade backend)
- As imagens nos cards são carregadas de URLs externas

## 🔗 Links Úteis

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Bootstrap Documentation](https://getbootstrap.com/docs/5.2/getting-started/introduction/)
- [Thymeleaf Documentation](https://www.thymeleaf.org/documentation.html)
