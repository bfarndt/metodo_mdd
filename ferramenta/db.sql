CREATE TABLE usuario (
    id bigserial NOT NULL,
    nome text NOT NULL,
    email text NOT NULL,
    senha text NOT NULL,
    ativo boolean DEFAULT true,

    CONSTRAINT usuario_pkey PRIMARY KEY (id)
);

CREATE TABLE passos_metodo (
    id bigserial NOT NULL,
    nome text NOT NULL,
    tipo text,

    CONSTRAINT passos_metodo_pkey PRIMARY KEY (id)
);

CREATE TABLE tarefa (
    id bigserial NOT NULL,
    nome text NOT NULL,
    descricao text,
    tempo_gasto text,
    tempo_estimado text,
    prazo date,
    engloba_modelo boolean DEFAULT false,
    engloba_criacao boolean DEFAULT false,
    engloba_dsl boolean DEFAULT false,
    engloba_template boolean DEFAULT false,
    col_kanban text NOT NULL,
    usuario_id bigint NOT NULL,

    CONSTRAINT tarefa_pkey PRIMARY KEY (id),
    CONSTRAINT tarefa_usuario_fkey FOREIGN KEY (usuario_id)
        REFERENCES usuario (id) MATCH SIMPLE
        ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE TABLE tarefa_passos (
    passos_metodo_id bigint,
    tarefa_id bigint,
    ja_realizada boolean DEFAULT false,

    CONSTRAINT tarefa_passos_pkey PRIMARY KEY (passos_metodo_id, tarefa_id),
    CONSTRAINT tarefa_passos_passos_metodo_fkey FOREIGN KEY (passos_metodo_id)
        REFERENCES passos_metodo (id) MATCH SIMPLE
        ON UPDATE NO ACTION ON DELETE NO ACTION,
    CONSTRAINT tarefa_passos_tarefa_fkey FOREIGN KEY (tarefa_id)
        REFERENCES tarefa (id) MATCH SIMPLE
        ON UPDATE NO ACTION ON DELETE NO ACTION
);

INSERT INTO passos_metodo(nome, tipo) VALUES('Tentar modificar o Modelo de acordo com as necessidades da tarefa e seguindo as defini&ccedil;&otilde;es do Metamodelo.', 'model');
INSERT INTO passos_metodo(nome, tipo) VALUES('Tentar executar novamente a transforma&ccedil;&atilde;o.', 'model');
INSERT INTO passos_metodo(nome, tipo) VALUES('Testar as modifica&ccedil;&otilde;es.', 'model');

INSERT INTO passos_metodo(nome, tipo) VALUES('Desabilitar o "Split JET Editor".', 'criacao');
INSERT INTO passos_metodo(nome, tipo) VALUES('Criar / Editar os arquivos.', 'criacao');
INSERT INTO passos_metodo(nome, tipo) VALUES('Testar as modifica&ccedil;&otilde;es.', 'criacao');

INSERT INTO passos_metodo(nome, tipo) VALUES('Tentar modificar o Metamodelo e sua DSL.', 'dsl');
INSERT INTO passos_metodo(nome, tipo) VALUES('Refazer o deploy do Metamodelo.', 'dsl');
INSERT INTO passos_metodo(nome, tipo) VALUES('Tentar modificar o Modelo de acordo com as necessidades da tarefa e seguindo as novas defini&ccedil;&otilde;es do Metamodelo.', 'dsl');
INSERT INTO passos_metodo(nome, tipo) VALUES('Tentar executar novamente a transforma&ccedil;&atilde;o.', 'dsl');
INSERT INTO passos_metodo(nome, tipo) VALUES('Testar as modifica&ccedil;&otilde;es.', 'dsl');

INSERT INTO passos_metodo(nome, tipo) VALUES('Localizar e abrir os arquivos da IR que precisam ser modificados.', 'template');
INSERT INTO passos_metodo(nome, tipo) VALUES('Utilizando o "Split JET Editor", abrir os templates correspondentes, deixando-os em uma view e os arquivos da IR em outra.', 'template');
INSERT INTO passos_metodo(nome, tipo) VALUES('Modificar e salvar os arquivos de acordo com as necessidades da tarefa.', 'template');
INSERT INTO passos_metodo(nome, tipo) VALUES('Testar as modifica&ccedil;&otilde;es.', 'template');

INSERT INTO usuario(nome, email, senha) VALUES('Bruno Arndt', 'bruno.arndt@dc.ufscar.br', '428366d66ec6cef0cefc4323f3689235');
INSERT INTO usuario(nome, email, senha) VALUES('Daniel Lucrédio', 'dlucredio@gmail.com', '698dc19d489c4e4db73e28a713eab07b');
