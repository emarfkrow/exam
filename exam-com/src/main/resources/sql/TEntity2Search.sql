SELECT
      a.`SOSEN_ID`
    , a.`OYA_SN`
    , a.`ENTITY_SN`
    , a.`NULL_ENTITY2_MEI`
    , a.`ENTITY2_MEI`
    , TRIM(TRAILING ' ' FROM a.`CHECK_F`) AS CHECK_F
    , a.`RADIO_KB`
    , a.`PULLDOWN_KB`
    , a.`MEMO_TX`
    , TRIM(TRAILING ' ' FROM a.`HIDUKE_YMD`) AS HIDUKE_YMD
    , TRIM(TRAILING ' ' FROM a.`NENGETSU_YM`) AS NENGETSU_YM
    , TRIM(TRAILING ' ' FROM a.`SAMPLE_Y`) AS SAMPLE_Y
    , TRIM(TRAILING ' ' FROM a.`SAMPLE_M`) AS SAMPLE_M
    , a.`NICHIJI_DT`
    , a.`JIKOKU_HM`
    , a.`JIKAN_TM`
    , a.`SURYO_QT`
    , a.`TANKA_AM`
    , a.`KINGAKU_AM`
    , TRIM(TRAILING ' ' FROM a.`FIG_8_BI`) AS FIG_8_BI
    , a.`INSERT_DT`
    , a.`INSERT_BY`
    , a.`UPDATE_DT`
    , a.`UPDATE_BY`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
FROM
    t_entity2 a 
WHERE
    1 = 1 
    AND a.`SOSEN_ID` = :sosen_id 
    AND a.`OYA_SN` = :oya_sn 
    AND a.`ENTITY_SN` = :entity_sn 
    AND TRIM (a.`NULL_ENTITY2_MEI`) LIKE CONCAT ('%', :null_entity_2_mei, '%') 
    AND TRIM (a.`ENTITY2_MEI`) LIKE CONCAT ('%', :entity_2_mei, '%') 
    AND CASE WHEN TRIM (a.`CHECK_F`) IS NULL THEN '0' ELSE TO_CHAR (a.`CHECK_F`) END IN (:check_f) 
    AND TRIM (a.`RADIO_KB`) IN (:radio_kb) 
    AND TRIM (a.`PULLDOWN_KB`) IN (:pulldown_kb) 
    AND TRIM (a.`MEMO_TX`) LIKE CONCAT ('%', :memo_tx, '%') 
    AND TRIM (a.`HIDUKE_YMD`) LIKE CONCAT ('%', :hiduke_ymd, '%') 
    AND a.`HIDUKE_YMD` >= :hiduke_ymd_1 
    AND a.`HIDUKE_YMD` <= :hiduke_ymd_2 
    AND TRIM (a.`NENGETSU_YM`) LIKE CONCAT ('%', :nengetsu_ym, '%') 
    AND a.`NENGETSU_YM` >= :nengetsu_ym_1 
    AND a.`NENGETSU_YM` <= :nengetsu_ym_2 
    AND TRIM (a.`SAMPLE_Y`) LIKE CONCAT ('%', :sample_y, '%') 
    AND a.`SAMPLE_Y` >= :sample_y_1 
    AND a.`SAMPLE_Y` <= :sample_y_2 
    AND TRIM (a.`SAMPLE_M`) LIKE CONCAT ('%', :sample_m, '%') 
    AND a.`SAMPLE_M` >= :sample_m_1 
    AND a.`SAMPLE_M` <= :sample_m_2 
    AND a.`NICHIJI_DT` = :nichiji_dt 
    AND a.`NICHIJI_DT` >= :nichiji_dt_1 
    AND a.`NICHIJI_DT` <= :nichiji_dt_2 
    AND TRIM (a.`JIKOKU_HM`) LIKE CONCAT ('%', :jikoku_hm, '%') 
    AND a.`JIKOKU_HM` >= :jikoku_hm_1 
    AND a.`JIKOKU_HM` <= :jikoku_hm_2 
    AND TRIM (a.`JIKAN_TM`) LIKE CONCAT ('%', :jikan_tm, '%') 
    AND a.`JIKAN_TM` >= :jikan_tm_1 
    AND a.`JIKAN_TM` <= :jikan_tm_2 
    AND a.`SURYO_QT` = :suryo_qt 
    AND a.`SURYO_QT` >= :suryo_qt_1 
    AND a.`SURYO_QT` <= :suryo_qt_2 
    AND a.`TANKA_AM` = :tanka_am 
    AND a.`TANKA_AM` >= :tanka_am_1 
    AND a.`TANKA_AM` <= :tanka_am_2 
    AND a.`KINGAKU_AM` = :kingaku_am 
    AND a.`KINGAKU_AM` >= :kingaku_am_1 
    AND a.`KINGAKU_AM` <= :kingaku_am_2 
    AND TRIM (a.`FIG_8_BI`) LIKE CONCAT ('%', :fig_8_bi, '%') 
    AND a.`FIG_8_BI` >= :fig_8_bi_1 
    AND a.`FIG_8_BI` <= :fig_8_bi_2 
    AND a.`INSERT_DT` = :insert_dt 
    AND a.`INSERT_DT` >= :insert_dt_1 
    AND a.`INSERT_DT` <= :insert_dt_2 
    AND TRIM (a.`INSERT_BY`) LIKE CONCAT ('%', :insert_by, '%') 
    AND a.`UPDATE_DT` = :update_dt 
    AND a.`UPDATE_DT` >= :update_dt_1 
    AND a.`UPDATE_DT` <= :update_dt_2 
    AND TRIM (a.`UPDATE_BY`) LIKE CONCAT ('%', :update_by, '%') 
    AND CASE WHEN TRIM (a.`DELETE_F`) IS NULL THEN '0' ELSE TO_CHAR (a.`DELETE_F`) END IN (:delete_f) 
ORDER BY
    a.`SOSEN_ID`, a.`OYA_SN`, a.`ENTITY_SN`
