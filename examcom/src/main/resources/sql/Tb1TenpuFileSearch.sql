SELECT
      a."SOSEN_ID"
    , a."OYA_BN"
    , a."ENTITY_BN"
    , a."TENPU_FILE_BN"
    , a."TENPU_FILE_MEI"
    , a."TENPU_FILE_PATH"
    , TO_CHAR (a."INSERT_TS", 'YYYY-MM-DD HH24:MI:SS.FF3') AS INSERT_TS
    , a."INSERT_ID"
    , TO_CHAR (a."UPDATE_TS", 'YYYY-MM-DD HH24:MI:SS.FF3') AS UPDATE_TS
    , a."UPDATE_ID"
    , RTRIM (RTRIM (a."DELETE_F"), '　') AS DELETE_F
    , a."STATUS_KB"
FROM
    TB1_TENPU_FILE a 
WHERE
    1 = 1 
    AND a."SOSEN_ID" = :sosen_id 
    AND a."OYA_BN" = :oya_bn 
    AND a."ENTITY_BN" = :entity_bn 
    AND a."TENPU_FILE_BN" = :tenpu_file_bn 
    AND RTRIM (RTRIM (a."TENPU_FILE_MEI"), '　') LIKE '%' || :tenpu_file_mei || '%' 
    AND RTRIM (RTRIM (a."TENPU_FILE_PATH"), '　') LIKE '%' || :tenpu_file_path || '%' 
    AND a."INSERT_TS" = TO_TIMESTAMP (REPLACE (SUBSTR (:insert_ts, 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3') 
    AND a."INSERT_TS" >= TO_TIMESTAMP (REPLACE (SUBSTR (:insert_ts_1 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."INSERT_TS" <= TO_TIMESTAMP (REPLACE (SUBSTR (:insert_ts_2 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."INSERT_ID" = :insert_id 
    AND a."UPDATE_TS" = TO_TIMESTAMP (REPLACE (SUBSTR (:update_ts, 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3') 
    AND a."UPDATE_TS" >= TO_TIMESTAMP (REPLACE (SUBSTR (:update_ts_1 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."UPDATE_TS" <= TO_TIMESTAMP (REPLACE (SUBSTR (:update_ts_2 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."UPDATE_ID" = :update_id 
    AND CASE WHEN TRIM (a."DELETE_F") IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_F") END IN (:delete_f) 
    AND TRIM (a."STATUS_KB") IN (:status_kb) 
ORDER BY
    a."SOSEN_ID", a."OYA_BN", a."ENTITY_BN", a."TENPU_FILE_BN"
