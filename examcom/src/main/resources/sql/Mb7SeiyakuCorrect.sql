SELECT
      a.`SEIYAKU_ID`
    , a.`SEIYAKU_MEI`
    , a.`INSERT_TS` AS INSERT_TS
    , a.`INSERT_USER_ID`
    , (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`
    , a.`UPDATE_TS` AS UPDATE_TS
    , a.`UPDATE_USER_ID`
    , (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
    , a.`STATUS_KB`
FROM
    MB7_SEIYAKU a 
WHERE
    1 = 1 
    AND IFNULL (a.DELETE_F, 0) != 1 
    AND a.`SEIYAKU_ID` = :seiyaku_id 
    AND TRIM(TRAILING ' ' FROM a.`SEIYAKU_MEI`) LIKE CONCAT ('%', :seiyaku_mei, '%') 
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
    AND EXISTS ( 
        SELECT
              * 
        FROM
            TB7_FUKUGO p 
        WHERE
            1 = 1 
            AND IFNULL (p.DELETE_F, 0) != 1 
            AND IFNULL (p.TEKIYO_BI, sysdate()) <= sysdate() 
            AND p.SANSHO_ID = :sansho_id 
            AND p.SEIYAKU_ID = a.SEIYAKU_ID 
    ) 
ORDER BY
    a.`SEIYAKU_ID`
