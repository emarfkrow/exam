SELECT
      RTRIM (RTRIM (a."ENTITY_NAME"), '　') AS ENTITY_NAME
    , a."SOSEN_ID"
    , a."SOSEN_MEI"
    , a."OYA_MEI"
    , a."ENTITY1_MEI"
    , a."KO_MEI"
    , a."SHISON_MEI"
    , a."SEARCH_SOSEN_ID"
    , a."SEARCH_OYA_BN"
    , a."SEARCH_ENTITY_BN"
    , a."SEARCH_KO_BN"
    , a."SEARCH_SHISON_BN"
    , TO_CHAR (a."INSERT_TS", 'YYYY-MM-DD HH24:MI:SS.FF3') AS INSERT_TS
FROM
    VB1_SHISON a 
WHERE
    1 = 1 
    AND RTRIM (RTRIM (a."ENTITY_NAME"), '　') LIKE '%' || :entity_name || '%' 
    AND a."SOSEN_ID" = :sosen_id 
    AND RTRIM (RTRIM (a."SOSEN_MEI"), '　') LIKE '%' || :sosen_mei || '%' 
    AND RTRIM (RTRIM (a."OYA_MEI"), '　') LIKE '%' || :oya_mei || '%' 
    AND RTRIM (RTRIM (a."ENTITY1_MEI"), '　') LIKE '%' || :entity_1_mei || '%' 
    AND RTRIM (RTRIM (a."KO_MEI"), '　') LIKE '%' || :ko_mei || '%' 
    AND RTRIM (RTRIM (a."SHISON_MEI"), '　') LIKE '%' || :shison_mei || '%' 
    AND a."SEARCH_SOSEN_ID" = :search_sosen_id 
    AND a."SEARCH_OYA_BN" = :search_oya_bn 
    AND a."SEARCH_ENTITY_BN" = :search_entity_bn 
    AND a."SEARCH_KO_BN" = :search_ko_bn 
    AND a."SEARCH_SHISON_BN" = :search_shison_bn 
    AND a."INSERT_TS" = TO_TIMESTAMP (REPLACE (SUBSTR (:insert_ts, 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3') 
    AND a."INSERT_TS" >= TO_TIMESTAMP (REPLACE (SUBSTR (:insert_ts_1 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."INSERT_TS" <= TO_TIMESTAMP (REPLACE (SUBSTR (:insert_ts_2 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
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
    , 11
    , 12
    , 13
