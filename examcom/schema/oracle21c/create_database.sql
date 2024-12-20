/*
alter session set container = ORCLPDB;
alter session set container = XEPDB1;

ALTER PROFILE DEFAULT LIMIT PASSWORD_LIFE_TIME UNLIMITED;

select * from all_users where common = 'NO' order by username;

DROP USER emarf CASCADE;
*/

create user emarf identified by emarf;

grant create session to emarf;

grant create table to emarf;

grant create view to emarf;

grant unlimited tablespace to emarf;

