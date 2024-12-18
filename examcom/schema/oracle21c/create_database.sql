/*
sqlplus / as sysdba

alter session set container = ORCLPDB;

ALTER PROFILE DEFAULT LIMIT PASSWORD_LIFE_TIME UNLIMITED;
*/

select * from all_users order by username;

create user emarf identified by emarf;

grant create session to emarf;

grant create table to emarf;

grant unlimited tablespace to emarf;

