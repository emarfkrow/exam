/**
 * 複合グリッド定義
 */

let Tb7FukugoGridColumns = [];

$(function() {
    Tb7FukugoGridColumns = [
        Column.refer('SANSHO1_ID', Messages['Tb7FukugoGrid.sansho1Id'], 80, 'primaryKey numbering', 'SANSHO1_MEI'),
        Column.refer('SANSHO2_ID', Messages['Tb7FukugoGrid.sansho2Id'], 80, 'primaryKey numbering', 'SANSHO2_MEI'),
        Column.date('TEKIYO_BI', Messages['Tb7FukugoGrid.tekiyoBi'], 80, 'primaryKey', Slick.Formatters.Extends.Date),
        Column.text('FUKUGO_INFO', Messages['Tb7FukugoGrid.fukugoInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb7FukugoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb7FukugoGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb7FukugoGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
