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
    , a.`NULL_ENTITY_NM`
    , a.`NULL_ENTITY_MEI`
    , TRIM(TRAILING ' ' FROM a.`NULL_CHECK_F`) AS NULL_CHECK_F
    , a.`NULL_RADIO_KB`
    , a.`NULL_PULLDOWN_KB`
    , a.`NULL_MEMO_TX`
    , TRIM(TRAILING ' ' FROM a.`NULL_NEN_Y`) AS NULL_NEN_Y
    , TRIM(TRAILING ' ' FROM a.`NULL_TSUKI_M`) AS NULL_TSUKI_M
    , TRIM(TRAILING ' ' FROM a.`NULL_HI_D`) AS NULL_HI_D
    , TRIM(TRAILING ' ' FROM a.`NULL_NENGETSU_YM`) AS NULL_NENGETSU_YM
    , TRIM(TRAILING ' ' FROM a.`NULL_NENGAPPI_YMD`) AS NULL_NENGAPPI_YMD
    , a.`NULL_TIMESTAMP_TS` AS NULL_TIMESTAMP_TS
    , a.`NULL_NICHIJI_DT` AS NULL_NICHIJI_DT
    , a.`NULL_HIDUKE_BI` AS NULL_HIDUKE_BI
    , a.`NULL_JIKOKU_HM`
    , a.`NULL_JIKAN_TM`
    , a.`NULL_SURYO_QT`
    , a.`NULL_TANKA_KG`
    , a.`NULL_ZEINUKI_KG`
    , a.`INSERT_TS` AS INSERT_TS
    , a.`INSERT_ID`
    , a.`UPDATE_TS` AS UPDATE_TS
    , a.`UPDATE_ID`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
    , a.`STATUS_KB`
FROM
    TB2_ENTITY a 
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
    AND TRIM(TRAILING ' ' FROM a.`NULL_ENTITY_NM`) LIKE CONCAT ('%', :null_entity_nm, '%') 
    AND TRIM(TRAILING ' ' FROM a.`NULL_ENTITY_MEI`) LIKE CONCAT ('%', :null_entity_mei, '%') 
    AND CASE WHEN TRIM (a.`NULL_CHECK_F`) IS NULL THEN '0' ELSE TO_CHAR (a.`NULL_CHECK_F`) END IN (:null_check_f) 
    AND TRIM (a.`NULL_RADIO_KB`) IN (:null_radio_kb) 
    AND TRIM (a.`NULL_PULLDOWN_KB`) IN (:null_pulldown_kb) 
    AND TRIM(TRAILING ' ' FROM a.`NULL_MEMO_TX`) LIKE CONCAT ('%', :null_memo_tx, '%') 
    AND TRIM(TRAILING ' ' FROM a.`NULL_NEN_Y`) LIKE CONCAT ('%', :null_nen_y, '%') 
    AND a.`NULL_NEN_Y` >= :null_nen_y_1 
    AND a.`NULL_NEN_Y` <= :null_nen_y_2 
    AND TRIM(TRAILING ' ' FROM a.`NULL_TSUKI_M`) LIKE CONCAT ('%', :null_tsuki_m, '%') 
    AND a.`NULL_TSUKI_M` >= :null_tsuki_m_1 
    AND a.`NULL_TSUKI_M` <= :null_tsuki_m_2 
    AND TRIM(TRAILING ' ' FROM a.`NULL_HI_D`) LIKE CONCAT ('%', :null_hi_d, '%') 
    AND a.`NULL_HI_D` >= :null_hi_d_1 
    AND a.`NULL_HI_D` <= :null_hi_d_2 
    AND TRIM(TRAILING ' ' FROM a.`NULL_NENGETSU_YM`) LIKE CONCAT ('%', :null_nengetsu_ym, '%') 
    AND a.`NULL_NENGETSU_YM` >= :null_nengetsu_ym_1 
    AND a.`NULL_NENGETSU_YM` <= :null_nengetsu_ym_2 
    AND TRIM(TRAILING ' ' FROM a.`NULL_NENGAPPI_YMD`) LIKE CONCAT ('%', :null_nengappi_ymd, '%') 
    AND a.`NULL_NENGAPPI_YMD` >= :null_nengappi_ymd_1 
    AND a.`NULL_NENGAPPI_YMD` <= :null_nengappi_ymd_2 
    AND a.`NULL_TIMESTAMP_TS` = :null_timestamp_ts 
    AND a.`NULL_TIMESTAMP_TS` >= :null_timestamp_ts_1 
    AND a.`NULL_TIMESTAMP_TS` <= :null_timestamp_ts_2 
    AND a.`NULL_NICHIJI_DT` = :null_nichiji_dt 
    AND a.`NULL_NICHIJI_DT` >= :null_nichiji_dt_1 
    AND a.`NULL_NICHIJI_DT` <= :null_nichiji_dt_2 
    AND a.`NULL_HIDUKE_BI` = :null_hiduke_bi 
    AND a.`NULL_HIDUKE_BI` >= :null_hiduke_bi_1 
    AND a.`NULL_HIDUKE_BI` <= :null_hiduke_bi_2 
    AND a.`NULL_JIKOKU_HM` = :null_jikoku_hm 
    AND a.`NULL_JIKOKU_HM` >= :null_jikoku_hm_1 
    AND a.`NULL_JIKOKU_HM` <= :null_jikoku_hm_2 
    AND TRIM(TRAILING ' ' FROM a.`NULL_JIKAN_TM`) LIKE CONCAT ('%', :null_jikan_tm, '%') 
    AND a.`NULL_JIKAN_TM` >= :null_jikan_tm_1 
    AND a.`NULL_JIKAN_TM` <= :null_jikan_tm_2 
    AND a.`NULL_SURYO_QT` = :null_suryo_qt 
    AND a.`NULL_SURYO_QT` >= :null_suryo_qt_1 
    AND a.`NULL_SURYO_QT` <= :null_suryo_qt_2 
    AND a.`NULL_TANKA_KG` = :null_tanka_kg 
    AND a.`NULL_TANKA_KG` >= :null_tanka_kg_1 
    AND a.`NULL_TANKA_KG` <= :null_tanka_kg_2 
    AND a.`NULL_ZEINUKI_KG` = :null_zeinuki_kg 
    AND a.`NULL_ZEINUKI_KG` >= :null_zeinuki_kg_1 
    AND a.`NULL_ZEINUKI_KG` <= :null_zeinuki_kg_2 
    AND a.`INSERT_TS` = :insert_ts 
    AND a.`INSERT_TS` >= :insert_ts_1 
    AND a.`INSERT_TS` <= :insert_ts_2 
    AND a.`INSERT_ID` = :insert_id 
    AND a.`UPDATE_TS` = :update_ts 
    AND a.`UPDATE_TS` >= :update_ts_1 
    AND a.`UPDATE_TS` <= :update_ts_2 
    AND a.`UPDATE_ID` = :update_id 
    AND CASE WHEN TRIM (a.`DELETE_F`) IS NULL THEN '0' ELSE TO_CHAR (a.`DELETE_F`) END IN (:delete_f) 
    AND TRIM (a.`STATUS_KB`) IN (:status_kb) 
ORDER BY
    a.`ENTITY_ID`
