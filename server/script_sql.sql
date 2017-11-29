CREATE DATABASE u533776325_vifit;
USE u533776325_vifit;
CREATE TABLE tbAlunos(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(100) NOT NULL,
	peso FLOAT NOT NULL,
	altura FLOAT NOT NULL,
	imc FLOAT NOT NULL,
	login VARCHAR(100) NOT NULL,
	senha VARCHAR(100) NOT NULL
);
CREATE TABLE tbExercicios(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	id_aluno INT NOT NULL,
	nome VARCHAR(100) NOT NULL,
	num_serie INT NOT NULL,
	num_repeticao INT NOT NULL
);