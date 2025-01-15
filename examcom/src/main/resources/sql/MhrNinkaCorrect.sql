SELECT
      a.`BUSHO_ID`
    , (SELECT r0.`BUSHO_MEI` FROM MHR_BUSHO r0 WHERE r0.`BUSHO_ID` = a.`BUSHO_ID`) AS `BUSHO_MEI`
    , a.`SHOKUI_ID`
    , (SELECT r1.`SHOKUI_MEI` FROM MHR_SHOKUI r1 WHERE r1.`SHOKUI_ID` = a.`SHOKUI_ID`) AS `SHOKUI_MEI`
    , a.`KINO_NM`
    , a.`KENGEN_KB`
    , a.`KAISHI_BI` AS KAISHI_BI
    , a.`SHURYO_BI` AS SHURYO_BI
    , a.`INSERT_TS` AS INSERT_TS
    , a.`INSERT_USER_ID`
    , (SELECT r2.`USER_SEI` FROM MHR_USER r2 WHERE r2.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`
    , a.`UPDATE_TS` AS UPDATE_TS
    , a.`UPDATE_USER_ID`
    , (SELECT r3.`USER_SEI` FROM MHR_USER r3 WHERE r3.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
    , a.`STATUS_KB`
FROM
    MHR_NINKA a 
    INNER JOIN MHR_BUSHO c1 
        ON 1 = 1 
        AND IFNULL (c1.DELETE_F, 0) != 1 
        AND IFNULL (c1.KAISHI_BI, sysdate()) <= sysdate() 
        AND DATE_ADD(IFNULL (c1.SHURYO_BI, sysdate()), INTERVAL 1 DAY) > sysdate()
        AND c1.BUSHO_ID = a.BUSHO_ID 
    INNER JOIN MHR_SHOKUI c2 
        ON 1 = 1 
        AND IFNULL (c2.DELETE_F, 0) != 1 
        AND IFNULL (c2.KAISHI_BI, sysdate()) <= sysdate() 
        AND DATE_ADD(IFNULL (c2.SHURYO_BI, sysdate()), INTERVAL 1 DAY) > sysdate()
        AND c2.SHOKUI_ID = a.SHOKUI_ID 
WHERE
    1 = 1 
    AND IFNULL (a.DELETE_F, 0) != 1 
    AND IFNULL (a.KAISHI_BI, sysdate()) <= sysdate() 
    AND DATE_ADD(IFNULL (a.SHURYO_BI, sysdate()), INTERVAL 1 DAY) > sysdate() 
    AND a.`BUSHO_ID` = :busho_id 
    AND a.`SHOKUI_ID` = :shokui_id 
    AND TRIM(TRAILING ' ' FROM a.`KINO_NM`) LIKE CONCAT ('%', :kino_nm, '%') 
    AND TRIM (a.`KENGEN_KB`) IN (:kengen_kb) 
    AND a.`KAISHI_BI` = :kaishi_bi 
    AND a.`KAISHI_BI` >= :kaishi_bi_1 
    AND a.`KAISHI_BI` <= :kaishi_bi_2 
    AND a.`SHURYO_BI` = :shuryo_bi 
    AND a.`SHURYO_BI` >= :shuryo_bi_1 
    AND a.`SHURYO_BI` <= :shuryo_bi_2 
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
    a.`BUSHO_ID`, a.`SHOKUI_ID`, a.`KINO_NM`
