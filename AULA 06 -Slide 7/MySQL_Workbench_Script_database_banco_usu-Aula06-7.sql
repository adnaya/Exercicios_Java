create database banco_Crud;
use banco_Crud;
-- Script Slide 7

-- Table Exercicio 01
create table Usuario(
id int auto_increment primary key,
nome varchar(60),
email varchar(60),
login varchar(60),
senha varchar(60)
);

-- Table Exercicio 02
create table Produto(
codigo int auto_increment primary key,
nomeProduto varchar(60),
descricao varchar(60)
);

-- Table Exercicio 03
create table Vendas(
codigo int auto_increment primary key,
nomeVendedor varchar(60),
produtoVendido varchar(60)
);

