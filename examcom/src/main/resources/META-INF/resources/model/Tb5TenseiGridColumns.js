/**
 * 転生グリッド定義
 */

let Tb5TenseiGridColumns = [];

$(function() {
    Tb5TenseiGridColumns = [
        Column.text('TENSEI_ID', Messages['Tb5TenseiGrid.tenseiId'], 90, 'primaryKey numbering', null),
        Column.text('TENSEI_INFO', Messages['Tb5TenseiGrid.tenseiInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseiGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
