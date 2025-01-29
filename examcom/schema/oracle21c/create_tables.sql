-- Project Name : emarf
-- Date/Time    : 2024/12/26 19:37:44
-- Author       : toshiyuki
-- RDBMS Type   : Oracle Database
-- Application  : A5:SQL Mk-2

-- 参照１マスタ
create table MB1_SANSHO1 (
  SANSHO1_ID NUMBER(10) not null
  , SANSHO1_MEI VARCHAR2(60) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MB1_SANSHO1_PKC primary key (SANSHO1_ID)
) ;

-- 参照２マスタ
create table MB1_SANSHO2 (
  SANSHO2_CD CHAR(6) not null
  , SANSHO2_MEI VARCHAR2(60) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MB1_SANSHO2_PKC primary key (SANSHO2_CD)
) ;

-- 参照３マスタ
create table MB1_SANSHO3 (
  SANSHO3_NO CHAR(10) not null
  , SANSHO3_MEI VARCHAR2(60) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MB1_SANSHO3_PKC primary key (SANSHO3_NO)
) ;

-- 部署マスタ
create table MHR_BUSHO (
  BUSHO_ID NUMBER(10) not null
  , BUSHO_MEI VARCHAR2(60) not null
  , OYA_BUSHO_ID NUMBER(10)
  , KAISHI_BI DATE
  , SHURYO_BI DATE
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
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
  , KAISHI_BI DATE
  , SHURYO_BI DATE
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MHR_NINKA_PKC primary key (BUSHO_ID,SHOKUI_ID,KINO_NM)
) ;

-- 職位マスタ
create table MHR_SHOKUI (
  SHOKUI_ID NUMBER(10) not null
  , SHOKUI_MEI VARCHAR2(60) not null
  , SHOKUI_ON NUMBER(10) not null
  , KAISHI_BI DATE
  , SHURYO_BI DATE
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MHR_SHOKUI_PKC primary key (SHOKUI_ID)
) ;

-- 所属マスタ
create table MHR_SHOZOKU (
  BUSHO_ID NUMBER(10) not null
  , SHOKUI_ID NUMBER(10) not null
  , USER_ID NUMBER(10) not null
  , KAISHI_BI DATE not null
  , SHURYO_BI DATE
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MHR_SHOZOKU_PKC primary key (BUSHO_ID,SHOKUI_ID,USER_ID,KAISHI_BI)
) ;

-- ユーザマスタ
create table MHR_USER (
  USER_ID NUMBER(10) not null
  , USER_SEI VARCHAR2(60) not null
  , USER_MEI VARCHAR2(60) not null
  , E_MAIL VARCHAR2(800) not null
  , PASSWORD VARCHAR2(800) not null
  , KAISHI_BI DATE
  , SHURYO_BI DATE
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MHR_USER_PKC primary key (USER_ID)
) ;

-- 区分マスタ
create table MSY_KBN (
  KBN_NM VARCHAR2(20) not null
  , KBN_MEI VARCHAR2(60) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
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
  , CRITERIA VARCHAR2(800)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint MSY_KBN_VAL_PKC primary key (KBN_NM,KBN_VAL)
) ;

-- エンティティ１
create table TB1_ENTITY1 (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , ENTITY1_MEI VARCHAR2(60) not null
  , SANSHO1_ID NUMBER(10)
  , SANSHO1_MEI VARCHAR2(60)
  , SANSHO2_CD CHAR(6)
  , SANSHO2_MEI VARCHAR2(60)
  , SANSHO3_NO CHAR(10)
  , SANSHO3_MEI VARCHAR2(60)
  , BETSU_SANSHO1_ID NUMBER(10)
  , BETSU_SANSHO1_MEI VARCHAR2(60)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_ENTITY1_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) ;

-- エンティティ１履歴
create table TB1_ENTITY1_HIS (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , HISTORY_BN NUMBER(10) not null
  , ENTITY1_MEI VARCHAR2(60) not null
  , SANSHO1_ID NUMBER(10)
  , SANSHO1_MEI VARCHAR2(60)
  , SANSHO2_CD CHAR(6)
  , SANSHO2_MEI VARCHAR2(60)
  , SANSHO3_NO CHAR(10)
  , SANSHO3_MEI VARCHAR2(60)
  , BETSU_SANSHO1_ID NUMBER(10)
  , BETSU_SANSHO1_MEI VARCHAR2(60)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_ENTITY1_HIS_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,HISTORY_BN)
) ;

-- エンティティ２
create table TB1_ENTITY2 (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , ENTITY2_MEI VARCHAR2(60) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_ENTITY2_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) ;

-- エンティティ３
create table TB1_ENTITY3 (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , ENTITY3_MEI VARCHAR2(60) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_ENTITY3_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) ;

-- エンティティ４
create table TB1_ENTITY4 (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , ENTITY4_MEI VARCHAR2(60) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_ENTITY4_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) ;

-- エンティティ５
create table TB1_ENTITY5 (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , ENTITY5_MEI VARCHAR2(60) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_ENTITY5_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) ;

-- 従妹
create table TB1_ITOKO (
  ITOKO_ID NUMBER(10)
  , ITOKO_MEI VARCHAR2(60)
  , SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_ITOKO_PKC primary key (ITOKO_ID)
) ;

-- 子
create table TB1_KO (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , KO_BN NUMBER(10) not null
  , KO_MEI VARCHAR2(60) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_KO_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,KO_BN)
) ;

-- 親
create table TB1_OYA (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , OYA_MEI VARCHAR2(60) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_OYA_PKC primary key (SOSEN_ID,OYA_BN)
) ;

-- 子孫
create table TB1_SHISON (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , KO_BN NUMBER(10) not null
  , SHISON_BN NUMBER(10) not null
  , SHISON_MEI VARCHAR2(60) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_SHISON_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,KO_BN,SHISON_BN)
) ;

-- 祖先
create table TB1_SOSEN (
  SOSEN_ID NUMBER(10) not null
  , BIKO VARCHAR2(800)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_SOSEN_PKC primary key (SOSEN_ID)
) ;

-- 添付ファイル
create table TB1_TENPU_FILE (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , TENPU_FILE_BN NUMBER(10) not null
  , TENPU_FILE_MEI VARCHAR2(60) not null
  , TENPU_FILE_PATH VARCHAR2(256) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_TENPU_FILE_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,TENPU_FILE_BN)
) ;

-- 転生
create table TB1_TENSEI (
  TENSEI_ID NUMBER(10)
  , TENSEI_MEI VARCHAR2(60) not null
  , SOSEN_ID NUMBER(10) not null
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB1_TENSEI_PKC primary key (TENSEI_ID)
) ;

-- エンティティ
create table TB2_ENTITY (
  ENTITY_ID NUMBER(10) not null
  , ENTITY_NM VARCHAR2(20) not null
  , ENTITY_MEI VARCHAR2(60) not null
  , CHECK_F CHAR(1) not null
  , RADIO_KB VARCHAR2(2) not null
  , PULLDOWN_KB VARCHAR2(2) not null
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
  , ZEINUKI_KG NUMBER(11,3) not null
  , NULL_ENTITY_NM VARCHAR2(20)
  , NULL_ENTITY_MEI VARCHAR2(60)
  , NULL_CHECK_F CHAR(1)
  , NULL_RADIO_KB VARCHAR2(2)
  , NULL_PULLDOWN_KB VARCHAR2(2)
  , NULL_MEMO_TX VARCHAR2(800)
  , NULL_NEN_Y CHAR(4)
  , NULL_TSUKI_M CHAR(2)
  , NULL_HI_D CHAR(2)
  , NULL_NENGETSU_YM CHAR(6)
  , NULL_NENGAPPI_YMD CHAR(8)
  , NULL_TIMESTAMP_TS TIMESTAMP
  , NULL_NICHIJI_DT DATE
  , NULL_HIDUKE_BI DATE
  , NULL_JIKOKU_HM DATE
  , NULL_JIKAN_TM VARCHAR2(9)
  , NULL_SURYO_QT NUMBER(9,2)
  , NULL_TANKA_KG NUMBER(11,3)
  , NULL_ZEINUKI_KG NUMBER(11,3)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
  , constraint TB2_ENTITY_PKC primary key (ENTITY_ID)
) ;

-- 主キーなし
create table TB2_NO_PK (
  COLUMN_A VARCHAR2(60)
  , COLUMN_B VARCHAR2(60)
  , COLUMN_C VARCHAR2(60)
  , COLUMN_D VARCHAR2(60)
  , COLUMN_E VARCHAR2(60)
  , INSERT_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , INSERT_ID NUMBER(10) not null
  , UPDATE_TS TIMESTAMP default CURRENT_TIMESTAMP not null
  , UPDATE_ID NUMBER(10) not null
  , DELETE_F CHAR(1) default 0
  , STATUS_KB VARCHAR2(2) default 0
) ;

create unique index TB2_NO_PK_IX1
  on TB2_NO_PK(COLUMN_A);

create unique index TB2_NO_PK_IX2
  on TB2_NO_PK(COLUMN_B,COLUMN_C);

-- 子孫
create view VB1_SHISON as
SELECT
    'TB1_SOSEN' AS TABLE_NAME
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

comment on table MB1_SANSHO1 is '参照１マスタ';
comment on column MB1_SANSHO1.SANSHO1_ID is '参照１ID';
comment on column MB1_SANSHO1.SANSHO1_MEI is '参照１名';
comment on column MB1_SANSHO1.INSERT_TS is '作成タイムスタンプ';
comment on column MB1_SANSHO1.INSERT_ID is '作成者';
comment on column MB1_SANSHO1.UPDATE_TS is '更新タイムスタンプ';
comment on column MB1_SANSHO1.UPDATE_ID is '更新者';
comment on column MB1_SANSHO1.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MB1_SANSHO1.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MB1_SANSHO2 is '参照２マスタ';
comment on column MB1_SANSHO2.SANSHO2_CD is '参照２CD';
comment on column MB1_SANSHO2.SANSHO2_MEI is '参照２名';
comment on column MB1_SANSHO2.INSERT_TS is '作成タイムスタンプ';
comment on column MB1_SANSHO2.INSERT_ID is '作成者';
comment on column MB1_SANSHO2.UPDATE_TS is '更新タイムスタンプ';
comment on column MB1_SANSHO2.UPDATE_ID is '更新者';
comment on column MB1_SANSHO2.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MB1_SANSHO2.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MB1_SANSHO3 is '参照３マスタ';
comment on column MB1_SANSHO3.SANSHO3_NO is '参照３NO';
comment on column MB1_SANSHO3.SANSHO3_MEI is '参照３名';
comment on column MB1_SANSHO3.INSERT_TS is '作成タイムスタンプ';
comment on column MB1_SANSHO3.INSERT_ID is '作成者';
comment on column MB1_SANSHO3.UPDATE_TS is '更新タイムスタンプ';
comment on column MB1_SANSHO3.UPDATE_ID is '更新者';
comment on column MB1_SANSHO3.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MB1_SANSHO3.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MHR_BUSHO is '部署マスタ';
comment on column MHR_BUSHO.BUSHO_ID is '部署ID';
comment on column MHR_BUSHO.BUSHO_MEI is '部署名';
comment on column MHR_BUSHO.OYA_BUSHO_ID is '親部署ID';
comment on column MHR_BUSHO.KAISHI_BI is '開始日';
comment on column MHR_BUSHO.SHURYO_BI is '終了日';
comment on column MHR_BUSHO.INSERT_TS is '作成タイムスタンプ';
comment on column MHR_BUSHO.INSERT_ID is '作成者';
comment on column MHR_BUSHO.UPDATE_TS is '更新タイムスタンプ';
comment on column MHR_BUSHO.UPDATE_ID is '更新者';
comment on column MHR_BUSHO.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MHR_BUSHO.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MHR_NINKA is '認可マスタ';
comment on column MHR_NINKA.BUSHO_ID is '部署ID';
comment on column MHR_NINKA.SHOKUI_ID is '職位ID';
comment on column MHR_NINKA.KINO_NM is '機能名称';
comment on column MHR_NINKA.KENGEN_KB is '権限区分';
comment on column MHR_NINKA.KAISHI_BI is '開始日';
comment on column MHR_NINKA.SHURYO_BI is '終了日';
comment on column MHR_NINKA.INSERT_TS is '作成タイムスタンプ';
comment on column MHR_NINKA.INSERT_ID is '作成者';
comment on column MHR_NINKA.UPDATE_TS is '更新タイムスタンプ';
comment on column MHR_NINKA.UPDATE_ID is '更新者';
comment on column MHR_NINKA.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MHR_NINKA.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MHR_SHOKUI is '職位マスタ';
comment on column MHR_SHOKUI.SHOKUI_ID is '職位ID';
comment on column MHR_SHOKUI.SHOKUI_MEI is '職位名';
comment on column MHR_SHOKUI.SHOKUI_ON is '職位順';
comment on column MHR_SHOKUI.KAISHI_BI is '開始日';
comment on column MHR_SHOKUI.SHURYO_BI is '終了日';
comment on column MHR_SHOKUI.INSERT_TS is '作成タイムスタンプ';
comment on column MHR_SHOKUI.INSERT_ID is '作成者';
comment on column MHR_SHOKUI.UPDATE_TS is '更新タイムスタンプ';
comment on column MHR_SHOKUI.UPDATE_ID is '更新者';
comment on column MHR_SHOKUI.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MHR_SHOKUI.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MHR_SHOZOKU is '所属マスタ';
comment on column MHR_SHOZOKU.BUSHO_ID is '部署ID';
comment on column MHR_SHOZOKU.SHOKUI_ID is '職位ID';
comment on column MHR_SHOZOKU.USER_ID is 'ユーザID';
comment on column MHR_SHOZOKU.KAISHI_BI is '開始日';
comment on column MHR_SHOZOKU.SHURYO_BI is '終了日';
comment on column MHR_SHOZOKU.INSERT_TS is '作成タイムスタンプ';
comment on column MHR_SHOZOKU.INSERT_ID is '作成者';
comment on column MHR_SHOZOKU.UPDATE_TS is '更新タイムスタンプ';
comment on column MHR_SHOZOKU.UPDATE_ID is '更新者';
comment on column MHR_SHOZOKU.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MHR_SHOZOKU.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MHR_USER is 'ユーザマスタ';
comment on column MHR_USER.USER_ID is 'ユーザID';
comment on column MHR_USER.USER_SEI is 'ユーザ姓';
comment on column MHR_USER.USER_MEI is 'ユーザ名';
comment on column MHR_USER.E_MAIL is 'メールアドレス';
comment on column MHR_USER.PASSWORD is 'パスワード';
comment on column MHR_USER.KAISHI_BI is '開始日';
comment on column MHR_USER.SHURYO_BI is '終了日';
comment on column MHR_USER.INSERT_TS is '作成タイムスタンプ';
comment on column MHR_USER.INSERT_ID is '作成者';
comment on column MHR_USER.UPDATE_TS is '更新タイムスタンプ';
comment on column MHR_USER.UPDATE_ID is '更新者';
comment on column MHR_USER.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MHR_USER.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MSY_KBN is '区分マスタ';
comment on column MSY_KBN.KBN_NM is '区分名称';
comment on column MSY_KBN.KBN_MEI is '区分名';
comment on column MSY_KBN.INSERT_TS is '作成タイムスタンプ';
comment on column MSY_KBN.INSERT_ID is '作成者';
comment on column MSY_KBN.UPDATE_TS is '更新タイムスタンプ';
comment on column MSY_KBN.UPDATE_ID is '更新者';
comment on column MSY_KBN.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MSY_KBN.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table MSY_KBN_VAL is '区分値マスタ';
comment on column MSY_KBN_VAL.KBN_NM is '区分名称';
comment on column MSY_KBN_VAL.KBN_VAL is '区分値';
comment on column MSY_KBN_VAL.KBN_VAL_MEI is '区分値名';
comment on column MSY_KBN_VAL.HYOJI_ON is '表示順';
comment on column MSY_KBN_VAL.CRITERIA is '取得条件';
comment on column MSY_KBN_VAL.INSERT_TS is '作成タイムスタンプ';
comment on column MSY_KBN_VAL.INSERT_ID is '作成者';
comment on column MSY_KBN_VAL.UPDATE_TS is '更新タイムスタンプ';
comment on column MSY_KBN_VAL.UPDATE_ID is '更新者';
comment on column MSY_KBN_VAL.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column MSY_KBN_VAL.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_ENTITY1 is 'エンティティ１';
comment on column TB1_ENTITY1.SOSEN_ID is '祖先ID';
comment on column TB1_ENTITY1.OYA_BN is '親枝番';
comment on column TB1_ENTITY1.ENTITY_BN is 'エンティティ枝番';
comment on column TB1_ENTITY1.ENTITY1_MEI is 'エンティティ名';
comment on column TB1_ENTITY1.SANSHO1_ID is '参照１ID';
comment on column TB1_ENTITY1.SANSHO1_MEI is '参照１名';
comment on column TB1_ENTITY1.SANSHO2_CD is '参照２CD';
comment on column TB1_ENTITY1.SANSHO2_MEI is '参照２名';
comment on column TB1_ENTITY1.SANSHO3_NO is '参照３NO';
comment on column TB1_ENTITY1.SANSHO3_MEI is '参照３名';
comment on column TB1_ENTITY1.BETSU_SANSHO1_ID is '別参照１ID';
comment on column TB1_ENTITY1.BETSU_SANSHO1_MEI is '別参照１名';
comment on column TB1_ENTITY1.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_ENTITY1.INSERT_ID is '作成者';
comment on column TB1_ENTITY1.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_ENTITY1.UPDATE_ID is '更新者';
comment on column TB1_ENTITY1.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_ENTITY1.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_ENTITY1_HIS is 'エンティティ１履歴';
comment on column TB1_ENTITY1_HIS.SOSEN_ID is '祖先ID';
comment on column TB1_ENTITY1_HIS.OYA_BN is '親枝番';
comment on column TB1_ENTITY1_HIS.ENTITY_BN is 'エンティティ枝番';
comment on column TB1_ENTITY1_HIS.HISTORY_BN is '履歴枝番';
comment on column TB1_ENTITY1_HIS.ENTITY1_MEI is 'エンティティ１名';
comment on column TB1_ENTITY1_HIS.SANSHO1_ID is '参照１ID';
comment on column TB1_ENTITY1_HIS.SANSHO1_MEI is '参照１名';
comment on column TB1_ENTITY1_HIS.SANSHO2_CD is '参照２CD';
comment on column TB1_ENTITY1_HIS.SANSHO2_MEI is '参照２名';
comment on column TB1_ENTITY1_HIS.SANSHO3_NO is '参照３NO';
comment on column TB1_ENTITY1_HIS.SANSHO3_MEI is '参照３名';
comment on column TB1_ENTITY1_HIS.BETSU_SANSHO1_ID is '別参照１ID';
comment on column TB1_ENTITY1_HIS.BETSU_SANSHO1_MEI is '別参照１名';
comment on column TB1_ENTITY1_HIS.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_ENTITY1_HIS.INSERT_ID is '作成者';
comment on column TB1_ENTITY1_HIS.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_ENTITY1_HIS.UPDATE_ID is '更新者';
comment on column TB1_ENTITY1_HIS.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_ENTITY1_HIS.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_ENTITY2 is 'エンティティ２';
comment on column TB1_ENTITY2.SOSEN_ID is '祖先ID';
comment on column TB1_ENTITY2.OYA_BN is '親枝番';
comment on column TB1_ENTITY2.ENTITY_BN is 'エンティティ枝番';
comment on column TB1_ENTITY2.ENTITY2_MEI is 'エンティティ２名';
comment on column TB1_ENTITY2.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_ENTITY2.INSERT_ID is '作成者';
comment on column TB1_ENTITY2.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_ENTITY2.UPDATE_ID is '更新者';
comment on column TB1_ENTITY2.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_ENTITY2.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_ENTITY3 is 'エンティティ３';
comment on column TB1_ENTITY3.SOSEN_ID is '祖先ID';
comment on column TB1_ENTITY3.OYA_BN is '親枝番';
comment on column TB1_ENTITY3.ENTITY_BN is 'エンティティ枝番';
comment on column TB1_ENTITY3.ENTITY3_MEI is 'エンティティ３名';
comment on column TB1_ENTITY3.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_ENTITY3.INSERT_ID is '作成者';
comment on column TB1_ENTITY3.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_ENTITY3.UPDATE_ID is '更新者';
comment on column TB1_ENTITY3.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_ENTITY3.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_ENTITY4 is 'エンティティ４';
comment on column TB1_ENTITY4.SOSEN_ID is '祖先ID';
comment on column TB1_ENTITY4.OYA_BN is '親枝番';
comment on column TB1_ENTITY4.ENTITY_BN is 'エンティティ枝番';
comment on column TB1_ENTITY4.ENTITY4_MEI is 'エンティティ４名';
comment on column TB1_ENTITY4.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_ENTITY4.INSERT_ID is '作成者';
comment on column TB1_ENTITY4.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_ENTITY4.UPDATE_ID is '更新者';
comment on column TB1_ENTITY4.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_ENTITY4.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_ENTITY5 is 'エンティティ５';
comment on column TB1_ENTITY5.SOSEN_ID is '祖先ID';
comment on column TB1_ENTITY5.OYA_BN is '親枝番';
comment on column TB1_ENTITY5.ENTITY_BN is 'エンティティ枝番';
comment on column TB1_ENTITY5.ENTITY5_MEI is 'エンティティ５名';
comment on column TB1_ENTITY5.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_ENTITY5.INSERT_ID is '作成者';
comment on column TB1_ENTITY5.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_ENTITY5.UPDATE_ID is '更新者';
comment on column TB1_ENTITY5.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_ENTITY5.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_ITOKO is '従妹';
comment on column TB1_ITOKO.ITOKO_ID is '従妹ID';
comment on column TB1_ITOKO.ITOKO_MEI is '従妹名';
comment on column TB1_ITOKO.SOSEN_ID is '祖先ID';
comment on column TB1_ITOKO.OYA_BN is '親枝番';
comment on column TB1_ITOKO.ENTITY_BN is 'エンティティ枝番';
comment on column TB1_ITOKO.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_ITOKO.INSERT_ID is '作成者';
comment on column TB1_ITOKO.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_ITOKO.UPDATE_ID is '更新者';
comment on column TB1_ITOKO.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_ITOKO.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_KO is '子';
comment on column TB1_KO.SOSEN_ID is '祖先ID';
comment on column TB1_KO.OYA_BN is '親枝番';
comment on column TB1_KO.ENTITY_BN is 'エンティティ枝番';
comment on column TB1_KO.KO_BN is '子枝番';
comment on column TB1_KO.KO_MEI is '子名';
comment on column TB1_KO.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_KO.INSERT_ID is '作成者';
comment on column TB1_KO.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_KO.UPDATE_ID is '更新者';
comment on column TB1_KO.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_KO.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_OYA is '親';
comment on column TB1_OYA.SOSEN_ID is '祖先ID';
comment on column TB1_OYA.OYA_BN is '親枝番';
comment on column TB1_OYA.OYA_MEI is '親名';
comment on column TB1_OYA.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_OYA.INSERT_ID is '作成者';
comment on column TB1_OYA.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_OYA.UPDATE_ID is '更新者';
comment on column TB1_OYA.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_OYA.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_SHISON is '子孫';
comment on column TB1_SHISON.SOSEN_ID is '祖先ID';
comment on column TB1_SHISON.OYA_BN is '親枝番';
comment on column TB1_SHISON.ENTITY_BN is 'エンティティ枝番';
comment on column TB1_SHISON.KO_BN is '子枝番';
comment on column TB1_SHISON.SHISON_BN is '子孫枝番';
comment on column TB1_SHISON.SHISON_MEI is '子孫名';
comment on column TB1_SHISON.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_SHISON.INSERT_ID is '作成者';
comment on column TB1_SHISON.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_SHISON.UPDATE_ID is '更新者';
comment on column TB1_SHISON.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_SHISON.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_SOSEN is '祖先';
comment on column TB1_SOSEN.SOSEN_ID is '祖先ID';
comment on column TB1_SOSEN.BIKO is '備考';
comment on column TB1_SOSEN.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_SOSEN.INSERT_ID is '作成者';
comment on column TB1_SOSEN.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_SOSEN.UPDATE_ID is '更新者';
comment on column TB1_SOSEN.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_SOSEN.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_TENPU_FILE is '添付ファイル';
comment on column TB1_TENPU_FILE.SOSEN_ID is '祖先ID';
comment on column TB1_TENPU_FILE.OYA_BN is '親枝番';
comment on column TB1_TENPU_FILE.ENTITY_BN is 'エンティティ枝番';
comment on column TB1_TENPU_FILE.TENPU_FILE_BN is '添付ファイル枝番';
comment on column TB1_TENPU_FILE.TENPU_FILE_MEI is '添付ファイル名';
comment on column TB1_TENPU_FILE.TENPU_FILE_PATH is '添付ファイルパス';
comment on column TB1_TENPU_FILE.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_TENPU_FILE.INSERT_ID is '作成者';
comment on column TB1_TENPU_FILE.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_TENPU_FILE.UPDATE_ID is '更新者';
comment on column TB1_TENPU_FILE.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_TENPU_FILE.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB1_TENSEI is '転生';
comment on column TB1_TENSEI.TENSEI_ID is '転生ID';
comment on column TB1_TENSEI.TENSEI_MEI is '転生名';
comment on column TB1_TENSEI.SOSEN_ID is '祖先ID';
comment on column TB1_TENSEI.INSERT_TS is '作成タイムスタンプ';
comment on column TB1_TENSEI.INSERT_ID is '作成者';
comment on column TB1_TENSEI.UPDATE_TS is '更新タイムスタンプ';
comment on column TB1_TENSEI.UPDATE_ID is '更新者';
comment on column TB1_TENSEI.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB1_TENSEI.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB2_ENTITY is 'エンティティ';
comment on column TB2_ENTITY.ENTITY_ID is 'エンティティID';
comment on column TB2_ENTITY.ENTITY_NM is 'エンティティ名称';
comment on column TB2_ENTITY.ENTITY_MEI is 'エンティティ名';
comment on column TB2_ENTITY.CHECK_F is 'チェックフラグ';
comment on column TB2_ENTITY.RADIO_KB is 'ラジオ区分';
comment on column TB2_ENTITY.PULLDOWN_KB is 'プルダウン区分';
comment on column TB2_ENTITY.MEMO_TX is 'メモ';
comment on column TB2_ENTITY.NEN_Y is '年';
comment on column TB2_ENTITY.TSUKI_M is '月';
comment on column TB2_ENTITY.HI_D is '日';
comment on column TB2_ENTITY.NENGETSU_YM is '年月';
comment on column TB2_ENTITY.NENGAPPI_YMD is '年月日';
comment on column TB2_ENTITY.TIMESTAMP_TS is 'タイムスタンプ';
comment on column TB2_ENTITY.NICHIJI_DT is '日時';
comment on column TB2_ENTITY.HIDUKE_BI is '日付';
comment on column TB2_ENTITY.JIKOKU_HM is '時刻';
comment on column TB2_ENTITY.JIKAN_TM is '時間';
comment on column TB2_ENTITY.SURYO_QT is '数量';
comment on column TB2_ENTITY.TANKA_KG is '単価';
comment on column TB2_ENTITY.ZEINUKI_KG is '税抜金額';
comment on column TB2_ENTITY.NULL_ENTITY_NM is '任意エンティティ名称';
comment on column TB2_ENTITY.NULL_ENTITY_MEI is '任意エンティティ名';
comment on column TB2_ENTITY.NULL_CHECK_F is '任意チェックフラグ';
comment on column TB2_ENTITY.NULL_RADIO_KB is '任意ラジオ区分';
comment on column TB2_ENTITY.NULL_PULLDOWN_KB is '任意プルダウン区分';
comment on column TB2_ENTITY.NULL_MEMO_TX is '任意メモ';
comment on column TB2_ENTITY.NULL_NEN_Y is '任意年';
comment on column TB2_ENTITY.NULL_TSUKI_M is '任意月';
comment on column TB2_ENTITY.NULL_HI_D is '任意日';
comment on column TB2_ENTITY.NULL_NENGETSU_YM is '任意年月';
comment on column TB2_ENTITY.NULL_NENGAPPI_YMD is '任意年月日';
comment on column TB2_ENTITY.NULL_TIMESTAMP_TS is '任意タイムスタンプ';
comment on column TB2_ENTITY.NULL_NICHIJI_DT is '任意日時';
comment on column TB2_ENTITY.NULL_HIDUKE_BI is '任意日付';
comment on column TB2_ENTITY.NULL_JIKOKU_HM is '任意時刻';
comment on column TB2_ENTITY.NULL_JIKAN_TM is '任意時間';
comment on column TB2_ENTITY.NULL_SURYO_QT is '任意数量';
comment on column TB2_ENTITY.NULL_TANKA_KG is '任意単価';
comment on column TB2_ENTITY.NULL_ZEINUKI_KG is '任意税抜金額';
comment on column TB2_ENTITY.INSERT_TS is '作成タイムスタンプ';
comment on column TB2_ENTITY.INSERT_ID is '作成者';
comment on column TB2_ENTITY.UPDATE_TS is '更新タイムスタンプ';
comment on column TB2_ENTITY.UPDATE_ID is '更新者';
comment on column TB2_ENTITY.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB2_ENTITY.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table TB2_NO_PK is '主キーなし';
comment on column TB2_NO_PK.COLUMN_A is '列Ａ';
comment on column TB2_NO_PK.COLUMN_B is '列Ｂ';
comment on column TB2_NO_PK.COLUMN_C is '列Ｃ';
comment on column TB2_NO_PK.COLUMN_D is '列Ｄ';
comment on column TB2_NO_PK.COLUMN_E is '列Ｅ';
comment on column TB2_NO_PK.INSERT_TS is '作成タイムスタンプ';
comment on column TB2_NO_PK.INSERT_ID is '作成者';
comment on column TB2_NO_PK.UPDATE_TS is '更新タイムスタンプ';
comment on column TB2_NO_PK.UPDATE_ID is '更新者';
comment on column TB2_NO_PK.DELETE_F is '削除フラグ:必須チェックにかかるのでNOTNULLにしない';
comment on column TB2_NO_PK.STATUS_KB is 'ステータス区分:必須チェックにかかるのでNOTNULLにしない';

comment on table VB1_SHISON is '子孫';
comment on column VB1_SHISON.TABLE_NAME is 'TABLE_NAME';
comment on column VB1_SHISON.SOSEN_ID is 'SOSEN_ID';
comment on column VB1_SHISON.SOSEN_MEI is 'SOSEN_MEI';
comment on column VB1_SHISON.OYA_MEI is 'OYA_MEI';
comment on column VB1_SHISON.ENTITY1_MEI is 'ENTITY1_MEI';
comment on column VB1_SHISON.KO_MEI is 'KO_MEI';
comment on column VB1_SHISON.SHISON_MEI is 'SHISON_MEI';
comment on column VB1_SHISON.SEARCH_SOSEN_ID is 'SEARCH_SOSEN_ID';
comment on column VB1_SHISON.SEARCH_OYA_BN is 'SEARCH_OYA_BN';
comment on column VB1_SHISON.SEARCH_ENTITY_BN is 'SEARCH_ENTITY_BN';
comment on column VB1_SHISON.SEARCH_KO_BN is 'SEARCH_KO_BN';
comment on column VB1_SHISON.SEARCH_SHISON_BN is 'SEARCH_SHISON_BN';
comment on column VB1_SHISON.INSERT_TS is 'INSERT_TS';

comment on table VB2_ENTITY is 'エンティティ検索';
comment on column VB2_ENTITY.ENTITY_ID is 'ENTITY_ID';
comment on column VB2_ENTITY.ENTITY_NM is 'ENTITY_NM';
comment on column VB2_ENTITY.ENTITY_MEI is 'ENTITY_MEI';
comment on column VB2_ENTITY.CHECK_F is 'CHECK_F';
comment on column VB2_ENTITY.RADIO_KB is 'RADIO_KB';
comment on column VB2_ENTITY.PULLDOWN_KB is 'PULLDOWN_KB';
comment on column VB2_ENTITY.MEMO_TX is 'MEMO_TX';
comment on column VB2_ENTITY.NEN_Y is 'NEN_Y';
comment on column VB2_ENTITY.TSUKI_M is 'TSUKI_M';
comment on column VB2_ENTITY.HI_D is 'HI_D';
comment on column VB2_ENTITY.NENGETSU_YM is 'NENGETSU_YM';
comment on column VB2_ENTITY.NENGAPPI_YMD is 'NENGAPPI_YMD';
comment on column VB2_ENTITY.TIMESTAMP_TS is 'TIMESTAMP_TS';
comment on column VB2_ENTITY.NICHIJI_DT is 'NICHIJI_DT';
comment on column VB2_ENTITY.HIDUKE_BI is 'HIDUKE_BI';
comment on column VB2_ENTITY.JIKOKU_HM is 'JIKOKU_HM';
comment on column VB2_ENTITY.JIKAN_TM is 'JIKAN_TM';
comment on column VB2_ENTITY.SURYO_QT is 'SURYO_QT';
comment on column VB2_ENTITY.TANKA_KG is 'TANKA_KG';
comment on column VB2_ENTITY.ZEINUKI_KG is 'ZEINUKI_KG';

