create database banco_usu;
use banco_usu;
-- Script Slide 5

-- Table Exercicio 01
create table UsuarioUm(
id int auto_increment primary key,
nome varchar(50),
email varchar(50),
login varchar(20),
senha varchar(50)
);

-- Table Exercicio 02
create table Produto(
codigo int auto_increment primary key,
nome varchar(50),
descricao varchar(200)
);

-- Table Exercicio 03
create table Venda(
codigo int auto_increment primary key,
NomeVendedor varchar(50),
NomeProduto varchar(50)
);