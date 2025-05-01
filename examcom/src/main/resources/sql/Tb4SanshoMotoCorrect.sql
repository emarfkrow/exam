SELECT
      a.`REF_ID`
    , a.`IDREF_ID`
    , a.`IDREF_MEI`
    , TRIM(TRAILING ' ' FROM a.`CDREF_CD`) AS `CDREF_CD`
    , a.`CDREF_MEI`
    , TRIM(TRAILING ' ' FROM a.`NOREF_NO`) AS `NOREF_NO`
    , a.`NOREF_MEI`
    , a.`BETSU_IDREF_ID`
    , (SELECT r0.`IDREF_MEI` FROM MB4_IDSANSHO r0 WHERE r0.`IDREF_ID` = a.`BETSU_IDREF_ID`) AS `BETSU_IDREF_MEI`
    , a.`INSERT_TS` AS `INSERT_TS`
    , a.`INSERT_USER_ID`
    , (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`
    , a.`UPDATE_TS` AS `UPDATE_TS`
    , a.`UPDATE_USER_ID`
    , (SELECT r2.`USER_SEI` FROM MHR_USER r2 WHERE r2.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`
FROM
    TB4_SANSHO_MOTO a 
WHERE
    1 = 1 
    AND a.`REF_ID` = :ref_id 
    AND a.`IDREF_ID` = :idref_id 
    AND UPPER (TRIM(TRAILING ' ' FROM a.`IDREF_MEI`)) LIKE UPPER (CONCAT ('%', :idref_mei, '%')) 
    AND UPPER (TRIM(TRAILING ' ' FROM a.`CDREF_CD`)) LIKE UPPER (CONCAT ('%', :cdref_cd, '%')) 
    AND UPPER (TRIM(TRAILING ' ' FROM a.`CDREF_MEI`)) LIKE UPPER (CONCAT ('%', :cdref_mei, '%')) 
    AND UPPER (TRIM(TRAILING ' ' FROM a.`NOREF_NO`)) LIKE UPPER (CONCAT ('%', :noref_no, '%')) 
    AND UPPER (TRIM(TRAILING ' ' FROM a.`NOREF_MEI`)) LIKE UPPER (CONCAT ('%', :noref_mei, '%')) 
    AND a.`BETSU_IDREF_ID` = :betsu_idref_id 
    AND a.`INSERT_TS` = :insert_ts 
    AND a.`INSERT_TS` >= :insert_ts_1 
    AND a.`INSERT_TS` <= :insert_ts_2 
    AND a.`INSERT_USER_ID` = :insert_user_id 
    AND a.`UPDATE_TS` = :update_ts 
    AND a.`UPDATE_TS` >= :update_ts_1 
    AND a.`UPDATE_TS` <= :update_ts_2 
    AND a.`UPDATE_USER_ID` = :update_user_id 
ORDER BY
    a.`REF_ID`
