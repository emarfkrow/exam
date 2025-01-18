SELECT
      a.`TENSEI_ID`
    , (SELECT r0.`TENSEI_MEI` FROM TB1_TENSEI r0 WHERE r0.`TENSEI_ID` = a.`TENSEI_ID`) AS `TENSEI_MEI`
    , a.`TENSEI_BN`
    , a.`MEMO`
    , a.`INSERT_TS` AS INSERT_TS
    , a.`INSERT_USER_ID`
    , (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`
    , a.`UPDATE_TS` AS UPDATE_TS
    , a.`UPDATE_USER_ID`
    , (SELECT r2.`USER_SEI` FROM MHR_USER r2 WHERE r2.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
    , a.`STATUS_KB`
FROM
    TB1_TENSEI_DET a 
WHERE
    1 = 1 
    AND a.`TENSEI_ID` = :tensei_id 
    AND a.`TENSEI_BN` = :tensei_bn 
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
    a.`TENSEI_ID`, a.`TENSEI_BN`
