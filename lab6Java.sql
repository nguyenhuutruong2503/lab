create database Lab6Java_MOB1024
use Lab6Java_MOB1024;

create table student (
    student_id   int primary key not null,
    student_name nvarchar(100) not null,
    gender       nvarchar(10) null,
    gpa          float null
);

create table tree(
node_id int primary key not null,
node_name nvarchar(100) not null,
parent_id int not null,
level int not null
);