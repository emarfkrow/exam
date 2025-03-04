SELECT
      a.`table_name`
    , a.`henkan_moto_id`
    , a.`henkan_moto_info`
    , a.`hikitsuida_info`
FROM
    VB9_HENKAN a 
WHERE
    1 = 1 
    AND TRIM(TRAILING ' ' FROM a.`table_name`) LIKE CONCAT ('%', :table_name, '%') 
    AND a.`henkan_moto_id` = :henkan_moto_id 
    AND TRIM(TRAILING ' ' FROM a.`henkan_moto_info`) LIKE CONCAT ('%', :henkan_moto_info, '%') 
    AND TRIM(TRAILING ' ' FROM a.`hikitsuida_info`) LIKE CONCAT ('%', :hikitsuida_info, '%') 
