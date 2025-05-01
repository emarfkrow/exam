/**
 * 転生先グリッド定義
 */

let Tb5TenseiToGridColumns = [];

$(function() {
    Tb5TenseiToGridColumns = [
        Column.text('TENSEI_TO_ID', Messages['Tb5TenseiToGrid.tenseiToId'], 90, 'primaryKey numbering', null),
        Column.cell('TENSEI_ID', Messages['Tb5TenseiToGrid.tenseiId'], 90, 'notblank', null),
        Column.text('TENSEI_INFO', Messages['Tb5TenseiToGrid.tenseiInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseiToGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
