/**
 * 孤児２グリッド定義
 */

let Tb2Koji2GridColumns = [];

$(function() {
    Tb2Koji2GridColumns = [
        Column.comma('KOJI_ID', Messages['Tb2Koji2Grid.kojiId'], 80, 'primaryKey numbering', null),
        Column.text('KOJI2_INFO', Messages['Tb2Koji2Grid.koji2Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2Koji2Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb2Koji2Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb2Koji2Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
