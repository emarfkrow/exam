/**
 * 転生抑止グリッド定義
 */

let Tb5TenseiyokushiGridColumns = [];

$(function() {
    Tb5TenseiyokushiGridColumns = [
        Column.comma('TENSEIYOKUSHI_ID', Messages['Tb5TenseiyokushiGrid.tenseiyokushiId'], 80, 'primaryKey numbering', null),
        Column.text('TENSEIYOKUSHI_INFO', Messages['Tb5TenseiyokushiGrid.tenseiyokushiInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseiyokushiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb5TenseiyokushiGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb5TenseiyokushiGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
