/**
 * 孤児３グリッド定義
 */

let Tb2Koji3GridColumns = [];

$(function() {
    Tb2Koji3GridColumns = [
        Column.comma('KOJI_ID', Messages['Tb2Koji3Grid.kojiId'], 80, 'primaryKey numbering', null),
        Column.text('KOJI3_INFO', Messages['Tb2Koji3Grid.koji3Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2Koji3Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb2Koji3Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb2Koji3Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
