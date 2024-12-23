SELECT
      a.`BUSHO_ID`
    , (SELECT r1.`BUSHO_MEI` FROM mhr_busho r1 WHERE r1.`BUSHO_ID` = a.`BUSHO_ID`) AS `BUSHO_MEI`
    , a.`SHOKUI_ID`
    , (SELECT r2.`SHOKUI_MEI` FROM mhr_shokui r2 WHERE r2.`SHOKUI_ID` = a.`SHOKUI_ID`) AS `SHOKUI_MEI`
    , a.`USER_ID`
    , (SELECT r3.`USER_SEI` FROM mhr_user r3 WHERE r3.`USER_ID` = a.`USER_ID`) AS `USER_SEI`
    , a.`KAISHI_BI` AS KAISHI_BI
    , a.`SHURYO_BI` AS SHURYO_BI
    , a.`INSERT_TS` AS INSERT_TS
    , a.`INSERT_ID`
    , a.`UPDATE_TS` AS UPDATE_TS
    , a.`UPDATE_ID`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
FROM
    mhr_shozoku a 
WHERE
    1 = 1 
    AND a.`BUSHO_ID` = :busho_id 
    AND a.`SHOKUI_ID` = :shokui_id 
    AND a.`USER_ID` = :user_id 
    AND a.`KAISHI_BI` = :kaishi_bi 
    AND a.`KAISHI_BI` >= :kaishi_bi_1 
    AND a.`KAISHI_BI` <= :kaishi_bi_2 
    AND a.`SHURYO_BI` = :shuryo_bi 
    AND a.`SHURYO_BI` >= :shuryo_bi_1 
    AND a.`SHURYO_BI` <= :shuryo_bi_2 
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
    a.`BUSHO_ID`, a.`SHOKUI_ID`, a.`USER_ID`, a.`KAISHI_BI`
