/**
 * 孤児グリッド定義
 */

let Tb2KojiGridColumns = [];

$(function() {
    Tb2KojiGridColumns = [
        Column.comma('KOJI_ID', Messages['Tb2KojiGrid.kojiId'], 80, 'primaryKey numbering', null),
        Column.text('KOJI_INFO', Messages['Tb2KojiGrid.kojiInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2KojiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb2KojiGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb2KojiGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
