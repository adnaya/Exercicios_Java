create database banco_usu;
use banco_usu;

create table UsuarioUm(
id int auto_increment primary key,
nome varchar(50),
email varchar(50),
login varchar(20),
senha varchar(50)
);

create table Produto(
codigo int auto_increment primary key,
nome varchar(50),
descricao varchar(200)
);