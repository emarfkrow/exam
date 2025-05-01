/**
 * 履歴元グリッド定義
 */

let Tb3RirekiGridColumns = [];

$(function() {
    Tb3RirekiGridColumns = [
        Column.text('RIREKI_ID', Messages['Tb3RirekiGrid.rirekiId'], 90, 'primaryKey numbering', null),
        Column.text('RIREKI_INFO', Messages['Tb3RirekiGrid.rirekiInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb3RirekiGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
