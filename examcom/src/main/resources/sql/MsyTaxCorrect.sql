SELECT
      a.`TAX_KB`
    , a.`TEKIYO_BI` AS TEKIYO_BI
    , a.`SHURYO_BI` AS SHURYO_BI
    , a.`TAX_RT`
    , a.`INSERT_TS` AS INSERT_TS
    , a.`INSERT_USER_ID`
    , (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`
    , a.`UPDATE_TS` AS UPDATE_TS
    , a.`UPDATE_USER_ID`
    , (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`
FROM
    MSY_TAX a 
WHERE
    1 = 1 
    AND IFNULL (a.TEKIYO_BI, sysdate()) <= sysdate() 
    AND DATE_ADD(IFNULL (a.SHURYO_BI, sysdate()), INTERVAL 1 DAY) > sysdate() 
    AND TRIM(TRAILING ' ' FROM a.`TAX_KB`) IN (:tax_kb) 
    AND a.`TEKIYO_BI` = :tekiyo_bi 
    AND a.`TEKIYO_BI` >= :tekiyo_bi_1 
    AND a.`TEKIYO_BI` <= :tekiyo_bi_2 
    AND a.`SHURYO_BI` = :shuryo_bi 
    AND a.`SHURYO_BI` >= :shuryo_bi_1 
    AND a.`SHURYO_BI` <= :shuryo_bi_2 
    AND a.`TAX_RT` = :tax_rt 
    AND a.`INSERT_TS` = :insert_ts 
    AND a.`INSERT_TS` >= :insert_ts_1 
    AND a.`INSERT_TS` <= :insert_ts_2 
    AND a.`INSERT_USER_ID` = :insert_user_id 
    AND a.`UPDATE_TS` = :update_ts 
    AND a.`UPDATE_TS` >= :update_ts_1 
    AND a.`UPDATE_TS` <= :update_ts_2 
    AND a.`UPDATE_USER_ID` = :update_user_id 
ORDER BY
    a.`TAX_KB`
    , a.`TEKIYO_BI`
