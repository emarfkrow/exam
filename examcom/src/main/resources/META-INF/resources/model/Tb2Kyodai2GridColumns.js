/**
 * 兄弟２グリッド定義
 */

let Tb2Kyodai2GridColumns = [];

$(function() {
    Tb2Kyodai2GridColumns = [
        Column.comma('KYODAI_ID', Messages['Tb2Kyodai2Grid.kyodaiId'], 80, 'primaryKey numbering', null),
        Column.text('KYODAI2_INFO', Messages['Tb2Kyodai2Grid.kyodai2Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2Kyodai2Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb2Kyodai2Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb2Kyodai2Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
