CREATE TABLE autor (

	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	nascimento DATE NOT NULL,
	nacionalidade VARCHAR(30) NOT NULL

)ENGINE=InnoDB DEFAULT CHARSET=utf8;