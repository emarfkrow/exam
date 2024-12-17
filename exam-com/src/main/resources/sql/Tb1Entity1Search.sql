SELECT
      a.`SOSEN_ID`
    , a.`OYA_BN`
    , a.`ENTITY_BN`
    , a.`ENTITY1_MEI`
    , a.`SANSHO1_ID`
    , a.`SANSHO1_MEI`
    , TRIM(TRAILING ' ' FROM a.`SANSHO2_CD`) AS SANSHO2_CD
    , a.`SANSHO2_MEI`
    , TRIM(TRAILING ' ' FROM a.`SANSHO3_NO`) AS SANSHO3_NO
    , a.`SANSHO3_MEI`
    , a.`BETSU_SANSHO1_ID`
    , a.`BETSU_SANSHO1_MEI`
    , a.`INSERT_DT` AS INSERT_DT
    , a.`INSERT_BY`
    , a.`UPDATE_DT` AS UPDATE_DT
    , a.`UPDATE_BY`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
FROM
    tb1_entity1 a 
WHERE
    1 = 1 
    AND a.`SOSEN_ID` = :sosen_id 
    AND a.`OYA_BN` = :oya_bn 
    AND a.`ENTITY_BN` = :entity_bn 
    AND TRIM(TRAILING ' ' FROM a.`ENTITY1_MEI`) LIKE CONCAT ('%', :entity_1_mei, '%') 
    AND a.`SANSHO1_ID` = :sansho_1_id 
    AND TRIM(TRAILING ' ' FROM a.`SANSHO1_MEI`) LIKE CONCAT ('%', :sansho_1_mei, '%') 
    AND TRIM(TRAILING ' ' FROM a.`SANSHO2_CD`) LIKE CONCAT ('%', :sansho_2_cd, '%') 
    AND TRIM(TRAILING ' ' FROM a.`SANSHO2_MEI`) LIKE CONCAT ('%', :sansho_2_mei, '%') 
    AND TRIM(TRAILING ' ' FROM a.`SANSHO3_NO`) LIKE CONCAT ('%', :sansho_3_no, '%') 
    AND TRIM(TRAILING ' ' FROM a.`SANSHO3_MEI`) LIKE CONCAT ('%', :sansho_3_mei, '%') 
    AND a.`BETSU_SANSHO1_ID` = :betsu_sansho_1_id 
    AND TRIM(TRAILING ' ' FROM a.`BETSU_SANSHO1_MEI`) LIKE CONCAT ('%', :betsu_sansho_1_mei, '%') 
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
    a.`SOSEN_ID`, a.`OYA_BN`, a.`ENTITY_BN`
