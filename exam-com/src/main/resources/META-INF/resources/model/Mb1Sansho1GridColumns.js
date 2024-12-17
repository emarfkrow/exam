/**
 * 参照１マスタグリッド定義
 */

let Mb1Sansho1GridColumns = [
    Column.comma('SANSHO1_ID', Messages['Mb1Sansho1Grid.sansho1Id'], 80, 'primaryKey numbering', null),
    Column.text('SANSHO1_MEI', Messages['Mb1Sansho1Grid.sansho1Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['Mb1Sansho1Grid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['Mb1Sansho1Grid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['Mb1Sansho1Grid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['Mb1Sansho1Grid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Mb1Sansho1Grid.deleteF'], 30, ''),
];
