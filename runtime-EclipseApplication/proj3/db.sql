
CREATE TABLE daniel
(
	id bigserial,
	cpf text,
	endereco text,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT daniel_pkey PRIMARY KEY (id)
	
);



CREATE TABLE bruno
(
	id bigserial,
	cpf text,
	endereco text,
	nascimento date,
	mensalidade money,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT bruno_pkey PRIMARY KEY (id)
	
);

CREATE TABLE bruno_daniel
(
	id bigserial,
	bruno_id bigint,
	daniel_id bigint,
	created_at timestamp with time zone,
	update_at timestamp with time zone,
	CONSTRAINT bruno_orientador_pkey PRIMARY KEY (id),
	CONSTRAINT bruno_orientador_bruno_fkey FOREIGN KEY (bruno_id)
		REFERENCES bruno (id) MATCH SIMPLE
		ON UPDATE NO ACTION ON DELETE NO ACTION,
	CONSTRAINT bruno_orientador_daniel_fkey FOREIGN KEY (daniel_id)
		REFERENCES daniel (id) MATCH SIMPLE
		ON UPDATE NO ACTION ON DELETE NO ACTION
);

