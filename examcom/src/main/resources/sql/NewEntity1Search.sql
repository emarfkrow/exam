SELECT
      a.`TABLE_NAME`
    , a.`SRC_ID`
    , a.`DEST_INFO`
FROM
    NEW_ENTITY1 a 
WHERE
    1 = 1 
    AND UPPER (TRIM(TRAILING ' ' FROM a.`TABLE_NAME`)) LIKE UPPER (CONCAT ('%', :table_name, '%')) 
    AND a.`SRC_ID` = :src_id 
    AND UPPER (TRIM(TRAILING ' ' FROM a.`DEST_INFO`)) LIKE UPPER (CONCAT ('%', :dest_info, '%')) 
