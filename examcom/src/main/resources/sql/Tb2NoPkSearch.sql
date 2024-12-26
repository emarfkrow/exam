SELECT
      a.`COLUMN_A`
    , a.`COLUMN_B`
    , a.`COLUMN_C`
    , a.`COLUMN_D`
    , a.`COLUMN_E`
    , a.`INSERT_TS` AS INSERT_TS
    , a.`INSERT_ID`
    , a.`UPDATE_TS` AS UPDATE_TS
    , a.`UPDATE_ID`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
    , a.`STATUS_KB`
FROM
    TB2_NO_PK a 
WHERE
    1 = 1 
    AND TRIM(TRAILING ' ' FROM a.`COLUMN_A`) LIKE CONCAT ('%', :column_a, '%') 
    AND TRIM(TRAILING ' ' FROM a.`COLUMN_B`) LIKE CONCAT ('%', :column_b, '%') 
    AND TRIM(TRAILING ' ' FROM a.`COLUMN_C`) LIKE CONCAT ('%', :column_c, '%') 
    AND TRIM(TRAILING ' ' FROM a.`COLUMN_D`) LIKE CONCAT ('%', :column_d, '%') 
    AND a.`COLUMN_D` >= :column_d_1 
    AND a.`COLUMN_D` <= :column_d_2 
    AND TRIM(TRAILING ' ' FROM a.`COLUMN_E`) LIKE CONCAT ('%', :column_e, '%') 
    AND a.`INSERT_TS` = :insert_ts 
    AND a.`INSERT_TS` >= :insert_ts_1 
    AND a.`INSERT_TS` <= :insert_ts_2 
    AND a.`INSERT_ID` = :insert_id 
    AND a.`UPDATE_TS` = :update_ts 
    AND a.`UPDATE_TS` >= :update_ts_1 
    AND a.`UPDATE_TS` <= :update_ts_2 
    AND a.`UPDATE_ID` = :update_id 
    AND CASE WHEN TRIM (a.`DELETE_F`) IS NULL THEN '0' ELSE TO_CHAR (a.`DELETE_F`) END IN (:delete_f) 
    AND TRIM (a.`STATUS_KB`) IN (:status_kb) 
ORDER BY
    a.`COLUMN_A`
