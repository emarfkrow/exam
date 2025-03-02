/**
 * 長男グリッド定義
 */

let Tb2ChonanGridColumns = [];

$(function() {
    Tb2ChonanGridColumns = [
        Column.text('CHONAN_ID', Messages['Tb2ChonanGrid.chonanId'], 80, 'primaryKey numbering', null),
        Column.text('CHONAN_INFO', Messages['Tb2ChonanGrid.chonanInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2ChonanGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
