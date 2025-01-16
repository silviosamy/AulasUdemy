select * from funcionarios
 

insert into funcionarios (cod_empresa, nome, idade, sexo, salario)
Values
	(6, "Ana", 28, 'F', 8.100),
    (6, "Pedro", 30, 'M', 7.500),
    (6, "José", 48, 'M', 8.100),
    (6, "Roberto", 50, 'M', 48.400),
    (6, "Paulo", 31, 'M', 18.300),
    (7, "Henrique", 44, 'M', 23.800),
    (7, "Alexandre", 25, 'M', 5.200),
    (7, "Gabriel", 18, 'M', 2.100),
    (7, "Julia", 29, 'F', 8.800)
    
alter table funcionarios modify salario double

delete from funcionarios