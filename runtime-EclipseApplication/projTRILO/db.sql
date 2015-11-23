
CREATE TABLE prova
(
	id bigserial NOT NULL,
	pontuacao_maxima integer,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT prova_pkey PRIMARY KEY (id)
);



CREATE TABLE provanomeacao
(
	id bigserial NOT NULL,
	id_prova bigint,
	transcricao text,
	imagem text,
	nome text,
	pontuacao_maxima integer,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT provanomeacao_pkey PRIMARY KEY (id),
		CONSTRAINT provanomeacao_id_prova_fkey FOREIGN KEY (id_prova)
			REFERENCES prova (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	
);



CREATE TABLE provasintaxe
(
	id bigserial NOT NULL,
	id_prova bigint,
	imagem text,
	nome text,
	pontuacao_maxima integer,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT provasintaxe_pkey PRIMARY KEY (id),
		CONSTRAINT provasintaxe_id_prova_fkey FOREIGN KEY (id_prova)
			REFERENCES prova (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	
);



CREATE TABLE provasequencia
(
	id bigserial NOT NULL,
	id_prova bigint,
	pontuacao_maxima integer,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT provasequencia_pkey PRIMARY KEY (id),
		CONSTRAINT provasequencia_id_prova_fkey FOREIGN KEY (id_prova)
			REFERENCES prova (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	
);



CREATE TABLE provasequenciaimagens
(
	id bigserial NOT NULL,
	id_prova_sequencia bigint,
	imagem text,
	ordem integer,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT provasequenciaimagens_pkey PRIMARY KEY (id),
		CONSTRAINT provasequenciaimagens_id_prova_sequencia_fkey FOREIGN KEY (id_prova_sequencia)
			REFERENCES provasequencia (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	
);



CREATE TABLE provaordem
(
	id bigserial NOT NULL,
	id_prova bigint,
	ordem text,
	pontuacao_maxima integer,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT provaordem_pkey PRIMARY KEY (id),
		CONSTRAINT provaordem_id_prova_fkey FOREIGN KEY (id_prova)
			REFERENCES prova (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	
);



CREATE TABLE provaordemimagens
(
	id bigserial NOT NULL,
	id_prova_ordem bigint,
	imagem text,
	correta boolean,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT provaordemimagens_pkey PRIMARY KEY (id),
		CONSTRAINT provaordemimagens_id_prova_ordem_fkey FOREIGN KEY (id_prova_ordem)
			REFERENCES provaordem (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	
);



CREATE TABLE provaabsurdo
(
	id bigserial NOT NULL,
	id_prova bigint,
	imagem text,
	pontuacao_maxima integer,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT provaabsurdo_pkey PRIMARY KEY (id),
		CONSTRAINT provaabsurdo_id_prova_fkey FOREIGN KEY (id_prova)
			REFERENCES prova (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	
);



CREATE TABLE usuario
(
	id bigserial NOT NULL,
	nome text,
	email text,
	email_relatorio text,
	senha text,
	crfa text,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT usuario_pkey PRIMARY KEY (id)
);



CREATE TABLE paciente
(
	id bigserial NOT NULL,
	foto text,
	nome text,
	nome_mae text,
	telefone text,
	data_nasc date,
	qtde_semanas_nasc integer,
	problema_parto text,
	parto_normal boolean,
	gemeos boolean,
	inflamacao_ouvido boolean,
	problemas_respiratorios boolean,
	teve_desnutricao boolean,
	anemia boolean,
	problema_familia_ling text,
	data_cadastro date,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT paciente_pkey PRIMARY KEY (id)
);



CREATE TABLE questionariopais
(
	id bigserial NOT NULL,
	id_paciente bigint,
	troca_sons boolean,
	troca_sons_mesma_idade boolean,
	forma_frases boolean,
	forma_frases_qtde_palavras integer,
	perguntas_pronomes boolean,
	frase_utiliza_artigos boolean,
	frase_correta_tempo_verbal boolean,
	compreende_palavras_frases boolean,
	escolhe_corretamente_palavras boolean,
	conta_historia_coerencia boolean,
	faz_pergunta_coerente boolean,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT questionariopais_pkey PRIMARY KEY (id),
		CONSTRAINT questionariopais_id_paciente_fkey FOREIGN KEY (id_paciente)
			REFERENCES paciente (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	
);



CREATE TABLE triagem
(
	id bigserial NOT NULL,
	id_paciente bigint,
	pontuacao integer,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT triagem_pkey PRIMARY KEY (id),
		CONSTRAINT triagem_id_paciente_fkey FOREIGN KEY (id_paciente)
			REFERENCES paciente (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	
);



CREATE TABLE triagemnomeacao
(
	id bigserial NOT NULL,
	id_triagem bigint,
	id_prova_nomeacao bigint,
	nomeacao text,
	pontuacao integer,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT triagemnomeacao_pkey PRIMARY KEY (id),
		CONSTRAINT triagemnomeacao_id_triagem_fkey FOREIGN KEY (id_triagem)
			REFERENCES triagem (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	,
		CONSTRAINT triagemnomeacao_id_prova_nomeacao_fkey FOREIGN KEY (id_prova_nomeacao)
			REFERENCES provanomeacao (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	
);



CREATE TABLE triagemnomeacaoerrosfonetica
(
	id bigserial NOT NULL,
	id_triagem_nomeacao bigint,
	fonema text,
	tipo_troca text,
	substituicao text,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT triagemnomeacaoerrosfonetica_pkey PRIMARY KEY (id),
		CONSTRAINT triagemnomeacaoerrosfonetica_id_triagem_nomeacao_fkey FOREIGN KEY (id_triagem_nomeacao)
			REFERENCES triagemnomeacao (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	
);



CREATE TABLE triagemsintaxe
(
	id bigserial NOT NULL,
	id_triagem bigint,
	id_prova_sintaxe bigint,
	frase text,
	frase_formulada text,
	utilizou_artigos text,
	utilizou_elem_ligacao text,
	utilizou_adjetivos text,
	pontuacao integer,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT triagemsintaxe_pkey PRIMARY KEY (id),
		CONSTRAINT triagemsintaxe_id_triagem_fkey FOREIGN KEY (id_triagem)
			REFERENCES triagem (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	,
		CONSTRAINT triagemsintaxe_id_prova_sintaxe_fkey FOREIGN KEY (id_prova_sintaxe)
			REFERENCES provasintaxe (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	
);



CREATE TABLE triagemsequencia
(
	id bigserial NOT NULL,
	id_triagem bigint,
	id_prova_sequencia bigint,
	ordenou_corretamente boolean,
	narrou_sequencia boolean,
	narrativa_coerente boolean,
	precisou_ajuda text,
	pontuacao integer,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT triagemsequencia_pkey PRIMARY KEY (id),
		CONSTRAINT triagemsequencia_id_triagem_fkey FOREIGN KEY (id_triagem)
			REFERENCES triagem (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	,
		CONSTRAINT triagemsequencia_id_prova_sequencia_fkey FOREIGN KEY (id_prova_sequencia)
			REFERENCES provasequencia (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	
);



CREATE TABLE triagemordem
(
	id bigserial NOT NULL,
	id_triagem bigint,
	id_prova_ordem bigint,
	acertou boolean,
	pontuacao integer,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT triagemordem_pkey PRIMARY KEY (id),
		CONSTRAINT triagemordem_id_triagem_fkey FOREIGN KEY (id_triagem)
			REFERENCES triagem (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	,
		CONSTRAINT triagemordem_id_prova_ordem_fkey FOREIGN KEY (id_prova_ordem)
			REFERENCES provaordem (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	
);



CREATE TABLE triagemabsurdo
(
	id bigserial NOT NULL,
	id_triagem bigint,
	id_prova_absurdo bigint,
	identificou text,
	pontuacao integer,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT triagemabsurdo_pkey PRIMARY KEY (id),
		CONSTRAINT triagemabsurdo_id_triagem_fkey FOREIGN KEY (id_triagem)
			REFERENCES triagem (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	,
		CONSTRAINT triagemabsurdo_id_prova_absurdo_fkey FOREIGN KEY (id_prova_absurdo)
			REFERENCES provaabsurdo (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	
);


