SELECT
      a.`CODE_NM`
    , a.`CODE_VALUE`
    , a.`CODE_VALUE_MEI`
    , a.`HYOJI_JUN`
    , a.`CRITERIA`
    , a.`INSERT_DT`
    , a.`INSERT_BY`
    , a.`UPDATE_DT`
    , a.`UPDATE_BY`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
FROM
    m_code_value a 
WHERE
    1 = 1 
    AND TRIM (a.`CODE_NM`) LIKE CONCAT ('%', :code_nm, '%') 
    AND TRIM (a.`CODE_VALUE`) LIKE CONCAT ('%', :code_value, '%') 
    AND TRIM (a.`CODE_VALUE_MEI`) LIKE CONCAT ('%', :code_value_mei, '%') 
    AND a.`HYOJI_JUN` = :hyoji_jun 
    AND TRIM (a.`CRITERIA`) LIKE CONCAT ('%', :criteria, '%') 
    AND a.`INSERT_DT` = :insert_dt 
    AND a.`INSERT_DT` >= :insert_dt_1 
    AND a.`INSERT_DT` <= :insert_dt_2 
    AND TRIM (a.`INSERT_BY`) LIKE CONCAT ('%', :insert_by, '%') 
    AND a.`UPDATE_DT` = :update_dt 
    AND a.`UPDATE_DT` >= :update_dt_1 
    AND a.`UPDATE_DT` <= :update_dt_2 
    AND TRIM (a.`UPDATE_BY`) LIKE CONCAT ('%', :update_by, '%') 
    AND CASE WHEN TRIM (a.`DELETE_F`) IS NULL THEN '0' ELSE TO_CHAR (a.`DELETE_F`) END IN (:delete_f) 
ORDER BY
    a.`CODE_NM`, a.`CODE_VALUE`
