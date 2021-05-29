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
insert into tb_atendente (nome,senha) values ('atd', '1234');
insert into tb_administrador (nome,senha) values ('adm', '1234');

select * from tb_fila_de_vacinacao;
select * from tb_atendente;
select * from tb_administrador;
describe tb_administrador;


SET GLOBAL TIME_ZONE = '-3:00';

alter table tb_administrador add column cargo varchar (20) not null;
update tb_administrador set cargo = 'Administrador' where id = 1;

alter table tb_atendente add column cargo varchar (20) not null;
update tb_atendente set cargo = 'Atendente' where id = 1;

