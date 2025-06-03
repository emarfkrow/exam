SELECT
      a.`REFER_ID`
    , (SELECT r0.`REFER_MEI` FROM MB8_REFER r0 WHERE r0.`REFER_ID` = a.`REFER_ID`) AS `REFER_MEI`
    , a.`STINT_ID`
    , (SELECT r1.`STINT_MEI` FROM MB8_STINT r1 WHERE r1.`STINT_ID` = a.`STINT_ID`) AS `STINT_MEI`
    , a.`TEKIYO_BI` AS `TEKIYO_BI`
    , a.`COMBO_INFO`
    , a.`INSERT_TS` AS `INSERT_TS`
    , a.`INSERT_USER_ID`
    , (SELECT r2.`USER_SEI` FROM MHR_USER r2 WHERE r2.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`
    , a.`UPDATE_TS` AS `UPDATE_TS`
    , a.`UPDATE_USER_ID`
    , (SELECT r3.`USER_SEI` FROM MHR_USER r3 WHERE r3.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`
FROM
    TB8_COMBO a 
    INNER JOIN MB8_REFER c1 
        ON 1 = 1 
        AND c1.REFER_ID = a.REFER_ID 
    INNER JOIN MB8_STINT c2 
        ON 1 = 1 
        AND c2.STINT_ID = a.STINT_ID 
WHERE
    1 = 1 
    AND IFNULL (a.TEKIYO_BI, sysdate()) <= sysdate() 
    AND a.`REFER_ID` = :refer_id 
    AND a.`STINT_ID` = :stint_id 
    AND a.`TEKIYO_BI` = :tekiyo_bi 
    AND a.`TEKIYO_BI` >= :tekiyo_bi_1 
    AND a.`TEKIYO_BI` <= :tekiyo_bi_2 
    AND UPPER (TRIM(TRAILING ' ' FROM a.`COMBO_INFO`)) LIKE UPPER (CONCAT ('%', :combo_info, '%')) 
    AND a.`INSERT_TS` = :insert_ts 
    AND a.`INSERT_TS` >= :insert_ts_1 
    AND a.`INSERT_TS` <= :insert_ts_2 
    AND a.`INSERT_USER_ID` = :insert_user_id 
    AND a.`UPDATE_TS` = :update_ts 
    AND a.`UPDATE_TS` >= :update_ts_1 
    AND a.`UPDATE_TS` <= :update_ts_2 
    AND a.`UPDATE_USER_ID` = :update_user_id 
    AND EXISTS ( 
        SELECT
              * 
        FROM
            MB8_STINT p 
        WHERE
            1 = 1 
            AND p.STINT_ID = :stint_id 
    ) 
ORDER BY
    a.`REFER_ID`
    , a.`STINT_ID`
    , a.`TEKIYO_BI`
