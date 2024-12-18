-- Project Name : emarf
-- Date/Time    : 2024/11/10 13:47:03
-- Author       : toshiyuki
-- RDBMS Type   : MySQL
-- Application  : A5:SQL Mk-2

/*
  << 注意！！ >>
  BackupToTempTable, RestoreFromTempTable疑似命令が付加されています。
  これにより、drop table, create table 後もデータが残ります。
  この機能は一時的に $$TableName のような一時テーブルを作成します。
  この機能は A5:SQL Mk-2でのみ有効であることに注意してください。
*/

-- 部署マスタ
-- * BackupToTempTable
drop table if exists M_BUSHO cascade;

-- * RestoreFromTempTable
create table M_BUSHO (
  BUSHO_ID INT not null comment '部署ID'
  , BUSHO_MEI VARCHAR(120) not null comment '部署名'
  , OYA_BUSHO_ID INT comment '親部署ID'
  , KAISHI_BI DATE comment '開始日'
  , SHURYO_BI DATE comment '終了日'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint M_BUSHO_PKC primary key (BUSHO_ID)
) comment '部署マスタ' ;

-- 区分マスタ
-- * BackupToTempTable
drop table if exists M_KBN cascade;

-- * RestoreFromTempTable
create table M_KBN (
  KBN_NM VARCHAR(30) not null comment '区分名称'
  , KBN_MEI VARCHAR(120) not null comment '区分名'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint M_KBN_PKC primary key (KBN_NM)
) comment '区分マスタ' ;

-- 区分値マスタ
-- * BackupToTempTable
drop table if exists M_KBN_VALUE cascade;

-- * RestoreFromTempTable
create table M_KBN_VALUE (
  KBN_NM VARCHAR(30) not null comment '区分名称'
  , KBN_KB VARCHAR(2) not null comment '区分値'
  , KBN_KB_MEI VARCHAR(120) not null comment '区分値名'
  , HYOJI_ON INT not null comment '表示順'
  , CRITERIA VARCHAR(800) comment '取得条件'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint M_KBN_VALUE_PKC primary key (KBN_NM,KBN_KB)
) comment '区分値マスタ' ;

-- 機能マスタ
-- * BackupToTempTable
drop table if exists M_KINO cascade;

-- * RestoreFromTempTable
create table M_KINO (
  KINO_NM VARCHAR(30) comment '機能名称'
  , KINO_MEI VARCHAR(120) comment '機能名'
  , KAISHI_BI DATE comment '開始日'
  , SHURYO_BI DATE comment '終了日'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint M_KINO_PKC primary key (KINO_NM)
) comment '機能マスタ' ;

-- 認可マスタ
-- * BackupToTempTable
drop table if exists M_NINKA cascade;

-- * RestoreFromTempTable
create table M_NINKA (
  BUSHO_ID INT not null comment '部署ID'
  , SHOKUI_ID INT not null comment '職位ID'
  , KINO_NM VARCHAR(30) not null comment '機能名称'
  , KENGEN_KB VARCHAR(2) not null comment '権限区分'
  , KAISHI_BI DATE comment '開始日'
  , SHURYO_BI DATE comment '終了日'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint M_NINKA_PKC primary key (BUSHO_ID,SHOKUI_ID,KINO_NM)
) comment '認可マスタ' ;

-- 参照１マスタ
-- * BackupToTempTable
drop table if exists M_SANSHO1 cascade;

-- * RestoreFromTempTable
create table M_SANSHO1 (
  SANSHO1_ID INT not null comment '参照１ID'
  , SANSHO1_MEI VARCHAR(120) not null comment '参照１名'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint M_SANSHO1_PKC primary key (SANSHO1_ID)
) comment '参照１マスタ' ;

-- 参照２マスタ
-- * BackupToTempTable
drop table if exists M_SANSHO2 cascade;

-- * RestoreFromTempTable
create table M_SANSHO2 (
  SANSHO2_CD CHAR(6) not null comment '参照２CD'
  , SANSHO2_MEI VARCHAR(120) not null comment '参照２名'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint M_SANSHO2_PKC primary key (SANSHO2_CD)
) comment '参照２マスタ' ;

-- 参照３マスタ
-- * BackupToTempTable
drop table if exists M_SANSHO3 cascade;

-- * RestoreFromTempTable
create table M_SANSHO3 (
  SANSHO3_NO CHAR(10) not null comment '参照３NO'
  , SANSHO3_MEI VARCHAR(120) not null comment '参照３名'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint M_SANSHO3_PKC primary key (SANSHO3_NO)
) comment '参照３マスタ' ;

-- 職位マスタ
-- * BackupToTempTable
drop table if exists M_SHOKUI cascade;

-- * RestoreFromTempTable
create table M_SHOKUI (
  SHOKUI_ID INT not null comment '職位ID'
  , SHOKUI_MEI VARCHAR(120) not null comment '職位名'
  , SHOKUI_ON INT not null comment '職位順'
  , KAISHI_BI DATE comment '開始日'
  , SHURYO_BI DATE comment '終了日'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint M_SHOKUI_PKC primary key (SHOKUI_ID)
) comment '職位マスタ' ;

-- 所属マスタ
-- * BackupToTempTable
drop table if exists M_SHOZOKU cascade;

-- * RestoreFromTempTable
create table M_SHOZOKU (
  BUSHO_ID INT not null comment '部署ID'
  , SHOKUI_ID INT not null comment '職位ID'
  , USER_ID INT not null comment 'ユーザID'
  , KAISHI_BI DATE comment '開始日'
  , SHURYO_BI DATE comment '終了日'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint M_SHOZOKU_PKC primary key (BUSHO_ID,SHOKUI_ID,USER_ID)
) comment '所属マスタ' ;

-- ユーザマスタ
-- * BackupToTempTable
drop table if exists M_USER cascade;

-- * RestoreFromTempTable
create table M_USER (
  USER_ID INT not null comment 'ユーザID'
  , USER_SEI VARCHAR(120) not null comment 'ユーザ姓'
  , USER_MEI VARCHAR(120) not null comment 'ユーザ名'
  , EMAIL VARCHAR(800) not null comment 'メールアドレス'
  , PASSWORD VARCHAR(800) not null comment 'パスワード'
  , KAISHI_BI DATE comment '開始日'
  , SHURYO_BI DATE comment '終了日'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint M_USER_PKC primary key (USER_ID)
) comment 'ユーザマスタ' ;

-- エンティティ
-- * BackupToTempTable
drop table if exists T_ENTITY cascade;

-- * RestoreFromTempTable
create table T_ENTITY (
  ENTITY_ID INT not null comment 'エンティティID'
  , ENTITY_NM VARCHAR(30) not null comment 'エンティティ名称'
  , ENTITY_MEI VARCHAR(120) not null comment 'エンティティ名'
  , CHECK_F CHAR(1) not null comment 'チェックフラグ'
  , RADIO_KB VARCHAR(2) not null comment 'ラジオ区分'
  , PULLDOWN_KB VARCHAR(2) not null comment 'プルダウン区分'
  , MEMO_TX VARCHAR(800) not null comment 'メモ'
  , NEN_Y CHAR(4) not null comment '年'
  , TSUKI_M CHAR(2) not null comment '月'
  , HI_D CHAR(2) not null comment '日'
  , NENGETSU_YM CHAR(6) not null comment '年月'
  , NENGAPPI_YMD CHAR(8) not null comment '年月日'
  , TIMESTAMP_TS TIMESTAMP not null comment 'タイムスタンプ'
  , NICHIJI_DT DATETIME not null comment '日時'
  , HIDUKE_BI DATE not null comment '日付'
  , JIKOKU_HM TIME not null comment '時刻'
  , JIKAN_TM VARCHAR(9) not null comment '時間'
  , SURYO_QT DECIMAL(9,2) not null comment '数量'
  , TANKA_KG DECIMAL(11,3) not null comment '単価'
  , ZEINUKI_KG DECIMAL(11,3) not null comment '税抜金額'
  , NULL_ENTITY_NM VARCHAR(30) comment '任意エンティティ名称'
  , NULL_ENTITY_MEI VARCHAR(120) comment '任意エンティティ名'
  , NULL_CHECK_F CHAR(1) comment '任意チェックフラグ'
  , NULL_RADIO_KB VARCHAR(2) comment '任意ラジオ区分'
  , NULL_PULLDOWN_KB VARCHAR(2) comment '任意プルダウン区分'
  , NULL_MEMO_TX VARCHAR(800) comment '任意メモ'
  , NULL_NEN_Y CHAR(4) comment '任意年'
  , NULL_TSUKI_M CHAR(2) comment '任意月'
  , NULL_HI_D CHAR(2) comment '任意日'
  , NULL_NENGETSU_YM CHAR(6) comment '任意年月'
  , NULL_NENGAPPI_YMD CHAR(8) comment '任意年月日'
  , NULL_TIMESTAMP_TS TIMESTAMP comment '任意タイムスタンプ'
  , NULL_NICHIJI_DT DATETIME comment '任意日時'
  , NULL_HIDUKE_BI DATE comment '任意日付'
  , NULL_JIKOKU_HM TIME comment '任意時刻'
  , NULL_JIKAN_TM VARCHAR(9) comment '任意時間'
  , NULL_SURYO_QT DECIMAL(9,2) comment '任意数量'
  , NULL_TANKA_KG DECIMAL(11,3) comment '任意単価'
  , NULL_ZEINUKI_KG DECIMAL(11,3) comment '任意税抜金額'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_ENTITY_PKC primary key (ENTITY_ID)
) comment 'エンティティ' ;

-- エンティティ１
-- * BackupToTempTable
drop table if exists T_ENTITY1 cascade;

-- * RestoreFromTempTable
create table T_ENTITY1 (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , ENTITY1_MEI VARCHAR(120) not null comment 'エンティティ名'
  , SANSHO1_ID INT comment '参照１ID'
  , SANSHO1_MEI VARCHAR(120) comment '参照１名'
  , SANSHO2_CD CHAR(6) comment '参照２CD'
  , SANSHO2_MEI VARCHAR(120) comment '参照２名'
  , SANSHO3_NO CHAR(10) comment '参照３NO'
  , SANSHO3_MEI VARCHAR(120) comment '参照３名'
  , BETSU_SANSHO1_ID INT comment '別参照１ID'
  , BETSU_SANSHO1_MEI VARCHAR(120) comment '別参照１名'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_ENTITY1_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) comment 'エンティティ１' ;

-- エンティティ１履歴
-- * BackupToTempTable
drop table if exists T_ENTITY1_HIS cascade;

-- * RestoreFromTempTable
create table T_ENTITY1_HIS (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , HISTORY_BN INT not null comment '履歴枝番'
  , ENTITY1_MEI VARCHAR(120) not null comment 'エンティティ１名'
  , SANSHO1_ID INT comment '参照１ID'
  , SANSHO1_MEI VARCHAR(120) comment '参照１名'
  , SANSHO2_CD CHAR(6) comment '参照２CD'
  , SANSHO2_MEI VARCHAR(120) comment '参照２名'
  , SANSHO3_NO CHAR(10) comment '参照３NO'
  , SANSHO3_MEI VARCHAR(120) comment '参照３名'
  , BETSU_SANSHO1_ID INT comment '別参照１ID'
  , BETSU_SANSHO1_MEI VARCHAR(120) comment '別参照１名'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_ENTITY1_HIS_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,HISTORY_BN)
) comment 'エンティティ１履歴' ;

-- エンティティ２
-- * BackupToTempTable
drop table if exists T_ENTITY2 cascade;

-- * RestoreFromTempTable
create table T_ENTITY2 (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , ENTITY2_MEI VARCHAR(120) not null comment 'エンティティ２名'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_ENTITY2_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) comment 'エンティティ２' ;

-- エンティティ３
-- * BackupToTempTable
drop table if exists T_ENTITY3 cascade;

-- * RestoreFromTempTable
create table T_ENTITY3 (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , ENTITY3_MEI VARCHAR(120) not null comment 'エンティティ３名'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_ENTITY3_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) comment 'エンティティ３' ;

-- エンティティ４
-- * BackupToTempTable
drop table if exists T_ENTITY4 cascade;

-- * RestoreFromTempTable
create table T_ENTITY4 (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , ENTITY4_MEI VARCHAR(120) not null comment 'エンティティ４名'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_ENTITY4_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) comment 'エンティティ４' ;

-- エンティティ５
-- * BackupToTempTable
drop table if exists T_ENTITY5 cascade;

-- * RestoreFromTempTable
create table T_ENTITY5 (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , ENTITY5_MEI VARCHAR(120) not null comment 'エンティティ５名'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_ENTITY5_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) comment 'エンティティ５' ;

-- 従妹
-- * BackupToTempTable
drop table if exists T_ITOKO cascade;

-- * RestoreFromTempTable
create table T_ITOKO (
  ITOKO_ID INT comment '従妹ID'
  , ITOKO_MEI VARCHAR(120) comment '従妹名'
  , SOSEN_ID INT comment '祖先ID'
  , OYA_BN INT comment '親枝番'
  , ENTITY_BN INT comment 'エンティティ枝番'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_ITOKO_PKC primary key (ITOKO_ID)
) comment '従妹' ;

-- 子
-- * BackupToTempTable
drop table if exists T_KO cascade;

-- * RestoreFromTempTable
create table T_KO (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , KO_BN INT not null comment '子枝番'
  , KO_MEI VARCHAR(120) not null comment '子名'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_KO_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,KO_BN)
) comment '子' ;

-- 主キーなし
-- * BackupToTempTable
drop table if exists T_NO_PK cascade;

-- * RestoreFromTempTable
create table T_NO_PK (
  COLUMN_A VARCHAR(120) comment '列Ａ'
  , COLUMN_B VARCHAR(120) comment '列Ｂ'
  , COLUMN_C VARCHAR(120) comment '列Ｃ'
  , COLUMN_D VARCHAR(120) comment '列Ｄ'
  , COLUMN_E VARCHAR(120) comment '列Ｅ'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
) comment '主キーなし' ;

create unique index T_NO_PK_IX1
  on T_NO_PK(COLUMN_A);

create unique index T_NO_PK_IX2
  on T_NO_PK(COLUMN_B,COLUMN_C);

-- 親
-- * BackupToTempTable
drop table if exists T_OYA cascade;

-- * RestoreFromTempTable
create table T_OYA (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , OYA_MEI VARCHAR(120) not null comment '親名'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_OYA_PKC primary key (SOSEN_ID,OYA_BN)
) comment '親' ;

-- 子孫
-- * BackupToTempTable
drop table if exists T_SHISON cascade;

-- * RestoreFromTempTable
create table T_SHISON (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , KO_BN INT not null comment '子枝番'
  , SHISON_BN INT not null comment '子孫枝番'
  , SHISON_MEI VARCHAR(120) not null comment '子孫名'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_SHISON_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,KO_BN,SHISON_BN)
) comment '子孫' ;

-- 祖先
-- * BackupToTempTable
drop table if exists T_SOSEN cascade;

-- * RestoreFromTempTable
create table T_SOSEN (
  SOSEN_ID INT not null comment '祖先ID'
  , SOSEN_MEI VARCHAR(120) not null comment '祖先名'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_SOSEN_PKC primary key (SOSEN_ID)
) comment '祖先' ;

-- 添付ファイル
-- * BackupToTempTable
drop table if exists T_TENPU_FILE cascade;

-- * RestoreFromTempTable
create table T_TENPU_FILE (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , TENPU_FILE_BN INT not null comment '添付ファイル枝番'
  , TENPU_FILE_MEI VARCHAR(120) not null comment '添付ファイル名'
  , TENPU_FILE_PATH VARCHAR(256) not null comment '添付ファイルパス'
  , INSERT_DT DATETIME not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_TENPU_FILE_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,TENPU_FILE_BN)
) comment '添付ファイル' ;

