create table empresa (
	id int not null primary key auto_increment,
	cnpj varchar(20),
	nome_fantasia varchar(100),
	razao_social varchar(100)
)ENGINE=InnoDB;