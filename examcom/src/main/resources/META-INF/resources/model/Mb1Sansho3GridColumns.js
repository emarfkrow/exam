/**
 * 参照３マスタグリッド定義
 */

let Mb1Sansho3GridColumns = [
    Column.text('SANSHO3_NO', Messages['Mb1Sansho3Grid.sansho3No'], 80, 'primaryKey', null),
    Column.text('SANSHO3_MEI', Messages['Mb1Sansho3Grid.sansho3Mei'], 300, 'notblank', null),
    Column.cell('INSERT_TS', Messages['Mb1Sansho3Grid.insertTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('INSERT_ID', Messages['Mb1Sansho3Grid.insertId'], 80, 'metaInfo', null),
    Column.cell('UPDATE_TS', Messages['Mb1Sansho3Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('UPDATE_ID', Messages['Mb1Sansho3Grid.updateId'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Mb1Sansho3Grid.deleteF'], 30, ''),
];
