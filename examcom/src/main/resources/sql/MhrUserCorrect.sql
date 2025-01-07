SELECT
      a.`USER_ID`
    , a.`USER_SEI`
    , a.`USER_MEI`
    , a.`E_MAIL`
    , a.`PASSWORD`
    , a.`KAISHI_BI` AS KAISHI_BI
    , a.`SHURYO_BI` AS SHURYO_BI
    , a.`INSERT_TS` AS INSERT_TS
    , a.`INSERT_USER_ID`
    , (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`
    , a.`UPDATE_TS` AS UPDATE_TS
    , a.`UPDATE_USER_ID`
    , (SELECT r2.`USER_SEI` FROM MHR_USER r2 WHERE r2.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
    , a.`STATUS_KB`
FROM
    MHR_USER a 
WHERE
    1 = 1 
    AND IFNULL (a.DELETE_F, 0) != 1 
    AND IFNULL (a.KAISHI_BI, sysdate()) <= sysdate() 
    AND DATE_ADD(IFNULL (a.SHURYO_BI, sysdate()), INTERVAL 1 DAY) > sysdate() 
    AND a.`USER_ID` = :user_id 
    AND TRIM(TRAILING ' ' FROM a.`USER_SEI`) LIKE CONCAT ('%', :user_sei, '%') 
    AND TRIM(TRAILING ' ' FROM a.`USER_MEI`) LIKE CONCAT ('%', :user_mei, '%') 
    AND TRIM(TRAILING ' ' FROM a.`E_MAIL`) LIKE CONCAT ('%', :e_mail, '%') 
    AND TRIM(TRAILING ' ' FROM a.`PASSWORD`) LIKE CONCAT ('%', :password, '%') 
    AND a.`KAISHI_BI` = :kaishi_bi 
    AND a.`KAISHI_BI` >= :kaishi_bi_1 
    AND a.`KAISHI_BI` <= :kaishi_bi_2 
    AND a.`SHURYO_BI` = :shuryo_bi 
    AND a.`SHURYO_BI` >= :shuryo_bi_1 
    AND a.`SHURYO_BI` <= :shuryo_bi_2 
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
ORDER BY
    a.`USER_ID`
