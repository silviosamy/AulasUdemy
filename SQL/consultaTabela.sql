-- Consultar estados
SELECT * FROM estados

select Sigla, nome as 'Nome do Estado' from estados
where regiao = 'Sul' -- selecionar somente os estados da região sul

select nome, regiao, populacao from estados
where populacao >= 10 -- Selecionar os que tem a populacao maior ou = 10
order by populacao desc -- Ordenar os estados em ordem decrescente (maiores ou igual a 10, conforme linha anterior)
