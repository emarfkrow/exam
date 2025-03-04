/**
 * 変換元グリッド定義
 */

let Tb9HenkanMotoGridColumns = [];

$(function() {
    Tb9HenkanMotoGridColumns = [
        Column.text('HENKAN_MOTO_ID', Messages['Tb9HenkanMotoGrid.henkanMotoId'], 80, 'primaryKey numbering', null),
        Column.text('HENKAN_MOTO_INFO', Messages['Tb9HenkanMotoGrid.henkanMotoInfo'], 300, '', null),
        Column.text('HIKITSUGU_INFO', Messages['Tb9HenkanMotoGrid.hikitsuguInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb9HenkanMotoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
