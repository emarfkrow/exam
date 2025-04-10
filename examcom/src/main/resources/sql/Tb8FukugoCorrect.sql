SELECT
      a.`SANSHO_ID`
    , (SELECT r0.`SANSHO_MEI` FROM MB8_SANSHO r0 WHERE r0.`SANSHO_ID` = a.`SANSHO_ID`) AS `SANSHO_MEI`
    , a.`SEIYAKU_ID`
    , (SELECT r1.`SEIYAKU_MEI` FROM MB8_SEIYAKU r1 WHERE r1.`SEIYAKU_ID` = a.`SEIYAKU_ID`) AS `SEIYAKU_MEI`
    , a.`TEKIYO_BI` AS `TEKIYO_BI`
    , a.`FUKUGO_INFO`
    , a.`INSERT_TS` AS `INSERT_TS`
    , a.`INSERT_USER_ID`
    , (SELECT r2.`USER_SEI` FROM MHR_USER r2 WHERE r2.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`
    , a.`UPDATE_TS` AS `UPDATE_TS`
    , a.`UPDATE_USER_ID`
    , (SELECT r3.`USER_SEI` FROM MHR_USER r3 WHERE r3.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`
FROM
    TB8_FUKUGO a 
    INNER JOIN MB8_SANSHO c1 
        ON 1 = 1 
        AND c1.SANSHO_ID = a.SANSHO_ID 
    INNER JOIN MB8_SEIYAKU c2 
        ON 1 = 1 
        AND c2.SEIYAKU_ID = a.SEIYAKU_ID 
WHERE
    1 = 1 
    AND IFNULL (a.TEKIYO_BI, sysdate()) <= sysdate() 
    AND a.`SANSHO_ID` = :sansho_id 
    AND a.`SEIYAKU_ID` = :seiyaku_id 
    AND a.`TEKIYO_BI` = :tekiyo_bi 
    AND a.`TEKIYO_BI` >= :tekiyo_bi_1 
    AND a.`TEKIYO_BI` <= :tekiyo_bi_2 
    AND UPPER (TRIM(TRAILING ' ' FROM a.`FUKUGO_INFO`)) LIKE UPPER (CONCAT ('%', :fukugo_info, '%')) 
    AND a.`INSERT_TS` = :insert_ts 
    AND a.`INSERT_TS` >= :insert_ts_1 
    AND a.`INSERT_TS` <= :insert_ts_2 
    AND a.`INSERT_USER_ID` = :insert_user_id 
    AND a.`UPDATE_TS` = :update_ts 
    AND a.`UPDATE_TS` >= :update_ts_1 
    AND a.`UPDATE_TS` <= :update_ts_2 
    AND a.`UPDATE_USER_ID` = :update_user_id 
ORDER BY
    a.`SANSHO_ID`
    , a.`SEIYAKU_ID`
    , a.`TEKIYO_BI`
