SELECT
      a.`CHOICE_ID`
    , a.`SUM_ID`
    , a.`SUM_INFO`
    , a.`SUM2_ID`
    , a.`SUM2_INFO`
    , a.`SUM3_ID`
    , a.`SUM3_INFO`
    , a.`INSERT_TS` AS `INSERT_TS`
    , a.`INSERT_USER_ID`
    , (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`
    , a.`UPDATE_TS` AS `UPDATE_TS`
    , a.`UPDATE_USER_ID`
    , (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`
FROM
    TB7_CHOICE a 
WHERE
    1 = 1 
    AND a.`CHOICE_ID` = :choice_id 
    AND a.`SUM_ID` = :sum_id 
    AND UPPER (TRIM(TRAILING ' ' FROM a.`SUM_INFO`)) LIKE UPPER (CONCAT ('%', :sum_info, '%')) 
    AND a.`SUM2_ID` = :sum_2_id 
    AND UPPER (TRIM(TRAILING ' ' FROM a.`SUM2_INFO`)) LIKE UPPER (CONCAT ('%', :sum_2_info, '%')) 
    AND a.`SUM3_ID` = :sum_3_id 
    AND UPPER (TRIM(TRAILING ' ' FROM a.`SUM3_INFO`)) LIKE UPPER (CONCAT ('%', :sum_3_info, '%')) 
    AND a.`INSERT_TS` = :insert_ts 
    AND a.`INSERT_TS` >= :insert_ts_1 
    AND a.`INSERT_TS` <= :insert_ts_2 
    AND a.`INSERT_USER_ID` = :insert_user_id 
    AND a.`UPDATE_TS` = :update_ts 
    AND a.`UPDATE_TS` >= :update_ts_1 
    AND a.`UPDATE_TS` <= :update_ts_2 
    AND a.`UPDATE_USER_ID` = :update_user_id 
ORDER BY
    a.`CHOICE_ID`
