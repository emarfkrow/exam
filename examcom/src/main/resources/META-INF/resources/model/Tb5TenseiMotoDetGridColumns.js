/**
 * 転生元明細グリッド定義
 */

let Tb5TenseiMotoDetGridColumns = [];

$(function() {
    Tb5TenseiMotoDetGridColumns = [
        Column.text('TENSEI_MOTO_ID', Messages['Tb5TenseiMotoDetGrid.tenseiMotoId'], 80, 'primaryKey numbering', null),
        Column.text('TENSEI_MOTO_BN', Messages['Tb5TenseiMotoDetGrid.tenseiMotoBn'], 80, 'primaryKey numbering', null),
        Column.text('TENSEI_MOTO_DET_INFO', Messages['Tb5TenseiMotoDetGrid.tenseiMotoDetInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseiMotoDetGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
