/**
 * 兄弟３グリッド定義
 */

let Tb2Bros3GridColumns = [];

$(function() {
    Tb2Bros3GridColumns = [
        Column.text('BROS_ID', Messages['Tb2Bros3Grid.brosId'], 80, 'primaryKey numbering', null),
        Column.text('BROS3_INFO', Messages['Tb2Bros3Grid.bros3Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2Bros3Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
