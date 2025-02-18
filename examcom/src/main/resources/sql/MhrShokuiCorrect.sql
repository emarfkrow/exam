SELECT
      a.`SHOKUI_ID`
    , a.`SHOKUI_MEI`
    , a.`SHOKUI_ON`
    , a.`TEKIYO_BI` AS TEKIYO_BI
    , a.`SHURYO_BI` AS SHURYO_BI
    , a.`INSERT_TS` AS INSERT_TS
    , a.`INSERT_USER_ID`
    , (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`
    , a.`UPDATE_TS` AS UPDATE_TS
    , a.`UPDATE_USER_ID`
    , (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
    , a.`STATUS_KB`
FROM
    MHR_SHOKUI a 
WHERE
    1 = 1 
    AND IFNULL (a.DELETE_F, 0) != 1 
    AND IFNULL (a.TEKIYO_BI, sysdate()) <= sysdate() 
    AND DATE_ADD(IFNULL (a.SHURYO_BI, sysdate()), INTERVAL 1 DAY) > sysdate() 
    AND a.`SHOKUI_ID` = :shokui_id 
    AND TRIM(TRAILING ' ' FROM a.`SHOKUI_MEI`) LIKE CONCAT ('%', :shokui_mei, '%') 
    AND a.`SHOKUI_ON` = :shokui_on 
    AND a.`TEKIYO_BI` = :tekiyo_bi 
    AND a.`TEKIYO_BI` >= :tekiyo_bi_1 
    AND a.`TEKIYO_BI` <= :tekiyo_bi_2 
    AND a.`SHURYO_BI` = :shuryo_bi 
    AND a.`SHURYO_BI` >= :shuryo_bi_1 
    AND a.`SHURYO_BI` <= :shuryo_bi_2 
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
    a.`SHOKUI_ON`
    , a.`SHOKUI_ID`
