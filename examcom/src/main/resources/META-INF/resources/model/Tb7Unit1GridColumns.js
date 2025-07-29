/**
 * 単位１グリッド定義
 */

let Tb7Unit1GridColumns = [];

$(function() {
    Tb7Unit1GridColumns = [
        Column.text('UNIT1_ID', Messages['Tb7Unit1Grid.unit1Id'], 90, 'primaryKey numbering', null),
        Column.text('SUM2_ID', Messages['Tb7Unit1Grid.sum2Id'], 90, '', null),
        Column.cell('UPDATE_TS', Messages['Tb7Unit1Grid.updateTs'], 207, 'metaInfo optLock', Slick.Formatters.Extends.Timestamp),
    ];
});
