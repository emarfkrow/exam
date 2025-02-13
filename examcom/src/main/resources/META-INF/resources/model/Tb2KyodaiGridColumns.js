/**
 * 兄弟グリッド定義
 */

let Tb2KyodaiGridColumns = [];

$(function() {
    Tb2KyodaiGridColumns = [
        Column.comma('KYODAI_ID', Messages['Tb2KyodaiGrid.kyodaiId'], 80, 'primaryKey numbering', null),
        Column.text('KYODAI_INFO', Messages['Tb2KyodaiGrid.kyodaiInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2KyodaiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb2KyodaiGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb2KyodaiGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
