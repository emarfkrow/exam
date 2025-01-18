-- Project Name : emarf
-- Date/Time    : 2025/01/18 13:56:37
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

-- 参照１マスタ
-- * BackupToTempTable
drop table if exists MB1_SANSHO1 cascade;

-- * RestoreFromTempTable
create table MB1_SANSHO1 (
  SANSHO1_ID INT not null comment '参照１ID'
  , SANSHO1_MEI VARCHAR(60) not null comment '参照１名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MB1_SANSHO1_PKC primary key (SANSHO1_ID)
) comment '参照１マスタ' ;

-- 参照２マスタ
-- * BackupToTempTable
drop table if exists MB1_SANSHO2 cascade;

-- * RestoreFromTempTable
create table MB1_SANSHO2 (
  SANSHO2_CD CHAR(10) not null comment '参照２CD'
  , SANSHO2_MEI VARCHAR(60) not null comment '参照２名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MB1_SANSHO2_PKC primary key (SANSHO2_CD)
) comment '参照２マスタ' ;

-- 参照３マスタ
-- * BackupToTempTable
drop table if exists MB1_SANSHO3 cascade;

-- * RestoreFromTempTable
create table MB1_SANSHO3 (
  SANSHO3_NO CHAR(10) not null comment '参照３NO'
  , SANSHO3_MEI VARCHAR(60) not null comment '参照３名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MB1_SANSHO3_PKC primary key (SANSHO3_NO)
) comment '参照３マスタ' ;

-- 部署マスタ
-- * BackupToTempTable
drop table if exists MHR_BUSHO cascade;

-- * RestoreFromTempTable
create table MHR_BUSHO (
  BUSHO_ID INT not null comment '部署ID'
  , BUSHO_MEI VARCHAR(60) not null comment '部署名'
  , OYA_BUSHO_ID INT comment '親部署ID'
  , KAISHI_BI DATE comment '開始日'
  , SHURYO_BI DATE comment '終了日'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MHR_BUSHO_PKC primary key (BUSHO_ID)
) comment '部署マスタ' ;

-- 認可マスタ
-- * BackupToTempTable
drop table if exists MHR_NINKA cascade;

-- * RestoreFromTempTable
create table MHR_NINKA (
  BUSHO_ID INT not null comment '部署ID'
  , SHOKUI_ID INT not null comment '職位ID'
  , KINO_NM VARCHAR(20) not null comment '機能名称'
  , KENGEN_KB VARCHAR(2) not null comment '権限区分'
  , KAISHI_BI DATE comment '開始日'
  , SHURYO_BI DATE comment '終了日'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MHR_NINKA_PKC primary key (BUSHO_ID,SHOKUI_ID,KINO_NM)
) comment '認可マスタ' ;

-- 職位マスタ
-- * BackupToTempTable
drop table if exists MHR_SHOKUI cascade;

-- * RestoreFromTempTable
create table MHR_SHOKUI (
  SHOKUI_ID INT not null comment '職位ID'
  , SHOKUI_MEI VARCHAR(60) not null comment '職位名'
  , SHOKUI_ON INT not null comment '職位順'
  , KAISHI_BI DATE comment '開始日'
  , SHURYO_BI DATE comment '終了日'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MHR_SHOKUI_PKC primary key (SHOKUI_ID)
) comment '職位マスタ' ;

-- 所属マスタ
-- * BackupToTempTable
drop table if exists MHR_SHOZOKU cascade;

-- * RestoreFromTempTable
create table MHR_SHOZOKU (
  BUSHO_ID INT not null comment '部署ID'
  , SHOKUI_ID INT not null comment '職位ID'
  , USER_ID INT not null comment 'ユーザID'
  , KAISHI_BI DATE not null comment '開始日'
  , SHURYO_BI DATE comment '終了日'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MHR_SHOZOKU_PKC primary key (BUSHO_ID,SHOKUI_ID,USER_ID,KAISHI_BI)
) comment '所属マスタ' ;

-- ユーザマスタ
-- * BackupToTempTable
drop table if exists MHR_USER cascade;

-- * RestoreFromTempTable
create table MHR_USER (
  USER_ID INT not null comment 'ユーザID'
  , USER_SEI VARCHAR(60) not null comment 'ユーザ姓'
  , USER_MEI VARCHAR(60) not null comment 'ユーザ名'
  , E_MAIL VARCHAR(300) not null comment 'メールアドレス'
  , PASSWORD VARCHAR(300) not null comment 'パスワード'
  , KAISHI_BI DATE comment '開始日'
  , SHURYO_BI DATE comment '終了日'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MHR_USER_PKC primary key (USER_ID)
) comment 'ユーザマスタ' ;

-- 区分マスタ
-- * BackupToTempTable
drop table if exists MSY_KBN cascade;

-- * RestoreFromTempTable
create table MSY_KBN (
  KBN_NM VARCHAR(20) not null comment '区分名称'
  , KBN_MEI VARCHAR(60) not null comment '区分名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MSY_KBN_PKC primary key (KBN_NM)
) comment '区分マスタ' ;

-- 区分値マスタ
-- * BackupToTempTable
drop table if exists MSY_KBN_VAL cascade;

-- * RestoreFromTempTable
create table MSY_KBN_VAL (
  KBN_NM VARCHAR(20) not null comment '区分名称'
  , KBN_VAL VARCHAR(2) not null comment '区分値'
  , KBN_VAL_MEI VARCHAR(60) not null comment '区分値名'
  , HYOJI_ON INT comment '表示順'
  , CRITERIA VARCHAR(300) comment '取得条件'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MSY_KBN_VAL_PKC primary key (KBN_NM,KBN_VAL)
) comment '区分値マスタ' ;

-- 税マスタ
-- * BackupToTempTable
drop table if exists MSY_TAX cascade;

-- * RestoreFromTempTable
create table MSY_TAX (
  TAX_KB VARCHAR(2) comment '税区分'
  , KAISHI_BI DATE comment '開始日'
  , SHURYO_BI DATE comment '終了日'
  , TAX_RT DECIMAL(5,2) comment '税率'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MSY_TAX_PKC primary key (TAX_KB,KAISHI_BI)
) comment '税マスタ' ;

-- 通貨マスタ
-- * BackupToTempTable
drop table if exists MSY_TSUKA cascade;

-- * RestoreFromTempTable
create table MSY_TSUKA (
  TSUKA_KB VARCHAR(2) comment '通貨区分'
  , TEKIYO_BI DATE comment '適用日'
  , TSUKA_RT DECIMAL(5,2) comment '通貨レート'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MSY_TSUKA_PKC primary key (TSUKA_KB,TEKIYO_BI)
) comment '通貨マスタ' ;

-- エンティティ１
-- * BackupToTempTable
drop table if exists TB1_ENTITY1 cascade;

-- * RestoreFromTempTable
create table TB1_ENTITY1 (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , ENTITY1_MEI VARCHAR(60) not null comment 'エンティティ名'
  , SANSHO1_ID INT comment '参照１ID'
  , SANSHO1_MEI VARCHAR(60) comment '参照１名'
  , SANSHO2_CD CHAR(10) comment '参照２CD'
  , SANSHO2_MEI VARCHAR(60) comment '参照２名'
  , SANSHO3_NO CHAR(10) comment '参照３NO'
  , SANSHO3_MEI VARCHAR(60) comment '参照３名'
  , BETSU_SANSHO1_ID INT comment '別参照１ID'
  , BETSU_SANSHO1_MEI VARCHAR(60) comment '別参照１名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_ENTITY1_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) comment 'エンティティ１' ;

-- エンティティ１履歴
-- * BackupToTempTable
drop table if exists TB1_ENTITY1_HIS cascade;

-- * RestoreFromTempTable
create table TB1_ENTITY1_HIS (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , HISTORY_BN INT not null comment '履歴枝番'
  , ENTITY1_MEI VARCHAR(60) not null comment 'エンティティ１名'
  , SANSHO1_ID INT comment '参照１ID'
  , SANSHO1_MEI VARCHAR(60) comment '参照１名'
  , SANSHO2_CD CHAR(10) comment '参照２CD'
  , SANSHO2_MEI VARCHAR(60) comment '参照２名'
  , SANSHO3_NO CHAR(10) comment '参照３NO'
  , SANSHO3_MEI VARCHAR(60) comment '参照３名'
  , BETSU_SANSHO1_ID INT comment '別参照１ID'
  , BETSU_SANSHO1_MEI VARCHAR(60) comment '別参照１名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_ENTITY1_HIS_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,HISTORY_BN)
) comment 'エンティティ１履歴' ;

-- エンティティ２
-- * BackupToTempTable
drop table if exists TB1_ENTITY2 cascade;

-- * RestoreFromTempTable
create table TB1_ENTITY2 (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , ENTITY2_MEI VARCHAR(60) not null comment 'エンティティ２名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_ENTITY2_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) comment 'エンティティ２' ;

-- エンティティ３
-- * BackupToTempTable
drop table if exists TB1_ENTITY3 cascade;

-- * RestoreFromTempTable
create table TB1_ENTITY3 (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , ENTITY3_MEI VARCHAR(60) not null comment 'エンティティ３名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_ENTITY3_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) comment 'エンティティ３' ;

-- エンティティ４
-- * BackupToTempTable
drop table if exists TB1_ENTITY4 cascade;

-- * RestoreFromTempTable
create table TB1_ENTITY4 (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , ENTITY4_MEI VARCHAR(60) not null comment 'エンティティ４名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_ENTITY4_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) comment 'エンティティ４' ;

-- エンティティ５
-- * BackupToTempTable
drop table if exists TB1_ENTITY5 cascade;

-- * RestoreFromTempTable
create table TB1_ENTITY5 (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , ENTITY5_MEI VARCHAR(60) not null comment 'エンティティ５名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_ENTITY5_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) comment 'エンティティ５' ;

-- 従妹
-- * BackupToTempTable
drop table if exists TB1_ITOKO cascade;

-- * RestoreFromTempTable
create table TB1_ITOKO (
  ITOKO_ID INT comment '従妹ID'
  , ITOKO_MEI VARCHAR(60) comment '従妹名'
  , SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_ITOKO_PKC primary key (ITOKO_ID)
) comment '従妹' ;

-- 子
-- * BackupToTempTable
drop table if exists TB1_KO cascade;

-- * RestoreFromTempTable
create table TB1_KO (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , KO_BN INT not null comment '子枝番'
  , KO_MEI VARCHAR(60) not null comment '子名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_KO_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,KO_BN)
) comment '子' ;

-- 親
-- * BackupToTempTable
drop table if exists TB1_OYA cascade;

-- * RestoreFromTempTable
create table TB1_OYA (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , OYA_MEI VARCHAR(60) not null comment '親名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_OYA_PKC primary key (SOSEN_ID,OYA_BN)
) comment '親' ;

-- 子孫
-- * BackupToTempTable
drop table if exists TB1_SHISON cascade;

-- * RestoreFromTempTable
create table TB1_SHISON (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , KO_BN INT not null comment '子枝番'
  , SHISON_BN INT not null comment '子孫枝番'
  , SHISON_MEI VARCHAR(60) not null comment '子孫名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_SHISON_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,KO_BN,SHISON_BN)
) comment '子孫' ;

-- 祖先
-- * BackupToTempTable
drop table if exists TB1_SOSEN cascade;

-- * RestoreFromTempTable
create table TB1_SOSEN (
  SOSEN_ID INT not null comment '祖先ID'
  , MEMO VARCHAR(300) comment 'メモ'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_SOSEN_PKC primary key (SOSEN_ID)
) comment '祖先' ;

-- 祖先明細
-- * BackupToTempTable
drop table if exists TB1_SOSEN_DET cascade;

-- * RestoreFromTempTable
create table TB1_SOSEN_DET (
  SOSEN_ID INT comment '祖先ID'
  , SOSEN_BN INT comment '祖先枝番'
  , MEMO VARCHAR(300) comment 'メモ'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_SOSEN_DET_PKC primary key (SOSEN_ID,SOSEN_BN)
) comment '祖先明細' ;

-- 添付ファイル
-- * BackupToTempTable
drop table if exists TB1_TENPU_FILE cascade;

-- * RestoreFromTempTable
create table TB1_TENPU_FILE (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , TENPU_FILE_BN INT not null comment '添付ファイル枝番'
  , TENPU_FILE_MEI VARCHAR(60) not null comment '添付ファイル名'
  , TENPU_FILE_PATH VARCHAR(256) not null comment '添付ファイルパス'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_TENPU_FILE_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,TENPU_FILE_BN)
) comment '添付ファイル' ;

-- 転生
-- * BackupToTempTable
drop table if exists TB1_TENSEI cascade;

-- * RestoreFromTempTable
create table TB1_TENSEI (
  TENSEI_ID INT comment '転生ID'
  , TENSEI_MEI VARCHAR(60) not null comment '転生名'
  , SOSEN_ID INT not null comment '祖先ID'
  , MEMO VARCHAR(300) comment 'メモ'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_TENSEI_PKC primary key (TENSEI_ID)
) comment '転生' ;

-- 転生明細
-- * BackupToTempTable
drop table if exists TB1_TENSEI_DET cascade;

-- * RestoreFromTempTable
create table TB1_TENSEI_DET (
  TENSEI_ID INT comment '転生ID'
  , TENSEI_BN INT comment '転生枝番'
  , MEMO VARCHAR(300) comment 'メモ'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_TENSEI_DET_PKC primary key (TENSEI_ID,TENSEI_BN)
) comment '転生明細' ;

-- エンティティ
-- * BackupToTempTable
drop table if exists TB2_ENTITY cascade;

-- * RestoreFromTempTable
create table TB2_ENTITY (
  ENTITY_ID INT not null comment 'エンティティID'
  , ENTITY_NM VARCHAR(20) not null comment 'エンティティ名称'
  , ENTITY_MEI VARCHAR(60) not null comment 'エンティティ名'
  , CHECK_F CHAR(1) not null comment 'チェックフラグ'
  , RADIO_KB VARCHAR(2) not null comment 'ラジオ区分'
  , PULLDOWN_KB VARCHAR(2) not null comment 'プルダウン区分'
  , PULLDOWN_SB VARCHAR(2) not null comment 'プルダウン種別'
  , MEMO_TX VARCHAR(300) not null comment 'メモ'
  , MEMO VARCHAR(300) not null comment '１行メモ'
  , FILE_PATH VARCHAR(300) not null comment 'ファイルパス'
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
  , SURYO_QT DECIMAL(11,3) not null comment '数量'
  , TANKA_PR DECIMAL(11,2) not null comment '単価'
  , TSUKA_KB VARCHAR(2) not null comment '通貨区分'
  , ZEINUKI_AM DECIMAL(11,2) not null comment '税抜金額'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB2_ENTITY_PKC primary key (ENTITY_ID)
) comment 'エンティティ' ;

-- 主キーなし
-- * BackupToTempTable
drop table if exists TB2_NO_PK cascade;

-- * RestoreFromTempTable
create table TB2_NO_PK (
  COLUMN_A VARCHAR(60) comment '列Ａ'
  , COLUMN_B VARCHAR(60) comment '列Ｂ'
  , COLUMN_C VARCHAR(60) comment '列Ｃ'
  , COLUMN_D VARCHAR(60) comment '列Ｄ'
  , COLUMN_E VARCHAR(60) comment '列Ｅ'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
) comment '主キーなし' ;

create unique index TB2_NO_PK_IX1
  on TB2_NO_PK(COLUMN_A);

create unique index TB2_NO_PK_IX2
  on TB2_NO_PK(COLUMN_B,COLUMN_C);

-- 子孫
drop view if exists VB1_SHISON;

create view VB1_SHISON as 
SELECT
    'TB1_SOSEN' AS entity_name
    , TB1_SOSEN.SOSEN_ID
    , TB1_OYA.OYA_MEI
    , TB1_ENTITY1.ENTITY1_MEI
    , TB1_KO.KO_MEI
    , TB1_SHISON.SHISON_MEI
    , TB1_SOSEN.SOSEN_ID AS SEARCH_SOSEN_ID
    , TB1_OYA.OYA_BN AS SEARCH_OYA_BN
    , TB1_ENTITY1.ENTITY_BN AS SEARCH_ENTITY_BN
    , TB1_KO.KO_BN AS SEARCH_KO_BN
    , TB1_SHISON.SHISON_BN AS SEARCH_SHISON_BN
    , TB1_SOSEN.INSERT_TS 
FROM
    TB1_SOSEN 
    LEFT OUTER JOIN TB1_OYA 
        ON TB1_OYA.SOSEN_ID = TB1_SOSEN.SOSEN_ID 
    LEFT OUTER JOIN TB1_ENTITY1 
        ON TB1_OYA.SOSEN_ID = TB1_ENTITY1.SOSEN_ID 
        AND TB1_OYA.OYA_BN = TB1_ENTITY1.OYA_BN 
    LEFT OUTER JOIN TB1_KO 
        ON TB1_ENTITY1.SOSEN_ID = TB1_KO.SOSEN_ID 
        AND TB1_ENTITY1.OYA_BN = TB1_KO.OYA_BN 
        AND TB1_ENTITY1.ENTITY_BN = TB1_KO.ENTITY_BN 
    LEFT OUTER JOIN TB1_SHISON 
        ON TB1_KO.SOSEN_ID = TB1_SHISON.SOSEN_ID 
        AND TB1_KO.OYA_BN = TB1_SHISON.OYA_BN 
        AND TB1_KO.ENTITY_BN = TB1_SHISON.ENTITY_BN 
        AND TB1_KO.KO_BN = TB1_SHISON.KO_BN 
ORDER BY
    TB1_SOSEN.SOSEN_ID
    , TB1_OYA.OYA_BN
    , TB1_ENTITY1.ENTITY_BN
    , TB1_KO.KO_BN
    , TB1_SHISON.SHISON_BN

;

-- エンティティ検索
drop view if exists VB2_ENTITY;

create view VB2_ENTITY as 
SELECT
    tb2_entity.* 
FROM
    tb2_entity

;

