SELECT
      a.`SOSEN_ID`
    , a.`OYA_SN`
    , a.`ENTITY_SN`
    , a.`ENTITY_MEI`
    , a.`SANSHO1_ID`
    , a.`SANSHO1_MEI`
    , TRIM(TRAILING ' ' FROM a.`SANSHO2_CD`) AS SANSHO2_CD
    , a.`SANSHO2_MEI`
    , a.`BETSU_SANSHO1_ID`
    , a.`BETSU_SANSHO1_MEI`
    , a.`INSERT_DT`
    , a.`INSERT_BY`
    , a.`UPDATE_DT`
    , a.`UPDATE_BY`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
FROM
    t_entity a 
WHERE
    1 = 1 
    AND a.`SOSEN_ID` = :sosen_id 
    AND a.`OYA_SN` = :oya_sn 
    AND a.`ENTITY_SN` = :entity_sn 
    AND a.`ENTITY_MEI` LIKE CONCAT ('%', :entity_mei, '%') 
    AND a.`SANSHO1_ID` = :sansho_1_id 
    AND a.`SANSHO1_MEI` LIKE CONCAT ('%', :sansho_1_mei, '%') 
    AND TRIM (a.`SANSHO2_CD`) = TRIM (:sansho_2_cd) 
    AND a.`SANSHO2_MEI` LIKE CONCAT ('%', :sansho_2_mei, '%') 
    AND a.`BETSU_SANSHO1_ID` = :betsu_sansho_1_id 
    AND a.`BETSU_SANSHO1_MEI` LIKE CONCAT ('%', :betsu_sansho_1_mei, '%') 
    AND a.`INSERT_DT` = :insert_dt 
    AND a.`INSERT_DT` >= :insert_dt_1 
    AND a.`INSERT_DT` <= :insert_dt_2 
    AND a.`INSERT_BY` = :insert_by 
    AND a.`UPDATE_DT` = :update_dt 
    AND a.`UPDATE_DT` >= :update_dt_1 
    AND a.`UPDATE_DT` <= :update_dt_2 
    AND a.`UPDATE_BY` = :update_by 
    AND CASE WHEN a.`DELETE_F` IS NULL THEN '0' ELSE TO_CHAR (a.`DELETE_F`) END IN (:delete_f) 
ORDER BY
    a.`SOSEN_ID`, a.`OYA_SN`, a.`ENTITY_SN`
