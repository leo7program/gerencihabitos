# Gerenciador de Hábitos!!! (Java)

Projeto desenvolvido em **Java** com foco em **organização de código**, **persistência de usuários** e **boa apresentação de projeto no GitHub**.

👉 **Vitrine do projeto (GitHub Pages):**
[https://leo7program.github.io/gerencihabitos/](https://leo7program.github.io/gerencihabitos/)

---

## Sobre o projeto

O **Gerenciador de Hábitos** é um sistema simples em **linha de comando (CLI)** que permite:

* Registro de usuários
* Login persistente usando **SQLite**
* Gerenciamento básico de hábitos (em memória)

O objetivo do projeto é servir como **base sólida** para futuras expansões, como interface gráfica, relatórios visuais e persistência completa dos hábitos.

---

## Tecnologias utilizadas

* **Java**
* **SQLite** (via JDBC)
* **Programação Orientada a Objetos (POO)**
* **GitHub Pages** (apenas como vitrine do projeto)

---

## Estrutura do projeto

```
GerenciadorHabitos/
 ├─ src/
 │   ├─ Main.java
 │   ├─ Database.java
 │   ├─ UserService.java
 │   └─ HabitMenu.java
 ├─ users.db
 ├─ index.html   (vitrine do projeto)
 └─ README.md
```

---

## Persistência de dados

* O sistema utiliza **SQLite** para armazenar:

  * Usuário
  * Senha

📌 Os hábitos ficam em memória nesta versão, mantendo o projeto simples e focado em arquitetura.

---

##  Como executar o projeto???

1. Clone o repositório:

```bash
git clone https://github.com/leo7program/gerencihabitos.git
```

2. Abra o projeto em sua IDE Java (IntelliJ, Eclipse, VS Code)
3. Execute a classe `Main.java`

---


---

## 👨‍💻 Autor

Desenvolvido por **Leo7program**
Projeto em Java para fins de estudo e portfólio.
