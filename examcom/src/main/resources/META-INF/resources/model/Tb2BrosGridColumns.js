/**
 * 兄弟グリッド定義
 */

let Tb2BrosGridColumns = [];

$(function() {
    Tb2BrosGridColumns = [
        Column.text('BROS_ID', Messages['Tb2BrosGrid.brosId'], 90, 'primaryKey numbering', null),
        Column.text('BROS_INFO', Messages['Tb2BrosGrid.brosInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2BrosGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
