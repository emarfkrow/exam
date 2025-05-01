/**
 * 履歴先グリッド定義
 */

let Tb3RirekiSakiGridColumns = [];

$(function() {
    Tb3RirekiSakiGridColumns = [
        Column.text('RIREKI_ID', Messages['Tb3RirekiSakiGrid.rirekiId'], 90, 'primaryKey numbering', null),
        Column.text('RIREKI_BN', Messages['Tb3RirekiSakiGrid.rirekiBn'], 90, 'primaryKey numbering', null),
        Column.text('RIREKI_INFO', Messages['Tb3RirekiSakiGrid.rirekiInfo'], 300, '', null),
        Column.text('HENKO_RIYU', Messages['Tb3RirekiSakiGrid.henkoRiyu'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb3RirekiSakiGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
