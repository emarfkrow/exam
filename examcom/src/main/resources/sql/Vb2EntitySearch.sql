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
FROM
    VB2_ENTITY a 
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
ORDER BY
    1
    , 2
    , 3
    , 4
    , 5
    , 6
    , 7
    , 8
    , 9
    , 10
    , 11
    , 12
    , 13
    , 14
    , 15
    , 16
    , 17
    , 18
    , 19
    , 20
