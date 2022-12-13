SELECT
      TRIM(TRAILING ' ' FROM a.`SANSHO2_CD`) AS SANSHO2_CD
    , a.`SANSHO2_MEI`
    , a.`INSERT_DT`
    , a.`INSERT_BY`
    , a.`UPDATE_DT`
    , a.`UPDATE_BY`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
FROM
    m_sansho2 a 
WHERE
    1 = 1 
    AND TRIM(TRAILING ' ' FROM a.`SANSHO2_CD`) LIKE CONCAT ('%', :sansho_2_cd, '%') 
    AND TRIM(TRAILING ' ' FROM a.`SANSHO2_MEI`) LIKE CONCAT ('%', :sansho_2_mei, '%') 
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
    a.`SANSHO2_CD`
