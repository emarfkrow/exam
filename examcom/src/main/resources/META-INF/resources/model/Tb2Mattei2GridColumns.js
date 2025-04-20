/**
 * 末弟２グリッド定義
 */

let Tb2Mattei2GridColumns = [];

$(function() {
    Tb2Mattei2GridColumns = [
        Column.text('MATTEI_ID', Messages['Tb2Mattei2Grid.matteiId'], 90, 'primaryKey numbering', null),
        Column.text('MATTEI2_INFO', Messages['Tb2Mattei2Grid.mattei2Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2Mattei2Grid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
