/**
 * 兄弟２グリッド定義
 */

let Tb2Bros2GridColumns = [];

$(function() {
    Tb2Bros2GridColumns = [
        Column.text('BROS_ID', Messages['Tb2Bros2Grid.brosId'], 80, 'primaryKey numbering', null),
        Column.text('BROS2_INFO', Messages['Tb2Bros2Grid.bros2Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2Bros2Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb2Bros2Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb2Bros2Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
