/**
 * 代表グリッド定義
 */

let Tb2DaihyoGridColumns = [];

$(function() {
    Tb2DaihyoGridColumns = [
        Column.text('DAIHYO_ID', Messages['Tb2DaihyoGrid.daihyoId'], 80, 'primaryKey numbering', null),
        Column.text('DAIHYO_INFO', Messages['Tb2DaihyoGrid.daihyoInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2DaihyoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
