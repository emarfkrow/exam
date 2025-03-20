SELECT
      a.`KADO_BI` AS KADO_BI
    , a.`BUSHO_ID`
    , (SELECT r0.`BUSHO_MEI` FROM MHR_BUSHO r0 WHERE r0.`BUSHO_ID` = a.`BUSHO_ID`) AS `BUSHO_MEI`
    , TRIM(TRAILING ' ' FROM a.`KADOBI_F`) AS KADOBI_F
    , a.`MEMO`
    , a.`INSERT_TS` AS INSERT_TS
    , a.`INSERT_USER_ID`
    , (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`
    , a.`UPDATE_TS` AS UPDATE_TS
    , a.`UPDATE_USER_ID`
    , (SELECT r2.`USER_SEI` FROM MHR_USER r2 WHERE r2.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`
FROM
    MSY_KADOBI a 
WHERE
    1 = 1 
    AND a.`KADO_BI` = :kado_bi 
    AND a.`KADO_BI` >= :kado_bi_1 
    AND a.`KADO_BI` <= :kado_bi_2 
    AND a.`BUSHO_ID` = :busho_id 
    AND CASE WHEN TRIM(TRAILING ' ' FROM a.`KADOBI_F`) IS NULL THEN '0' ELSE TO_CHAR (a.`KADOBI_F`) END IN (:kadobi_f) 
    AND UPPER (TRIM(TRAILING ' ' FROM a.`MEMO`)) LIKE UPPER (CONCAT ('%', :memo, '%')) 
    AND a.`INSERT_TS` = :insert_ts 
    AND a.`INSERT_TS` >= :insert_ts_1 
    AND a.`INSERT_TS` <= :insert_ts_2 
    AND a.`INSERT_USER_ID` = :insert_user_id 
    AND a.`UPDATE_TS` = :update_ts 
    AND a.`UPDATE_TS` >= :update_ts_1 
    AND a.`UPDATE_TS` <= :update_ts_2 
    AND a.`UPDATE_USER_ID` = :update_user_id 
ORDER BY
    a.`KADO_BI`
    , a.`BUSHO_ID`
