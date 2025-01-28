/**
 * 参照２マスタグリッド定義
 */

let Mb7Sansho2GridColumns = [];

$(function() {
    Mb7Sansho2GridColumns = [
        Column.comma('SANSHO2_ID', Messages['Mb7Sansho2Grid.sansho2Id'], 80, 'primaryKey numbering', null),
        Column.text('SANSHO2_MEI', Messages['Mb7Sansho2Grid.sansho2Mei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Mb7Sansho2Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Mb7Sansho2Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Mb7Sansho2Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
