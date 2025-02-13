/*
SELECT CONCAT ('DROP TABLE ', table_name, ' CASCADE;') AS '--' FROM information_schema.tables WHERE table_schema = 'emarf' AND table_type = 'BASE TABLE'
UNION
SELECT CONCAT ('DROP VIEW ', table_name, ';') AS '--' FROM information_schema.views WHERE table_schema = 'emarf' 
*/
--
DROP TABLE mb4_cdsansho CASCADE;
DROP TABLE mb4_idsansho CASCADE;
DROP TABLE mb4_nosansho CASCADE;
DROP TABLE mb7_sansho CASCADE;
DROP TABLE mb7_seiyaku CASCADE;
DROP TABLE mhr_busho CASCADE;
DROP TABLE mhr_ninka CASCADE;
DROP TABLE mhr_shokui CASCADE;
DROP TABLE mhr_shozoku CASCADE;
DROP TABLE mhr_user CASCADE;
DROP TABLE msy_kadobi CASCADE;
DROP TABLE msy_kbn CASCADE;
DROP TABLE msy_kbn_val CASCADE;
DROP TABLE msy_tax CASCADE;
DROP TABLE msy_tsuka CASCADE;
DROP TABLE tb0_entity CASCADE;
DROP TABLE tb0_nokey CASCADE;
DROP TABLE tb1_ko CASCADE;
DROP TABLE tb1_ko_rireki CASCADE;
DROP TABLE tb1_mago CASCADE;
DROP TABLE tb1_oya CASCADE;
DROP TABLE tb3_kyodai2 CASCADE;
DROP TABLE tb3_kyodai3 CASCADE;
DROP TABLE tb3_kyodai4 CASCADE;
DROP TABLE tb3_kyodai5 CASCADE;
DROP TABLE tb4_sansho_moto CASCADE;
DROP TABLE tb5_tensei_moto CASCADE;
DROP TABLE tb5_tensei_moto_det CASCADE;
DROP TABLE tb5_tensei_saki CASCADE;
DROP TABLE tb5_tensei_saki_det CASCADE;
DROP TABLE tb5_tensei_yokushi CASCADE;
DROP TABLE tb5_tensei_yokushi_saki1 CASCADE;
DROP TABLE tb5_tensei_yokushi_saki2 CASCADE;
DROP TABLE tb6_shuyaku_moto CASCADE;
DROP TABLE tb6_shuyaku_saki CASCADE;
DROP TABLE tb6_shuyaku_yokushi CASCADE;
DROP TABLE tb6_shuyaku_yokushi_moto1 CASCADE;
DROP TABLE tb6_shuyaku_yokushi_moto2 CASCADE;
DROP TABLE tb7_fukugo CASCADE;
DROP TABLE tb8_henkan_moto CASCADE;
DROP TABLE tb8_henkan_saki CASCADE;
DROP VIEW vb8_henkan;
DROP VIEW vb8_etsuran;

