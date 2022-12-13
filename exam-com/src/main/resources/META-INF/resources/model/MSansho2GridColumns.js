/**
 * 参照２マスタグリッド定義
 */

let MSansho2GridColumns = [
    Column.text('SANSHO2_CD', Messages['MSansho2Grid.sansho2Cd'], 90, 'primaryKey', null),
    Column.text('SANSHO2_MEI', Messages['MSansho2Grid.sansho2Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['MSansho2Grid.insertDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MSansho2Grid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MSansho2Grid.updateDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MSansho2Grid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MSansho2Grid.deleteF'], 30, ''),
];
