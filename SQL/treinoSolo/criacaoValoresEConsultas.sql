INSERT INTO empresateste (razao_social, cnpj)

VALUES
	("Renner", 42654345686585),
    ("Pernambucanas", 78654852153685),
    ("Tng", 14285798654685),
    ("Maha", 74898756874215),
    ("Bradesco", 49635415236589),
    ("Santander", 95645678965197),
    ("NuBank", 10678598687426)
    
select * from empresateste
where cnpj like '1%';

select * from empresateste
where razao_social = "Santander"
or cnpj = 10678598687426