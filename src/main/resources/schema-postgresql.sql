create sequence mooday_seq;
create sequence cars_sequence start 1 increment 1;
create table mooday (id bigint default nextval('mooday_seq'), nom varchar(255), prenom varchar(255), primary key (id));
create table cars (id int8 default nextval('cars_sequence'), age int4 not null, nom varchar(255), prenom varchar(255), primary key (id));
