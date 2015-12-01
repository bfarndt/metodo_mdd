
CREATE TABLE medico
(
	id bigserial NOT NULL,
	nome text NOT NULL,
	crm text,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT medico_pkey PRIMARY KEY (id)
);



CREATE TABLE paciente
(
	id bigserial NOT NULL,
	nome text NOT NULL,
	cpf text NOT NULL,
	data_nasc date,
	endereco text,
	cidade text,
	estado text,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT paciente_pkey PRIMARY KEY (id)
);



CREATE TABLE medicamento
(
	id bigserial NOT NULL,
	nome text,
	fabricante text,
	composicao text,
	generico boolean,
	custo money,
	medico bigint,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT medicamento_pkey PRIMARY KEY (id),
		CONSTRAINT medicamento_medico_fkey FOREIGN KEY (medico)
			REFERENCES medico (id) MATCH SIMPLE
			ON UPDATE NO ACTION ON DELETE NO ACTION
	
);


