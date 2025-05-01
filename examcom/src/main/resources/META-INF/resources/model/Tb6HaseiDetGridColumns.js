/**
 * 派生明細グリッド定義
 */

let Tb6HaseiDetGridColumns = [];

$(function() {
    Tb6HaseiDetGridColumns = [
        Column.text('HASEI_ID', Messages['Tb6HaseiDetGrid.haseiId'], 90, 'primaryKey numbering', null),
        Column.text('HASEI_BN', Messages['Tb6HaseiDetGrid.haseiBn'], 90, 'primaryKey numbering', null),
        Column.text('HASEI_DET_INFO', Messages['Tb6HaseiDetGrid.haseiDetInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb6HaseiDetGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
