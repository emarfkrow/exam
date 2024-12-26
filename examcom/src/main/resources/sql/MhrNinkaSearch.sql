SELECT
      a."BUSHO_ID"
    , (SELECT r1."BUSHO_MEI" FROM MHR_BUSHO r1 WHERE r1."BUSHO_ID" = a."BUSHO_ID") AS "BUSHO_MEI"
    , a."SHOKUI_ID"
    , (SELECT r2."SHOKUI_MEI" FROM MHR_SHOKUI r2 WHERE r2."SHOKUI_ID" = a."SHOKUI_ID") AS "SHOKUI_MEI"
    , a."KINO_NM"
    , a."KENGEN_KB"
    , TO_CHAR (a."KAISHI_BI", 'YYYY-MM-DD') AS KAISHI_BI
    , TO_CHAR (a."SHURYO_BI", 'YYYY-MM-DD') AS SHURYO_BI
    , TO_CHAR (a."INSERT_TS", 'YYYY-MM-DD HH24:MI:SS.FF3') AS INSERT_TS
    , a."INSERT_ID"
    , TO_CHAR (a."UPDATE_TS", 'YYYY-MM-DD HH24:MI:SS.FF3') AS UPDATE_TS
    , a."UPDATE_ID"
    , RTRIM (RTRIM (a."DELETE_F"), '　') AS DELETE_F
    , a."STATUS_KB"
FROM
    MHR_NINKA a 
WHERE
    1 = 1 
    AND a."BUSHO_ID" = :busho_id 
    AND a."SHOKUI_ID" = :shokui_id 
    AND RTRIM (RTRIM (a."KINO_NM"), '　') LIKE '%' || :kino_nm || '%' 
    AND TRIM (a."KENGEN_KB") IN (:kengen_kb) 
    AND a."KAISHI_BI" = TO_DATE (SUBSTR (:kaishi_bi, 0, 10), 'YYYY-MM-DD') 
    AND a."KAISHI_BI" >= TO_DATE (SUBSTR (:kaishi_bi_1 , 0, 10), 'YYYY-MM-DD')
    AND a."KAISHI_BI" <= TO_DATE (SUBSTR (:kaishi_bi_2 , 0, 10), 'YYYY-MM-DD')
    AND a."SHURYO_BI" = TO_DATE (SUBSTR (:shuryo_bi, 0, 10), 'YYYY-MM-DD') 
    AND a."SHURYO_BI" >= TO_DATE (SUBSTR (:shuryo_bi_1 , 0, 10), 'YYYY-MM-DD')
    AND a."SHURYO_BI" <= TO_DATE (SUBSTR (:shuryo_bi_2 , 0, 10), 'YYYY-MM-DD')
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
    a."BUSHO_ID", a."SHOKUI_ID", a."KINO_NM"
