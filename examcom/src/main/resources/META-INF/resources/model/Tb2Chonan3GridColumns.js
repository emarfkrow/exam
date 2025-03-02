/**
 * 長男３グリッド定義
 */

let Tb2Chonan3GridColumns = [];

$(function() {
    Tb2Chonan3GridColumns = [
        Column.text('CHONAN_ID', Messages['Tb2Chonan3Grid.chonanId'], 80, 'primaryKey numbering', null),
        Column.text('CHONAN3_INFO', Messages['Tb2Chonan3Grid.chonan3Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2Chonan3Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
