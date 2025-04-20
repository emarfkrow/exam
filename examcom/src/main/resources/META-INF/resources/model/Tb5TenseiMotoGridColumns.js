/**
 * 転生元グリッド定義
 */

let Tb5TenseiMotoGridColumns = [];

$(function() {
    Tb5TenseiMotoGridColumns = [
        Column.text('TENSEI_MOTO_ID', Messages['Tb5TenseiMotoGrid.tenseiMotoId'], 90, 'primaryKey numbering', null),
        Column.text('TENSEI_MOTO_INFO', Messages['Tb5TenseiMotoGrid.tenseiMotoInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseiMotoGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
