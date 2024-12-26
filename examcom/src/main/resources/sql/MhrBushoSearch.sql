SELECT
      a.`BUSHO_ID`
    , a.`BUSHO_MEI`
    , a.`OYA_BUSHO_ID`
    , (SELECT r1.`BUSHO_MEI` FROM MHR_BUSHO r1 WHERE r1.`BUSHO_ID` = a.`OYA_BUSHO_ID`) AS `OYA_BUSHO_MEI`
    , a.`KAISHI_BI` AS KAISHI_BI
    , a.`SHURYO_BI` AS SHURYO_BI
    , a.`INSERT_TS` AS INSERT_TS
    , a.`INSERT_ID`
    , a.`UPDATE_TS` AS UPDATE_TS
    , a.`UPDATE_ID`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
    , a.`STATUS_KB`
FROM
    MHR_BUSHO a 
WHERE
    1 = 1 
    AND a.`BUSHO_ID` = :busho_id 
    AND TRIM(TRAILING ' ' FROM a.`BUSHO_MEI`) LIKE CONCAT ('%', :busho_mei, '%') 
    AND a.`OYA_BUSHO_ID` = :oya_busho_id 
    AND a.`KAISHI_BI` = :kaishi_bi 
    AND a.`KAISHI_BI` >= :kaishi_bi_1 
    AND a.`KAISHI_BI` <= :kaishi_bi_2 
    AND a.`SHURYO_BI` = :shuryo_bi 
    AND a.`SHURYO_BI` >= :shuryo_bi_1 
    AND a.`SHURYO_BI` <= :shuryo_bi_2 
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
    a.`BUSHO_ID`
