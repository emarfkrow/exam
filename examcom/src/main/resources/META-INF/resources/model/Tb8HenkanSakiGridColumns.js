/**
 * 変換先グリッド定義
 */

let Tb8HenkanSakiGridColumns = [];

$(function() {
    Tb8HenkanSakiGridColumns = [
        Column.text('HENKAN_SAKI_ID', Messages['Tb8HenkanSakiGrid.henkanSakiId'], 80, 'primaryKey numbering', null),
        Column.text('HENKAN_SAKI_INFO', Messages['Tb8HenkanSakiGrid.henkanSakiInfo'], 300, '', null),
        Column.text('HIKITSUIDA_INFO', Messages['Tb8HenkanSakiGrid.hikitsuidaInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb8HenkanSakiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
