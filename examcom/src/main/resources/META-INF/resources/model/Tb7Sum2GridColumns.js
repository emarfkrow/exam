/**
 * 集約抑止グリッド定義
 */

let Tb7Sum2GridColumns = [];

$(function() {
    Tb7Sum2GridColumns = [
        Column.text('SUM2_ID', Messages['Tb7Sum2Grid.sum2Id'], 90, 'primaryKey numbering', null),
        Column.text('SUM2_INFO', Messages['Tb7Sum2Grid.sum2Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb7Sum2Grid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
