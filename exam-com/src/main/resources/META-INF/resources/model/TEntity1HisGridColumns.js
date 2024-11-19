/**
 * エンティティ１履歴グリッド定義
 */

let TEntity1HisGridColumns = [
    Column.refer('SOSEN_ID', Messages['TEntity1HisGrid.sosenId'], 150, 'primaryKey numbering', 'null'),
    Column.cell('OYA_BN', Messages['TEntity1HisGrid.oyaBn'], 150, 'primaryKey numbering', null),
    Column.cell('ENTITY_BN', Messages['TEntity1HisGrid.entityBn'], 150, 'primaryKey numbering', null),
    Column.cell('HISTORY_BN', Messages['TEntity1HisGrid.historyBn'], 150, 'primaryKey numbering', null),
    Column.cell('ENTITY1_MEI', Messages['TEntity1HisGrid.entity1Mei'], 300, '', null),
    Column.refer('SANSHO1_ID', Messages['TEntity1HisGrid.sansho1Id'], 150, '', 'null'),
    Column.cell('SANSHO1_MEI', Messages['TEntity1HisGrid.sansho1Mei'], 300, '', null),
    Column.refer('SANSHO2_CD', Messages['TEntity1HisGrid.sansho2Cd'], 90, '', 'null'),
    Column.cell('SANSHO2_MEI', Messages['TEntity1HisGrid.sansho2Mei'], 300, '', null),
    Column.refer('SANSHO3_NO', Messages['TEntity1HisGrid.sansho3No'], 150, '', 'null'),
    Column.cell('SANSHO3_MEI', Messages['TEntity1HisGrid.sansho3Mei'], 300, '', null),
    Column.refer('BETSU_SANSHO1_ID', Messages['TEntity1HisGrid.betsuSansho1Id'], 150, '', 'null'),
    Column.cell('BETSU_SANSHO1_MEI', Messages['TEntity1HisGrid.betsuSansho1Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TEntity1HisGrid.insertDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TEntity1HisGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TEntity1HisGrid.updateDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TEntity1HisGrid.updateBy'], 150, 'metaInfo', null),
    Column.cell('DELETE_F', Messages['TEntity1HisGrid.deleteF'], 30, '', null),
];
