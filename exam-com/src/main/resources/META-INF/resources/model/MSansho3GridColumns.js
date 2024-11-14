/**
 * 参照３マスタグリッド定義
 */

let MSansho3GridColumns = [
    Column.text('SANSHO3_NO', Messages['MSansho3Grid.sansho3No'], 150, 'primaryKey', null),
    Column.text('SANSHO3_MEI', Messages['MSansho3Grid.sansho3Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['MSansho3Grid.insertDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MSansho3Grid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MSansho3Grid.updateDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MSansho3Grid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MSansho3Grid.deleteF'], 30, ''),
];
