/**
 * 参照２マスタグリッド定義
 */

let Mb1Sansho2GridColumns = [
    Column.text('SANSHO2_CD', Messages['Mb1Sansho2Grid.sansho2Cd'], 48, 'primaryKey', null),
    Column.text('SANSHO2_MEI', Messages['Mb1Sansho2Grid.sansho2Mei'], 300, 'notblank', null),
    Column.check('DELETE_F', Messages['Mb1Sansho2Grid.deleteF'], 30, ''),
];
