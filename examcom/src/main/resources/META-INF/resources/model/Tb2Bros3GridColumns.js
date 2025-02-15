/**
 * 兄弟３グリッド定義
 */

let Tb2Bros3GridColumns = [];

$(function() {
    Tb2Bros3GridColumns = [
        Column.comma('BROS_ID', Messages['Tb2Bros3Grid.brosId'], 80, 'primaryKey numbering', null),
        Column.text('BROS3_INFO', Messages['Tb2Bros3Grid.bros3Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2Bros3Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb2Bros3Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb2Bros3Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
