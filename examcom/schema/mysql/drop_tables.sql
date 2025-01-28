/*
SELECT CONCAT ('DROP TABLE ', table_name, ' CASCADE;') AS '--' FROM information_schema.tables WHERE table_schema = 'emarf' AND table_type = 'BASE TABLE'
UNION
SELECT CONCAT ('DROP VIEW ', table_name, ';') AS '--' FROM information_schema.views WHERE table_schema = 'emarf' 
*/
--
DROP TABLE mb4_cdsansho CASCADE;
DROP VIEW vb1_shison;
DROP VIEW vb2_entity;

