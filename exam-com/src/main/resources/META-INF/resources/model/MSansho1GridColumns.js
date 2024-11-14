/**
 * 参照１マスタグリッド定義
 */

let MSansho1GridColumns = [
    Column.comma('SANSHO1_ID', Messages['MSansho1Grid.sansho1Id'], 150, 'primaryKey numbering', null),
    Column.text('SANSHO1_MEI', Messages['MSansho1Grid.sansho1Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['MSansho1Grid.insertDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MSansho1Grid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MSansho1Grid.updateDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MSansho1Grid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MSansho1Grid.deleteF'], 30, ''),
];
