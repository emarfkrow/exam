-- Project Name : emarf
-- Date/Time    : 2024/11/18 9:44:57
-- Author       : KTC0966
-- RDBMS Type   : Oracle Database
-- Application  : A5:SQL Mk-2

-- 部署マスタ
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

-- 区分マスタ
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

-- 区分値マスタ
create table M_KBN_VALUE (
  KBN_NM VARCHAR2(30) not null
  , KBN_KB VARCHAR2(2) not null
  , KBN_KB_MEI VARCHAR2(120) not null
  , HYOJI_ON NUMBER(10) not null
  , CRITERIA VARCHAR2(800)
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint M_KBN_VALUE_PKC primary key (KBN_NM,KBN_KB)
) ;

-- 機能マスタ
create table M_KINO (
  KINO_NM VARCHAR2(30)
  , KINO_MEI VARCHAR2(120)
  , KAISHI_BI DATE
  , SHURYO_BI DATE
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint M_KINO_PKC primary key (KINO_NM)
) ;

-- 認可マスタ
create table M_NINKA (
  BUSHO_ID NUMBER(10) not null
  , SHOKUI_ID NUMBER(10) not null
  , KINO_NM VARCHAR2(30) not null
  , KENGEN_KB VARCHAR2(2) not null
  , KAISHI_BI DATE
  , SHURYO_BI DATE
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint M_NINKA_PKC primary key (BUSHO_ID,SHOKUI_ID,KINO_NM)
) ;

-- 参照１マスタ
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

-- 参照２マスタ
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

-- 参照３マスタ
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

-- 職位マスタ
create table M_SHOKUI (
  SHOKUI_ID NUMBER(10) not null
  , SHOKUI_MEI VARCHAR2(120) not null
  , SHOKUI_ON NUMBER(10) not null
  , KAISHI_BI DATE
  , SHURYO_BI DATE
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint M_SHOKUI_PKC primary key (SHOKUI_ID)
) ;

-- 所属マスタ
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

-- ユーザマスタ
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

-- エンティティ
create table T_ENTITY (
  ENTITY_ID NUMBER(10) not null
  , ENTITY_NM VARCHAR2(30) not null
  , ENTITY_MEI VARCHAR2(120) not null
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
  , NULL_ENTITY_NM VARCHAR2(30)
  , NULL_ENTITY_MEI VARCHAR2(120)
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
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint T_ENTITY_PKC primary key (ENTITY_ID)
) ;

-- エンティティ１
create table T_ENTITY1 (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , ENTITY1_MEI VARCHAR2(120) not null
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
  , constraint T_ENTITY1_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) ;

-- エンティティ１履歴
create table T_ENTITY1_HIS (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , HISTORY_BN NUMBER(10) not null
  , ENTITY1_MEI VARCHAR2(120) not null
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
  , constraint T_ENTITY1_HIS_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,HISTORY_BN)
) ;

-- エンティティ２
create table T_ENTITY2 (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , ENTITY2_MEI VARCHAR2(120) not null
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint T_ENTITY2_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) ;

-- エンティティ３
create table T_ENTITY3 (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , ENTITY3_MEI VARCHAR2(120) not null
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint T_ENTITY3_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) ;

-- エンティティ４
create table T_ENTITY4 (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , ENTITY4_MEI VARCHAR2(120) not null
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint T_ENTITY4_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) ;

-- エンティティ５
create table T_ENTITY5 (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , ENTITY5_MEI VARCHAR2(120) not null
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint T_ENTITY5_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN)
) ;

-- 従妹
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

-- 子
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

-- 主キーなし
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

-- 親
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

-- 子孫
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

-- 祖先
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

-- 添付ファイル
create table T_TENPU_FILE (
  SOSEN_ID NUMBER(10) not null
  , OYA_BN NUMBER(10) not null
  , ENTITY_BN NUMBER(10) not null
  , TENPU_FILE_BN NUMBER(10) not null
  , TENPU_FILE_MEI VARCHAR2(120) not null
  , TENPU_FILE_PATH VARCHAR2(256) not null
  , INSERT_DT DATE not null
  , INSERT_BY VARCHAR2(10) not null
  , UPDATE_DT DATE not null
  , UPDATE_BY VARCHAR2(10) not null
  , DELETE_F CHAR(1)
  , constraint T_TENPU_FILE_PKC primary key (SOSEN_ID,OYA_BN,ENTITY_BN,TENPU_FILE_BN)
) ;

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

comment on table M_KBN is '区分マスタ';
comment on column M_KBN.KBN_NM is '区分名称';
comment on column M_KBN.KBN_MEI is '区分名';
comment on column M_KBN.INSERT_DT is '登録日時';
comment on column M_KBN.INSERT_BY is '登録者';
comment on column M_KBN.UPDATE_DT is '更新日時';
comment on column M_KBN.UPDATE_BY is '更新者';
comment on column M_KBN.DELETE_F is '削除フラグ';

comment on table M_KBN_VALUE is '区分値マスタ';
comment on column M_KBN_VALUE.KBN_NM is '区分名称';
comment on column M_KBN_VALUE.KBN_KB is '区分値';
comment on column M_KBN_VALUE.KBN_KB_MEI is '区分値名';
comment on column M_KBN_VALUE.HYOJI_ON is '表示順';
comment on column M_KBN_VALUE.CRITERIA is '取得条件';
comment on column M_KBN_VALUE.INSERT_DT is '登録日時';
comment on column M_KBN_VALUE.INSERT_BY is '登録者';
comment on column M_KBN_VALUE.UPDATE_DT is '更新日時';
comment on column M_KBN_VALUE.UPDATE_BY is '更新者';
comment on column M_KBN_VALUE.DELETE_F is '削除フラグ';

comment on table M_KINO is '機能マスタ';
comment on column M_KINO.KINO_NM is '機能名称';
comment on column M_KINO.KINO_MEI is '機能名';
comment on column M_KINO.KAISHI_BI is '開始日';
comment on column M_KINO.SHURYO_BI is '終了日';
comment on column M_KINO.INSERT_DT is '登録日時';
comment on column M_KINO.INSERT_BY is '登録者';
comment on column M_KINO.UPDATE_DT is '更新日時';
comment on column M_KINO.UPDATE_BY is '更新者';
comment on column M_KINO.DELETE_F is '削除フラグ';

comment on table M_NINKA is '認可マスタ';
comment on column M_NINKA.BUSHO_ID is '部署ID';
comment on column M_NINKA.SHOKUI_ID is '職位ID';
comment on column M_NINKA.KINO_NM is '機能名称';
comment on column M_NINKA.KENGEN_KB is '権限区分';
comment on column M_NINKA.KAISHI_BI is '開始日';
comment on column M_NINKA.SHURYO_BI is '終了日';
comment on column M_NINKA.INSERT_DT is '登録日時';
comment on column M_NINKA.INSERT_BY is '登録者';
comment on column M_NINKA.UPDATE_DT is '更新日時';
comment on column M_NINKA.UPDATE_BY is '更新者';
comment on column M_NINKA.DELETE_F is '削除フラグ';

comment on table M_SANSHO1 is '参照１マスタ';
comment on column M_SANSHO1.SANSHO1_ID is '参照１ID';
comment on column M_SANSHO1.SANSHO1_MEI is '参照１名';
comment on column M_SANSHO1.INSERT_DT is '登録日時';
comment on column M_SANSHO1.INSERT_BY is '登録者';
comment on column M_SANSHO1.UPDATE_DT is '更新日時';
comment on column M_SANSHO1.UPDATE_BY is '更新者';
comment on column M_SANSHO1.DELETE_F is '削除フラグ';

comment on table M_SANSHO2 is '参照２マスタ';
comment on column M_SANSHO2.SANSHO2_CD is '参照２CD';
comment on column M_SANSHO2.SANSHO2_MEI is '参照２名';
comment on column M_SANSHO2.INSERT_DT is '登録日時';
comment on column M_SANSHO2.INSERT_BY is '登録者';
comment on column M_SANSHO2.UPDATE_DT is '更新日時';
comment on column M_SANSHO2.UPDATE_BY is '更新者';
comment on column M_SANSHO2.DELETE_F is '削除フラグ';

comment on table M_SANSHO3 is '参照３マスタ';
comment on column M_SANSHO3.SANSHO3_NO is '参照３NO';
comment on column M_SANSHO3.SANSHO3_MEI is '参照３名';
comment on column M_SANSHO3.INSERT_DT is '登録日時';
comment on column M_SANSHO3.INSERT_BY is '登録者';
comment on column M_SANSHO3.UPDATE_DT is '更新日時';
comment on column M_SANSHO3.UPDATE_BY is '更新者';
comment on column M_SANSHO3.DELETE_F is '削除フラグ';

comment on table M_SHOKUI is '職位マスタ';
comment on column M_SHOKUI.SHOKUI_ID is '職位ID';
comment on column M_SHOKUI.SHOKUI_MEI is '職位名';
comment on column M_SHOKUI.SHOKUI_ON is '職位順';
comment on column M_SHOKUI.KAISHI_BI is '開始日';
comment on column M_SHOKUI.SHURYO_BI is '終了日';
comment on column M_SHOKUI.INSERT_DT is '登録日時';
comment on column M_SHOKUI.INSERT_BY is '登録者';
comment on column M_SHOKUI.UPDATE_DT is '更新日時';
comment on column M_SHOKUI.UPDATE_BY is '更新者';
comment on column M_SHOKUI.DELETE_F is '削除フラグ';

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

comment on table T_ENTITY is 'エンティティ';
comment on column T_ENTITY.ENTITY_ID is 'エンティティID';
comment on column T_ENTITY.ENTITY_NM is 'エンティティ名称';
comment on column T_ENTITY.ENTITY_MEI is 'エンティティ名';
comment on column T_ENTITY.CHECK_F is 'チェックフラグ';
comment on column T_ENTITY.RADIO_KB is 'ラジオ区分';
comment on column T_ENTITY.PULLDOWN_KB is 'プルダウン区分';
comment on column T_ENTITY.MEMO_TX is 'メモ';
comment on column T_ENTITY.NEN_Y is '年';
comment on column T_ENTITY.TSUKI_M is '月';
comment on column T_ENTITY.HI_D is '日';
comment on column T_ENTITY.NENGETSU_YM is '年月';
comment on column T_ENTITY.NENGAPPI_YMD is '年月日';
comment on column T_ENTITY.TIMESTAMP_TS is 'タイムスタンプ';
comment on column T_ENTITY.NICHIJI_DT is '日時';
comment on column T_ENTITY.HIDUKE_BI is '日付';
comment on column T_ENTITY.JIKOKU_HM is '時刻';
comment on column T_ENTITY.JIKAN_TM is '時間';
comment on column T_ENTITY.SURYO_QT is '数量';
comment on column T_ENTITY.TANKA_KG is '単価';
comment on column T_ENTITY.ZEINUKI_KG is '税抜金額';
comment on column T_ENTITY.NULL_ENTITY_NM is '任意エンティティ名称';
comment on column T_ENTITY.NULL_ENTITY_MEI is '任意エンティティ名';
comment on column T_ENTITY.NULL_CHECK_F is '任意チェックフラグ';
comment on column T_ENTITY.NULL_RADIO_KB is '任意ラジオ区分';
comment on column T_ENTITY.NULL_PULLDOWN_KB is '任意プルダウン区分';
comment on column T_ENTITY.NULL_MEMO_TX is '任意メモ';
comment on column T_ENTITY.NULL_NEN_Y is '任意年';
comment on column T_ENTITY.NULL_TSUKI_M is '任意月';
comment on column T_ENTITY.NULL_HI_D is '任意日';
comment on column T_ENTITY.NULL_NENGETSU_YM is '任意年月';
comment on column T_ENTITY.NULL_NENGAPPI_YMD is '任意年月日';
comment on column T_ENTITY.NULL_TIMESTAMP_TS is '任意タイムスタンプ';
comment on column T_ENTITY.NULL_NICHIJI_DT is '任意日時';
comment on column T_ENTITY.NULL_HIDUKE_BI is '任意日付';
comment on column T_ENTITY.NULL_JIKOKU_HM is '任意時刻';
comment on column T_ENTITY.NULL_JIKAN_TM is '任意時間';
comment on column T_ENTITY.NULL_SURYO_QT is '任意数量';
comment on column T_ENTITY.NULL_TANKA_KG is '任意単価';
comment on column T_ENTITY.NULL_ZEINUKI_KG is '任意税抜金額';
comment on column T_ENTITY.INSERT_DT is '登録日時';
comment on column T_ENTITY.INSERT_BY is '登録者';
comment on column T_ENTITY.UPDATE_DT is '更新日時';
comment on column T_ENTITY.UPDATE_BY is '更新者';
comment on column T_ENTITY.DELETE_F is '削除フラグ';

comment on table T_ENTITY1 is 'エンティティ１';
comment on column T_ENTITY1.SOSEN_ID is '祖先ID';
comment on column T_ENTITY1.OYA_BN is '親枝番';
comment on column T_ENTITY1.ENTITY_BN is 'エンティティ枝番';
comment on column T_ENTITY1.ENTITY1_MEI is 'エンティティ名';
comment on column T_ENTITY1.SANSHO1_ID is '参照１ID';
comment on column T_ENTITY1.SANSHO1_MEI is '参照１名';
comment on column T_ENTITY1.SANSHO2_CD is '参照２CD';
comment on column T_ENTITY1.SANSHO2_MEI is '参照２名';
comment on column T_ENTITY1.SANSHO3_NO is '参照３NO';
comment on column T_ENTITY1.SANSHO3_MEI is '参照３名';
comment on column T_ENTITY1.BETSU_SANSHO1_ID is '別参照１ID';
comment on column T_ENTITY1.BETSU_SANSHO1_MEI is '別参照１名';
comment on column T_ENTITY1.INSERT_DT is '登録日時';
comment on column T_ENTITY1.INSERT_BY is '登録者';
comment on column T_ENTITY1.UPDATE_DT is '更新日時';
comment on column T_ENTITY1.UPDATE_BY is '更新者';
comment on column T_ENTITY1.DELETE_F is '削除フラグ';

comment on table T_ENTITY1_HIS is 'エンティティ１履歴';
comment on column T_ENTITY1_HIS.SOSEN_ID is '祖先ID';
comment on column T_ENTITY1_HIS.OYA_BN is '親枝番';
comment on column T_ENTITY1_HIS.ENTITY_BN is 'エンティティ枝番';
comment on column T_ENTITY1_HIS.HISTORY_BN is '履歴枝番';
comment on column T_ENTITY1_HIS.ENTITY1_MEI is 'エンティティ１名';
comment on column T_ENTITY1_HIS.SANSHO1_ID is '参照１ID';
comment on column T_ENTITY1_HIS.SANSHO1_MEI is '参照１名';
comment on column T_ENTITY1_HIS.SANSHO2_CD is '参照２CD';
comment on column T_ENTITY1_HIS.SANSHO2_MEI is '参照２名';
comment on column T_ENTITY1_HIS.SANSHO3_NO is '参照３NO';
comment on column T_ENTITY1_HIS.SANSHO3_MEI is '参照３名';
comment on column T_ENTITY1_HIS.BETSU_SANSHO1_ID is '別参照１ID';
comment on column T_ENTITY1_HIS.BETSU_SANSHO1_MEI is '別参照１名';
comment on column T_ENTITY1_HIS.INSERT_DT is '登録日時';
comment on column T_ENTITY1_HIS.INSERT_BY is '登録者';
comment on column T_ENTITY1_HIS.UPDATE_DT is '更新日時';
comment on column T_ENTITY1_HIS.UPDATE_BY is '更新者';
comment on column T_ENTITY1_HIS.DELETE_F is '削除フラグ';

comment on table T_ENTITY2 is 'エンティティ２';
comment on column T_ENTITY2.SOSEN_ID is '祖先ID';
comment on column T_ENTITY2.OYA_BN is '親枝番';
comment on column T_ENTITY2.ENTITY_BN is 'エンティティ枝番';
comment on column T_ENTITY2.ENTITY2_MEI is 'エンティティ２名';
comment on column T_ENTITY2.INSERT_DT is '登録日時';
comment on column T_ENTITY2.INSERT_BY is '登録者';
comment on column T_ENTITY2.UPDATE_DT is '更新日時';
comment on column T_ENTITY2.UPDATE_BY is '更新者';
comment on column T_ENTITY2.DELETE_F is '削除フラグ';

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

comment on table T_ENTITY4 is 'エンティティ４';
comment on column T_ENTITY4.SOSEN_ID is '祖先ID';
comment on column T_ENTITY4.OYA_BN is '親枝番';
comment on column T_ENTITY4.ENTITY_BN is 'エンティティ枝番';
comment on column T_ENTITY4.ENTITY4_MEI is 'エンティティ４名';
comment on column T_ENTITY4.INSERT_DT is '登録日時';
comment on column T_ENTITY4.INSERT_BY is '登録者';
comment on column T_ENTITY4.UPDATE_DT is '更新日時';
comment on column T_ENTITY4.UPDATE_BY is '更新者';
comment on column T_ENTITY4.DELETE_F is '削除フラグ';

comment on table T_ENTITY5 is 'エンティティ５';
comment on column T_ENTITY5.SOSEN_ID is '祖先ID';
comment on column T_ENTITY5.OYA_BN is '親枝番';
comment on column T_ENTITY5.ENTITY_BN is 'エンティティ枝番';
comment on column T_ENTITY5.ENTITY5_MEI is 'エンティティ５名';
comment on column T_ENTITY5.INSERT_DT is '登録日時';
comment on column T_ENTITY5.INSERT_BY is '登録者';
comment on column T_ENTITY5.UPDATE_DT is '更新日時';
comment on column T_ENTITY5.UPDATE_BY is '更新者';
comment on column T_ENTITY5.DELETE_F is '削除フラグ';

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

comment on table T_OYA is '親';
comment on column T_OYA.SOSEN_ID is '祖先ID';
comment on column T_OYA.OYA_BN is '親枝番';
comment on column T_OYA.OYA_MEI is '親名';
comment on column T_OYA.INSERT_DT is '登録日時';
comment on column T_OYA.INSERT_BY is '登録者';
comment on column T_OYA.UPDATE_DT is '更新日時';
comment on column T_OYA.UPDATE_BY is '更新者';
comment on column T_OYA.DELETE_F is '削除フラグ';

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

comment on table T_SOSEN is '祖先';
comment on column T_SOSEN.SOSEN_ID is '祖先ID';
comment on column T_SOSEN.SOSEN_MEI is '祖先名';
comment on column T_SOSEN.INSERT_DT is '登録日時';
comment on column T_SOSEN.INSERT_BY is '登録者';
comment on column T_SOSEN.UPDATE_DT is '更新日時';
comment on column T_SOSEN.UPDATE_BY is '更新者';
comment on column T_SOSEN.DELETE_F is '削除フラグ';

comment on table T_TENPU_FILE is '添付ファイル';
comment on column T_TENPU_FILE.SOSEN_ID is '祖先ID';
comment on column T_TENPU_FILE.OYA_BN is '親枝番';
comment on column T_TENPU_FILE.ENTITY_BN is 'エンティティ枝番';
comment on column T_TENPU_FILE.TENPU_FILE_BN is '添付ファイル枝番';
comment on column T_TENPU_FILE.TENPU_FILE_MEI is '添付ファイル名';
comment on column T_TENPU_FILE.TENPU_FILE_PATH is '添付ファイルパス';
comment on column T_TENPU_FILE.INSERT_DT is '登録日時';
comment on column T_TENPU_FILE.INSERT_BY is '登録者';
comment on column T_TENPU_FILE.UPDATE_DT is '更新日時';
comment on column T_TENPU_FILE.UPDATE_BY is '更新者';
comment on column T_TENPU_FILE.DELETE_F is '削除フラグ';

