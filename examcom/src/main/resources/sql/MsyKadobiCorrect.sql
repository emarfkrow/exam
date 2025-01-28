SELECT
      a.`KADO_BI` AS KADO_BI
    , a.`BUSHO_KB`
    , TRIM(TRAILING ' ' FROM a.`KADOBI_F`) AS KADOBI_F
    , a.`MEMO`
    , a.`INSERT_TS` AS INSERT_TS
    , a.`INSERT_USER_ID`
    , (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`
    , a.`UPDATE_TS` AS UPDATE_TS
    , a.`UPDATE_USER_ID`
    , (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
    , a.`STATUS_KB`
FROM
    MSY_KADOBI a 
WHERE
    1 = 1 
    AND IFNULL (a.DELETE_F, 0) != 1 
    AND a.`KADO_BI` = :kado_bi 
    AND a.`KADO_BI` >= :kado_bi_1 
    AND a.`KADO_BI` <= :kado_bi_2 
    AND TRIM (a.`BUSHO_KB`) IN (:busho_kb) 
    AND CASE WHEN TRIM (a.`KADOBI_F`) IS NULL THEN '0' ELSE TO_CHAR (a.`KADOBI_F`) END IN (:kadobi_f) 
    AND TRIM(TRAILING ' ' FROM a.`MEMO`) LIKE CONCAT ('%', :memo, '%') 
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
    a.`KADO_BI`, a.`BUSHO_KB`
