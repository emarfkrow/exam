/**
 * 参照３マスタグリッド定義
 */

let Mb1Sansho3GridColumns = [];

$(function() {
    Mb1Sansho3GridColumns = [
        Column.text('SANSHO3_NO', Messages['Mb1Sansho3Grid.sansho3No'], 80, 'primaryKey', null),
        Column.text('SANSHO3_MEI', Messages['Mb1Sansho3Grid.sansho3Mei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Mb1Sansho3Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Mb1Sansho3Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Mb1Sansho3Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
