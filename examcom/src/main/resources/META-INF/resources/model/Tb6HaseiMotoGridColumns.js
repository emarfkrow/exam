/**
 * 派生元グリッド定義
 */

let Tb6HaseiMotoGridColumns = [];

$(function() {
    Tb6HaseiMotoGridColumns = [
        Column.text('HASEI_MOTO_ID', Messages['Tb6HaseiMotoGrid.haseiMotoId'], 90, 'primaryKey numbering', null),
        Column.text('HASEI_MOTO_INFO', Messages['Tb6HaseiMotoGrid.haseiMotoInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb6HaseiMotoGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
