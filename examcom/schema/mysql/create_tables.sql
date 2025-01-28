-- Project Name : emarf
-- Date/Time    : 2025/01/28 19:45:49
-- Author       : toshiyuki
-- RDBMS Type   : MySQL
-- Application  : A5:SQL Mk-2

-- CD参照マスタ
drop table if exists MB4_CDSANSHO cascade;

create table MB4_CDSANSHO (
  CDSANSHO_CD CHAR(10) comment 'CD参照CD'
  , CDSANSHO_MEI VARCHAR(60) not null comment 'CD参照名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MB4_CDSANSHO_PKC primary key (CDSANSHO_CD)
) comment 'CD参照マスタ' ;

-- ID参照マスタ
drop table if exists MB4_IDSANSHO cascade;

create table MB4_IDSANSHO (
  IDSANSHO_ID INT comment 'ID参照ID'
  , IDSANSHO_MEI VARCHAR(60) not null comment 'ID参照名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MB4_IDSANSHO_PKC primary key (IDSANSHO_ID)
) comment 'ID参照マスタ' ;

-- NO参照マスタ
drop table if exists MB4_NOSANSHO cascade;

create table MB4_NOSANSHO (
  NOSANSHO_NO CHAR(10) comment 'NO参照NO'
  , NOSANSHO_MEI VARCHAR(60) not null comment 'NO参照名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MB4_NOSANSHO_PKC primary key (NOSANSHO_NO)
) comment 'NO参照マスタ' ;

-- 参照１マスタ
drop table if exists MB7_SANSHO1 cascade;

create table MB7_SANSHO1 (
  SANSHO1_ID INT comment '参照１ID'
  , SANSHO1_MEI VARCHAR(60) not null comment '参照１名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MB7_SANSHO1_PKC primary key (SANSHO1_ID)
) comment '参照１マスタ' ;

-- 参照２マスタ
drop table if exists MB7_SANSHO2 cascade;

create table MB7_SANSHO2 (
  SANSHO2_ID INT comment '参照２ID'
  , SANSHO2_MEI VARCHAR(60) not null comment '参照２名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MB7_SANSHO2_PKC primary key (SANSHO2_ID)
) comment '参照２マスタ' ;

-- 部署マスタ
drop table if exists MHR_BUSHO cascade;

create table MHR_BUSHO (
  BUSHO_ID INT not null comment '部署ID'
  , BUSHO_MEI VARCHAR(60) not null comment '部署名'
  , OYA_BUSHO_ID INT comment '親部署ID'
  , TEKIYO_BI DATE comment '適用日'
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
drop table if exists MHR_NINKA cascade;

create table MHR_NINKA (
  BUSHO_ID INT not null comment '部署ID'
  , SHOKUI_ID INT not null comment '職位ID'
  , KINO_NM VARCHAR(20) not null comment '機能名称'
  , KENGEN_KB VARCHAR(2) not null comment '権限区分'
  , TEKIYO_BI DATE comment '適用日'
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
drop table if exists MHR_SHOKUI cascade;

create table MHR_SHOKUI (
  SHOKUI_ID INT not null comment '職位ID'
  , SHOKUI_MEI VARCHAR(60) not null comment '職位名'
  , SHOKUI_ON INT not null comment '職位順'
  , TEKIYO_BI DATE comment '適用日'
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
drop table if exists MHR_SHOZOKU cascade;

create table MHR_SHOZOKU (
  BUSHO_ID INT not null comment '部署ID'
  , SHOKUI_ID INT not null comment '職位ID'
  , USER_ID INT not null comment 'ユーザID'
  , TEKIYO_BI DATE not null comment '適用日'
  , SHURYO_BI DATE comment '終了日'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MHR_SHOZOKU_PKC primary key (BUSHO_ID,SHOKUI_ID,USER_ID,TEKIYO_BI)
) comment '所属マスタ' ;

-- ユーザマスタ
drop table if exists MHR_USER cascade;

create table MHR_USER (
  USER_ID INT not null comment 'ユーザID'
  , USER_SEI VARCHAR(60) not null comment 'ユーザ姓'
  , USER_MEI VARCHAR(60) not null comment 'ユーザ名'
  , E_MAIL VARCHAR(300) not null comment 'メールアドレス'
  , PASSWORD VARCHAR(300) not null comment 'パスワード'
  , TEKIYO_BI DATE comment '適用日'
  , SHURYO_BI DATE comment '終了日'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MHR_USER_PKC primary key (USER_ID)
) comment 'ユーザマスタ' ;

-- 稼働日マスタ
drop table if exists MSY_KADOBI cascade;

create table MSY_KADOBI (
  KADO_BI DATE comment '稼働日'
  , BUSHO_KB VARCHAR(2) comment '部署区分'
  , KADOBI_F CHAR(1) not null comment '稼働日フラグ'
  , MEMO VARCHAR(300) comment 'メモ'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MSY_KADOBI_PKC primary key (KADO_BI,BUSHO_KB)
) comment '稼働日マスタ' ;

-- 区分マスタ
drop table if exists MSY_KBN cascade;

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
drop table if exists MSY_KBN_VAL cascade;

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
drop table if exists MSY_TAX cascade;

create table MSY_TAX (
  TAX_KB VARCHAR(2) comment '税区分'
  , TEKIYO_BI DATE comment '適用日'
  , SHURYO_BI DATE comment '終了日'
  , TAX_RT DECIMAL(5,2) comment '税率'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MSY_TAX_PKC primary key (TAX_KB,TEKIYO_BI)
) comment '税マスタ' ;

-- 通貨マスタ
drop table if exists MSY_TSUKA cascade;

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

-- エンティティ
drop table if exists TB0_ENTITY cascade;

create table TB0_ENTITY (
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
  , constraint TB0_ENTITY_PKC primary key (ENTITY_ID)
) comment 'エンティティ' ;

-- 主キーなし
drop table if exists TB0_NOKEY cascade;

create table TB0_NOKEY (
  COL_A VARCHAR(60) comment '列Ａ'
  , COL_B VARCHAR(60) comment '列Ｂ'
  , COL_C VARCHAR(60) comment '列Ｃ'
  , COL_D VARCHAR(60) comment '列Ｄ'
  , COL_E VARCHAR(60) comment '列Ｅ'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
) comment '主キーなし' ;

create unique index TB0_NOKEY_IX1
  on TB0_NOKEY(COL_A,COL_B);

create unique index TB0_NOKEY_IX2
  on TB0_NOKEY(COL_C);

-- 子
drop table if exists TB1_KO cascade;

create table TB1_KO (
  OYA_ID INT comment '親ID'
  , KO_BN INT comment '子枝番'
  , KO_INFO VARCHAR(300) comment '子情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_KO_PKC primary key (OYA_ID,KO_BN)
) comment '子' ;

-- 履歴
drop table if exists TB1_KO_RIREKI cascade;

create table TB1_KO_RIREKI (
  OYA_ID INT comment '親ID'
  , KO_BN INT comment '子枝番'
  , RIREKI_BN INT comment '履歴枝番'
  , KO_INFO VARCHAR(300) comment '子情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_KO_RIREKI_PKC primary key (OYA_ID,KO_BN,RIREKI_BN)
) comment '履歴' ;

-- 孫
drop table if exists TB1_MAGO cascade;

create table TB1_MAGO (
  OYA_ID INT comment '親ID'
  , KO_BN INT comment '子枝番'
  , MAGO_BN INT comment '孫枝番'
  , MAGO_INFO VARCHAR(300) comment '孫情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_MAGO_PKC primary key (OYA_ID,KO_BN,MAGO_BN)
) comment '孫' ;

-- 親
drop table if exists TB1_OYA cascade;

create table TB1_OYA (
  OYA_ID INT comment '親ID'
  , OYA_INFO VARCHAR(300) comment '親情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_OYA_PKC primary key (OYA_ID)
) comment '親' ;

-- 兄弟２
drop table if exists TB3_KYODAI2 cascade;

create table TB3_KYODAI2 (
  OYA_ID INT comment '親ID'
  , KO_BN INT comment '子枝番'
  , KYODAI2_INFO VARCHAR(300) comment '兄弟２情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB3_KYODAI2_PKC primary key (OYA_ID,KO_BN)
) comment '兄弟２' ;

-- 兄弟３
drop table if exists TB3_KYODAI3 cascade;

create table TB3_KYODAI3 (
  OYA_ID INT comment '親ID'
  , KO_BN INT comment '子枝番'
  , KYODAI3_INFO VARCHAR(300) comment '兄弟３情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB3_KYODAI3_PKC primary key (OYA_ID,KO_BN)
) comment '兄弟３' ;

-- 兄弟４
drop table if exists TB3_KYODAI4 cascade;

create table TB3_KYODAI4 (
  OYA_ID INT comment '親ID'
  , KO_BN INT comment '子枝番'
  , KYODAI4_INFO VARCHAR(300) comment '兄弟４情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB3_KYODAI4_PKC primary key (OYA_ID,KO_BN)
) comment '兄弟４' ;

-- 兄弟５
drop table if exists TB3_KYODAI5 cascade;

create table TB3_KYODAI5 (
  OYA_ID INT comment '親ID'
  , KO_BN INT comment '子枝番'
  , KYODAI5_INFO VARCHAR(300) comment '兄弟５情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB3_KYODAI5_PKC primary key (OYA_ID,KO_BN)
) comment '兄弟５' ;

-- 参照元
drop table if exists TB4_SANSHOMOTO cascade;

create table TB4_SANSHOMOTO (
  SANSHOMOTO_ID INT not null comment '参照元ID'
  , IDSANSHO_ID INT comment 'ID参照ID'
  , IDSANSHO_MEI VARCHAR(60) comment 'ID参照名'
  , CDSANSHO_CD CHAR(10) comment 'CD参照CD'
  , CDSANSHO_MEI VARCHAR(60) comment 'CD参照名'
  , NOSANSHO_NO CHAR(10) comment 'NO参照NO'
  , NOSANSHO_MEI VARCHAR(60) comment 'NO参照名'
  , BETSU_IDSANSHO_ID INT comment '別ID参照ID'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB4_SANSHOMOTO_PKC primary key (SANSHOMOTO_ID)
) comment '参照元' ;

-- 転生元
drop table if exists TB5_TENSEIMOTO cascade;

create table TB5_TENSEIMOTO (
  TENSEIMOTO_ID INT not null comment '転生元ID'
  , TENSEIMOTO_INFO VARCHAR(300) comment '転生元情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB5_TENSEIMOTO_PKC primary key (TENSEIMOTO_ID)
) comment '転生元' ;

-- 転生元明細
drop table if exists TB5_TENSEIMOTO_DET cascade;

create table TB5_TENSEIMOTO_DET (
  TENSEIMOTO_ID INT comment '転生元ID'
  , TENSEIMOTO_BN INT comment '転生元枝番'
  , TENSEIMOTO_DET_INFO VARCHAR(300) comment '転生元明細情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB5_TENSEIMOTO_DET_PKC primary key (TENSEIMOTO_ID,TENSEIMOTO_BN)
) comment '転生元明細' ;

-- 転生先
drop table if exists TB5_TENSEISAKI cascade;

create table TB5_TENSEISAKI (
  TENSEISAKI_ID INT comment '転生先ID'
  , TENSEIMOTO_ID INT not null comment '転生元ID'
  , TENSEISAKI_INFO VARCHAR(300) comment '転生先情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB5_TENSEISAKI_PKC primary key (TENSEISAKI_ID)
) comment '転生先' ;

-- 転生先明細
drop table if exists TB5_TENSEISAKI_DET cascade;

create table TB5_TENSEISAKI_DET (
  TENSEISAKI_ID INT comment '転生先ID'
  , TENSEISAKI_BN INT comment '転生先枝番'
  , TENSEISAKI_DET_INFO VARCHAR(300) comment '転生先明細情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB5_TENSEISAKI_DET_PKC primary key (TENSEISAKI_ID,TENSEISAKI_BN)
) comment '転生先明細' ;

-- 集約元
drop table if exists TB6_SHUYAKUMOTO cascade;

create table TB6_SHUYAKUMOTO (
  SHUYAKUMOTO_ID INT comment '集約元ID'
  , SHUYAKUSAKI_ID INT comment '集約先ID'
  , SHUYAKUMOTO_INFO VARCHAR(300) comment '集約元情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB6_SHUYAKUMOTO_PKC primary key (SHUYAKUMOTO_ID)
) comment '集約元' ;

-- 集約先
drop table if exists TB6_SHUYAKUSAKI cascade;

create table TB6_SHUYAKUSAKI (
  SHUYAKUSAKI_ID INT comment '集約先ID'
  , SHUYAKUSAKI_INFO VARCHAR(300) comment '集約先情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB6_SHUYAKUSAKI_PKC primary key (SHUYAKUSAKI_ID)
) comment '集約先' ;

-- 複合
drop table if exists TB7_FUKUGO cascade;

create table TB7_FUKUGO (
  SANSHO1_ID INT comment '参照１ID'
  , SANSHO2_ID INT comment '参照２ID'
  , TEKIYO_BI DATE comment '適用日'
  , FUKUGO_INFO VARCHAR(300) comment '複合情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB7_FUKUGO_PKC primary key (SANSHO1_ID,SANSHO2_ID,TEKIYO_BI)
) comment '複合' ;

