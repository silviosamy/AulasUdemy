ALTER TABLE empresas MODIFY cnpj VARCHAR(14);

INSERT INTO empresas 
	(nome,cnpj)
VALUES
	('Bradesco', 78947587648512),
    ('Vale',15349267485247),
    ('Cielo',49356874261859)

desc empresas
desc prefeitos

select * from empresas;
select * from cidades;

INSERT INTO empresas_unidades
	(empresa_id, cidade_id, sede)
VALUES
	(1, 1, 1),
	(1, 2, 0),
    (2, 1, 0),
    (2, 2, 2);