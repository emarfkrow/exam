/**
 * 転生元明細グリッド定義
 */

let Tb5TenseiMotoDetGridColumns = [];

$(function() {
    Tb5TenseiMotoDetGridColumns = [
        Column.text('TENSEI_MOTO_ID', Messages['Tb5TenseiMotoDetGrid.tenseiMotoId'], 90, 'primaryKey numbering', null),
        Column.text('TENSEI_MOTO_BN', Messages['Tb5TenseiMotoDetGrid.tenseiMotoBn'], 90, 'primaryKey numbering', null),
        Column.text('TENSEI_MOTO_DET_INFO', Messages['Tb5TenseiMotoDetGrid.tenseiMotoDetInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseiMotoDetGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
