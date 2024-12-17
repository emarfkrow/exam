/**
 * 参照３マスタグリッド定義
 */

let Mb1Sansho3GridColumns = [
    Column.text('SANSHO3_NO', Messages['Mb1Sansho3Grid.sansho3No'], 80, 'primaryKey', null),
    Column.text('SANSHO3_MEI', Messages['Mb1Sansho3Grid.sansho3Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['Mb1Sansho3Grid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['Mb1Sansho3Grid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['Mb1Sansho3Grid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['Mb1Sansho3Grid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Mb1Sansho3Grid.deleteF'], 30, ''),
];
