/**
 * 参照１マスタグリッド定義
 */

let Mb7Sansho1GridColumns = [];

$(function() {
    Mb7Sansho1GridColumns = [
        Column.comma('SANSHO1_ID', Messages['Mb7Sansho1Grid.sansho1Id'], 80, 'primaryKey numbering', null),
        Column.text('SANSHO1_MEI', Messages['Mb7Sansho1Grid.sansho1Mei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Mb7Sansho1Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Mb7Sansho1Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Mb7Sansho1Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
