SELECT
      a.`ENTITY_ID`
    , a.`ENTITY_NM`
    , a.`ENTITY_MEI`
    , TRIM(TRAILING ' ' FROM a.`CHECK_F`) AS CHECK_F
    , a.`RADIO_KB`
    , a.`PULLDOWN_KB`
    , a.`MEMO_TX`
    , TRIM(TRAILING ' ' FROM a.`NEN_Y`) AS NEN_Y
    , TRIM(TRAILING ' ' FROM a.`TSUKI_M`) AS TSUKI_M
    , TRIM(TRAILING ' ' FROM a.`HI_D`) AS HI_D
    , TRIM(TRAILING ' ' FROM a.`NENGETSU_YM`) AS NENGETSU_YM
    , TRIM(TRAILING ' ' FROM a.`NENGAPPI_YMD`) AS NENGAPPI_YMD
    , a.`TIMESTAMP_TS` AS TIMESTAMP_TS
    , a.`NICHIJI_DT` AS NICHIJI_DT
    , a.`HIDUKE_BI` AS HIDUKE_BI
    , a.`JIKOKU_HM`
    , a.`JIKAN_TM`
    , a.`SURYO_QT`
    , a.`TANKA_KG`
    , a.`ZEINUKI_KG`
FROM
    VB2_ENTITY a 
WHERE
    1 = 1 
    AND a.`ENTITY_ID` = :entity_id 
    AND TRIM(TRAILING ' ' FROM a.`ENTITY_NM`) LIKE CONCAT ('%', :entity_nm, '%') 
    AND TRIM(TRAILING ' ' FROM a.`ENTITY_MEI`) LIKE CONCAT ('%', :entity_mei, '%') 
    AND CASE WHEN TRIM (a.`CHECK_F`) IS NULL THEN '0' ELSE TO_CHAR (a.`CHECK_F`) END IN (:check_f) 
    AND TRIM (a.`RADIO_KB`) IN (:radio_kb) 
    AND TRIM (a.`PULLDOWN_KB`) IN (:pulldown_kb) 
    AND TRIM(TRAILING ' ' FROM a.`MEMO_TX`) LIKE CONCAT ('%', :memo_tx, '%') 
    AND TRIM(TRAILING ' ' FROM a.`NEN_Y`) LIKE CONCAT ('%', :nen_y, '%') 
    AND a.`NEN_Y` >= :nen_y_1 
    AND a.`NEN_Y` <= :nen_y_2 
    AND TRIM(TRAILING ' ' FROM a.`TSUKI_M`) LIKE CONCAT ('%', :tsuki_m, '%') 
    AND a.`TSUKI_M` >= :tsuki_m_1 
    AND a.`TSUKI_M` <= :tsuki_m_2 
    AND TRIM(TRAILING ' ' FROM a.`HI_D`) LIKE CONCAT ('%', :hi_d, '%') 
    AND a.`HI_D` >= :hi_d_1 
    AND a.`HI_D` <= :hi_d_2 
    AND TRIM(TRAILING ' ' FROM a.`NENGETSU_YM`) LIKE CONCAT ('%', :nengetsu_ym, '%') 
    AND a.`NENGETSU_YM` >= :nengetsu_ym_1 
    AND a.`NENGETSU_YM` <= :nengetsu_ym_2 
    AND TRIM(TRAILING ' ' FROM a.`NENGAPPI_YMD`) LIKE CONCAT ('%', :nengappi_ymd, '%') 
    AND a.`NENGAPPI_YMD` >= :nengappi_ymd_1 
    AND a.`NENGAPPI_YMD` <= :nengappi_ymd_2 
    AND a.`TIMESTAMP_TS` = :timestamp_ts 
    AND a.`TIMESTAMP_TS` >= :timestamp_ts_1 
    AND a.`TIMESTAMP_TS` <= :timestamp_ts_2 
    AND a.`NICHIJI_DT` = :nichiji_dt 
    AND a.`NICHIJI_DT` >= :nichiji_dt_1 
    AND a.`NICHIJI_DT` <= :nichiji_dt_2 
    AND a.`HIDUKE_BI` = :hiduke_bi 
    AND a.`HIDUKE_BI` >= :hiduke_bi_1 
    AND a.`HIDUKE_BI` <= :hiduke_bi_2 
    AND a.`JIKOKU_HM` = :jikoku_hm 
    AND a.`JIKOKU_HM` >= :jikoku_hm_1 
    AND a.`JIKOKU_HM` <= :jikoku_hm_2 
    AND TRIM(TRAILING ' ' FROM a.`JIKAN_TM`) LIKE CONCAT ('%', :jikan_tm, '%') 
    AND a.`JIKAN_TM` >= :jikan_tm_1 
    AND a.`JIKAN_TM` <= :jikan_tm_2 
    AND a.`SURYO_QT` = :suryo_qt 
    AND a.`SURYO_QT` >= :suryo_qt_1 
    AND a.`SURYO_QT` <= :suryo_qt_2 
    AND a.`TANKA_KG` = :tanka_kg 
    AND a.`TANKA_KG` >= :tanka_kg_1 
    AND a.`TANKA_KG` <= :tanka_kg_2 
    AND a.`ZEINUKI_KG` = :zeinuki_kg 
    AND a.`ZEINUKI_KG` >= :zeinuki_kg_1 
    AND a.`ZEINUKI_KG` <= :zeinuki_kg_2 
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
