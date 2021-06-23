CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produto(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR (60) NOT NULL,
    preco DOUBLE NOT NULL,
    marca VARCHAR (60) NOT NULL,
    estoque_imediato BOOLEAN,
    quantidade INT NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO tb_produto(nome, preco, marca, estoque_imediato,quantidade) 
VALUES 
("Celular",3000,"Samsung",true,40),
("Celular",2500,"Asus",true,25),
("TV",6000,"Philco",false,0),
("Notebook",3500,"Lenovo",false,2),
("Celular",7000,"Apple",true,32); 

SELECT * FROM tb_produto;

SELECT * FROM tb_produto WHERE preco > 3000;
SELECT * FROM tb_produto WHERE preco < 3000;

UPDATE tb_produto SET nome = 'Notebook' WHERE id = 3;

SELECT * FROM tb_produto