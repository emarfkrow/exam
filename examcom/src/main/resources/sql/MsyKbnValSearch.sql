SELECT
      a.`KBN_NM`
    , a.`KBN_VAL`
    , a.`KBN_VAL_MEI`
    , a.`HYOJI_ON`
    , a.`CRITERIA`
    , a.`INSERT_TS` AS INSERT_TS
    , a.`INSERT_ID`
    , a.`UPDATE_TS` AS UPDATE_TS
    , a.`UPDATE_ID`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
FROM
    msy_kbn_val a 
WHERE
    1 = 1 
    AND :kbn_nm LIKE CONCAT ('%', TRIM(TRAILING ' ' FROM a.`KBN_NM`)) 
    AND TRIM(TRAILING ' ' FROM a.`KBN_VAL`) LIKE CONCAT ('%', :kbn_val, '%') 
    AND TRIM(TRAILING ' ' FROM a.`KBN_VAL_MEI`) LIKE CONCAT ('%', :kbn_val_mei, '%') 
    AND a.`HYOJI_ON` = :hyoji_on 
    AND TRIM(TRAILING ' ' FROM a.`CRITERIA`) LIKE CONCAT ('%', :criteria, '%') 
    AND a.`INSERT_TS` = :insert_ts 
    AND a.`INSERT_TS` >= :insert_ts_1 
    AND a.`INSERT_TS` <= :insert_ts_2 
    AND a.`INSERT_ID` = :insert_id 
    AND a.`UPDATE_TS` = :update_ts 
    AND a.`UPDATE_TS` >= :update_ts_1 
    AND a.`UPDATE_TS` <= :update_ts_2 
    AND a.`UPDATE_ID` = :update_id 
    AND CASE WHEN TRIM (a.`DELETE_F`) IS NULL THEN '0' ELSE TO_CHAR (a.`DELETE_F`) END IN (:delete_f) 
ORDER BY
    a.`KBN_NM`, a.`KBN_VAL`
