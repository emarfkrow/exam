SELECT
      a.`ITOKO_ID`
    , a.`ITOKO_MEI`
    , a.`SOSEN_ID`
    , (SELECT r1.`SOSEN_MEI` FROM tb1_sosen r1 WHERE r1.`SOSEN_ID` = a.`SOSEN_ID`) AS `SOSEN_MEI`
    , a.`OYA_BN`
    , a.`ENTITY_BN`
    , a.`INSERT_TS` AS INSERT_TS
    , a.`INSERT_ID`
    , a.`UPDATE_TS` AS UPDATE_TS
    , a.`UPDATE_ID`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
FROM
    tb1_itoko a 
WHERE
    1 = 1 
    AND a.`ITOKO_ID` = :itoko_id 
    AND TRIM(TRAILING ' ' FROM a.`ITOKO_MEI`) LIKE CONCAT ('%', :itoko_mei, '%') 
    AND a.`SOSEN_ID` = :sosen_id 
    AND a.`OYA_BN` = :oya_bn 
    AND a.`ENTITY_BN` = :entity_bn 
    AND a.`INSERT_TS` = :insert_ts 
    AND a.`INSERT_TS` >= :insert_ts_1 
    AND a.`INSERT_TS` <= :insert_ts_2 
    AND a.`INSERT_ID` = :insert_id 
    AND a.`UPDATE_TS` = :update_ts 
    AND a.`UPDATE_TS` >= :update_ts_1 
    AND a.`UPDATE_TS` <= :update_ts_2 
    AND a.`UPDATE_ID` = :update_id 
    AND CASE WHEN TRIM (a.`DELETE_F`) IS NULL THEN '0' ELSE TO_CHAR (a.`DELETE_F`) END IN (:delete_f) 
ORDER BY
    a.`ITOKO_ID`
