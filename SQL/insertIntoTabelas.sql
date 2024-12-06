select * from estados

INSERT into cidades (nome, area, estado_id)
VALUES ('São Paulo', 795,25)

INSERT into cidades (nome, area, estado_id)
VALUES ('Rio de Janeiro', 133.9,19)

INSERT INTO cidades 
	(nome, area, estado_id)
VALUES('Caruaru',
		920.6, 
        (select id from estados where sigla = "PE")
        ) -- Inserir valor de nome area e estado_id(estado_id será definido o id da 
		  -- tabela estados onde a sigla seja "PE"
          
INSERT INTO cidades 
	(nome, area, estado_id)
VALUES ('Juazeiro do Norte',
		248.2,
		(select id from estados where sigla = 'CE')
        )