SELECT
      a.`SANSHO1_ID`
    , (SELECT r0.`SANSHO1_MEI` FROM MB7_SANSHO1 r0 WHERE r0.`SANSHO1_ID` = a.`SANSHO1_ID`) AS `SANSHO1_MEI`
    , a.`SANSHO2_ID`
    , (SELECT r1.`SANSHO2_MEI` FROM MB7_SANSHO2 r1 WHERE r1.`SANSHO2_ID` = a.`SANSHO2_ID`) AS `SANSHO2_MEI`
    , a.`TEKIYO_BI` AS TEKIYO_BI
    , a.`FUKUGO_INFO`
    , a.`INSERT_TS` AS INSERT_TS
    , a.`INSERT_USER_ID`
    , (SELECT r2.`USER_SEI` FROM MHR_USER r2 WHERE r2.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`
    , a.`UPDATE_TS` AS UPDATE_TS
    , a.`UPDATE_USER_ID`
    , (SELECT r3.`USER_SEI` FROM MHR_USER r3 WHERE r3.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
    , a.`STATUS_KB`
FROM
    TB7_FUKUGO a 
WHERE
    1 = 1 
    AND a.`SANSHO1_ID` = :sansho_1_id 
    AND a.`SANSHO2_ID` = :sansho_2_id 
    AND a.`TEKIYO_BI` = :tekiyo_bi 
    AND a.`TEKIYO_BI` >= :tekiyo_bi_1 
    AND a.`TEKIYO_BI` <= :tekiyo_bi_2 
    AND TRIM(TRAILING ' ' FROM a.`FUKUGO_INFO`) LIKE CONCAT ('%', :fukugo_info, '%') 
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
    a.`SANSHO1_ID`, a.`SANSHO2_ID`, a.`TEKIYO_BI`
