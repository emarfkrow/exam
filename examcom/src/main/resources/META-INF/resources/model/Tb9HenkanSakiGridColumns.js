/**
 * 変換先グリッド定義
 */

let Tb9HenkanSakiGridColumns = [];

$(function() {
    Tb9HenkanSakiGridColumns = [
        Column.text('HENKAN_SAKI_ID', Messages['Tb9HenkanSakiGrid.henkanSakiId'], 80, 'primaryKey numbering', null),
        Column.text('HENKAN_SAKI_INFO', Messages['Tb9HenkanSakiGrid.henkanSakiInfo'], 300, '', null),
        Column.text('HIKITSUIDA_INFO', Messages['Tb9HenkanSakiGrid.hikitsuidaInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb9HenkanSakiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
