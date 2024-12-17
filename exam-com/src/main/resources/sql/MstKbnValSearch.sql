SELECT
      a.`KBN_NM`
    , a.`KBN_VAL`
    , a.`KBN_VAL_MEI`
    , a.`HYOJI_ON`
    , a.`CRITERIA`
    , a.`INSERT_DT` AS INSERT_DT
    , a.`INSERT_BY`
    , a.`UPDATE_DT` AS UPDATE_DT
    , a.`UPDATE_BY`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
FROM
    mst_kbn_val a 
WHERE
    1 = 1 
    AND :kbn_nm LIKE CONCAT ('%', TRIM(TRAILING ' ' FROM a.`KBN_NM`)) 
    AND TRIM(TRAILING ' ' FROM a.`KBN_VAL`) LIKE CONCAT ('%', :kbn_val, '%') 
    AND TRIM(TRAILING ' ' FROM a.`KBN_VAL_MEI`) LIKE CONCAT ('%', :kbn_val_mei, '%') 
    AND a.`HYOJI_ON` = :hyoji_on 
    AND TRIM(TRAILING ' ' FROM a.`CRITERIA`) LIKE CONCAT ('%', :criteria, '%') 
    AND a.`INSERT_DT` = :insert_dt 
    AND a.`INSERT_DT` >= :insert_dt_1 
    AND a.`INSERT_DT` <= :insert_dt_2 
    AND TRIM(TRAILING ' ' FROM a.`INSERT_BY`) LIKE CONCAT ('%', :insert_by, '%') 
    AND a.`UPDATE_DT` = :update_dt 
    AND a.`UPDATE_DT` >= :update_dt_1 
    AND a.`UPDATE_DT` <= :update_dt_2 
    AND TRIM(TRAILING ' ' FROM a.`UPDATE_BY`) LIKE CONCAT ('%', :update_by, '%') 
    AND CASE WHEN TRIM (a.`DELETE_F`) IS NULL THEN '0' ELSE TO_CHAR (a.`DELETE_F`) END IN (:delete_f) 
ORDER BY
    a.`KBN_NM`, a.`KBN_VAL`
