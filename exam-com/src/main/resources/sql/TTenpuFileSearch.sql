SELECT
      a.`SOSEN_ID`
    , a.`OYA_SN`
    , a.`ENTITY_SN`
    , a.`TENPU_FILE_SN`
    , a.`TENPU_FILE_MEI`
    , a.`TENPU_FILE`
    , a.`INSERT_DT`
    , a.`INSERT_BY`
    , a.`UPDATE_DT`
    , a.`UPDATE_BY`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
FROM
    t_tenpu_file a 
WHERE
    1 = 1 
    AND a.`SOSEN_ID` = :sosen_id 
    AND a.`OYA_SN` = :oya_sn 
    AND a.`ENTITY_SN` = :entity_sn 
    AND a.`TENPU_FILE_SN` = :tenpu_file_sn 
    AND TRIM(TRAILING ' ' FROM a.`TENPU_FILE_MEI`) LIKE CONCAT ('%', :tenpu_file_mei, '%') 
    AND TRIM(TRAILING ' ' FROM a.`TENPU_FILE`) LIKE CONCAT ('%', :tenpu_file, '%') 
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
    a.`SOSEN_ID`, a.`OYA_SN`, a.`ENTITY_SN`, a.`TENPU_FILE_SN`
