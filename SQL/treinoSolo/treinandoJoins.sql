select e.razao_social, f.nome as Funcionario, f.empresa_id as Empresa
from empresateste e
left join funcionarios f
on  e.cod_empresa = f.empresa_id;