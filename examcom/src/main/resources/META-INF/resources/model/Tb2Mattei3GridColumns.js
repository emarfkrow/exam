/**
 * 末弟３グリッド定義
 */

let Tb2Mattei3GridColumns = [];

$(function() {
    Tb2Mattei3GridColumns = [
        Column.text('MATTEI_ID', Messages['Tb2Mattei3Grid.matteiId'], 80, 'primaryKey numbering', null),
        Column.text('MATTEI3_INFO', Messages['Tb2Mattei3Grid.mattei3Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2Mattei3Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb2Mattei3Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb2Mattei3Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
