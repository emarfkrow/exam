SELECT
      a."COLUMN_A"
    , a."COLUMN_B"
    , a."COLUMN_C"
    , a."COLUMN_D"
    , a."COLUMN_E"
    , TO_CHAR (a."INSERT_TS", 'YYYY-MM-DD HH24:MI:SS.FF3') AS INSERT_TS
    , a."INSERT_ID"
    , TO_CHAR (a."UPDATE_TS", 'YYYY-MM-DD HH24:MI:SS.FF3') AS UPDATE_TS
    , a."UPDATE_ID"
    , RTRIM (RTRIM (a."DELETE_F"), '　') AS DELETE_F
    , a."STATUS_KB"
FROM
    TB2_NO_PK a 
WHERE
    1 = 1 
    AND RTRIM (RTRIM (a."COLUMN_A"), '　') LIKE '%' || :column_a || '%' 
    AND RTRIM (RTRIM (a."COLUMN_B"), '　') LIKE '%' || :column_b || '%' 
    AND RTRIM (RTRIM (a."COLUMN_C"), '　') LIKE '%' || :column_c || '%' 
    AND RTRIM (RTRIM (a."COLUMN_D"), '　') LIKE '%' || :column_d || '%' 
    AND a."COLUMN_D" >= :column_d_1 
    AND a."COLUMN_D" <= :column_d_2 
    AND RTRIM (RTRIM (a."COLUMN_E"), '　') LIKE '%' || :column_e || '%' 
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
    a."COLUMN_A"
