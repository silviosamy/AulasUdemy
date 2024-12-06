update estados
set nome = 'Maranhão'
where sigla = 'MA'

select nome from estados where sigla = 'MA'

update estados
set nome = 'Paraná', 
	populacao = 11.32 -- 1 set pode ser usado para atualizar várias linhas conforme coluna X
where sigla = 'PR' -- Nunca esquecer de usar o WHERE para definir em qual coluna encontra-se a informação correta.

select est.nome, 
	sigla, 
    populacao
from estados est where sigla = "PR"