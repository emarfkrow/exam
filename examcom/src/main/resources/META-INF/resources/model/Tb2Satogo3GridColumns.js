/**
 * 里子３グリッド定義
 */

let Tb2Satogo3GridColumns = [];

$(function() {
    Tb2Satogo3GridColumns = [
        Column.text('SATOGO_ID', Messages['Tb2Satogo3Grid.satogoId'], 90, 'primaryKey numbering', null),
        Column.text('SATOGO3_INFO', Messages['Tb2Satogo3Grid.satogo3Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2Satogo3Grid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
