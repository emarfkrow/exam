/**
 * 単位グリッド定義
 */

let Tb7UnitGridColumns = [];

$(function() {
    Tb7UnitGridColumns = [
        Column.text('UNIT_ID', Messages['Tb7UnitGrid.unitId'], 90, 'primaryKey numbering', null),
        Column.text('UNIT_INFO', Messages['Tb7UnitGrid.unitInfo'], 300, '', null),
        Column.cell('SUM_ID', Messages['Tb7UnitGrid.sumId'], 90, '', null),
        Column.cell('UPDATE_TS', Messages['Tb7UnitGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
