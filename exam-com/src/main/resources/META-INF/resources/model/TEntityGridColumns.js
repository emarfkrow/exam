/**
 * エンティティグリッド定義
 */

let TEntityGridColumns = [
    Column.refer('SOSEN_ID', Messages['TEntityGrid.sosenId'], 150, 'primaryKey numbering', 'null'),
    Column.comma('OYA_SN', Messages['TEntityGrid.oyaSn'], 150, 'primaryKey numbering', null),
    Column.comma('ENTITY_SN', Messages['TEntityGrid.entitySn'], 150, 'primaryKey numbering', null),
    Column.text('ENTITY_MEI', Messages['TEntityGrid.entityMei'], 300, '', null),
    Column.refer('SANSHO1_ID', Messages['TEntityGrid.sansho1Id'], 150, '', 'null'),
    Column.text('SANSHO1_MEI', Messages['TEntityGrid.sansho1Mei'], 300, '', null),
    Column.refer('SANSHO2_CD', Messages['TEntityGrid.sansho2Cd'], 90, '', 'null'),
    Column.text('SANSHO2_MEI', Messages['TEntityGrid.sansho2Mei'], 300, '', null),
    Column.refer('BETSU_SANSHO1_ID', Messages['TEntityGrid.betsuSansho1Id'], 150, '', 'null'),
    Column.text('BETSU_SANSHO1_MEI', Messages['TEntityGrid.betsuSansho1Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TEntityGrid.insertDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TEntityGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TEntityGrid.updateDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TEntityGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TEntityGrid.deleteF'], 30, ''),
];
