/**
 * 末弟グリッド定義
 */

let Tb2MatteiGridColumns = [];

$(function() {
    Tb2MatteiGridColumns = [
        Column.text('MATTEI_ID', Messages['Tb2MatteiGrid.matteiId'], 80, 'primaryKey numbering', null),
        Column.text('MATTEI_INFO', Messages['Tb2MatteiGrid.matteiInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2MatteiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb2MatteiGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb2MatteiGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
