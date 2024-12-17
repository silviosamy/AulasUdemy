select e.razao_social as Banco, 
f.nome as Funcionario, f.salario as Salario
from empresateste e 
right join funcionarios f 
on 
f.empresa_id = e.cod_empresa