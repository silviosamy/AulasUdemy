select e.nome as Estado,
 c.nome as Cidade,
 regiao as Regiao,
from estados e, cidades c -- Juntando as 2 tabelas especificando
where e.id = c.estado_id; -- igualar as IDs conforme definido nas tabelas.

select
	c.nome as Cidade,
    e.nome as Estado,
    regiao as Região
from estados e
inner join cidades c on e.id = c.estado_id -- Funciona desta mesma forma pra juntar qual tabela em algo.
    

