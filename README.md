<h1 align="center" style="font-weight: bold;">ApiRestGym 💻</h1>

<h2 id="technologies">💻 Tecnologias</h2>

- Java
- Springboot
- Mysql

<h3>Pré-requisitos</h3>

- Certifique-se de ter o Java JDK instalado em sua máquina.
- Garanta que o MySQL esteja instalado e configurado corretamente.

<h3>Clonando</h3>

Como clonar o projeto

```bash
git clone git@github.com:Leoonpr/ApiRestGym.git
```

<h3>Pasos</h3>

- Abra o projeto no seu IDE
- Configure o Banco de Dados e o application.properties
- Compile e Execute


<h2 id="routes">📍 API Endpoints</h2>
​
| rotas               | descrição                                          
|----------------------|-----------------------------------------------------
| <kbd>GET /atividades</kbd>     | Recupera informações sobre todas as atividades.
| <kbd>GET /atividades/{id}</kbd>     | Recupera detalhes de uma atividade específica pelo ID.
| <kbd>POST /atividades</kbd>     | Atualiza informações para uma atividade específica pelo ID
| <kbd>PUT /atividades</kbd>     | Cria uma nova atividade.
| <kbd>DELETE /atividades/{id}</kbd>     | Exclui uma atividade específica pelo ID.

| rotas               | descrição                                          
|----------------------|-----------------------------------------------------
| <kbd>GET /instrutores</kbd>     | Recupera informações sobre todas os instrutores.
| <kbd>GET /instrutores/{id}</kbd>     | Recupera detalhes de um instrutor específico pelo ID.
| <kbd>POST /instrutores</kbd>     | Atualiza informações para um instrutor específico pelo ID
| <kbd>PUT /instrutores</kbd>     | Cria um novo instrutores.
| <kbd>DELETE /instrutores/{id}</kbd>     | Exclui um instrutores específico pelo ID.


| rotas               | descrição                                          
|----------------------|-----------------------------------------------------
| <kbd>GET /turmas</kbd>     | Recupera informações sobre todas as turmas.
| <kbd>GET /turmas/{id}</kbd>     | Recupera detalhes de uma turma específica pelo ID.
| <kbd>POST /turmas</kbd>     | Atualiza informações para uma turma específica pelo ID
| <kbd>PUT /turmas</kbd>     | Cria uma nova turma.
| <kbd>DELETE /turmas/{id}</kbd>     | Exclui uma turma específica pelo ID.

| rotas               | descrição                                          
|----------------------|-----------------------------------------------------
| <kbd>GET /alunos</kbd>     | Recupera informações sobre todas os alunos.
| <kbd>GET /alunos/{id}</kbd>     | Recupera detalhes de um aluno específico pelo ID.
| <kbd>POST /alunos</kbd>     | Atualiza informações para um aluno específico pelo ID
| <kbd>PUT /alunos</kbd>     | Cria um novo aluno.
| <kbd>DELETE /alunos/{id}</kbd>     | Exclui um aluno específico pelo ID.
