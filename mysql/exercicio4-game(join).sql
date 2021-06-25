CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classe (
	id_classe INT AUTO_INCREMENT,
    tipo VARCHAR (255) NOT NULL,
    dificuldade VARCHAR(255) NOT NULL,
    lancamento int (4),
    PRIMARY KEY (id_classe)
);


CREATE TABLE tb_personagens (
	id_personagem INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR (255) NOT NULL,
    ataque 	INT NOT NULL,
    defesa INT NOT NULL,
    especial INT NOT NULL,
    fatality INT NOT NULL,
    tipo_luta VARCHAR (255) NOT NULL,
    fk_classe int,
	FOREIGN KEY (fk_classe) REFERENCES tb_classe(id_classe),
    PRIMARY KEY (id_personagem)
);

INSERT INTO tb_classe (tipo, dificuldade, lancamento)
 VALUES 
("RPG","Facil",2003),
("AÇÃO","Media",2000),
("ESPORTE","Dificil",2021),
("MUNDO ABERTO","Dificil",2016),
("FPS","Facil",2021);

INSERT INTO tb_personagens(nome, ataque, defesa,especial,fatality,tipo_luta)
VALUES
("GOKU",15000,9000,50000,5000,"Corpo a corpo"),
("EZIO",8000,8000,30000,5000,"Armas"),
("THOR",12000,9000,30000,5000,"Armas"),
("NATAN DRAKE",18000,6000,500,5000,"Armas"),
("KRATOS",12000,9000,50000,5000,"Armas"),
("SAITAMA",10000,9000,50000,5000,"Corpo a corpo"),
("HOMER",10000,9000,6000,5000,"Armas"),
("NARUTO",16000,9000,50000,8000,"Corpo a corpo");


SELECT * FROM tb_personagens WHERE ataque > 2000;
SELECT * FROM tb_personagens WHERE defesa < 6000 and defesa > 1000;
SELECT nome FROM tb_personagens WHERE nome LIKE "%c%";

SELECT nome,tipo_luta, fk_classe from tb_personagens
	INNER JOIN tb_classe ON tb_classe.id_classe = tb_personagens.fk_classe;




