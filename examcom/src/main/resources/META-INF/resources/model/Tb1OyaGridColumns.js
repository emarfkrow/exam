/**
 * 親グリッド定義
 */

let Tb1OyaGridColumns = [];

$(function() {
    Tb1OyaGridColumns = [
        Column.text('OYA_ID', Messages['Tb1OyaGrid.oyaId'], 80, 'primaryKey numbering', null),
        Column.text('OYA_INFO', Messages['Tb1OyaGrid.oyaInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb1OyaGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
