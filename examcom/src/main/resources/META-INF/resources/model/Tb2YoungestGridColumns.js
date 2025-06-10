/**
 * 末弟グリッド定義
 */

let Tb2YoungestGridColumns = [];

$(function() {
    Tb2YoungestGridColumns = [
        Column.text('KYODAI_ID', Messages['Tb2YoungestGrid.kyodaiId'], 90, 'primaryKey numbering', null),
        Column.text('YOUNGEST_INFO', Messages['Tb2YoungestGrid.youngestInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2YoungestGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
