CREATE TABLE funcionarios (
	cod_funcionario bigint(9999) auto_increment primary key,
    cod_empresa bigint (3) ,
    nome varchar(255) not null,
    idade tinyint(3) not null,
    sexo varchar(1) not null,
    salario double not null
)