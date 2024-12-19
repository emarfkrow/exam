SELECT
      a.`SOSEN_MEI`
    , a.`OYA_MEI`
    , a.`ENTITY1_MEI`
    , a.`KO_MEI`
    , a.`SHISON_MEI`
    , a.`SEARCH_SOSEN_ID`
    , a.`SEARCH_OYA_BN`
    , a.`SEARCH_ENTITY_BN`
    , a.`SEARCH_KO_BN`
    , a.`SEARCH_SHISON_BN`
FROM
    vb1_shison a 
WHERE
    1 = 1 
    AND TRIM(TRAILING ' ' FROM a.`SOSEN_MEI`) LIKE CONCAT ('%', :sosen_mei, '%') 
    AND TRIM(TRAILING ' ' FROM a.`OYA_MEI`) LIKE CONCAT ('%', :oya_mei, '%') 
    AND TRIM(TRAILING ' ' FROM a.`ENTITY1_MEI`) LIKE CONCAT ('%', :entity_1_mei, '%') 
    AND TRIM(TRAILING ' ' FROM a.`KO_MEI`) LIKE CONCAT ('%', :ko_mei, '%') 
    AND TRIM(TRAILING ' ' FROM a.`SHISON_MEI`) LIKE CONCAT ('%', :shison_mei, '%') 
    AND a.`SEARCH_SOSEN_ID` = :search_sosen_id 
    AND a.`SEARCH_OYA_BN` = :search_oya_bn 
    AND a.`SEARCH_ENTITY_BN` = :search_entity_bn 
    AND a.`SEARCH_KO_BN` = :search_ko_bn 
    AND a.`SEARCH_SHISON_BN` = :search_shison_bn 
ORDER BY
    1
    , 2
    , 3
    , 4
    , 5
    , 6
    , 7
    , 8
    , 9
    , 10
