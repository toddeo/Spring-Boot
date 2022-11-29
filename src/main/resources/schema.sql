create sequence mooday_seq;
create table mooday (id bigint default nextval('mooday_seq'), nom varchar(255), prenom varchar(255), primary key (id));
