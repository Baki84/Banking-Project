create database bankSystem;
use bankSystem;
create table SignUp(form_no varchar(30),name varchar(30),father_name varchar(30),DOB varchar(30),gender varchar(30),email varchar(80),marital_status varchar(30),address varchar(60),city varchar(30),pincode varchar(30),state varchar(40));
select * from SignUp;



create table SignUptwo(form_no varchar(30),religion varchar(30),category varchar(30),income varchar(30),education varchar(30),occuption varchar(80),pan varchar(30),aadhar varchar(60),seniorcitizen varchar(30),existing_account varchar(30));
select * from SignUptwo;


create table Signupthree(form_no varchar(30),account_Type varchar(40), card_number varchar(30),pin varchar(30),facility varchar(200));
select * from SignUpthree;

create table login(form_no varchar(30),card_number varchar(50),pin varchar(30));
select * from login;

create table bank(pin varchar(10),date varchar(50),type varchar(20),amount varchar(20)); 
select * from bank;