/**
 * 転生抑止グリッド定義
 */

let Tb5TenseiYokushiGridColumns = [];

$(function() {
    Tb5TenseiYokushiGridColumns = [
        Column.comma('TENSEI_YOKUSHI_ID', Messages['Tb5TenseiYokushiGrid.tenseiYokushiId'], 80, 'primaryKey numbering', null),
        Column.text('TENSEI_YOKUSHI_INFO', Messages['Tb5TenseiYokushiGrid.tenseiYokushiInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseiYokushiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb5TenseiYokushiGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb5TenseiYokushiGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
