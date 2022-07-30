SELECT
      a.`COLUMN_A`
    , a.`COLUMN_B`
    , a.`COLUMN_C`
    , a.`COLUMN_D`
    , a.`COLUMN_E`
    , a.`INSERT_DT`
    , a.`INSERT_BY`
    , a.`UPDATE_DT`
    , a.`UPDATE_BY`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
FROM
    t_no_pk a 
WHERE
    1 = 1 
    AND a.`COLUMN_A` = :column_a 
    AND a.`COLUMN_B` = :column_b 
    AND a.`COLUMN_C` = :column_c 
    AND a.`COLUMN_D` = :column_d 
    AND a.`COLUMN_E` = :column_e 
    AND a.`INSERT_DT` = :insert_dt 
    AND a.`INSERT_DT` >= :insert_dt_1 
    AND a.`INSERT_DT` <= :insert_dt_2 
    AND a.`INSERT_BY` = :insert_by 
    AND a.`UPDATE_DT` = :update_dt 
    AND a.`UPDATE_DT` >= :update_dt_1 
    AND a.`UPDATE_DT` <= :update_dt_2 
    AND a.`UPDATE_BY` = :update_by 
    AND CASE WHEN a.`DELETE_F` IS NULL THEN '0' ELSE TO_CHAR (a.`DELETE_F`) END IN (:delete_f) 
ORDER BY
    1
    , 2
    , 3
    , 4
    , 5
    , 6
    , 7
    , 8
    , 9
    , 10
