SELECT
      a.`henkan_moto_id`
    , a.`henkan_moto_info`
    , a.`hikitsuida_info`
FROM
    VB9_ETSURAN a 
WHERE
    1 = 1 
    AND a.`henkan_moto_id` = :henkan_moto_id 
    AND UPPER (TRIM(TRAILING ' ' FROM a.`henkan_moto_info`)) LIKE UPPER (CONCAT ('%', :henkan_moto_info, '%')) 
    AND UPPER (TRIM(TRAILING ' ' FROM a.`hikitsuida_info`)) LIKE UPPER (CONCAT ('%', :hikitsuida_info, '%')) 
