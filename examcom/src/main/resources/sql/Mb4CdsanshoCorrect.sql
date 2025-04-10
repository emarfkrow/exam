SELECT
      TRIM(TRAILING ' ' FROM a.`CDSANSHO_CD`) AS `CDSANSHO_CD`
    , a.`CDSANSHO_MEI`
    , a.`INSERT_TS` AS `INSERT_TS`
    , a.`INSERT_USER_ID`
    , (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`
    , a.`UPDATE_TS` AS `UPDATE_TS`
    , a.`UPDATE_USER_ID`
    , (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`
FROM
    MB4_CDSANSHO a 
WHERE
    1 = 1 
    AND UPPER (TRIM(TRAILING ' ' FROM a.`CDSANSHO_CD`)) LIKE UPPER (CONCAT ('%', :cdsansho_cd, '%')) 
    AND UPPER (TRIM(TRAILING ' ' FROM a.`CDSANSHO_MEI`)) LIKE UPPER (CONCAT ('%', :cdsansho_mei, '%')) 
    AND a.`INSERT_TS` = :insert_ts 
    AND a.`INSERT_TS` >= :insert_ts_1 
    AND a.`INSERT_TS` <= :insert_ts_2 
    AND a.`INSERT_USER_ID` = :insert_user_id 
    AND a.`UPDATE_TS` = :update_ts 
    AND a.`UPDATE_TS` >= :update_ts_1 
    AND a.`UPDATE_TS` <= :update_ts_2 
    AND a.`UPDATE_USER_ID` = :update_user_id 
ORDER BY
    a.`CDSANSHO_CD`
