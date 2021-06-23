CREATE DATABASE db_rh;
USE db_rh;
CREATE TABLE tb_funcionarios (
	id_funcionario INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255),
    email VARCHAR(255),
    cargo VARCHAR(255),
    salario FLOAT NULL,
    PRIMARY KEY(id_funcionario)
);
INSERT INTO tb_funcionarios (nome, email, cargo, salario)
VALUES
('Katia','katia@email.com','Figurinista de Tv',6000),
('Carlos','carlos@email.com','Tecnico de suporte',2000),
('Tamiris','tamiris@email.com','Dev Jr',4000),
('Lucia','lucia@email.com','Diretora de Tv',9000),
('Antonio','antonio@email.com','Supervisor de Limpeza',1500);

SELECT * FROM tb_funcionarios;

SELECT * FROM tb_funcionarios WHERE salario > 3000;
SELECT * FROM tb_funcionarios WHERE salario < 3000;

UPDATE tb_funcionarios SET nome = 'Tomi' WHERE id_funcionario = 2;
UPDATE tb_funcionarios SET email = 'tomi@email' WHERE id_funcionario = 2;

SELECT * FROM tb_funcionarios;





