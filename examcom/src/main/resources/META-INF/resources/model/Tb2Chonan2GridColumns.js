/**
 * 長男２グリッド定義
 */

let Tb2Chonan2GridColumns = [];

$(function() {
    Tb2Chonan2GridColumns = [
        Column.text('CHONAN_ID', Messages['Tb2Chonan2Grid.chonanId'], 90, 'primaryKey numbering', null),
        Column.text('CHONAN2_INFO', Messages['Tb2Chonan2Grid.chonan2Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2Chonan2Grid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
