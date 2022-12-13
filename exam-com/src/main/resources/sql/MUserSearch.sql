SELECT
      a.`USER_ID`
    , a.`USER_SEI`
    , a.`USER_MEI`
    , a.`EMAIL`
    , a.`PASSWORD`
    , TRIM(TRAILING ' ' FROM a.`KAISHI_YMD`) AS KAISHI_YMD
    , TRIM(TRAILING ' ' FROM a.`SHURYO_YMD`) AS SHURYO_YMD
    , a.`INSERT_DT`
    , a.`INSERT_BY`
    , a.`UPDATE_DT`
    , a.`UPDATE_BY`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
FROM
    m_user a 
WHERE
    1 = 1 
    AND a.`USER_ID` = :user_id 
    AND TRIM(TRAILING ' ' FROM a.`USER_SEI`) LIKE CONCAT ('%', :user_sei, '%') 
    AND TRIM(TRAILING ' ' FROM a.`USER_MEI`) LIKE CONCAT ('%', :user_mei, '%') 
    AND TRIM(TRAILING ' ' FROM a.`EMAIL`) LIKE CONCAT ('%', :email, '%') 
    AND TRIM(TRAILING ' ' FROM a.`PASSWORD`) LIKE CONCAT ('%', :password, '%') 
    AND TRIM(TRAILING ' ' FROM a.`KAISHI_YMD`) LIKE CONCAT ('%', :kaishi_ymd, '%') 
    AND a.`KAISHI_YMD` >= :kaishi_ymd_1 
    AND a.`KAISHI_YMD` <= :kaishi_ymd_2 
    AND TRIM(TRAILING ' ' FROM a.`SHURYO_YMD`) LIKE CONCAT ('%', :shuryo_ymd, '%') 
    AND a.`SHURYO_YMD` >= :shuryo_ymd_1 
    AND a.`SHURYO_YMD` <= :shuryo_ymd_2 
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
    a.`USER_ID`
