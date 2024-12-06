select
	regiao as 'Regiao',
    sum(populacao) as Total -- Aqui ele fará a soma de toda a populacao por REGIAO, definindo como "Total".
from estados
group by regiao -- Agrupando por regiao
order by Total desc -- Ordenar de forma decrescente.

select
    sum(populacao) as Total -- Pegou todos os dados de determinadas coluna, e somou.

select
    avg(populacao) as Total -- Média de população com todos os registros do banco.
from estados