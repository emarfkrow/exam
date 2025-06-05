SELECT
      a.`table_name`
    , a.`src_id`
    , a.`dest_info`
FROM
    TB9_HENKAN a 
WHERE
    1 = 1 
    AND UPPER (TRIM(TRAILING ' ' FROM a.`table_name`)) LIKE UPPER (CONCAT ('%', :table_name, '%')) 
    AND a.`src_id` = :src_id 
    AND UPPER (TRIM(TRAILING ' ' FROM a.`dest_info`)) LIKE UPPER (CONCAT ('%', :dest_info, '%')) 
