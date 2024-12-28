/*
Microsoft Windows [Version 10.0.19045.5247]
(c) Microsoft Corporation. All rights reserved.

C:\Users\toshiyuki>sqlplus / as sysdba

SQL*Plus: Release 21.0.0.0.0 - Production on 金 12月 27 21:05:28 2024
Version 21.3.0.0.0

Copyright (c) 1982, 2021, Oracle.  All rights reserved.



Oracle Database 21c Enterprise Edition Release 21.0.0.0.0 - Production
Version 21.3.0.0.0
に接続されました。
SQL> show pdbs

    CON_ID CON_NAME                       OPEN MODE  RESTRICTED
---------- ------------------------------ ---------- ----------
         2 PDB$SEED                       READ ONLY  NO
         3 ORCLPDB                        MOUNTED
SQL> alter pluggable database all open;

プラガブル・データベースが変更されました。

SQL>
*/
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

