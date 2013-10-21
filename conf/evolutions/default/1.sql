# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table movies (
  id                        bigint not null,
  name                      varchar(255),
  language                  varchar(255),
  type                      varchar(255),
  constraint pk_movies primary key (id))
;

create sequence movies_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists movies;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists movies_seq;

