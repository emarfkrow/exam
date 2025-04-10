SELECT
      a.`HASEI_SAKI1_ID`
    , a.`HASEI_SAKI1_BN`
    , a.`HASEI_SAKI1_DET_INFO`
    , a.`INSERT_TS` AS `INSERT_TS`
    , a.`INSERT_USER_ID`
    , (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`
    , a.`UPDATE_TS` AS `UPDATE_TS`
    , a.`UPDATE_USER_ID`
    , (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`
FROM
    TB6_HASEI_SAKI1_DET a 
WHERE
    1 = 1 
    AND a.`HASEI_SAKI1_ID` = :hasei_saki_1_id 
    AND a.`HASEI_SAKI1_BN` = :hasei_saki_1_bn 
    AND UPPER (TRIM(TRAILING ' ' FROM a.`HASEI_SAKI1_DET_INFO`)) LIKE UPPER (CONCAT ('%', :hasei_saki_1_det_info, '%')) 
    AND a.`INSERT_TS` = :insert_ts 
    AND a.`INSERT_TS` >= :insert_ts_1 
    AND a.`INSERT_TS` <= :insert_ts_2 
    AND a.`INSERT_USER_ID` = :insert_user_id 
    AND a.`UPDATE_TS` = :update_ts 
    AND a.`UPDATE_TS` >= :update_ts_1 
    AND a.`UPDATE_TS` <= :update_ts_2 
    AND a.`UPDATE_USER_ID` = :update_user_id 
ORDER BY
    a.`HASEI_SAKI1_ID`
    , a.`HASEI_SAKI1_BN`
