/**
 * 代表２グリッド定義
 */

let Tb2Daihyo2GridColumns = [];

$(function() {
    Tb2Daihyo2GridColumns = [
        Column.text('DAIHYO_ID', Messages['Tb2Daihyo2Grid.daihyoId'], 80, 'primaryKey numbering', null),
        Column.text('DAIHYO2_INFO', Messages['Tb2Daihyo2Grid.daihyo2Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2Daihyo2Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
