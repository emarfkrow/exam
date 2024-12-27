SELECT
      a."SOSEN_ID"
    , a."OYA_BN"
    , a."ENTITY_BN"
    , a."ENTITY1_MEI"
    , a."SANSHO1_ID"
    , a."SANSHO1_MEI"
    , RTRIM (RTRIM (a."SANSHO2_CD"), '　') AS SANSHO2_CD
    , a."SANSHO2_MEI"
    , RTRIM (RTRIM (a."SANSHO3_NO"), '　') AS SANSHO3_NO
    , a."SANSHO3_MEI"
    , a."BETSU_SANSHO1_ID"
    , a."BETSU_SANSHO1_MEI"
    , TO_CHAR (a."INSERT_TS", 'YYYY-MM-DD HH24:MI:SS.FF3') AS INSERT_TS
    , a."INSERT_USER_ID"
    , (SELECT r5."USER_SEI" FROM MHR_USER r5 WHERE r5."USER_ID" = a."INSERT_USER_ID") AS "INSERT_USER_SEI"
    , TO_CHAR (a."UPDATE_TS", 'YYYY-MM-DD HH24:MI:SS.FF3') AS UPDATE_TS
    , a."UPDATE_USER_ID"
    , (SELECT r6."USER_SEI" FROM MHR_USER r6 WHERE r6."USER_ID" = a."UPDATE_USER_ID") AS "UPDATE_USER_SEI"
    , RTRIM (RTRIM (a."DELETE_F"), '　') AS DELETE_F
    , a."STATUS_KB"
FROM
    TB1_ENTITY1 a 
WHERE
    1 = 1 
    AND a."SOSEN_ID" = :sosen_id 
    AND a."OYA_BN" = :oya_bn 
    AND a."ENTITY_BN" = :entity_bn 
    AND RTRIM (RTRIM (a."ENTITY1_MEI"), '　') LIKE '%' || :entity_1_mei || '%' 
    AND a."SANSHO1_ID" = :sansho_1_id 
    AND RTRIM (RTRIM (a."SANSHO1_MEI"), '　') LIKE '%' || :sansho_1_mei || '%' 
    AND RTRIM (RTRIM (a."SANSHO2_CD"), '　') LIKE '%' || :sansho_2_cd || '%' 
    AND RTRIM (RTRIM (a."SANSHO2_MEI"), '　') LIKE '%' || :sansho_2_mei || '%' 
    AND RTRIM (RTRIM (a."SANSHO3_NO"), '　') LIKE '%' || :sansho_3_no || '%' 
    AND RTRIM (RTRIM (a."SANSHO3_MEI"), '　') LIKE '%' || :sansho_3_mei || '%' 
    AND a."BETSU_SANSHO1_ID" = :betsu_sansho_1_id 
    AND RTRIM (RTRIM (a."BETSU_SANSHO1_MEI"), '　') LIKE '%' || :betsu_sansho_1_mei || '%' 
    AND a."INSERT_TS" = TO_TIMESTAMP (REPLACE (SUBSTR (:insert_ts, 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3') 
    AND a."INSERT_TS" >= TO_TIMESTAMP (REPLACE (SUBSTR (:insert_ts_1 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."INSERT_TS" <= TO_TIMESTAMP (REPLACE (SUBSTR (:insert_ts_2 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."INSERT_USER_ID" = :insert_user_id 
    AND a."UPDATE_TS" = TO_TIMESTAMP (REPLACE (SUBSTR (:update_ts, 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3') 
    AND a."UPDATE_TS" >= TO_TIMESTAMP (REPLACE (SUBSTR (:update_ts_1 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."UPDATE_TS" <= TO_TIMESTAMP (REPLACE (SUBSTR (:update_ts_2 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."UPDATE_USER_ID" = :update_user_id 
    AND CASE WHEN TRIM (a."DELETE_F") IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_F") END IN (:delete_f) 
    AND TRIM (a."STATUS_KB") IN (:status_kb) 
ORDER BY
    a."SOSEN_ID", a."OYA_BN", a."ENTITY_BN"
