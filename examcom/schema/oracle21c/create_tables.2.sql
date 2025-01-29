-- Project Name : emarf
-- Date/Time    : 2025/01/28 9:57:47
-- Author       : KTC0966
-- RDBMS Type   : Oracle Database
-- Application  : A5:SQL Mk-2

-- CD参照マスタ
create table MB1_CDSANSHO (
  SANSHO_CD CHAR(10)
  , CDSANSHO_MEI VARCHAR2(60) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MB1_CDSANSHO_PKC primary key (SANSHO_CD)
) ;

-- ID参照マスタ
create table MB1_IDSANSHO (
  SANSHO_ID NUMBER(10)
  , IDSANSHO_MEI VARCHAR2(60) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MB1_IDSANSHO_PKC primary key (SANSHO_ID)
) ;

-- NO参照マスタ
create table MB1_NOSANSHO (
  SANSHO_NO CHAR(10)
  , NOSANSHO_MEI VARCHAR2(60) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MB1_NOSANSHO_PKC primary key (SANSHO_NO)
) ;

-- 参照１マスタ
create table MB1_SANSHO1 (
  SANSHO1_ID NUMBER(10)
  , SANSHO1_MEI VARCHAR2(60) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MB1_SANSHO1_PKC primary key (SANSHO1_ID)
) ;

-- 参照２マスタ
create table MB1_SANSHO2 (
  SANSHO2_ID NUMBER(10)
  , SANSHO2_MEI VARCHAR2(60) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MB1_SANSHO2_PKC primary key (SANSHO2_ID)
) ;

-- 部署マスタ
create table MHR_BUSHO (
  BUSHO_ID NUMBER(10) not null
  , BUSHO_MEI VARCHAR2(60) not null
  , OYA_BUSHO_ID NUMBER(10)
  , TEKIYO_BI DATE
  , SHURYO_BI DATE
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MHR_BUSHO_PKC primary key (BUSHO_ID)
) ;

-- 認可マスタ
create table MHR_NINKA (
  BUSHO_ID NUMBER(10) not null
  , SHOKUI_ID NUMBER(10) not null
  , KINO_NM VARCHAR2(20) not null
  , KENGEN_KB VARCHAR2(2) not null
  , TEKIYO_BI DATE
  , SHURYO_BI DATE
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MHR_NINKA_PKC primary key (BUSHO_ID,SHOKUI_ID,KINO_NM)
) ;

-- 職位マスタ
create table MHR_SHOKUI (
  SHOKUI_ID NUMBER(10) not null
  , SHOKUI_MEI VARCHAR2(60) not null
  , SHOKUI_ON NUMBER(10) not null
  , TEKIYO_BI DATE
  , SHURYO_BI DATE
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MHR_SHOKUI_PKC primary key (SHOKUI_ID)
) ;

-- 所属マスタ
create table MHR_SHOZOKU (
  BUSHO_ID NUMBER(10) not null
  , SHOKUI_ID NUMBER(10) not null
  , USER_ID NUMBER(10) not null
  , TEKIYO_BI DATE not null
  , SHURYO_BI DATE
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MHR_SHOZOKU_PKC primary key (BUSHO_ID,SHOKUI_ID,USER_ID,TEKIYO_BI)
) ;

-- ユーザマスタ
create table MHR_USER (
  USER_ID NUMBER(10) not null
  , USER_SEI VARCHAR2(60) not null
  , USER_MEI VARCHAR2(60) not null
  , E_MAIL VARCHAR2(300) not null
  , PASSWORD VARCHAR2(300) not null
  , TEKIYO_BI DATE
  , SHURYO_BI DATE
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MHR_USER_PKC primary key (USER_ID)
) ;

-- 稼働日マスタ
create table MSY_KADOBI (
  KADO_BI DATE
  , BUSHO_KB VARCHAR2(2)
  , KADOBI_F CHAR(1) not null
  , MEMO VARCHAR2(300)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MSY_KADOBI_PKC primary key (KADO_BI,BUSHO_KB)
) ;

-- 区分マスタ
create table MSY_KBN (
  KBN_NM VARCHAR2(20) not null
  , KBN_MEI VARCHAR2(60) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MSY_KBN_PKC primary key (KBN_NM)
) ;

-- 区分値マスタ
create table MSY_KBN_VAL (
  KBN_NM VARCHAR2(20) not null
  , KBN_VAL VARCHAR2(2) not null
  , KBN_VAL_MEI VARCHAR2(60) not null
  , HYOJI_ON NUMBER(10)
  , CRITERIA VARCHAR2(300)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MSY_KBN_VAL_PKC primary key (KBN_NM,KBN_VAL)
) ;

-- 税マスタ
create table MSY_TAX (
  TAX_KB VARCHAR2(2)
  , TEKIYO_BI DATE
  , SHURYO_BI DATE
  , TAX_RT NUMBER(5,2)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MSY_TAX_PKC primary key (TAX_KB,TEKIYO_BI)
) ;

-- 通貨マスタ
create table MSY_TSUKA (
  TSUKA_KB VARCHAR2(2)
  , TEKIYO_BI DATE
  , TSUKA_RT NUMBER(5,2)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MSY_TSUKA_PKC primary key (TSUKA_KB,TEKIYO_BI)
) ;

-- エンティティ
create table TB0_ENTITY (
  ENTITY_ID NUMBER(10) not null
  , ENTITY_NM VARCHAR2(20) not null
  , ENTITY_MEI VARCHAR2(60) not null
  , CHECK_F CHAR(1) not null
  , RADIO_KB VARCHAR2(2) not null
  , PULLDOWN_KB VARCHAR2(2) not null
  , PULLDOWN_SB VARCHAR2(2) not null
  , MEMO_TX VARCHAR2(300) not null
  , MEMO VARCHAR2(300) not null
  , FILE_PATH VARCHAR2(300) not null
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
  , SURYO_QT NUMBER(11,3) not null
  , TANKA_PR NUMBER(11,2) not null
  , TSUKA_KB VARCHAR2(2) not null
  , ZEINUKI_AM NUMBER(11,2) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB0_ENTITY_PKC primary key (ENTITY_ID)
) ;

-- 主キーなし
create table TB0_NOKEY (
  COL_A VARCHAR2(60)
  , COL_B VARCHAR2(60)
  , COL_C VARCHAR2(60)
  , COL_D VARCHAR2(60)
  , COL_E VARCHAR2(60)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
) ;

create unique index TB0_NOKEY_IX1
  on TB0_NOKEY(COL_A,COL_B);

create unique index TB0_NOKEY_IX2
  on TB0_NOKEY(COL_C);

-- 複合
create table TB1_FUKUGO (
  SANSHO1_ID NUMBER(10)
  , SANSHO2_ID NUMBER(10)
  , TEKIYO_BI DATE
  , MEMO VARCHAR2(300)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_FUKUGO_PKC primary key (SANSHO1_ID,SANSHO2_ID,TEKIYO_BI)
) ;

-- 子
create table TB1_KO (
  OYA_ID NUMBER(10)
  , KO_BN NUMBER(10)
  , MEMO VARCHAR2(300)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_KO_PKC primary key (OYA_ID,KO_BN)
) ;

-- 兄弟２
create table TB1_KYODAI2 (
  OYA_ID NUMBER(10)
  , KO_BN NUMBER(10)
  , MEMO VARCHAR2(300)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_KYODAI2_PKC primary key (OYA_ID,KO_BN)
) ;

-- 兄弟３
create table TB1_KYODAI3 (
  OYA_ID NUMBER(10)
  , KO_BN NUMBER(10)
  , MEMO VARCHAR2(300)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_KYODAI3_PKC primary key (OYA_ID,KO_BN)
) ;

-- 兄弟４
create table TB1_KYODAI4 (
  OYA_ID NUMBER(10)
  , KO_BN NUMBER(10)
  , MEMO VARCHAR2(300)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_KYODAI4_PKC primary key (OYA_ID,KO_BN)
) ;

-- 兄弟５
create table TB1_KYODAI5 (
  OYA_ID NUMBER(10)
  , KO_BN NUMBER(10)
  , MEMO VARCHAR2(300)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_KYODAI5_PKC primary key (OYA_ID,KO_BN)
) ;

-- 孫
create table TB1_MAGO (
  OYA_ID NUMBER(10)
  , KO_BN NUMBER(10)
  , MAGO_BN NUMBER(10)
  , BIKO VARCHAR2(300)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_MAGO_PKC primary key (OYA_ID,KO_BN,MAGO_BN)
) ;

-- 親
create table TB1_OYA (
  OYA_ID NUMBER(10)
  , MEMO VARCHAR2(300)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_OYA_PKC primary key (OYA_ID)
) ;

-- 履歴
create table TB1_RIREKI (
  OYA_ID NUMBER(10)
  , KO_BN NUMBER(10)
  , RIREKI_BN NUMBER(10)
  , MEMO VARCHAR2(300)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_RIREKI_PKC primary key (OYA_ID,KO_BN,RIREKI_BN)
) ;

-- 参照元
create table TB1_SANSHOMOTO (
  SANSHOMOTO_ID NUMBER(10) not null
  , SANSHO_ID NUMBER(10)
  , IDSANSHO_MEI VARCHAR2(60)
  , SANSHO_CD CHAR(10)
  , CDSANSHO_MEI VARCHAR2(60)
  , SANSHO_NO CHAR(10)
  , NOSANSHO_MEI VARCHAR2(60)
  , BETSU_SANSHO_ID NUMBER(10)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_SANSHOMOTO_PKC primary key (SANSHOMOTO_ID)
) ;

-- 転生元
create table TB1_TENSEIMOTO (
  TENSEIMOTO_ID NUMBER(10) not null
  , MEMO VARCHAR2(300)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_TENSEIMOTO_PKC primary key (TENSEIMOTO_ID)
) ;

-- 転生元明細
create table TB1_TENSEIMOTO_DET (
  TENSEIMOTO_ID NUMBER(10)
  , TENSEIMOTO_BN NUMBER(10)
  , MEMO VARCHAR2(300)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_TENSEIMOTO_DET_PKC primary key (TENSEIMOTO_ID,TENSEIMOTO_BN)
) ;

-- 転生先
create table TB1_TENSEISAKI (
  TENSEISAKI_ID NUMBER(10)
  , TENSEIMOTO_ID NUMBER(10) not null
  , MEMO VARCHAR2(300)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_TENSEISAKI_PKC primary key (TENSEISAKI_ID)
) ;

-- 転生先明細
create table TB1_TENSEISAKI_DET (
  TENSEISAKI_ID NUMBER(10)
  , TENSEISAKI_BN NUMBER(10)
  , MEMO VARCHAR2(300)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_USER_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_USER_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_TENSEISAKI_DET_PKC primary key (TENSEISAKI_ID,TENSEISAKI_BN)
) ;

comment on table MB1_CDSANSHO is 'CD参照マスタ';
comment on column MB1_CDSANSHO.SANSHO_CD is '参照CD';
comment on column MB1_CDSANSHO.CDSANSHO_MEI is 'CD参照名';
comment on column MB1_CDSANSHO.INSERT_TS is '作成タイムスタンプ';
comment on column MB1_CDSANSHO.INSERT_USER_ID is '作成者';
comment on column MB1_CDSANSHO.UPDATE_TS is '更新タイムスタンプ';
comment on column MB1_CDSANSHO.UPDATE_USER_ID is '更新者';
comment on column MB1_CDSANSHO.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MB1_CDSANSHO.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MB1_IDSANSHO is 'ID参照マスタ';
comment on column MB1_IDSANSHO.SANSHO_ID is '参照ID';
comment on column MB1_IDSANSHO.IDSANSHO_MEI is 'ID参照名';
comment on column MB1_IDSANSHO.INSERT_TS is '作成タイムスタンプ';
comment on column MB1_IDSANSHO.INSERT_USER_ID is '作成者';
comment on column MB1_IDSANSHO.UPDATE_TS is '更新タイムスタンプ';
comment on column MB1_IDSANSHO.UPDATE_USER_ID is '更新者';
comment on column MB1_IDSANSHO.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MB1_IDSANSHO.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MB1_NOSANSHO is 'NO参照マスタ';
comment on column MB1_NOSANSHO.SANSHO_NO is '参照NO';
comment on column MB1_NOSANSHO.NOSANSHO_MEI is 'NO参照名';
comment on column MB1_NOSANSHO.INSERT_TS is '作成タイムスタンプ';
comment on column MB1_NOSANSHO.INSERT_USER_ID is '作成者';
comment on column MB1_NOSANSHO.UPDATE_TS is '更新タイムスタンプ';
comment on column MB1_NOSANSHO.UPDATE_USER_ID is '更新者';
comment on column MB1_NOSANSHO.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MB1_NOSANSHO.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MB1_SANSHO1 is '参照１マスタ';
comment on column MB1_SANSHO1.SANSHO1_ID is '参照１ID';
comment on column MB1_SANSHO1.SANSHO1_MEI is '参照１名';
comment on column MB1_SANSHO1.INSERT_TS is '作成タイムスタンプ';
comment on column MB1_SANSHO1.INSERT_USER_ID is '作成者';
comment on column MB1_SANSHO1.UPDATE_TS is '更新タイムスタンプ';
comment on column MB1_SANSHO1.UPDATE_USER_ID is '更新者';
comment on column MB1_SANSHO1.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MB1_SANSHO1.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MB1_SANSHO2 is '参照２マスタ';
comment on column MB1_SANSHO2.SANSHO2_ID is '参照２ID';
comment on column MB1_SANSHO2.SANSHO2_MEI is '参照２名';
comment on column MB1_SANSHO2.INSERT_TS is '作成タイムスタンプ';
comment on column MB1_SANSHO2.INSERT_USER_ID is '作成者';
comment on column MB1_SANSHO2.UPDATE_TS is '更新タイムスタンプ';
comment on column MB1_SANSHO2.UPDATE_USER_ID is '更新者';
comment on column MB1_SANSHO2.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MB1_SANSHO2.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MHR_BUSHO is '部署マスタ';
comment on column MHR_BUSHO.BUSHO_ID is '部署ID';
comment on column MHR_BUSHO.BUSHO_MEI is '部署名';
comment on column MHR_BUSHO.OYA_BUSHO_ID is '親部署ID';
comment on column MHR_BUSHO.TEKIYO_BI is '適用日';
comment on column MHR_BUSHO.SHURYO_BI is '終了日';
comment on column MHR_BUSHO.INSERT_TS is '作成タイムスタンプ';
comment on column MHR_BUSHO.INSERT_USER_ID is '作成者';
comment on column MHR_BUSHO.UPDATE_TS is '更新タイムスタンプ';
comment on column MHR_BUSHO.UPDATE_USER_ID is '更新者';
comment on column MHR_BUSHO.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MHR_BUSHO.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MHR_NINKA is '認可マスタ';
comment on column MHR_NINKA.BUSHO_ID is '部署ID';
comment on column MHR_NINKA.SHOKUI_ID is '職位ID';
comment on column MHR_NINKA.KINO_NM is '機能名称';
comment on column MHR_NINKA.KENGEN_KB is '権限区分';
comment on column MHR_NINKA.TEKIYO_BI is '適用日';
comment on column MHR_NINKA.SHURYO_BI is '終了日';
comment on column MHR_NINKA.INSERT_TS is '作成タイムスタンプ';
comment on column MHR_NINKA.INSERT_USER_ID is '作成者';
comment on column MHR_NINKA.UPDATE_TS is '更新タイムスタンプ';
comment on column MHR_NINKA.UPDATE_USER_ID is '更新者';
comment on column MHR_NINKA.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MHR_NINKA.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MHR_SHOKUI is '職位マスタ';
comment on column MHR_SHOKUI.SHOKUI_ID is '職位ID';
comment on column MHR_SHOKUI.SHOKUI_MEI is '職位名';
comment on column MHR_SHOKUI.SHOKUI_ON is '職位順';
comment on column MHR_SHOKUI.TEKIYO_BI is '適用日';
comment on column MHR_SHOKUI.SHURYO_BI is '終了日';
comment on column MHR_SHOKUI.INSERT_TS is '作成タイムスタンプ';
comment on column MHR_SHOKUI.INSERT_USER_ID is '作成者';
comment on column MHR_SHOKUI.UPDATE_TS is '更新タイムスタンプ';
comment on column MHR_SHOKUI.UPDATE_USER_ID is '更新者';
comment on column MHR_SHOKUI.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MHR_SHOKUI.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MHR_SHOZOKU is '所属マスタ';
comment on column MHR_SHOZOKU.BUSHO_ID is '部署ID';
comment on column MHR_SHOZOKU.SHOKUI_ID is '職位ID';
comment on column MHR_SHOZOKU.USER_ID is 'ユーザID';
comment on column MHR_SHOZOKU.TEKIYO_BI is '適用日';
comment on column MHR_SHOZOKU.SHURYO_BI is '終了日';
comment on column MHR_SHOZOKU.INSERT_TS is '作成タイムスタンプ';
comment on column MHR_SHOZOKU.INSERT_USER_ID is '作成者';
comment on column MHR_SHOZOKU.UPDATE_TS is '更新タイムスタンプ';
comment on column MHR_SHOZOKU.UPDATE_USER_ID is '更新者';
comment on column MHR_SHOZOKU.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MHR_SHOZOKU.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MHR_USER is 'ユーザマスタ';
comment on column MHR_USER.USER_ID is 'ユーザID';
comment on column MHR_USER.USER_SEI is 'ユーザ姓';
comment on column MHR_USER.USER_MEI is 'ユーザ名';
comment on column MHR_USER.E_MAIL is 'メールアドレス';
comment on column MHR_USER.PASSWORD is 'パスワード';
comment on column MHR_USER.TEKIYO_BI is '適用日';
comment on column MHR_USER.SHURYO_BI is '終了日';
comment on column MHR_USER.INSERT_TS is '作成タイムスタンプ';
comment on column MHR_USER.INSERT_USER_ID is '作成者';
comment on column MHR_USER.UPDATE_TS is '更新タイムスタンプ';
comment on column MHR_USER.UPDATE_USER_ID is '更新者';
comment on column MHR_USER.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MHR_USER.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MSY_KADOBI is '稼働日マスタ';
comment on column MSY_KADOBI.KADO_BI is '稼働日';
comment on column MSY_KADOBI.BUSHO_KB is '部署区分';
comment on column MSY_KADOBI.KADOBI_F is '稼働日フラグ';
comment on column MSY_KADOBI.MEMO is 'メモ';
comment on column MSY_KADOBI.INSERT_TS is '作成タイムスタンプ';
comment on column MSY_KADOBI.INSERT_USER_ID is '作成者';
comment on column MSY_KADOBI.UPDATE_TS is '更新タイムスタンプ';
comment on column MSY_KADOBI.UPDATE_USER_ID is '更新者';
comment on column MSY_KADOBI.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MSY_KADOBI.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MSY_KBN is '区分マスタ';
comment on column MSY_KBN.KBN_NM is '区分名称';
comment on column MSY_KBN.KBN_MEI is '区分名';
comment on column MSY_KBN.INSERT_TS is '作成タイムスタンプ';
comment on column MSY_KBN.INSERT_USER_ID is '作成者';
comment on column MSY_KBN.UPDATE_TS is '更新タイムスタンプ';
comment on column MSY_KBN.UPDATE_USER_ID is '更新者';
comment on column MSY_KBN.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MSY_KBN.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MSY_KBN_VAL is '区分値マスタ';
comment on column MSY_KBN_VAL.KBN_NM is '区分名称';
comment on column MSY_KBN_VAL.KBN_VAL is '区分値';
comment on column MSY_KBN_VAL.KBN_VAL_MEI is '区分値名';
comment on column MSY_KBN_VAL.HYOJI_ON is '表示順';
comment on column MSY_KBN_VAL.CRITERIA is '取得条件';
comment on column MSY_KBN_VAL.INSERT_TS is '作成タイムスタンプ';
comment on column MSY_KBN_VAL.INSERT_USER_ID is '作成者';
comment on column MSY_KBN_VAL.UPDATE_TS is '更新タイムスタンプ';
comment on column MSY_KBN_VAL.UPDATE_USER_ID is '更新者';
comment on column MSY_KBN_VAL.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MSY_KBN_VAL.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MSY_TAX is '税マスタ';
comment on column MSY_TAX.TAX_KB is '税区分';
comment on column MSY_TAX.TEKIYO_BI is '適用日';
comment on column MSY_TAX.SHURYO_BI is '終了日';
comment on column MSY_TAX.TAX_RT is '税率';
comment on column MSY_TAX.INSERT_TS is '作成タイムスタンプ';
comment on column MSY_TAX.INSERT_USER_ID is '作成者';
comment on column MSY_TAX.UPDATE_TS is '更新タイムスタンプ';
comment on column MSY_TAX.UPDATE_USER_ID is '更新者';
comment on column MSY_TAX.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MSY_TAX.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MSY_TSUKA is '通貨マスタ';
comment on column MSY_TSUKA.TSUKA_KB is '通貨区分';
comment on column MSY_TSUKA.TEKIYO_BI is '適用日';
comment on column MSY_TSUKA.TSUKA_RT is '通貨レート';
comment on column MSY_TSUKA.INSERT_TS is '作成タイムスタンプ';
comment on column MSY_TSUKA.INSERT_USER_ID is '作成者';
comment on column MSY_TSUKA.UPDATE_TS is '更新タイムスタンプ';
comment on column MSY_TSUKA.UPDATE_USER_ID is '更新者';
comment on column MSY_TSUKA.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MSY_TSUKA.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB0_ENTITY is 'エンティティ';
comment on column TB0_ENTITY.ENTITY_ID is 'エンティティID';
comment on column TB0_ENTITY.ENTITY_NM is 'エンティティ名称';
comment on column TB0_ENTITY.ENTITY_MEI is 'エンティティ名';
comment on column TB0_ENTITY.CHECK_F is 'チェックフラグ';
comment on column TB0_ENTITY.RADIO_KB is 'ラジオ区分';
comment on column TB0_ENTITY.PULLDOWN_KB is 'プルダウン区分';
comment on column TB0_ENTITY.PULLDOWN_SB is 'プルダウン種別';
comment on column TB0_ENTITY.MEMO_TX is 'メモ';
comment on column TB0_ENTITY.MEMO is '１行メモ';
comment on column TB0_ENTITY.FILE_PATH is 'ファイルパス';
comment on column TB0_ENTITY.NEN_Y is '年';
comment on column TB0_ENTITY.TSUKI_M is '月';
comment on column TB0_ENTITY.HI_D is '日';
comment on column TB0_ENTITY.NENGETSU_YM is '年月';
comment on column TB0_ENTITY.NENGAPPI_YMD is '年月日';
comment on column TB0_ENTITY.TIMESTAMP_TS is 'タイムスタンプ';
comment on column TB0_ENTITY.NICHIJI_DT is '日時';
comment on column TB0_ENTITY.HIDUKE_BI is '日付';
comment on column TB0_ENTITY.JIKOKU_HM is '時刻';
comment on column TB0_ENTITY.JIKAN_TM is '時間';
comment on column TB0_ENTITY.SURYO_QT is '数量';
comment on column TB0_ENTITY.TANKA_PR is '単価';
comment on column TB0_ENTITY.TSUKA_KB is '通貨区分';
comment on column TB0_ENTITY.ZEINUKI_AM is '税抜金額';
comment on column TB0_ENTITY.INSERT_TS is '作成タイムスタンプ';
comment on column TB0_ENTITY.INSERT_USER_ID is '作成者';
comment on column TB0_ENTITY.UPDATE_TS is '更新タイムスタンプ';
comment on column TB0_ENTITY.UPDATE_USER_ID is '更新者';
comment on column TB0_ENTITY.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB0_ENTITY.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB0_NOKEY is '主キーなし';
comment on column TB0_NOKEY.COL_A is '列Ａ';
comment on column TB0_NOKEY.COL_B is '列Ｂ';
comment on column TB0_NOKEY.COL_C is '列Ｃ';
comment on column TB0_NOKEY.COL_D is '列Ｄ';
comment on column TB0_NOKEY.COL_E is '列Ｅ';
comment on column TB0_NOKEY.INSERT_TS is '作成タイムスタンプ';
comment on column TB0_NOKEY.INSERT_USER_ID is '作成者';
comment on column TB0_NOKEY.UPDATE_TS is '更新タイムスタンプ';
comment on column TB0_NOKEY.UPDATE_USER_ID is '更新者';
comment on column TB0_NOKEY.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB0_NOKEY.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_FUKUGO is '複合';
comment on column TB1_FUKUGO.SANSHO1_ID is '参照１ID';
comment on column TB1_FUKUGO.SANSHO2_ID is '参照２ID';
comment on column TB1_FUKUGO.TEKIYO_BI is '適用日';
comment on column TB1_FUKUGO.MEMO is 'メモ';
comment on column TB1_FUKUGO.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_FUKUGO.INSERT_USER_ID is '作成者';
comment on column TB1_FUKUGO.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_FUKUGO.UPDATE_USER_ID is '更新者';
comment on column TB1_FUKUGO.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_FUKUGO.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_KO is '子';
comment on column TB1_KO.OYA_ID is '親ID';
comment on column TB1_KO.KO_BN is '子枝番';
comment on column TB1_KO.MEMO is 'メモ';
comment on column TB1_KO.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_KO.INSERT_USER_ID is '作成者';
comment on column TB1_KO.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_KO.UPDATE_USER_ID is '更新者';
comment on column TB1_KO.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_KO.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_KYODAI2 is '兄弟２';
comment on column TB1_KYODAI2.OYA_ID is '親ID';
comment on column TB1_KYODAI2.KO_BN is '子枝番';
comment on column TB1_KYODAI2.MEMO is 'メモ';
comment on column TB1_KYODAI2.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_KYODAI2.INSERT_USER_ID is '作成者';
comment on column TB1_KYODAI2.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_KYODAI2.UPDATE_USER_ID is '更新者';
comment on column TB1_KYODAI2.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_KYODAI2.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_KYODAI3 is '兄弟３';
comment on column TB1_KYODAI3.OYA_ID is '親ID';
comment on column TB1_KYODAI3.KO_BN is '子枝番';
comment on column TB1_KYODAI3.MEMO is 'メモ';
comment on column TB1_KYODAI3.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_KYODAI3.INSERT_USER_ID is '作成者';
comment on column TB1_KYODAI3.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_KYODAI3.UPDATE_USER_ID is '更新者';
comment on column TB1_KYODAI3.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_KYODAI3.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_KYODAI4 is '兄弟４';
comment on column TB1_KYODAI4.OYA_ID is '親ID';
comment on column TB1_KYODAI4.KO_BN is '子枝番';
comment on column TB1_KYODAI4.MEMO is 'メモ';
comment on column TB1_KYODAI4.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_KYODAI4.INSERT_USER_ID is '作成者';
comment on column TB1_KYODAI4.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_KYODAI4.UPDATE_USER_ID is '更新者';
comment on column TB1_KYODAI4.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_KYODAI4.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_KYODAI5 is '兄弟５';
comment on column TB1_KYODAI5.OYA_ID is '親ID';
comment on column TB1_KYODAI5.KO_BN is '子枝番';
comment on column TB1_KYODAI5.MEMO is 'メモ';
comment on column TB1_KYODAI5.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_KYODAI5.INSERT_USER_ID is '作成者';
comment on column TB1_KYODAI5.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_KYODAI5.UPDATE_USER_ID is '更新者';
comment on column TB1_KYODAI5.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_KYODAI5.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_MAGO is '孫';
comment on column TB1_MAGO.OYA_ID is '親ID';
comment on column TB1_MAGO.KO_BN is '子枝番';
comment on column TB1_MAGO.MAGO_BN is '孫枝番';
comment on column TB1_MAGO.BIKO is '備考';
comment on column TB1_MAGO.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_MAGO.INSERT_USER_ID is '作成者';
comment on column TB1_MAGO.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_MAGO.UPDATE_USER_ID is '更新者';
comment on column TB1_MAGO.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_MAGO.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_OYA is '親';
comment on column TB1_OYA.OYA_ID is '親ID';
comment on column TB1_OYA.MEMO is 'メモ';
comment on column TB1_OYA.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_OYA.INSERT_USER_ID is '作成者';
comment on column TB1_OYA.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_OYA.UPDATE_USER_ID is '更新者';
comment on column TB1_OYA.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_OYA.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_RIREKI is '履歴';
comment on column TB1_RIREKI.OYA_ID is '親ID';
comment on column TB1_RIREKI.KO_BN is '子枝番';
comment on column TB1_RIREKI.RIREKI_BN is '履歴枝番';
comment on column TB1_RIREKI.MEMO is 'メモ';
comment on column TB1_RIREKI.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_RIREKI.INSERT_USER_ID is '作成者';
comment on column TB1_RIREKI.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_RIREKI.UPDATE_USER_ID is '更新者';
comment on column TB1_RIREKI.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_RIREKI.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_SANSHOMOTO is '参照元';
comment on column TB1_SANSHOMOTO.SANSHOMOTO_ID is '参照元ID';
comment on column TB1_SANSHOMOTO.SANSHO_ID is '参照ID';
comment on column TB1_SANSHOMOTO.IDSANSHO_MEI is 'ID参照名';
comment on column TB1_SANSHOMOTO.SANSHO_CD is '参照CD';
comment on column TB1_SANSHOMOTO.CDSANSHO_MEI is 'CD参照名';
comment on column TB1_SANSHOMOTO.SANSHO_NO is '参照NO';
comment on column TB1_SANSHOMOTO.NOSANSHO_MEI is 'NO参照名';
comment on column TB1_SANSHOMOTO.BETSU_SANSHO_ID is '別参照ID';
comment on column TB1_SANSHOMOTO.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_SANSHOMOTO.INSERT_USER_ID is '作成者';
comment on column TB1_SANSHOMOTO.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_SANSHOMOTO.UPDATE_USER_ID is '更新者';
comment on column TB1_SANSHOMOTO.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_SANSHOMOTO.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_TENSEIMOTO is '転生元';
comment on column TB1_TENSEIMOTO.TENSEIMOTO_ID is '転生元ID';
comment on column TB1_TENSEIMOTO.MEMO is 'メモ';
comment on column TB1_TENSEIMOTO.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_TENSEIMOTO.INSERT_USER_ID is '作成者';
comment on column TB1_TENSEIMOTO.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_TENSEIMOTO.UPDATE_USER_ID is '更新者';
comment on column TB1_TENSEIMOTO.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_TENSEIMOTO.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_TENSEIMOTO_DET is '転生元明細';
comment on column TB1_TENSEIMOTO_DET.TENSEIMOTO_ID is '転生元ID';
comment on column TB1_TENSEIMOTO_DET.TENSEIMOTO_BN is '転生元枝番';
comment on column TB1_TENSEIMOTO_DET.MEMO is 'メモ';
comment on column TB1_TENSEIMOTO_DET.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_TENSEIMOTO_DET.INSERT_USER_ID is '作成者';
comment on column TB1_TENSEIMOTO_DET.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_TENSEIMOTO_DET.UPDATE_USER_ID is '更新者';
comment on column TB1_TENSEIMOTO_DET.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_TENSEIMOTO_DET.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_TENSEISAKI is '転生先';
comment on column TB1_TENSEISAKI.TENSEISAKI_ID is '転生先ID';
comment on column TB1_TENSEISAKI.TENSEIMOTO_ID is '転生元ID';
comment on column TB1_TENSEISAKI.MEMO is 'メモ';
comment on column TB1_TENSEISAKI.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_TENSEISAKI.INSERT_USER_ID is '作成者';
comment on column TB1_TENSEISAKI.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_TENSEISAKI.UPDATE_USER_ID is '更新者';
comment on column TB1_TENSEISAKI.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_TENSEISAKI.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_TENSEISAKI_DET is '転生先明細';
comment on column TB1_TENSEISAKI_DET.TENSEISAKI_ID is '転生先ID';
comment on column TB1_TENSEISAKI_DET.TENSEISAKI_BN is '転生先枝番';
comment on column TB1_TENSEISAKI_DET.MEMO is 'メモ';
comment on column TB1_TENSEISAKI_DET.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_TENSEISAKI_DET.INSERT_USER_ID is '作成者';
comment on column TB1_TENSEISAKI_DET.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_TENSEISAKI_DET.UPDATE_USER_ID is '更新者';
comment on column TB1_TENSEISAKI_DET.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_TENSEISAKI_DET.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

