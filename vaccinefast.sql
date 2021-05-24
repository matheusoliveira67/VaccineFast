create database db_vacina;
use db_vacina;

create table tb_administrador (
    id int primary key auto_increment,
    nome varchar(200),
    senha varchar(200)
);

create table tb_atendente (
    id int primary key auto_increment,
    nome varchar(200),
    senha varchar(200)
);

create table tb_fila_de_vacinacao (
    id int primary key auto_increment,
    nome varchar(200),
    idade int(200),
    profissao bool,
    endereco varchar(200),
    datavacinacao varchar(200)

);

select * from tb_fila_de_vacinacao;
