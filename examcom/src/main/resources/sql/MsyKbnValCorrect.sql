SELECT
      a.`KBN_NM`
    , (SELECT r1.`KBN_MEI` FROM MSY_KBN r1 WHERE r1.`KBN_NM` = a.`KBN_NM`) AS `KBN_MEI`
    , a.`KBN_VAL`
    , a.`KBN_VAL_MEI`
    , a.`HYOJI_ON`
    , a.`CRITERIA`
    , a.`INSERT_TS` AS INSERT_TS
    , a.`INSERT_USER_ID`
    , (SELECT r2.`USER_SEI` FROM MHR_USER r2 WHERE r2.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`
    , a.`UPDATE_TS` AS UPDATE_TS
    , a.`UPDATE_USER_ID`
    , (SELECT r3.`USER_SEI` FROM MHR_USER r3 WHERE r3.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
    , a.`STATUS_KB`
FROM
    MSY_KBN_VAL a 
WHERE
    1= 1 
    AND IFNULL (a.DELETE_F, 0) != 1 
    AND :kbn_nm LIKE CONCAT ('%', TRIM(TRAILING ' ' FROM a.`KBN_NM`)) 
    AND TRIM(TRAILING ' ' FROM a.`KBN_VAL`) LIKE CONCAT ('%', :kbn_val, '%') 
    AND TRIM(TRAILING ' ' FROM a.`KBN_VAL_MEI`) LIKE CONCAT ('%', :kbn_val_mei, '%') 
    AND a.`HYOJI_ON` = :hyoji_on 
    AND TRIM(TRAILING ' ' FROM a.`CRITERIA`) LIKE CONCAT ('%', :criteria, '%') 
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
    a.`KBN_NM`, a.`KBN_VAL`
