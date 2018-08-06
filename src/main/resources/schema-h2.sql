create table student
(
   id integer not null,
   name varchar(255) not null,
   passport_number varchar(255) not null,
   primary key(id)
);

CREATE TABLE TB_REGION
(
   SEQ BIGINT PRIMARY KEY AUTO_INCREMENT,
   REGION_TP varchar(10) not null,
   LAT integer not null,
   LNG integer not null,
   CREATE_DT DATE ,
   UPDATE_DT DATE
);

CREATE TABLE TB_REGION_TRANS
(
   SEQ BIGINT PRIMARY KEY AUTO_INCREMENT,
   REGION_NO BIGINT not null,
   LANG_TP varchar(10) not null,
   TITLE varchar(10) not null,
   CONTENT varchar(10) not null,
   CREATE_DT DATE ,
   UPDATE_DT DATE
);
