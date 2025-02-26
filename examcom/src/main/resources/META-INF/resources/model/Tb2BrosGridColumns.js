/**
 * 兄弟グリッド定義
 */

let Tb2BrosGridColumns = [];

$(function() {
    Tb2BrosGridColumns = [
        Column.text('BROS_ID', Messages['Tb2BrosGrid.brosId'], 80, 'primaryKey numbering', null),
        Column.text('BROS_INFO', Messages['Tb2BrosGrid.brosInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2BrosGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb2BrosGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb2BrosGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
