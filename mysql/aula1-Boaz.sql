-- DDL (Linguagem de definição de dados)
-- CREATE
-- ALTER
-- DROP

-- CREATE
CREATE DATABASE db_restaurante;
USE db_restaurante;

CREATE TABLE tb_funcionarios (
	id_usuario INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) DEFAULT 'batatinha',
    sobrenome VARCHAR(255),
    email VARCHAR(255),
    data_inicio DATE,
    salario FLOAT NULL,
    PRIMARY KEY(id_usuario)
);

CREATE TABLE tb_produtos (
	id_prato INT NOT NULL AUTO_INCREMENT,
    nome_prato VARCHAR(255),
    descricao_prato VARCHAR(255),
    preco FLOAT,
    PRIMARY KEY(id_prato)
);

CREATE TABLE tb_vendas (
	id_venda INT NOT NULL AUTO_INCREMENT,
    descricao_mesa VARCHAR(255),
    fk_funcionario INT,
    fk_produto INT,
    PRIMARY KEY (id_venda),
	FOREIGN KEY (fk_funcionario) REFERENCES tb_funcionarios(id_usuario),
    FOREIGN KEY (fk_produto) REFERENCES tb_produtos(id_prato)
);

-- ALTER
ALTER TABLE tb_funcionarios
MODIFY COLUMN data_inicio DATE NOT NULL;

ALTER TABLE tb_funcionarios
ADD data_termino DATE NULL;

ALTER TABLE tb_produtos
DROP COLUMN preco;


-- DROP
DROP TABLE tb_vendas;
DROP TABLE tb_funcionarios;
DROP TABLE tb_produtos;

DROP DATABASE db_restaurante;

