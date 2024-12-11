CREATE TABLE empresateste(
	cod_empresa auto_increment bigint(20),
    razao_social not null varchar(100),
    cnpj not null  varchar(14),
    (cod_empresa) primary key,
  )