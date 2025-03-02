SELECT
      a.`COL_A`
    , a.`COL_B`
    , a.`COL_C`
    , a.`COL_D`
    , a.`COL_E`
    , a.`INSERT_TS` AS INSERT_TS
    , a.`INSERT_USER_ID`
    , (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`
    , a.`UPDATE_TS` AS UPDATE_TS
    , a.`UPDATE_USER_ID`
    , (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`
FROM
    TB0_NOKEY a 
WHERE
    1 = 1 
    AND TRIM(TRAILING ' ' FROM a.`COL_A`) LIKE CONCAT ('%', :col_a, '%') 
    AND TRIM(TRAILING ' ' FROM a.`COL_B`) LIKE CONCAT ('%', :col_b, '%') 
    AND TRIM(TRAILING ' ' FROM a.`COL_C`) LIKE CONCAT ('%', :col_c, '%') 
    AND TRIM(TRAILING ' ' FROM a.`COL_D`) LIKE CONCAT ('%', :col_d, '%') 
    AND a.`COL_D` >= :col_d_1 
    AND a.`COL_D` <= :col_d_2 
    AND TRIM(TRAILING ' ' FROM a.`COL_E`) LIKE CONCAT ('%', :col_e, '%') 
    AND a.`INSERT_TS` = :insert_ts 
    AND a.`INSERT_TS` >= :insert_ts_1 
    AND a.`INSERT_TS` <= :insert_ts_2 
    AND a.`INSERT_USER_ID` = :insert_user_id 
    AND a.`UPDATE_TS` = :update_ts 
    AND a.`UPDATE_TS` >= :update_ts_1 
    AND a.`UPDATE_TS` <= :update_ts_2 
    AND a.`UPDATE_USER_ID` = :update_user_id 
ORDER BY
    a.`COL_A`
    , a.`COL_B`
