-- Project Name : emarf
-- Date/Time    : 2025/02/13 19:42:09
-- Author       : toshiyuki
-- RDBMS Type   : MySQL
-- Application  : A5:SQL Mk-2

-- CD参照マスタ
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

-- 参照マスタ
create table MB7_SANSHO (
  SANSHO_ID INT comment '参照ID'
  , SANSHO_MEI VARCHAR(60) not null comment '参照名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MB7_SANSHO_PKC primary key (SANSHO_ID)
) comment '参照マスタ' ;

-- 制約マスタ
create table MB7_SEIYAKU (
  SEIYAKU_ID INT comment '制約ID'
  , SEIYAKU_MEI VARCHAR(60) not null comment '制約名'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint MB7_SEIYAKU_PKC primary key (SEIYAKU_ID)
) comment '制約マスタ' ;

-- 部署マスタ
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
  , TENPU_FILE VARCHAR(300) not null comment '添付ファイル'
  , NEN_Y CHAR(4) not null comment '年'
  , TSUKI_M CHAR(2) not null comment '月'
  , HI_D CHAR(2) not null comment '日'
  , NENGETSU_YM CHAR(6) not null comment '年月'
  , NENGAPPI_YMD CHAR(8) not null comment '年月日'
  , TIMESTAMP_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment 'タイムスタンプ'
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

-- 子２
create table TB1_KO2 (
  OYA_ID INT comment '親ID'
  , KO_BN INT comment '子枝番'
  , KO2_INFO VARCHAR(300) comment '子２情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_KO2_PKC primary key (OYA_ID,KO_BN)
) comment '子２' ;

-- 子３
create table TB1_KO3 (
  OYA_ID INT comment '親ID'
  , KO_BN INT comment '子枝番'
  , KO3_INFO VARCHAR(300) comment '子３情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB1_KO3_PKC primary key (OYA_ID,KO_BN)
) comment '子３' ;

-- 孫
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

-- 長男
create table TB2_CHONAN (
  CHONAN_ID INT comment '長男ID'
  , CHONAN_INFO VARCHAR(300) comment '長男情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB2_CHONAN_PKC primary key (CHONAN_ID)
) comment '長男' ;

-- 長男２
create table TB2_CHONAN2 (
  CHONAN_ID INT not null comment '長男ID'
  , CHONAN2_INFO VARCHAR(300) comment '長男２情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB2_CHONAN2_PKC primary key (CHONAN_ID)
) comment '長男２' ;

-- 長男３
create table TB2_CHONAN3 (
  CHONAN_ID INT not null comment '長男ID'
  , CHONAN3_INFO VARCHAR(300) comment '長男３情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB2_CHONAN3_PKC primary key (CHONAN_ID)
) comment '長男３' ;

-- 孤児
create table TB2_KOJI (
  KOJI_ID INT comment '孤児ID'
  , KOJI_INFO VARCHAR(300) comment '孤児情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB2_KOJI_PKC primary key (KOJI_ID)
) comment '孤児' ;

-- 孤児２
create table TB2_KOJI2 (
  KOJI_ID INT comment '孤児ID'
  , KOJI2_INFO VARCHAR(300) comment '孤児２情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB2_KOJI2_PKC primary key (KOJI_ID)
) comment '孤児２' ;

-- 孤児３
create table TB2_KOJI3 (
  KOJI_ID INT comment '孤児ID'
  , KOJI3_INFO VARCHAR(300) comment '孤児３情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB2_KOJI3_PKC primary key (KOJI_ID)
) comment '孤児３' ;

-- 兄弟
create table TB2_KYODAI (
  KYODAI_ID INT comment '兄弟ID'
  , KYODAI_INFO VARCHAR(300) comment '兄弟情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB2_KYODAI_PKC primary key (KYODAI_ID)
) comment '兄弟' ;

-- 兄弟２
create table TB2_KYODAI2 (
  KYODAI_ID INT comment '兄弟ID'
  , KYODAI2_INFO VARCHAR(300) comment '兄弟２情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB2_KYODAI2_PKC primary key (KYODAI_ID)
) comment '兄弟２' ;

-- 兄弟３
create table TB2_KYODAI3 (
  KYODAI_ID INT comment '兄弟ID'
  , KYODAI3_INFO VARCHAR(300) comment '兄弟３情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB2_KYODAI3_PKC primary key (KYODAI_ID)
) comment '兄弟３' ;

-- 末弟
create table TB2_MATTEI (
  MATTEI_ID INT comment '末弟ID'
  , MATTEI_INFO VARCHAR(300) comment '末弟情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB2_MATTEI_PKC primary key (MATTEI_ID)
) comment '末弟' ;

-- 末弟２
create table TB2_MATTEI2 (
  MATTEI_ID INT comment '末弟ID'
  , MATTEI2_INFO VARCHAR(300) comment '末弟２情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB2_MATTEI2_PKC primary key (MATTEI_ID)
) comment '末弟２' ;

-- 末弟３
create table TB2_MATTEI3 (
  MATTEI_ID INT comment '末弟ID'
  , MATTEI3_INFO VARCHAR(300) comment '末弟３情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB2_MATTEI3_PKC primary key (MATTEI_ID)
) comment '末弟３' ;

-- 履歴
create table TB3_RIREKI (
  RIREKI_MOTO_ID INT comment '履歴元ID'
  , RIREKI_BN INT comment '履歴枝番'
  , RIREKI_MOTO_INFO VARCHAR(300) comment '履歴元情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB3_RIREKI_PKC primary key (RIREKI_MOTO_ID,RIREKI_BN)
) comment '履歴' ;

-- 履歴元
create table TB3_RIREKI_MOTO (
  RIREKI_MOTO_ID INT comment '履歴元ID'
  , RIREKI_MOTO_INFO VARCHAR(300) comment '履歴元情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB3_RIREKI_MOTO_PKC primary key (RIREKI_MOTO_ID)
) comment '履歴元' ;

-- 参照元
create table TB4_SANSHO_MOTO (
  SANSHO_MOTO_ID INT not null comment '参照元ID'
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
  , constraint TB4_SANSHO_MOTO_PKC primary key (SANSHO_MOTO_ID)
) comment '参照元' ;

-- 転生元
create table TB5_TENSEI_MOTO (
  TENSEI_MOTO_ID INT not null comment '転生元ID'
  , TENSEI_MOTO_INFO VARCHAR(300) comment '転生元情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB5_TENSEI_MOTO_PKC primary key (TENSEI_MOTO_ID)
) comment '転生元' ;

-- 転生元明細
create table TB5_TENSEI_MOTO_DET (
  TENSEI_MOTO_ID INT comment '転生元ID'
  , TENSEI_MOTO_BN INT comment '転生元枝番'
  , TENSEI_MOTO_DET_INFO VARCHAR(300) comment '転生元明細情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB5_TENSEI_MOTO_DET_PKC primary key (TENSEI_MOTO_ID,TENSEI_MOTO_BN)
) comment '転生元明細' ;

-- 転生先
create table TB5_TENSEI_SAKI (
  TENSEI_SAKI_ID INT comment '転生先ID'
  , TENSEI_SAKI_INFO VARCHAR(300) comment '転生先情報'
  , TENSEI_MOTO_ID INT not null comment '転生元ID'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB5_TENSEI_SAKI_PKC primary key (TENSEI_SAKI_ID)
) comment '転生先' ;

-- 転生先明細
create table TB5_TENSEI_SAKI_DET (
  TENSEI_SAKI_ID INT comment '転生先ID'
  , TENSEI_SAKI_BN INT comment '転生先枝番'
  , TENSEI_SAKI_DET_INFO VARCHAR(300) comment '転生先明細情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB5_TENSEI_SAKI_DET_PKC primary key (TENSEI_SAKI_ID,TENSEI_SAKI_BN)
) comment '転生先明細' ;

-- 転生抑止
create table TB5_TENSEI_YOKUSHI (
  TENSEI_YOKUSHI_ID INT comment '転生抑止ID'
  , TENSEI_YOKUSHI_INFO VARCHAR(300) comment '転生抑止情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB5_TENSEI_YOKUSHI_PKC primary key (TENSEI_YOKUSHI_ID)
) comment '転生抑止' ;

-- 転生抑止先１
create table TB5_TENSEI_YOKUSHI_SAKI1 (
  TENSEI_YOKUSHI_SAKI1_ID INT comment '転生抑止先１ID'
  , TENSEI_YOKUSHI_ID INT not null comment '転生抑止ID'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB5_TENSEI_YOKUSHI_SAKI1_PKC primary key (TENSEI_YOKUSHI_SAKI1_ID)
) comment '転生抑止先１' ;

-- 転生抑止先２
create table TB5_TENSEI_YOKUSHI_SAKI2 (
  TENSEI_YOKUSHI_SAKI2_ID INT comment '転生抑止先２ID'
  , TENSEI_YOKUSHI_ID INT not null comment '転生抑止ID'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB5_TENSEI_YOKUSHI_SAKI2_PKC primary key (TENSEI_YOKUSHI_SAKI2_ID)
) comment '転生抑止先２' ;

-- 集約元
create table TB6_SHUYAKU_MOTO (
  SHUYAKU_MOTO_ID INT comment '集約元ID'
  , SHUYAKU_MOTO_INFO VARCHAR(300) comment '集約元情報'
  , SHUYAKU_SAKI_ID INT comment '集約先ID'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB6_SHUYAKU_MOTO_PKC primary key (SHUYAKU_MOTO_ID)
) comment '集約元' ;

-- 集約先
create table TB6_SHUYAKU_SAKI (
  SHUYAKU_SAKI_ID INT comment '集約先ID'
  , SHUYAKU_SAKI_INFO VARCHAR(300) comment '集約先情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB6_SHUYAKU_SAKI_PKC primary key (SHUYAKU_SAKI_ID)
) comment '集約先' ;

-- 集約抑止
create table TB6_SHUYAKU_YOKUSHI (
  SHUYAKU_YOKUSHI_ID INT comment '集約抑止ID'
  , SHUYAKU_YOKUSHI_INFO VARCHAR(300) comment '集約抑止情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB6_SHUYAKU_YOKUSHI_PKC primary key (SHUYAKU_YOKUSHI_ID)
) comment '集約抑止' ;

-- 集約抑止元１
create table TB6_SHUYAKU_YOKUSHI_MOTO1 (
  SHUYAKU_YOKUSHI_MOTO1_ID INT comment '集約抑止元１ID'
  , SHUYAKU_YOKUSHI_ID INT comment '転生抑止ID'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB6_SHUYAKU_YOKUSHI_MOTO1_PKC primary key (SHUYAKU_YOKUSHI_MOTO1_ID)
) comment '集約抑止元１' ;

-- 集約抑止元２
create table TB6_SHUYAKU_YOKUSHI_MOTO2 (
  SHUYAKU_YOKUSHI_MOTO2_ID INT comment '集約抑止元２ID'
  , SHUYAKU_YOKUSHI_ID INT comment '集約抑止ID'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB6_SHUYAKU_YOKUSHI_MOTO2_PKC primary key (SHUYAKU_YOKUSHI_MOTO2_ID)
) comment '集約抑止元２' ;

-- 複合
create table TB7_FUKUGO (
  SANSHO_ID INT comment '参照ID'
  , SEIYAKU_ID INT comment '制約ID'
  , TEKIYO_BI DATE comment '適用日'
  , FUKUGO_INFO VARCHAR(300) comment '複合情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB7_FUKUGO_PKC primary key (SANSHO_ID,SEIYAKU_ID,TEKIYO_BI)
) comment '複合' ;

-- 変換元
create table TB8_HENKAN_MOTO (
  HENKAN_MOTO_ID INT comment '変換元ID'
  , HENKAN_MOTO_INFO VARCHAR(300) comment '変換元情報'
  , HIKITSUGU_INFO VARCHAR(300) comment '引継ぐ情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB8_HENKAN_MOTO_PKC primary key (HENKAN_MOTO_ID)
) comment '変換元' ;

-- 変換先
create table TB8_HENKAN_SAKI (
  HENKAN_SAKI_ID INT comment '変換先ID'
  , HENKAN_SAKI_INFO VARCHAR(300) comment '変換先情報'
  , HIKITSUIDA_INFO VARCHAR(300) comment '引継いだ情報'
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '作成タイムスタンプ'
  , INSERT_USER_ID INT not null comment '作成者'
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null comment '更新タイムスタンプ'
  , UPDATE_USER_ID INT not null comment '更新者'
  , DELETE_F CHAR(1) default 0 comment '削除フラグ:必須チェックにかかるのでNOTNULLにしない'
  , STATUS_KB VARCHAR(2) default 0 comment 'ステータス区分:必須チェックにかかるのでNOTNULLにしない'
  , constraint TB8_HENKAN_SAKI_PKC primary key (HENKAN_SAKI_ID)
) comment '変換先' ;

-- 閲覧ビュー
create view VB8_ETSURAN as 
SELECT
    hm.henkan_moto_id
    , hm.henkan_moto_info
    , hm.hikitsugu_info AS hikitsuida_info      -- 「HIKITSUGU_INFO」に別名を付ける
FROM
    tb8_henkan_moto hm

;

-- 変換ビュー
create view VB8_HENKAN as 
SELECT
    'TB8_HENKAN_SAKI' AS table_name             -- 「TB8_HENKAN_SAKI」を指定
    , hm.henkan_moto_id
    , hm.henkan_moto_info
    , hm.hikitsugu_info AS hikitsuida_info      -- 「HIKITSUGU_INFO」に別名を付ける
FROM
    tb8_henkan_moto hm

;

