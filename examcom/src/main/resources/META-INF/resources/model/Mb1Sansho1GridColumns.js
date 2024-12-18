/**
 * 参照１マスタグリッド定義
 */

let Mb1Sansho1GridColumns = [
    Column.comma('SANSHO1_ID', Messages['Mb1Sansho1Grid.sansho1Id'], 80, 'primaryKey numbering', null),
    Column.text('SANSHO1_MEI', Messages['Mb1Sansho1Grid.sansho1Mei'], 300, 'notblank', null),
    Column.cell('INSERT_TS', Messages['Mb1Sansho1Grid.insertTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('INSERT_ID', Messages['Mb1Sansho1Grid.insertId'], 80, 'metaInfo', null),
    Column.cell('UPDATE_TS', Messages['Mb1Sansho1Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('UPDATE_ID', Messages['Mb1Sansho1Grid.updateId'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Mb1Sansho1Grid.deleteF'], 30, ''),
];
