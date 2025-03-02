/**
 * 変換元グリッド定義
 */

let Tb8HenkanMotoGridColumns = [];

$(function() {
    Tb8HenkanMotoGridColumns = [
        Column.text('HENKAN_MOTO_ID', Messages['Tb8HenkanMotoGrid.henkanMotoId'], 80, 'primaryKey numbering', null),
        Column.text('HENKAN_MOTO_INFO', Messages['Tb8HenkanMotoGrid.henkanMotoInfo'], 300, '', null),
        Column.text('HIKITSUGU_INFO', Messages['Tb8HenkanMotoGrid.hikitsuguInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb8HenkanMotoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
