/**
 * 単位２グリッド定義
 */

let Tb7Unit2GridColumns = [];

$(function() {
    Tb7Unit2GridColumns = [
        Column.text('UNIT2_ID', Messages['Tb7Unit2Grid.unit2Id'], 90, 'primaryKey numbering', null),
        Column.text('SUM2_ID', Messages['Tb7Unit2Grid.sum2Id'], 90, '', null),
        Column.cell('UPDATE_TS', Messages['Tb7Unit2Grid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
