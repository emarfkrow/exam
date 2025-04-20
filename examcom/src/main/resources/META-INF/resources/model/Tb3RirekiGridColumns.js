/**
 * 履歴元グリッド定義
 */

let Tb3RirekiGridColumns = [];

$(function() {
    Tb3RirekiGridColumns = [
        Column.text('RIREKI_MOTO_ID', Messages['Tb3RirekiGrid.rirekiMotoId'], 90, 'primaryKey numbering', null),
        Column.text('RIREKI_MOTO_INFO', Messages['Tb3RirekiGrid.rirekiMotoInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb3RirekiGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
