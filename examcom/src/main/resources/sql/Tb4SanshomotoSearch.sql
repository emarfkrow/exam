SELECT
      a.`SANSHOMOTO_ID`
    , a.`IDSANSHO_ID`
    , a.`IDSANSHO_MEI`
    , TRIM(TRAILING ' ' FROM a.`CDSANSHO_CD`) AS CDSANSHO_CD
    , a.`CDSANSHO_MEI`
    , TRIM(TRAILING ' ' FROM a.`NOSANSHO_NO`) AS NOSANSHO_NO
    , a.`NOSANSHO_MEI`
    , a.`BETSU_IDSANSHO_ID`
    , (SELECT r0.`IDSANSHO_MEI` FROM MB4_IDSANSHO r0 WHERE r0.`IDSANSHO_ID` = a.`BETSU_IDSANSHO_ID`) AS `BETSU_IDSANSHO_MEI`
    , a.`INSERT_TS` AS INSERT_TS
    , a.`INSERT_USER_ID`
    , (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`
    , a.`UPDATE_TS` AS UPDATE_TS
    , a.`UPDATE_USER_ID`
    , (SELECT r2.`USER_SEI` FROM MHR_USER r2 WHERE r2.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
    , a.`STATUS_KB`
FROM
    TB4_SANSHOMOTO a 
WHERE
    1 = 1 
    AND a.`SANSHOMOTO_ID` = :sanshomoto_id 
    AND a.`IDSANSHO_ID` = :idsansho_id 
    AND TRIM(TRAILING ' ' FROM a.`IDSANSHO_MEI`) LIKE CONCAT ('%', :idsansho_mei, '%') 
    AND TRIM(TRAILING ' ' FROM a.`CDSANSHO_CD`) LIKE CONCAT ('%', :cdsansho_cd, '%') 
    AND TRIM(TRAILING ' ' FROM a.`CDSANSHO_MEI`) LIKE CONCAT ('%', :cdsansho_mei, '%') 
    AND TRIM(TRAILING ' ' FROM a.`NOSANSHO_NO`) LIKE CONCAT ('%', :nosansho_no, '%') 
    AND TRIM(TRAILING ' ' FROM a.`NOSANSHO_MEI`) LIKE CONCAT ('%', :nosansho_mei, '%') 
    AND a.`BETSU_IDSANSHO_ID` = :betsu_idsansho_id 
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
    a.`SANSHOMOTO_ID`
