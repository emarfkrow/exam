/**
 * 里子２グリッド定義
 */

let Tb2Satogo2GridColumns = [];

$(function() {
    Tb2Satogo2GridColumns = [
        Column.text('SATOGO_ID', Messages['Tb2Satogo2Grid.satogoId'], 90, 'primaryKey numbering', null),
        Column.text('SATOGO2_INFO', Messages['Tb2Satogo2Grid.satogo2Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2Satogo2Grid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
