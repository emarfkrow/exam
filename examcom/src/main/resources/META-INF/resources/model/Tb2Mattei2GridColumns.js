/**
 * 末弟２グリッド定義
 */

let Tb2Mattei2GridColumns = [];

$(function() {
    Tb2Mattei2GridColumns = [
        Column.comma('MATTEI_ID', Messages['Tb2Mattei2Grid.matteiId'], 80, 'primaryKey numbering', null),
        Column.text('MATTEI2_INFO', Messages['Tb2Mattei2Grid.mattei2Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2Mattei2Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb2Mattei2Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb2Mattei2Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
