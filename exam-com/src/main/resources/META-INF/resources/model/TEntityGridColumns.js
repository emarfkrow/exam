/**
 * エンティティグリッド定義
 */

let TEntityGridColumns = [
    Column.refer('SOSEN_ID', Messages['TEntityGrid.sosenId'], 100, 'primaryKey', 'SOSEN_MEI'),
    Column.cell('OYA_SN', Messages['TEntityGrid.oyaSn'], 100, 'primaryKey', null),
    Column.cell('ENTITY_SN', Messages['TEntityGrid.entitySn'], 100, 'primaryKey', null),
    Column.text('ENTITY_MEI', Messages['TEntityGrid.entityMei'], 300, '', null),
    Column.refer('SANSHO1_ID', Messages['TEntityGrid.sansho1Id'], 100, '', 'SANSHO_1_MEI'),
    Column.text('SANSHO1_MEI', Messages['TEntityGrid.sansho1Mei'], 300, '', null),
    Column.refer('SANSHO2_CD', Messages['TEntityGrid.sansho2Cd'], 60, '', 'SANSHO_2_MEI'),
    Column.text('SANSHO2_MEI', Messages['TEntityGrid.sansho2Mei'], 300, '', null),
    Column.refer('BETSU_SANSHO1_ID', Messages['TEntityGrid.betsuSansho1Id'], 100, '', 'BETSU_SANSHO_1_MEI'),
    Column.text('BETSU_SANSHO1_MEI', Messages['TEntityGrid.betsuSansho1Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TEntityGrid.insertDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TEntityGrid.insertBy'], 100, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TEntityGrid.updateDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TEntityGrid.updateBy'], 100, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TEntityGrid.deleteF'], 10, ''),
];
