/**
 * 兄弟３グリッド定義
 */

let Tb2Kyodai3GridColumns = [];

$(function() {
    Tb2Kyodai3GridColumns = [
        Column.comma('KYODAI_ID', Messages['Tb2Kyodai3Grid.kyodaiId'], 80, 'primaryKey numbering', null),
        Column.text('KYODAI3_INFO', Messages['Tb2Kyodai3Grid.kyodai3Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2Kyodai3Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb2Kyodai3Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb2Kyodai3Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
