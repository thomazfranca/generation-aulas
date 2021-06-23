CREATE DATABASE db_escola;
USE  db_escola;
CREATE TABLE tb_estudantes(
	id_estudantes bigint auto_increment,
    nome varchar(50) not null,
    numero_chamada int (3) not null,
    ano varchar(60) not null,
    nota float not null,
    matriculado boolean,
    primary key (id_estudantes)
    );
    
INSERT INTO tb_estudantes(nome, numero_chamada, ano, nota,matriculado) 
VALUES
("Luis",2,"9 ano",8.5,true),
("Caio",1,"9 ano",6.0,true),
("Larissa",2,"1 ano",7.0,false),
("Gabriela",1,"1 ano",5.5,true),
("Tulio",2,"2 ano",3.5,true),
("Fernanda",1,"2 ano",8.0,true),
("Antonio",1,"3 ano",3.0,true),
("Eduardo",2,"3 ano",8.5,false);


SELECT * FROM tb_estudantes WHERE nota > 8.0;
SELECT * FROM tb_estudantes WHERE nota < 8.0;

UPDATE tb_estudantes SET nome = 'Thomaz' WHERE id_estudantes = 8;

SELECT * FROM tb_estudantes