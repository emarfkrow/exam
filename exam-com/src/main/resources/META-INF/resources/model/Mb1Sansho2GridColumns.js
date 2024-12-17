/**
 * 参照２マスタグリッド定義
 */

let Mb1Sansho2GridColumns = [
    Column.text('SANSHO2_CD', Messages['Mb1Sansho2Grid.sansho2Cd'], 48, 'primaryKey', null),
    Column.text('SANSHO2_MEI', Messages['Mb1Sansho2Grid.sansho2Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['Mb1Sansho2Grid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['Mb1Sansho2Grid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['Mb1Sansho2Grid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['Mb1Sansho2Grid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Mb1Sansho2Grid.deleteF'], 30, ''),
];
