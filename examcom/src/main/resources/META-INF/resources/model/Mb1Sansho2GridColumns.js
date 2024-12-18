/**
 * 参照２マスタグリッド定義
 */

let Mb1Sansho2GridColumns = [
    Column.text('SANSHO2_CD', Messages['Mb1Sansho2Grid.sansho2Cd'], 48, 'primaryKey', null),
    Column.text('SANSHO2_MEI', Messages['Mb1Sansho2Grid.sansho2Mei'], 300, 'notblank', null),
    Column.cell('INSERT_TS', Messages['Mb1Sansho2Grid.insertTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('INSERT_ID', Messages['Mb1Sansho2Grid.insertId'], 80, 'metaInfo', null),
    Column.cell('UPDATE_TS', Messages['Mb1Sansho2Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('UPDATE_ID', Messages['Mb1Sansho2Grid.updateId'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Mb1Sansho2Grid.deleteF'], 30, ''),
];
