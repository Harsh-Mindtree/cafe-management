create database cafe_management_db;
use cafe_management_db;
create table employees(
emp_name varchar(50) NOT NULL, 
emp_id varchar(8),
emp_email varchar(50) NOT NULL,
emp_designation varchar(20) NOT NULL,
emp_password varchar(20) NOT NULL,
emp_status varchar(10) default 'user',
PRIMARY KEY(emp_id));