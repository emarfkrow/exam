SELECT
      a."ENTITY_ID"
    , a."ENTITY_NM"
    , a."ENTITY_MEI"
    , RTRIM (RTRIM (a."CHECK_F"), '　') AS CHECK_F
    , a."RADIO_KB"
    , a."PULLDOWN_KB"
    , a."MEMO_TX"
    , RTRIM (RTRIM (a."NEN_Y"), '　') AS NEN_Y
    , RTRIM (RTRIM (a."TSUKI_M"), '　') AS TSUKI_M
    , RTRIM (RTRIM (a."HI_D"), '　') AS HI_D
    , RTRIM (RTRIM (a."NENGETSU_YM"), '　') AS NENGETSU_YM
    , RTRIM (RTRIM (a."NENGAPPI_YMD"), '　') AS NENGAPPI_YMD
    , TO_CHAR (a."TIMESTAMP_TS", 'YYYY-MM-DD HH24:MI:SS.FF3') AS TIMESTAMP_TS
    , TO_CHAR (a."NICHIJI_DT", 'YYYY-MM-DD HH24:MI:SS') AS NICHIJI_DT
    , TO_CHAR (a."HIDUKE_BI", 'YYYY-MM-DD') AS HIDUKE_BI
    , a."JIKOKU_HM"
    , a."JIKAN_TM"
    , a."SURYO_QT"
    , a."TANKA_KG"
    , a."ZEINUKI_KG"
    , a."NULL_ENTITY_NM"
    , a."NULL_ENTITY_MEI"
    , RTRIM (RTRIM (a."NULL_CHECK_F"), '　') AS NULL_CHECK_F
    , a."NULL_RADIO_KB"
    , a."NULL_PULLDOWN_KB"
    , a."NULL_MEMO_TX"
    , RTRIM (RTRIM (a."NULL_NEN_Y"), '　') AS NULL_NEN_Y
    , RTRIM (RTRIM (a."NULL_TSUKI_M"), '　') AS NULL_TSUKI_M
    , RTRIM (RTRIM (a."NULL_HI_D"), '　') AS NULL_HI_D
    , RTRIM (RTRIM (a."NULL_NENGETSU_YM"), '　') AS NULL_NENGETSU_YM
    , RTRIM (RTRIM (a."NULL_NENGAPPI_YMD"), '　') AS NULL_NENGAPPI_YMD
    , TO_CHAR (a."NULL_TIMESTAMP_TS", 'YYYY-MM-DD HH24:MI:SS.FF3') AS NULL_TIMESTAMP_TS
    , TO_CHAR (a."NULL_NICHIJI_DT", 'YYYY-MM-DD HH24:MI:SS') AS NULL_NICHIJI_DT
    , TO_CHAR (a."NULL_HIDUKE_BI", 'YYYY-MM-DD') AS NULL_HIDUKE_BI
    , a."NULL_JIKOKU_HM"
    , a."NULL_JIKAN_TM"
    , a."NULL_SURYO_QT"
    , a."NULL_TANKA_KG"
    , a."NULL_ZEINUKI_KG"
    , TO_CHAR (a."INSERT_TS", 'YYYY-MM-DD HH24:MI:SS.FF3') AS INSERT_TS
    , a."INSERT_ID"
    , TO_CHAR (a."UPDATE_TS", 'YYYY-MM-DD HH24:MI:SS.FF3') AS UPDATE_TS
    , a."UPDATE_ID"
    , RTRIM (RTRIM (a."DELETE_F"), '　') AS DELETE_F
    , a."STATUS_KB"
FROM
    TB2_ENTITY a 
WHERE
    1 = 1 
    AND a."ENTITY_ID" = :entity_id 
    AND RTRIM (RTRIM (a."ENTITY_NM"), '　') LIKE '%' || :entity_nm || '%' 
    AND RTRIM (RTRIM (a."ENTITY_MEI"), '　') LIKE '%' || :entity_mei || '%' 
    AND CASE WHEN TRIM (a."CHECK_F") IS NULL THEN '0' ELSE TO_CHAR (a."CHECK_F") END IN (:check_f) 
    AND TRIM (a."RADIO_KB") IN (:radio_kb) 
    AND TRIM (a."PULLDOWN_KB") IN (:pulldown_kb) 
    AND RTRIM (RTRIM (a."MEMO_TX"), '　') LIKE '%' || :memo_tx || '%' 
    AND RTRIM (RTRIM (a."NEN_Y"), '　') LIKE '%' || :nen_y || '%' 
    AND a."NEN_Y" >= :nen_y_1 
    AND a."NEN_Y" <= :nen_y_2 
    AND RTRIM (RTRIM (a."TSUKI_M"), '　') LIKE '%' || :tsuki_m || '%' 
    AND a."TSUKI_M" >= :tsuki_m_1 
    AND a."TSUKI_M" <= :tsuki_m_2 
    AND RTRIM (RTRIM (a."HI_D"), '　') LIKE '%' || :hi_d || '%' 
    AND a."HI_D" >= :hi_d_1 
    AND a."HI_D" <= :hi_d_2 
    AND RTRIM (RTRIM (a."NENGETSU_YM"), '　') LIKE '%' || :nengetsu_ym || '%' 
    AND a."NENGETSU_YM" >= :nengetsu_ym_1 
    AND a."NENGETSU_YM" <= :nengetsu_ym_2 
    AND RTRIM (RTRIM (a."NENGAPPI_YMD"), '　') LIKE '%' || :nengappi_ymd || '%' 
    AND a."NENGAPPI_YMD" >= :nengappi_ymd_1 
    AND a."NENGAPPI_YMD" <= :nengappi_ymd_2 
    AND a."TIMESTAMP_TS" = TO_TIMESTAMP (REPLACE (SUBSTR (:timestamp_ts, 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3') 
    AND a."TIMESTAMP_TS" >= TO_TIMESTAMP (REPLACE (SUBSTR (:timestamp_ts_1 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."TIMESTAMP_TS" <= TO_TIMESTAMP (REPLACE (SUBSTR (:timestamp_ts_2 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."NICHIJI_DT" = TO_TIMESTAMP (REPLACE (SUBSTR (:nichiji_dt, 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3') 
    AND a."NICHIJI_DT" >= TO_TIMESTAMP (REPLACE (SUBSTR (:nichiji_dt_1 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."NICHIJI_DT" <= TO_TIMESTAMP (REPLACE (SUBSTR (:nichiji_dt_2 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."HIDUKE_BI" = TO_DATE (SUBSTR (:hiduke_bi, 0, 10), 'YYYY-MM-DD') 
    AND a."HIDUKE_BI" >= TO_DATE (SUBSTR (:hiduke_bi_1 , 0, 10), 'YYYY-MM-DD')
    AND a."HIDUKE_BI" <= TO_DATE (SUBSTR (:hiduke_bi_2 , 0, 10), 'YYYY-MM-DD')
    AND a."JIKOKU_HM" = :jikoku_hm 
    AND a."JIKOKU_HM" >= :jikoku_hm_1 
    AND a."JIKOKU_HM" <= :jikoku_hm_2 
    AND RTRIM (RTRIM (a."JIKAN_TM"), '　') LIKE '%' || :jikan_tm || '%' 
    AND a."JIKAN_TM" >= :jikan_tm_1 
    AND a."JIKAN_TM" <= :jikan_tm_2 
    AND a."SURYO_QT" = :suryo_qt 
    AND a."SURYO_QT" >= :suryo_qt_1 
    AND a."SURYO_QT" <= :suryo_qt_2 
    AND a."TANKA_KG" = :tanka_kg 
    AND a."TANKA_KG" >= :tanka_kg_1 
    AND a."TANKA_KG" <= :tanka_kg_2 
    AND a."ZEINUKI_KG" = :zeinuki_kg 
    AND a."ZEINUKI_KG" >= :zeinuki_kg_1 
    AND a."ZEINUKI_KG" <= :zeinuki_kg_2 
    AND RTRIM (RTRIM (a."NULL_ENTITY_NM"), '　') LIKE '%' || :null_entity_nm || '%' 
    AND RTRIM (RTRIM (a."NULL_ENTITY_MEI"), '　') LIKE '%' || :null_entity_mei || '%' 
    AND CASE WHEN TRIM (a."NULL_CHECK_F") IS NULL THEN '0' ELSE TO_CHAR (a."NULL_CHECK_F") END IN (:null_check_f) 
    AND TRIM (a."NULL_RADIO_KB") IN (:null_radio_kb) 
    AND TRIM (a."NULL_PULLDOWN_KB") IN (:null_pulldown_kb) 
    AND RTRIM (RTRIM (a."NULL_MEMO_TX"), '　') LIKE '%' || :null_memo_tx || '%' 
    AND RTRIM (RTRIM (a."NULL_NEN_Y"), '　') LIKE '%' || :null_nen_y || '%' 
    AND a."NULL_NEN_Y" >= :null_nen_y_1 
    AND a."NULL_NEN_Y" <= :null_nen_y_2 
    AND RTRIM (RTRIM (a."NULL_TSUKI_M"), '　') LIKE '%' || :null_tsuki_m || '%' 
    AND a."NULL_TSUKI_M" >= :null_tsuki_m_1 
    AND a."NULL_TSUKI_M" <= :null_tsuki_m_2 
    AND RTRIM (RTRIM (a."NULL_HI_D"), '　') LIKE '%' || :null_hi_d || '%' 
    AND a."NULL_HI_D" >= :null_hi_d_1 
    AND a."NULL_HI_D" <= :null_hi_d_2 
    AND RTRIM (RTRIM (a."NULL_NENGETSU_YM"), '　') LIKE '%' || :null_nengetsu_ym || '%' 
    AND a."NULL_NENGETSU_YM" >= :null_nengetsu_ym_1 
    AND a."NULL_NENGETSU_YM" <= :null_nengetsu_ym_2 
    AND RTRIM (RTRIM (a."NULL_NENGAPPI_YMD"), '　') LIKE '%' || :null_nengappi_ymd || '%' 
    AND a."NULL_NENGAPPI_YMD" >= :null_nengappi_ymd_1 
    AND a."NULL_NENGAPPI_YMD" <= :null_nengappi_ymd_2 
    AND a."NULL_TIMESTAMP_TS" = TO_TIMESTAMP (REPLACE (SUBSTR (:null_timestamp_ts, 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3') 
    AND a."NULL_TIMESTAMP_TS" >= TO_TIMESTAMP (REPLACE (SUBSTR (:null_timestamp_ts_1 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."NULL_TIMESTAMP_TS" <= TO_TIMESTAMP (REPLACE (SUBSTR (:null_timestamp_ts_2 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."NULL_NICHIJI_DT" = TO_TIMESTAMP (REPLACE (SUBSTR (:null_nichiji_dt, 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3') 
    AND a."NULL_NICHIJI_DT" >= TO_TIMESTAMP (REPLACE (SUBSTR (:null_nichiji_dt_1 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."NULL_NICHIJI_DT" <= TO_TIMESTAMP (REPLACE (SUBSTR (:null_nichiji_dt_2 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."NULL_HIDUKE_BI" = TO_DATE (SUBSTR (:null_hiduke_bi, 0, 10), 'YYYY-MM-DD') 
    AND a."NULL_HIDUKE_BI" >= TO_DATE (SUBSTR (:null_hiduke_bi_1 , 0, 10), 'YYYY-MM-DD')
    AND a."NULL_HIDUKE_BI" <= TO_DATE (SUBSTR (:null_hiduke_bi_2 , 0, 10), 'YYYY-MM-DD')
    AND a."NULL_JIKOKU_HM" = :null_jikoku_hm 
    AND a."NULL_JIKOKU_HM" >= :null_jikoku_hm_1 
    AND a."NULL_JIKOKU_HM" <= :null_jikoku_hm_2 
    AND RTRIM (RTRIM (a."NULL_JIKAN_TM"), '　') LIKE '%' || :null_jikan_tm || '%' 
    AND a."NULL_JIKAN_TM" >= :null_jikan_tm_1 
    AND a."NULL_JIKAN_TM" <= :null_jikan_tm_2 
    AND a."NULL_SURYO_QT" = :null_suryo_qt 
    AND a."NULL_SURYO_QT" >= :null_suryo_qt_1 
    AND a."NULL_SURYO_QT" <= :null_suryo_qt_2 
    AND a."NULL_TANKA_KG" = :null_tanka_kg 
    AND a."NULL_TANKA_KG" >= :null_tanka_kg_1 
    AND a."NULL_TANKA_KG" <= :null_tanka_kg_2 
    AND a."NULL_ZEINUKI_KG" = :null_zeinuki_kg 
    AND a."NULL_ZEINUKI_KG" >= :null_zeinuki_kg_1 
    AND a."NULL_ZEINUKI_KG" <= :null_zeinuki_kg_2 
    AND a."INSERT_TS" = TO_TIMESTAMP (REPLACE (SUBSTR (:insert_ts, 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3') 
    AND a."INSERT_TS" >= TO_TIMESTAMP (REPLACE (SUBSTR (:insert_ts_1 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."INSERT_TS" <= TO_TIMESTAMP (REPLACE (SUBSTR (:insert_ts_2 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."INSERT_ID" = :insert_id 
    AND a."UPDATE_TS" = TO_TIMESTAMP (REPLACE (SUBSTR (:update_ts, 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3') 
    AND a."UPDATE_TS" >= TO_TIMESTAMP (REPLACE (SUBSTR (:update_ts_1 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."UPDATE_TS" <= TO_TIMESTAMP (REPLACE (SUBSTR (:update_ts_2 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."UPDATE_ID" = :update_id 
    AND CASE WHEN TRIM (a."DELETE_F") IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_F") END IN (:delete_f) 
    AND TRIM (a."STATUS_KB") IN (:status_kb) 
ORDER BY
    a."ENTITY_ID"
