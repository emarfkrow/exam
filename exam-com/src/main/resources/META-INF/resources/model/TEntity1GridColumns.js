/**
 * エンティティ１グリッド定義
 */

let TEntity1GridColumns = [
    Column.refer('SOSEN_ID', Messages['TEntity1Grid.sosenId'], 150, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['TEntity1Grid.oyaBn'], 150, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['TEntity1Grid.entityBn'], 150, 'primaryKey numbering', null),
    Column.text('ENTITY1_MEI', Messages['TEntity1Grid.entity1Mei'], 300, '', null),
    Column.refer('SANSHO1_ID', Messages['TEntity1Grid.sansho1Id'], 150, '', 'null'),
    Column.text('SANSHO1_MEI', Messages['TEntity1Grid.sansho1Mei'], 300, '', null),
    Column.refer('SANSHO2_CD', Messages['TEntity1Grid.sansho2Cd'], 90, '', 'null'),
    Column.text('SANSHO2_MEI', Messages['TEntity1Grid.sansho2Mei'], 300, '', null),
    Column.refer('SANSHO3_NO', Messages['TEntity1Grid.sansho3No'], 150, '', 'null'),
    Column.text('SANSHO3_MEI', Messages['TEntity1Grid.sansho3Mei'], 300, '', null),
    Column.refer('BETSU_SANSHO1_ID', Messages['TEntity1Grid.betsuSansho1Id'], 150, '', 'null'),
    Column.text('BETSU_SANSHO1_MEI', Messages['TEntity1Grid.betsuSansho1Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TEntity1Grid.insertDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TEntity1Grid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TEntity1Grid.updateDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TEntity1Grid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TEntity1Grid.deleteF'], 30, ''),
];
