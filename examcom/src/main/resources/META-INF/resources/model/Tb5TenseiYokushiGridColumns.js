/**
 * 転生抑止グリッド定義
 */

let Tb5TenseiYokushiGridColumns = [];

$(function() {
    Tb5TenseiYokushiGridColumns = [
        Column.text('TENSEI_YOKUSHI_ID', Messages['Tb5TenseiYokushiGrid.tenseiYokushiId'], 80, 'primaryKey numbering', null),
        Column.text('TENSEI_YOKUSHI_INFO', Messages['Tb5TenseiYokushiGrid.tenseiYokushiInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseiYokushiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
