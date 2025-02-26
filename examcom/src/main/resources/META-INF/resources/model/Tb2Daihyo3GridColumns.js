/**
 * 代表３グリッド定義
 */

let Tb2Daihyo3GridColumns = [];

$(function() {
    Tb2Daihyo3GridColumns = [
        Column.text('DAIHYO_ID', Messages['Tb2Daihyo3Grid.daihyoId'], 80, 'primaryKey numbering', null),
        Column.text('DAIHYO3_INFO', Messages['Tb2Daihyo3Grid.daihyo3Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2Daihyo3Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb2Daihyo3Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb2Daihyo3Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
