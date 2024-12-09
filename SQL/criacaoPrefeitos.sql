CREATE TABLE IF NOT EXISTS prefeitos (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    cidade_id int unsigned,
    PRIMARY KEY (id), -- CHAVE PRIMÁRIA DESTA TABELA
    UNIQUE KEY (cidade_id), -- NÃO ACEITA DUPLICAÇÃO
    foreign key (cidade_id) REFERENCES cidades (id) -- CHAVE ESTRANGEIRA É ESSA CHAVE cidade_id
)