/**
 * エンティティ履歴グリッド定義
 */

let TEntityHisGridColumns = [
    Column.refer('SOSEN_ID', Messages['TEntityHisGrid.sosenId'], 150, 'primaryKey numbering', 'null'),
    Column.comma('OYA_SN', Messages['TEntityHisGrid.oyaSn'], 150, 'primaryKey numbering', null),
    Column.comma('ENTITY_SN', Messages['TEntityHisGrid.entitySn'], 150, 'primaryKey numbering', null),
    Column.comma('HISTORY_SN', Messages['TEntityHisGrid.historySn'], 150, 'primaryKey numbering', null),
    Column.text('ENTITY_MEI', Messages['TEntityHisGrid.entityMei'], 300, '', null),
    Column.refer('SANSHO1_ID', Messages['TEntityHisGrid.sansho1Id'], 150, '', 'null'),
    Column.text('SANSHO1_MEI', Messages['TEntityHisGrid.sansho1Mei'], 300, '', null),
    Column.refer('SANSHO2_CD', Messages['TEntityHisGrid.sansho2Cd'], 90, '', 'null'),
    Column.text('SANSHO2_MEI', Messages['TEntityHisGrid.sansho2Mei'], 300, '', null),
    Column.refer('BETSU_SANSHO1_ID', Messages['TEntityHisGrid.betsuSansho1Id'], 150, '', 'null'),
    Column.text('BETSU_SANSHO1_MEI', Messages['TEntityHisGrid.betsuSansho1Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TEntityHisGrid.insertDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TEntityHisGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TEntityHisGrid.updateDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TEntityHisGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TEntityHisGrid.deleteF'], 30, ''),
];
