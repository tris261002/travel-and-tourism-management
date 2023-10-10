create database travelmanagementsystem;

show databases;

use travelmanagementsystem;
create table account(username varchar(20), name varchar(20), password varchar (20), security varchar (100), answer varchar (50));


show tables;

select * from account;

create table customer(username varchar(20),id varchar (30),number varchar(30),name varchar (30),gender varchar (20),country varchar(30),address varchar(100),email varchar(40),phone varchar(15));

select * from customer;

create table bookpackage(username varchar(20),package varchar (30),persons varchar(30),id varchar (30),number varchar (30),phone varchar(15),price varchar(20));

create table hotel(name varchar(30),costperperson varchar(30),acroom varchar(10),foodincluded varchar(10));

insert into hotel values('JW Marriott','5500','2000','2500');
insert into hotel values('ITC Hotel','7500','3500','3000'); 
insert into hotel values('Maradin Oriental Hotel','6500','2000','2000'); 
insert into hotel values('Four Seasons Hotel','4500','2000','2000');
insert into hotel values('Raddison Blue Hotel','5500','2500','2000');
insert into hotel values('The Bay Club Hotell','4000','2000','2000');
insert into hotel values('Breeze Blow Hotel','4500','2000','2000');
insert into hotel values('The Taj Hotel','8000','4000','3500');
insert into hotel values('Happy Morning Motel','4000','2000','2500');

select * from hotel;

create table bookhotel(username varchar(20),name varchar (30),persons varchar(30),days varchar(30),ac varchar(30),food varchar(30),id varchar (30),number varchar (30),phone varchar(15),price varchar(20));

select * from bookhotel;