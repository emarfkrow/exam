-- Project Name : emarf
-- Date/Time    : 2024/12/26 19:38:05
-- Author       : toshiyuki
-- RDBMS Type   : MySQL
-- Application  : A5:SQL Mk-2

-- 参照１マスタ
create table MB1_SANSHO1 (
  SANSHO1_ID INT not null comment '参照１ID'
  , SANSHO1_MEI VARCHAR(60) not null comment '参照１名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MB1_SANSHO1_PKC primary key (SANSHO1_ID)
) comment '参照１マスタ' ;

-- 参照２マスタ
create table MB1_SANSHO2 (
  SANSHO2_CD CHAR(6) not null comment '参照２CD'
  , SANSHO2_MEI VARCHAR(60) not null comment '参照２名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MB1_SANSHO2_PKC primary key (SANSHO2_CD)
) comment '参照２マスタ' ;

-- 参照３マスタ
create table MB1_SANSHO3 (
  SANSHO3_NO CHAR(10) not null comment '参照３NO'
  , SANSHO3_MEI VARCHAR(60) not null comment '参照３名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MB1_SANSHO3_PKC primary key (SANSHO3_NO)
) comment '参照３マスタ' ;

-- 部署マスタ
create table MHR_BUSHO (
  BUSHO_ID INT not null comment '部署ID'
  , BUSHO_MEI VARCHAR(60) not null comment '部署名'
  , OYA_BUSHO_ID INT comment '親部署ID'
  , KAISHI_BI DATE comment '開始日'
  , SHURYO_BI DATE comment '終了日'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MHR_BUSHO_PKC primary key (BUSHO_ID)
) comment '部署マスタ' ;

-- 認可マスタ
create table MHR_NINKA (
  BUSHO_ID INT not null comment '部署ID'
  , SHOKUI_ID INT not null comment '職位ID'
  , KINO_NM VARCHAR(20) not null comment '機能名称'
  , KENGEN_KB VARCHAR(2) not null comment '権限区分'
  , KAISHI_BI DATE comment '開始日'
  , SHURYO_BI DATE comment '終了日'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MHR_NINKA_PKC primary key (BUSHO_ID,SHOKUI_ID,KINO_NM)
) comment '認可マスタ' ;

-- 職位マスタ
create table MHR_SHOKUI (
  SHOKUI_ID INT not null comment '職位ID'
  , SHOKUI_MEI VARCHAR(60) not null comment '職位名'
  , SHOKUI_ON INT not null comment '職位順'
  , KAISHI_BI DATE comment '開始日'
  , SHURYO_BI DATE comment '終了日'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MHR_SHOKUI_PKC primary key (SHOKUI_ID)
) comment '職位マスタ' ;

-- 所属マスタ
create table MHR_SHOZOKU (
  BUSHO_ID INT not null comment '部署ID'
  , SHOKUI_ID INT not null comment '職位ID'
  , USER_ID INT not null comment 'ユーザID'
  , KAISHI_BI DATE not null comment '開始日'
  , SHURYO_BI DATE comment '終了日'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MHR_SHOZOKU_PKC primary key (BUSHO_ID,SHOKUI_ID,USER_ID,KAISHI_BI)
) comment '所属マスタ' ;

-- ユーザマスタ
create table MHR_USER (
  USER_ID INT not null comment 'ユーザID'
  , USER_SEI VARCHAR(60) not null comment 'ユーザ姓'
  , USER_MEI VARCHAR(60) not null comment 'ユーザ名'
  , E_MAIL VARCHAR(800) not null comment 'メールアドレス'
  , PASSWORD VARCHAR(800) not null comment 'パスワード'
  , KAISHI_BI DATE comment '開始日'
  , SHURYO_BI DATE comment '終了日'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MHR_USER_PKC primary key (USER_ID)
) comment 'ユーザマスタ' ;

-- 区分マスタ
create table MSY_KBN (
  KBN_NM VARCHAR(20) not null comment '区分名称'
  , KBN_MEI VARCHAR(60) not null comment '区分名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MSY_KBN_PKC primary key (KBN_NM)
) comment '区分マスタ' ;

-- 区分値マスタ
create table MSY_KBN_VAL (
  KBN_NM VARCHAR(20) not null comment '区分名称'
  , KBN_VAL VARCHAR(2) not null comment '区分値'
  , KBN_VAL_MEI VARCHAR(60) not null comment '区分値名'
  , HYOJI_ON INT comment '表示順'
  , CRITERIA VARCHAR(800) comment '取得条件'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MSY_KBN_VAL_PKC primary key (KBN_NM,KBN_VAL)
) comment '区分値マスタ' ;

-- エンティティ１
create table TB1_ENTITY1 (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , ENTITY1_MEI VARCHAR(60) not null comment 'エンティティ名'
  , SANSHO1_ID INT comment '参照１ID'
  , SANSHO1_MEI VARCHAR(60) comment '参照１名'
  , SANSHO2_CD CHAR(6) comment '参照２CD'
  , SANSHO2_MEI VARCHAR(60) comment '参照２名'
  , SANSHO3_NO CHAR(10) comment '参照３NO'
  , SANSHO3_MEI VARCHAR(60) comment '参照３名'
  , BETSU_SANSHO1_ID INT comment '別参照１ID'
  , BETSU_SANSHO1_MEI VARCHAR(60) comment '別参照１名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_ENTITY1_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) comment 'エンティティ１' ;

-- エンティティ１履歴
create table TB1_ENTITY1_HIS (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , HISTORY_BN INT not null comment '履歴枝番'
  , ENTITY1_MEI VARCHAR(60) not null comment 'エンティティ１名'
  , SANSHO1_ID INT comment '参照１ID'
  , SANSHO1_MEI VARCHAR(60) comment '参照１名'
  , SANSHO2_CD CHAR(6) comment '参照２CD'
  , SANSHO2_MEI VARCHAR(60) comment '参照２名'
  , SANSHO3_NO CHAR(10) comment '参照３NO'
  , SANSHO3_MEI VARCHAR(60) comment '参照３名'
  , BETSU_SANSHO1_ID INT comment '別参照１ID'
  , BETSU_SANSHO1_MEI VARCHAR(60) comment '別参照１名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_ENTITY1_HIS_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,HISTORY_BN)
) comment 'エンティティ１履歴' ;

-- エンティティ２
create table TB1_ENTITY2 (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , ENTITY2_MEI VARCHAR(60) not null comment 'エンティティ２名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_ENTITY2_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) comment 'エンティティ２' ;

-- エンティティ３
create table TB1_ENTITY3 (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , ENTITY3_MEI VARCHAR(60) not null comment 'エンティティ３名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_ENTITY3_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) comment 'エンティティ３' ;

-- エンティティ４
create table TB1_ENTITY4 (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , ENTITY4_MEI VARCHAR(60) not null comment 'エンティティ４名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_ENTITY4_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) comment 'エンティティ４' ;

-- エンティティ５
create table TB1_ENTITY5 (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , ENTITY5_MEI VARCHAR(60) not null comment 'エンティティ５名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_ENTITY5_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) comment 'エンティティ５' ;

-- 従妹
create table TB1_ITOKO (
  ITOKO_ID INT comment '従妹ID'
  , ITOKO_MEI VARCHAR(60) comment '従妹名'
  , SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_ITOKO_PKC primary key (ITOKO_ID)
) comment '従妹' ;

-- 子
create table TB1_KO (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , KO_BN INT not null comment '子枝番'
  , KO_MEI VARCHAR(60) not null comment '子名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_KO_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,KO_BN)
) comment '子' ;

-- 親
create table TB1_OYA (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , OYA_MEI VARCHAR(60) not null comment '親名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_OYA_PKC primary key (SOSEN_ID,OYA_BN)
) comment '親' ;

-- 子孫
create table TB1_SHISON (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , KO_BN INT not null comment '子枝番'
  , SHISON_BN INT not null comment '子孫枝番'
  , SHISON_MEI VARCHAR(60) not null comment '子孫名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_SHISON_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,KO_BN,SHISON_BN)
) comment '子孫' ;

-- 祖先
create table TB1_SOSEN (
  SOSEN_ID INT not null comment '祖先ID'
  , BIKO VARCHAR(800) comment '備考'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_SOSEN_PKC primary key (SOSEN_ID)
) comment '祖先' ;

-- 添付ファイル
create table TB1_TENPU_FILE (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_BN INT not null comment '親枝番'
  , ENTITY_BN INT not null comment 'エンティティ枝番'
  , TENPU_FILE_BN INT not null comment '添付ファイル枝番'
  , TENPU_FILE_MEI VARCHAR(60) not null comment '添付ファイル名'
  , TENPU_FILE_PATH VARCHAR(256) not null comment '添付ファイルパス'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_TENPU_FILE_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,TENPU_FILE_BN)
) comment '添付ファイル' ;

-- 転生
create table TB1_TENSEI (
  TENSEI_ID INT comment '転生ID'
  , TENSEI_MEI VARCHAR(60) not null comment '転生名'
  , SOSEN_ID INT not null comment '祖先ID'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_TENSEI_PKC primary key (TENSEI_ID)
) comment '転生' ;

-- エンティティ
create table TB2_ENTITY (
  ENTITY_ID INT not null comment 'エンティティID'
  , ENTITY_NM VARCHAR(20) not null comment 'エンティティ名称'
  , ENTITY_MEI VARCHAR(60) not null comment 'エンティティ名'
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
  , NULL_ENTITY_NM VARCHAR(20) comment '任意エンティティ名称'
  , NULL_ENTITY_MEI VARCHAR(60) comment '任意エンティティ名'
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
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB2_ENTITY_PKC primary key (ENTITY_ID)
) comment 'エンティティ' ;

-- 主キーなし
create table TB2_NO_PK (
  COLUMN_A VARCHAR(60) comment '列Ａ'
  , COLUMN_B VARCHAR(60) comment '列Ｂ'
  , COLUMN_C VARCHAR(60) comment '列Ｃ'
  , COLUMN_D VARCHAR(60) comment '列Ｄ'
  , COLUMN_E VARCHAR(60) comment '列Ｅ'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
) comment '主キーなし' ;

create unique index TB2_NO_PK_IX1
  on TB2_NO_PK(COLUMN_A);

create unique index TB2_NO_PK_IX2
  on TB2_NO_PK(COLUMN_B,COLUMN_C);

-- 子孫
create view VB1_SHISON as 
SELECT
    'TB1_SOSEN' AS entity_name
    , TB1_SOSEN.SOSEN_ID
    , TB1_SOSEN.SOSEN_MEI
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
create view VB2_ENTITY as 
SELECT
    TB2_ENTITY.ENTITY_ID
    , TB2_ENTITY.ENTITY_NM
    , TB2_ENTITY.ENTITY_MEI
    , TB2_ENTITY.CHECK_F
    , TB2_ENTITY.RADIO_KB
    , TB2_ENTITY.PULLDOWN_KB
    , TB2_ENTITY.MEMO_TX
    , TB2_ENTITY.NEN_Y
    , TB2_ENTITY.TSUKI_M
    , TB2_ENTITY.HI_D
    , TB2_ENTITY.NENGETSU_YM
    , TB2_ENTITY.NENGAPPI_YMD
    , TB2_ENTITY.TIMESTAMP_TS
    , TB2_ENTITY.NICHIJI_DT
    , TB2_ENTITY.HIDUKE_BI
    , TB2_ENTITY.JIKOKU_HM
    , TB2_ENTITY.JIKAN_TM
    , TB2_ENTITY.SURYO_QT
    , TB2_ENTITY.TANKA_KG
    , TB2_ENTITY.ZEINUKI_KG 
FROM
    TB2_ENTITY

;

