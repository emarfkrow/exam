/**
 * エンティティ１履歴グリッド定義
 */

let Tb1Entity1HisGridColumns = [
    Column.refer('SOSEN_ID', Messages['Tb1Entity1HisGrid.sosenId'], 80, 'primaryKey numbering', 'null'),
    Column.cell('OYA_BN', Messages['Tb1Entity1HisGrid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.cell('ENTITY_BN', Messages['Tb1Entity1HisGrid.entityBn'], 80, 'primaryKey numbering', null),
    Column.cell('HISTORY_BN', Messages['Tb1Entity1HisGrid.historyBn'], 80, 'primaryKey numbering', null),
    Column.cell('ENTITY1_MEI', Messages['Tb1Entity1HisGrid.entity1Mei'], 300, 'notblank', null),
    Column.refer('SANSHO1_ID', Messages['Tb1Entity1HisGrid.sansho1Id'], 80, '', 'null'),
    Column.cell('SANSHO1_MEI', Messages['Tb1Entity1HisGrid.sansho1Mei'], 300, '', null),
    Column.refer('SANSHO2_CD', Messages['Tb1Entity1HisGrid.sansho2Cd'], 48, '', 'null'),
    Column.cell('SANSHO2_MEI', Messages['Tb1Entity1HisGrid.sansho2Mei'], 300, '', null),
    Column.refer('SANSHO3_NO', Messages['Tb1Entity1HisGrid.sansho3No'], 80, '', 'null'),
    Column.cell('SANSHO3_MEI', Messages['Tb1Entity1HisGrid.sansho3Mei'], 300, '', null),
    Column.refer('BETSU_SANSHO1_ID', Messages['Tb1Entity1HisGrid.betsuSansho1Id'], 80, '', 'null'),
    Column.cell('BETSU_SANSHO1_MEI', Messages['Tb1Entity1HisGrid.betsuSansho1Mei'], 300, '', null),
    Column.cell('INSERT_TS', Messages['Tb1Entity1HisGrid.insertTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('INSERT_ID', Messages['Tb1Entity1HisGrid.insertId'], 80, 'metaInfo', null),
    Column.cell('UPDATE_TS', Messages['Tb1Entity1HisGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('UPDATE_ID', Messages['Tb1Entity1HisGrid.updateId'], 80, 'metaInfo', null),
    Column.cell('DELETE_F', Messages['Tb1Entity1HisGrid.deleteF'], 30, '', null),
];
