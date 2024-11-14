SELECT
      a.`BUSHO_ID`
    , a.`BUSHO_MEI`
    , a.`OYA_BUSHO_ID`
    , a.`KAISHI_BI`
    , a.`SHURYO_BI`
    , a.`INSERT_DT`
    , a.`INSERT_BY`
    , a.`UPDATE_DT`
    , a.`UPDATE_BY`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
FROM
    m_busho a 
WHERE
    1 = 1 
    AND a.`BUSHO_ID` = :busho_id 
    AND TRIM(TRAILING ' ' FROM a.`BUSHO_MEI`) LIKE CONCAT ('%', :busho_mei, '%') 
    AND a.`OYA_BUSHO_ID` = :oya_busho_id 
    AND a.`KAISHI_BI` = :kaishi_bi 
    AND a.`KAISHI_BI` >= :kaishi_bi_1 
    AND a.`KAISHI_BI` <= :kaishi_bi_2 
    AND a.`SHURYO_BI` = :shuryo_bi 
    AND a.`SHURYO_BI` >= :shuryo_bi_1 
    AND a.`SHURYO_BI` <= :shuryo_bi_2 
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
    a.`BUSHO_ID`
