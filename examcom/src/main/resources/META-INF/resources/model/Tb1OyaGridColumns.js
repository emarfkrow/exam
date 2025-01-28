/**
 * 親グリッド定義
 */

let Tb1OyaGridColumns = [];

$(function() {
    Tb1OyaGridColumns = [
        Column.comma('OYA_ID', Messages['Tb1OyaGrid.oyaId'], 80, 'primaryKey numbering', null),
        Column.text('OYA_INFO', Messages['Tb1OyaGrid.oyaInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb1OyaGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb1OyaGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb1OyaGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
