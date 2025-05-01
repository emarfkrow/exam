/**
 * 派生グリッド定義
 */

let Tb6HaseiGridColumns = [];

$(function() {
    Tb6HaseiGridColumns = [
        Column.text('HASEI_ID', Messages['Tb6HaseiGrid.haseiId'], 90, 'primaryKey numbering', null),
        Column.text('HASEI_INFO', Messages['Tb6HaseiGrid.haseiInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb6HaseiGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
