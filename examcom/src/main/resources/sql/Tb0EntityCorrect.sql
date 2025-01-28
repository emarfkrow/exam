SELECT
      a.`ENTITY_ID`
    , a.`ENTITY_NM`
    , a.`ENTITY_MEI`
    , TRIM(TRAILING ' ' FROM a.`CHECK_F`) AS CHECK_F
    , a.`RADIO_KB`
    , a.`PULLDOWN_KB`
    , a.`PULLDOWN_SB`
    , a.`MEMO_TX`
    , a.`MEMO`
    , a.`FILE_PATH`
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
    , a.`TANKA_PR`
    , a.`TSUKA_KB`
    , a.`ZEINUKI_AM`
    , a.`INSERT_TS` AS INSERT_TS
    , a.`INSERT_USER_ID`
    , (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`
    , a.`UPDATE_TS` AS UPDATE_TS
    , a.`UPDATE_USER_ID`
    , (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
    , a.`STATUS_KB`
FROM
    TB0_ENTITY a 
WHERE
    1 = 1 
    AND IFNULL (a.DELETE_F, 0) != 1 
    AND a.`ENTITY_ID` = :entity_id 
    AND TRIM(TRAILING ' ' FROM a.`ENTITY_NM`) LIKE CONCAT ('%', :entity_nm, '%') 
    AND TRIM(TRAILING ' ' FROM a.`ENTITY_MEI`) LIKE CONCAT ('%', :entity_mei, '%') 
    AND CASE WHEN TRIM (a.`CHECK_F`) IS NULL THEN '0' ELSE TO_CHAR (a.`CHECK_F`) END IN (:check_f) 
    AND TRIM (a.`RADIO_KB`) IN (:radio_kb) 
    AND TRIM (a.`PULLDOWN_KB`) IN (:pulldown_kb) 
    AND TRIM(TRAILING ' ' FROM a.`PULLDOWN_SB`) LIKE CONCAT ('%', :pulldown_sb, '%') 
    AND TRIM(TRAILING ' ' FROM a.`MEMO_TX`) LIKE CONCAT ('%', :memo_tx, '%') 
    AND TRIM(TRAILING ' ' FROM a.`MEMO`) LIKE CONCAT ('%', :memo, '%') 
    AND TRIM(TRAILING ' ' FROM a.`FILE_PATH`) LIKE CONCAT ('%', :file_path, '%') 
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
    AND a.`TANKA_PR` = :tanka_pr 
    AND TRIM (a.`TSUKA_KB`) IN (:tsuka_kb) 
    AND a.`ZEINUKI_AM` = :zeinuki_am 
    AND a.`INSERT_TS` = :insert_ts 
    AND a.`INSERT_TS` >= :insert_ts_1 
    AND a.`INSERT_TS` <= :insert_ts_2 
    AND a.`INSERT_USER_ID` = :insert_user_id 
    AND a.`UPDATE_TS` = :update_ts 
    AND a.`UPDATE_TS` >= :update_ts_1 
    AND a.`UPDATE_TS` <= :update_ts_2 
    AND a.`UPDATE_USER_ID` = :update_user_id 
    AND CASE WHEN TRIM (a.`DELETE_F`) IS NULL THEN '0' ELSE TO_CHAR (a.`DELETE_F`) END IN (:delete_f) 
    AND TRIM (a.`STATUS_KB`) IN (:status_kb) 
ORDER BY
    a.`ENTITY_ID`
