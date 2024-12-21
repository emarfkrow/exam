/**
 * 参照１マスタグリッド定義
 */

let Mb1Sansho1GridColumns = [
    Column.comma('SANSHO1_ID', Messages['Mb1Sansho1Grid.sansho1Id'], 80, 'primaryKey numbering', null),
    Column.text('SANSHO1_MEI', Messages['Mb1Sansho1Grid.sansho1Mei'], 300, 'notblank', null),
    Column.check('DELETE_F', Messages['Mb1Sansho1Grid.deleteF'], 30, ''),
];