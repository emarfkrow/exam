-- Project Name : emarf
-- Date/Time    : 2024/11/06 19:49:04
-- Author       : toshiyuki
-- RDBMS Type   : Oracle Database
-- Application  : A5:SQL Mk-2

/*
  << 注意！！ >>
  BackupToTempTable, RestoreFromTempTable疑似命令が付加されています。
  これにより、drop table, create table 後もデータが残ります。
  この機能は一時的に $$TableName のような一時テーブルを作成します。
  この機能は A5:SQL Mk-2でのみ有効であることに注意してください。
*/

-- 従妹
-- * BackupToTempTable
drop table T_ITOKO cascade constraints;

-- * RestoreFromTempTable
create table T_ITOKO (
  ITOKO_ID NUMBER(10)
  , ITOKO_MEI VARCHAR2(120)
  , SOSEN_ID NUMBER(10)
  , OYA_BN NUMBER(10)
  , ENTITY_BN NUMBER(10)
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint T_ITOKO_PKC primary key (ITOKO_ID)
) ;

-- エンティティ３
-- * BackupToTempTable
drop table T_ENTITY3 cascade constraints;

-- * RestoreFromTempTable
create table T_ENTITY3 (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , ENTITY3_MEI VARCHAR2(120)
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint T_ENTITY3_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) ;

-- 参照３マスタ
-- * BackupToTempTable
drop table M_SANSHO3 cascade constraints;

-- * RestoreFromTempTable
create table M_SANSHO3 (
  SANSHO3_NO CHAR(10) not null
  , SANSHO3_MEI VARCHAR2(120) not null
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint M_SANSHO3_PKC primary key (SANSHO3_NO)
) ;

-- 主キーなし
-- * BackupToTempTable
drop table T_NO_PK cascade constraints;

-- * RestoreFromTempTable
create table T_NO_PK (
  COLUMN_A VARCHAR2(120)
  , COLUMN_B VARCHAR2(120)
  , COLUMN_C VARCHAR2(120)
  , COLUMN_D VARCHAR2(120)
  , COLUMN_E VARCHAR2(120)
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
) ;

create unique index T_NO_PK_IX1
  on T_NO_PK(COLUMN_A);

create unique index T_NO_PK_IX2
  on T_NO_PK(COLUMN_B,COLUMN_C);

-- 添付ファイル
-- * BackupToTempTable
drop table T_TENPU_FILE cascade constraints;

-- * RestoreFromTempTable
create table T_TENPU_FILE (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , TENPU_FILE_BN NUMBER(10) not null
  , TENPU_FILE_MEI VARCHAR2(120) not null
  , FILE_PATH_TX VARCHAR2(800) not null
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint T_TENPU_FILE_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,TENPU_FILE_BN)
) ;

-- 所属マスタ
-- * BackupToTempTable
drop table M_SHOZOKU cascade constraints;

-- * RestoreFromTempTable
create table M_SHOZOKU (
  BUSHO_ID NUMBER(10) not null
  , SHOKUI_ID NUMBER(10) not null
  , USER_ID NUMBER(10) not null
  , KAISHI_BI DATE
  , SHURYO_BI DATE
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint M_SHOZOKU_PKC primary key (BUSHO_ID,SHOKUI_ID,USER_ID)
) ;

-- 職位マスタ
-- * BackupToTempTable
drop table M_SHOKUI cascade constraints;

-- * RestoreFromTempTable
create table M_SHOKUI (
  SHOKUI_ID NUMBER(10) not null
  , SHOKUI_MEI VARCHAR2(120) not null
  , ORDER_ID NUMBER(10) not null
  , KAISHI_BI DATE
  , SHURYO_BI DATE
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint M_SHOKUI_PKC primary key (SHOKUI_ID)
) ;

-- 部署マスタ
-- * BackupToTempTable
drop table M_BUSHO cascade constraints;

-- * RestoreFromTempTable
create table M_BUSHO (
  BUSHO_ID NUMBER(10) not null
  , BUSHO_MEI VARCHAR2(120) not null
  , OYA_BUSHO_ID NUMBER(10)
  , KAISHI_BI DATE
  , SHURYO_BI DATE
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint M_BUSHO_PKC primary key (BUSHO_ID)
) ;

-- 参照２マスタ
-- * BackupToTempTable
drop table M_SANSHO2 cascade constraints;

-- * RestoreFromTempTable
create table M_SANSHO2 (
  SANSHO2_CD CHAR(6) not null
  , SANSHO2_MEI VARCHAR2(120) not null
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint M_SANSHO2_PKC primary key (SANSHO2_CD)
) ;

-- 認可マスタ
-- * BackupToTempTable
drop table M_NINKA cascade constraints;

-- * RestoreFromTempTable
create table M_NINKA (
  BUSHO_ID NUMBER(10) not null
  , SHOKUI_ID NUMBER(10) not null
  , GAMEN_NM VARCHAR2(30) not null
  , KENGEN_KB CHAR(2) not null
  , KAISHI_BI DATE
  , SHURYO_BI DATE
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint M_NINKA_PKC primary key (BUSHO_ID,SHOKUI_ID,GAMEN_NM)
) ;

-- ユーザマスタ
-- * BackupToTempTable
drop table M_USER cascade constraints;

-- * RestoreFromTempTable
create table M_USER (
  USER_ID NUMBER(10) not null
  , USER_SEI VARCHAR2(120) not null
  , USER_MEI VARCHAR2(120) not null
  , EMAIL VARCHAR2(800) not null
  , PASSWORD VARCHAR2(800) not null
  , KAISHI_BI DATE
  , SHURYO_BI DATE
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint M_USER_PKC primary key (USER_ID)
) ;

-- エンティティ２
-- * BackupToTempTable
drop table T_ENTITY2 cascade constraints;

-- * RestoreFromTempTable
create table T_ENTITY2 (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , NULL_ENTITY2_NM VARCHAR2(30)
  , ENTITY2_MEI VARCHAR2(120) not null
  , CHECK_F CHAR(1) not null
  , RADIO_KB CHAR(2) not null
  , PULLDOWN_KB CHAR(2) not null
  , MEMO_TX VARCHAR2(800) not null
  , NEN_Y CHAR(4) not null
  , TSUKI_M CHAR(2) not null
  , HI_D CHAR(2) not null
  , NENGETSU_YM CHAR(6) not null
  , NENGAPPI_YMD CHAR(8) not null
  , TIMESTAMP_TS TIMESTAMP not null
  , NICHIJI_DT DATE not null
  , HIDUKE_BI DATE not null
  , JIKOKU_HM DATE not null
  , JIKAN_TM VARCHAR2(9) not null
  , SURYO_QT NUMBER(9,2) not null
  , TANKA_KG NUMBER(11,3) not null
  , KINGAKU_KG NUMBER(11,3) not null
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint T_ENTITY2_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) ;

-- 区分値マスタ
-- * BackupToTempTable
drop table M_KBN_VALUE cascade constraints;

-- * RestoreFromTempTable
create table M_KBN_VALUE (
  KBN_NM VARCHAR2(30) not null
  , KBN_KB CHAR(2) not null
  , KBN_KB_MEI VARCHAR2(120) not null
  , HYOJIJUN_BN NUMBER(10) not null
  , CRITERIA_TX VARCHAR2(800)
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint M_KBN_VALUE_PKC primary key (KBN_NM,KBN_KB)
) ;

-- 区分マスタ
-- * BackupToTempTable
drop table M_KBN cascade constraints;

-- * RestoreFromTempTable
create table M_KBN (
  KBN_NM VARCHAR2(30) not null
  , KBN_MEI VARCHAR2(120) not null
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint M_KBN_PKC primary key (KBN_NM)
) ;

-- エンティティ履歴
-- * BackupToTempTable
drop table T_ENTITY_HIS cascade constraints;

-- * RestoreFromTempTable
create table T_ENTITY_HIS (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , HISTORY_BN NUMBER(10) not null
  , ENTITY_MEI VARCHAR2(120) not null
  , SANSHO1_ID NUMBER(10)
  , SANSHO1_MEI VARCHAR2(120)
  , SANSHO2_CD CHAR(6)
  , SANSHO2_MEI VARCHAR2(120)
  , BETSU_SANSHO1_ID NUMBER(10)
  , BETSU_SANSHO1_MEI VARCHAR2(120)
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint T_ENTITY_HIS_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,HISTORY_BN)
) ;

-- 参照１マスタ
-- * BackupToTempTable
drop table M_SANSHO1 cascade constraints;

-- * RestoreFromTempTable
create table M_SANSHO1 (
  SANSHO1_ID NUMBER(10) not null
  , SANSHO1_MEI VARCHAR2(120) not null
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint M_SANSHO1_PKC primary key (SANSHO1_ID)
) ;

-- 子孫
-- * BackupToTempTable
drop table T_SHISON cascade constraints;

-- * RestoreFromTempTable
create table T_SHISON (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , KO_BN NUMBER(10) not null
  , SHISON_BN NUMBER(10) not null
  , SHISON_MEI VARCHAR2(120) not null
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint T_SHISON_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,KO_BN,SHISON_BN)
) ;

-- 子
-- * BackupToTempTable
drop table T_KO cascade constraints;

-- * RestoreFromTempTable
create table T_KO (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , KO_BN NUMBER(10) not null
  , KO_MEI VARCHAR2(120) not null
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint T_KO_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,KO_BN)
) ;

-- エンティティ
-- * BackupToTempTable
drop table T_ENTITY cascade constraints;

-- * RestoreFromTempTable
create table T_ENTITY (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , ENTITY_MEI VARCHAR2(120) not null
  , SANSHO1_ID NUMBER(10)
  , SANSHO1_MEI VARCHAR2(120)
  , SANSHO2_CD CHAR(6)
  , SANSHO2_MEI VARCHAR2(120)
  , SANSHO3_NO CHAR(10)
  , SANSHO3_MEI VARCHAR2(120)
  , BETSU_SANSHO1_ID NUMBER(10)
  , BETSU_SANSHO1_MEI VARCHAR2(120)
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint T_ENTITY_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) ;

-- 親
-- * BackupToTempTable
drop table T_OYA cascade constraints;

-- * RestoreFromTempTable
create table T_OYA (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , OYA_MEI VARCHAR2(120) not null
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint T_OYA_PKC primary key (SOSEN_ID,OYA_BN)
) ;

-- 祖先
-- * BackupToTempTable
drop table T_SOSEN cascade constraints;

-- * RestoreFromTempTable
create table T_SOSEN (
  SOSEN_ID NUMBER(10) not null
  , SOSEN_MEI VARCHAR2(120) not null
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint T_SOSEN_PKC primary key (SOSEN_ID)
) ;

comment on table T_ITOKO is '従妹';
comment on column T_ITOKO.ITOKO_ID is '従妹ID';
comment on column T_ITOKO.ITOKO_MEI is '従妹名';
comment on column T_ITOKO.SOSEN_ID is '祖先ID';
comment on column T_ITOKO.OYA_BN is '親枝番';
comment on column T_ITOKO.ENTITY_BN is 'エンティティ枝番';
comment on column T_ITOKO.INSERT_DT is '登録日時';
comment on column T_ITOKO.INSERT_BY is '登録者';
comment on column T_ITOKO.UPDATE_DT is '更新日時';
comment on column T_ITOKO.UPDATE_BY is '更新者';
comment on column T_ITOKO.DELETE_F is '削除フラグ';

comment on table T_ENTITY3 is 'エンティティ３';
comment on column T_ENTITY3.SOSEN_ID is '祖先ID';
comment on column T_ENTITY3.OYA_BN is '親枝番';
comment on column T_ENTITY3.ENTITY_BN is 'エンティティ枝番';
comment on column T_ENTITY3.ENTITY3_MEI is 'エンティティ３名';
comment on column T_ENTITY3.INSERT_DT is '登録日時';
comment on column T_ENTITY3.INSERT_BY is '登録者';
comment on column T_ENTITY3.UPDATE_DT is '更新日時';
comment on column T_ENTITY3.UPDATE_BY is '更新者';
comment on column T_ENTITY3.DELETE_F is '削除フラグ';

comment on table M_SANSHO3 is '参照３マスタ';
comment on column M_SANSHO3.SANSHO3_NO is '参照３NO';
comment on column M_SANSHO3.SANSHO3_MEI is '参照３名';
comment on column M_SANSHO3.INSERT_DT is '登録日時';
comment on column M_SANSHO3.INSERT_BY is '登録者';
comment on column M_SANSHO3.UPDATE_DT is '更新日時';
comment on column M_SANSHO3.UPDATE_BY is '更新者';
comment on column M_SANSHO3.DELETE_F is '削除フラグ';

comment on table T_NO_PK is '主キーなし';
comment on column T_NO_PK.COLUMN_A is '列Ａ';
comment on column T_NO_PK.COLUMN_B is '列Ｂ';
comment on column T_NO_PK.COLUMN_C is '列Ｃ';
comment on column T_NO_PK.COLUMN_D is '列Ｄ';
comment on column T_NO_PK.COLUMN_E is '列Ｅ';
comment on column T_NO_PK.INSERT_DT is '登録日時';
comment on column T_NO_PK.INSERT_BY is '登録者';
comment on column T_NO_PK.UPDATE_DT is '更新日時';
comment on column T_NO_PK.UPDATE_BY is '更新者';
comment on column T_NO_PK.DELETE_F is '削除フラグ';

comment on table T_TENPU_FILE is '添付ファイル';
comment on column T_TENPU_FILE.SOSEN_ID is '祖先ID';
comment on column T_TENPU_FILE.OYA_BN is '親枝番';
comment on column T_TENPU_FILE.ENTITY_BN is 'エンティティ枝番';
comment on column T_TENPU_FILE.TENPU_FILE_BN is '添付ファイル枝番';
comment on column T_TENPU_FILE.TENPU_FILE_MEI is '添付ファイル名';
comment on column T_TENPU_FILE.FILE_PATH_TX is 'ファイルパス';
comment on column T_TENPU_FILE.INSERT_DT is '登録日時';
comment on column T_TENPU_FILE.INSERT_BY is '登録者';
comment on column T_TENPU_FILE.UPDATE_DT is '更新日時';
comment on column T_TENPU_FILE.UPDATE_BY is '更新者';
comment on column T_TENPU_FILE.DELETE_F is '削除フラグ';

comment on table M_SHOZOKU is '所属マスタ';
comment on column M_SHOZOKU.BUSHO_ID is '部署ID';
comment on column M_SHOZOKU.SHOKUI_ID is '職位ID';
comment on column M_SHOZOKU.USER_ID is 'ユーザID';
comment on column M_SHOZOKU.KAISHI_BI is '開始日';
comment on column M_SHOZOKU.SHURYO_BI is '終了日';
comment on column M_SHOZOKU.INSERT_DT is '登録日時';
comment on column M_SHOZOKU.INSERT_BY is '登録者';
comment on column M_SHOZOKU.UPDATE_DT is '更新日時';
comment on column M_SHOZOKU.UPDATE_BY is '更新者';
comment on column M_SHOZOKU.DELETE_F is '削除フラグ';

comment on table M_SHOKUI is '職位マスタ';
comment on column M_SHOKUI.SHOKUI_ID is '職位ID';
comment on column M_SHOKUI.SHOKUI_MEI is '職位名';
comment on column M_SHOKUI.ORDER_ID is '職位順';
comment on column M_SHOKUI.KAISHI_BI is '開始日';
comment on column M_SHOKUI.SHURYO_BI is '終了日';
comment on column M_SHOKUI.INSERT_DT is '登録日時';
comment on column M_SHOKUI.INSERT_BY is '登録者';
comment on column M_SHOKUI.UPDATE_DT is '更新日時';
comment on column M_SHOKUI.UPDATE_BY is '更新者';
comment on column M_SHOKUI.DELETE_F is '削除フラグ';

comment on table M_BUSHO is '部署マスタ';
comment on column M_BUSHO.BUSHO_ID is '部署ID';
comment on column M_BUSHO.BUSHO_MEI is '部署名';
comment on column M_BUSHO.OYA_BUSHO_ID is '親部署ID';
comment on column M_BUSHO.KAISHI_BI is '開始日';
comment on column M_BUSHO.SHURYO_BI is '終了日';
comment on column M_BUSHO.INSERT_DT is '登録日時';
comment on column M_BUSHO.INSERT_BY is '登録者';
comment on column M_BUSHO.UPDATE_DT is '更新日時';
comment on column M_BUSHO.UPDATE_BY is '更新者';
comment on column M_BUSHO.DELETE_F is '削除フラグ';

comment on table M_SANSHO2 is '参照２マスタ';
comment on column M_SANSHO2.SANSHO2_CD is '参照２CD';
comment on column M_SANSHO2.SANSHO2_MEI is '参照２名';
comment on column M_SANSHO2.INSERT_DT is '登録日時';
comment on column M_SANSHO2.INSERT_BY is '登録者';
comment on column M_SANSHO2.UPDATE_DT is '更新日時';
comment on column M_SANSHO2.UPDATE_BY is '更新者';
comment on column M_SANSHO2.DELETE_F is '削除フラグ';

comment on table M_NINKA is '認可マスタ';
comment on column M_NINKA.BUSHO_ID is '部署ID';
comment on column M_NINKA.SHOKUI_ID is '職位ID';
comment on column M_NINKA.GAMEN_NM is '画面名';
comment on column M_NINKA.KENGEN_KB is '権限区分';
comment on column M_NINKA.KAISHI_BI is '開始日';
comment on column M_NINKA.SHURYO_BI is '終了日';
comment on column M_NINKA.INSERT_DT is '登録日時';
comment on column M_NINKA.INSERT_BY is '登録者';
comment on column M_NINKA.UPDATE_DT is '更新日時';
comment on column M_NINKA.UPDATE_BY is '更新者';
comment on column M_NINKA.DELETE_F is '削除フラグ';

comment on table M_USER is 'ユーザマスタ';
comment on column M_USER.USER_ID is 'ユーザID';
comment on column M_USER.USER_SEI is 'ユーザ姓';
comment on column M_USER.USER_MEI is 'ユーザ名';
comment on column M_USER.EMAIL is 'メールアドレス';
comment on column M_USER.PASSWORD is 'パスワード';
comment on column M_USER.KAISHI_BI is '開始日';
comment on column M_USER.SHURYO_BI is '終了日';
comment on column M_USER.INSERT_DT is '登録日時';
comment on column M_USER.INSERT_BY is '登録者';
comment on column M_USER.UPDATE_DT is '更新日時';
comment on column M_USER.UPDATE_BY is '更新者';
comment on column M_USER.DELETE_F is '削除フラグ';

comment on table T_ENTITY2 is 'エンティティ２';
comment on column T_ENTITY2.SOSEN_ID is '祖先ID';
comment on column T_ENTITY2.OYA_BN is '親枝番';
comment on column T_ENTITY2.ENTITY_BN is 'エンティティ枝番';
comment on column T_ENTITY2.NULL_ENTITY2_NM is '任意エンティティ２名称';
comment on column T_ENTITY2.ENTITY2_MEI is 'エンティティ２名';
comment on column T_ENTITY2.CHECK_F is 'チェックフラグ';
comment on column T_ENTITY2.RADIO_KB is 'ラジオ区分';
comment on column T_ENTITY2.PULLDOWN_KB is 'プルダウン区分';
comment on column T_ENTITY2.MEMO_TX is 'メモ';
comment on column T_ENTITY2.NEN_Y is '年';
comment on column T_ENTITY2.TSUKI_M is '月';
comment on column T_ENTITY2.HI_D is '日';
comment on column T_ENTITY2.NENGETSU_YM is '年月';
comment on column T_ENTITY2.NENGAPPI_YMD is '年月日';
comment on column T_ENTITY2.TIMESTAMP_TS is 'タイムスタンプ';
comment on column T_ENTITY2.NICHIJI_DT is '日時';
comment on column T_ENTITY2.HIDUKE_BI is '日付';
comment on column T_ENTITY2.JIKOKU_HM is '時刻';
comment on column T_ENTITY2.JIKAN_TM is '時間';
comment on column T_ENTITY2.SURYO_QT is '数量';
comment on column T_ENTITY2.TANKA_KG is '単価';
comment on column T_ENTITY2.KINGAKU_KG is '金額';
comment on column T_ENTITY2.INSERT_DT is '登録日時';
comment on column T_ENTITY2.INSERT_BY is '登録者';
comment on column T_ENTITY2.UPDATE_DT is '更新日時';
comment on column T_ENTITY2.UPDATE_BY is '更新者';
comment on column T_ENTITY2.DELETE_F is '削除フラグ';

comment on table M_KBN_VALUE is '区分値マスタ';
comment on column M_KBN_VALUE.KBN_NM is '区分名称';
comment on column M_KBN_VALUE.KBN_KB is '区分値';
comment on column M_KBN_VALUE.KBN_KB_MEI is '区分値名';
comment on column M_KBN_VALUE.HYOJIJUN_BN is '表示順';
comment on column M_KBN_VALUE.CRITERIA_TX is '取得条件';
comment on column M_KBN_VALUE.INSERT_DT is '登録日時';
comment on column M_KBN_VALUE.INSERT_BY is '登録者';
comment on column M_KBN_VALUE.UPDATE_DT is '更新日時';
comment on column M_KBN_VALUE.UPDATE_BY is '更新者';
comment on column M_KBN_VALUE.DELETE_F is '削除フラグ';

comment on table M_KBN is '区分マスタ';
comment on column M_KBN.KBN_NM is '区分名称';
comment on column M_KBN.KBN_MEI is '区分名';
comment on column M_KBN.INSERT_DT is '登録日時';
comment on column M_KBN.INSERT_BY is '登録者';
comment on column M_KBN.UPDATE_DT is '更新日時';
comment on column M_KBN.UPDATE_BY is '更新者';
comment on column M_KBN.DELETE_F is '削除フラグ';

comment on table T_ENTITY_HIS is 'エンティティ履歴';
comment on column T_ENTITY_HIS.SOSEN_ID is '祖先ID';
comment on column T_ENTITY_HIS.OYA_BN is '親枝番';
comment on column T_ENTITY_HIS.ENTITY_BN is 'エンティティ枝番';
comment on column T_ENTITY_HIS.HISTORY_BN is '履歴枝番';
comment on column T_ENTITY_HIS.ENTITY_MEI is 'エンティティ名';
comment on column T_ENTITY_HIS.SANSHO1_ID is '参照１ID';
comment on column T_ENTITY_HIS.SANSHO1_MEI is '参照１名';
comment on column T_ENTITY_HIS.SANSHO2_CD is '参照２CD';
comment on column T_ENTITY_HIS.SANSHO2_MEI is '参照２名';
comment on column T_ENTITY_HIS.BETSU_SANSHO1_ID is '別参照１ID';
comment on column T_ENTITY_HIS.BETSU_SANSHO1_MEI is '別参照１名';
comment on column T_ENTITY_HIS.INSERT_DT is '登録日時';
comment on column T_ENTITY_HIS.INSERT_BY is '登録者';
comment on column T_ENTITY_HIS.UPDATE_DT is '更新日時';
comment on column T_ENTITY_HIS.UPDATE_BY is '更新者';
comment on column T_ENTITY_HIS.DELETE_F is '削除フラグ';

comment on table M_SANSHO1 is '参照１マスタ';
comment on column M_SANSHO1.SANSHO1_ID is '参照１ID';
comment on column M_SANSHO1.SANSHO1_MEI is '参照１名';
comment on column M_SANSHO1.INSERT_DT is '登録日時';
comment on column M_SANSHO1.INSERT_BY is '登録者';
comment on column M_SANSHO1.UPDATE_DT is '更新日時';
comment on column M_SANSHO1.UPDATE_BY is '更新者';
comment on column M_SANSHO1.DELETE_F is '削除フラグ';

comment on table T_SHISON is '子孫';
comment on column T_SHISON.SOSEN_ID is '祖先ID';
comment on column T_SHISON.OYA_BN is '親枝番';
comment on column T_SHISON.ENTITY_BN is 'エンティティ枝番';
comment on column T_SHISON.KO_BN is '子枝番';
comment on column T_SHISON.SHISON_BN is '子孫枝番';
comment on column T_SHISON.SHISON_MEI is '子孫名';
comment on column T_SHISON.INSERT_DT is '登録日時';
comment on column T_SHISON.INSERT_BY is '登録者';
comment on column T_SHISON.UPDATE_DT is '更新日時';
comment on column T_SHISON.UPDATE_BY is '更新者';
comment on column T_SHISON.DELETE_F is '削除フラグ';

comment on table T_KO is '子';
comment on column T_KO.SOSEN_ID is '祖先ID';
comment on column T_KO.OYA_BN is '親枝番';
comment on column T_KO.ENTITY_BN is 'エンティティ枝番';
comment on column T_KO.KO_BN is '子枝番';
comment on column T_KO.KO_MEI is '子名';
comment on column T_KO.INSERT_DT is '登録日時';
comment on column T_KO.INSERT_BY is '登録者';
comment on column T_KO.UPDATE_DT is '更新日時';
comment on column T_KO.UPDATE_BY is '更新者';
comment on column T_KO.DELETE_F is '削除フラグ';

comment on table T_ENTITY is 'エンティティ';
comment on column T_ENTITY.SOSEN_ID is '祖先ID';
comment on column T_ENTITY.OYA_BN is '親枝番';
comment on column T_ENTITY.ENTITY_BN is 'エンティティ枝番';
comment on column T_ENTITY.ENTITY_MEI is 'エンティティ名';
comment on column T_ENTITY.SANSHO1_ID is '参照１ID';
comment on column T_ENTITY.SANSHO1_MEI is '参照１名';
comment on column T_ENTITY.SANSHO2_CD is '参照２CD';
comment on column T_ENTITY.SANSHO2_MEI is '参照２名';
comment on column T_ENTITY.SANSHO3_NO is '参照３NO';
comment on column T_ENTITY.SANSHO3_MEI is '参照３名';
comment on column T_ENTITY.BETSU_SANSHO1_ID is '別参照１ID';
comment on column T_ENTITY.BETSU_SANSHO1_MEI is '別参照１名';
comment on column T_ENTITY.INSERT_DT is '登録日時';
comment on column T_ENTITY.INSERT_BY is '登録者';
comment on column T_ENTITY.UPDATE_DT is '更新日時';
comment on column T_ENTITY.UPDATE_BY is '更新者';
comment on column T_ENTITY.DELETE_F is '削除フラグ';

comment on table T_OYA is '親';
comment on column T_OYA.SOSEN_ID is '祖先ID';
comment on column T_OYA.OYA_BN is '親枝番';
comment on column T_OYA.OYA_MEI is '親名';
comment on column T_OYA.INSERT_DT is '登録日時';
comment on column T_OYA.INSERT_BY is '登録者';
comment on column T_OYA.UPDATE_DT is '更新日時';
comment on column T_OYA.UPDATE_BY is '更新者';
comment on column T_OYA.DELETE_F is '削除フラグ';

comment on table T_SOSEN is '祖先';
comment on column T_SOSEN.SOSEN_ID is '祖先ID';
comment on column T_SOSEN.SOSEN_MEI is '祖先名';
comment on column T_SOSEN.INSERT_DT is '登録日時';
comment on column T_SOSEN.INSERT_BY is '登録者';
comment on column T_SOSEN.UPDATE_DT is '更新日時';
comment on column T_SOSEN.UPDATE_BY is '更新者';
comment on column T_SOSEN.DELETE_F is '削除フラグ';

