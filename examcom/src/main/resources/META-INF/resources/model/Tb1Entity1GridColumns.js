/**
 * エンティティ１グリッド定義
 */

let Tb1Entity1GridColumns = [
    Column.comma('SOSEN_ID', Messages['Tb1Entity1Grid.sosenId'], 80, 'primaryKey numbering', null),
    Column.comma('OYA_BN', Messages['Tb1Entity1Grid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['Tb1Entity1Grid.entityBn'], 80, 'primaryKey numbering', null),
    Column.text('ENTITY1_MEI', Messages['Tb1Entity1Grid.entity1Mei'], 300, 'notblank', null),
    Column.refer('SANSHO1_ID', Messages['Tb1Entity1Grid.sansho1Id'], 80, '', 'SANSHO1_MEI'),
    Column.text('SANSHO1_MEI', Messages['Tb1Entity1Grid.sansho1Mei'], 300, '', null),
    Column.refer('SANSHO2_CD', Messages['Tb1Entity1Grid.sansho2Cd'], 48, '', 'SANSHO2_MEI'),
    Column.text('SANSHO2_MEI', Messages['Tb1Entity1Grid.sansho2Mei'], 300, '', null),
    Column.refer('SANSHO3_NO', Messages['Tb1Entity1Grid.sansho3No'], 80, '', 'SANSHO3_MEI'),
    Column.text('SANSHO3_MEI', Messages['Tb1Entity1Grid.sansho3Mei'], 300, '', null),
    Column.refer('BETSU_SANSHO1_ID', Messages['Tb1Entity1Grid.betsuSansho1Id'], 80, '', 'BETSU_SANSHO1_MEI'),
    Column.text('BETSU_SANSHO1_MEI', Messages['Tb1Entity1Grid.betsuSansho1Mei'], 300, '', null),
    Column.check('DELETE_F', Messages['Tb1Entity1Grid.deleteF'], 30, ''),
    Column.select('STATUS_KB', Messages['Tb1Entity1Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
];
