/**
 * 里子グリッド定義
 */

let Tb2SatogoGridColumns = [];

$(function() {
    Tb2SatogoGridColumns = [
        Column.text('SATOGO_ID', Messages['Tb2SatogoGrid.satogoId'], 90, 'primaryKey numbering', null),
        Column.text('SATOGO_INFO', Messages['Tb2SatogoGrid.satogoInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2SatogoGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
